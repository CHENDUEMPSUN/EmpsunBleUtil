EmpsunBleUtil
蓝牙4.0
```
Gradle 依赖
allprojects {
	repositories {
			...
			maven { url 'https://www.jitpack.io' }
	             }
	    }
	    
dependencies {
   implementation 'com.github.CHENDUEMPSUN:EmpsunBleUtil:v1.0'
}
简单使用
1.初始化

权限：
<uses-permission android:name="android.permission.BLUETOOTH" />
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

注意：
6.0以上记得主动申请权限

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EmpBleManager.getInstance().initApplication(this);//初始化
    }
}

2.扫描

EmpBleManager.getInstance().isBlueEnable()         //是否打开蓝牙
EmpBleScanRuleConfig scanRuleConfig = new BleScanRuleConfig.Builder()
          .setServiceUuids(serviceUuids)           // 只扫描指定的服务的设备，可选
          .setDeviceMac(mac)                       // 只扫描指定mac的设备，可选
          .setScanTimeOut(5000)                    // 扫描超时时间，可选，默认10秒
          .build();
EmpBleManager.getInstance().initScanRule(scanRuleConfig);
EmpBleManager.getInstance().scan(new BleScanCallback() {
    @Override
    public void onScanStarted(boolean success) {
      //表示本次扫描动作是否开启成功
    }

    @Override
    public void onLeScan(BleDevice bleDevice) {
      //扫描过程中所有被扫描到的结果回调
    }

    @Override
    public void onScanning(BleDevice bleDevice) {
      //扫描过程中的所有过滤后的结果回调
    }

    @Override
    public void onScanFinished(List<BleDevice> scanResultList) {
      //本次扫描时段内所有被扫描且过滤后的设备集合
    }
});
3.连接

EmpBleManager.getInstance().startConnect(value, new BleConnectNotifyImp() {
            @Override
            public void onConnectSuccess(BleDevice bleDevice, BluetoothGatt gatt, int status) {
                //连接成功回调
            }

            @Override
            public void onConnectFail(BleDevice bleDevice, BleException exception) {
                //连接失败回调
            }

            @Override
            public void onConnectDis(boolean isActiveDisConnected, BleDevice device, BluetoothGatt gatt, int status) {
                //连接断开回调（注意：异常断开做了主动重连了一次的处理）
            }
        });

4.NOTIFY通讯

EmpBleManager.getInstance().notify(
                bleDevice,
                "0000ffe0-0000-1000-8000-00805f9b34fb",
                "0000ffe1-0000-1000-8000-00805f9b34fb",
                new BleNotifyCallback() {
                    @Override
                    public void onNotifySuccess() {
                        // 打开通知操作成功
                    }


                    @Override
                    public void onNotifyFailure(BleException exception) {
                        // 打开通知操作失败
                    }

                    @Override
                    public void onCharacteristicChanged(byte[] data) {
                        // 打开通知后，设备发过来的数据将在这里出现
                        Log.d("接收数据:", HexStrToBytesUtils.bytesToHexString(data));
                    }
                });

5.写数据

EmpBleManager.getInstance().write(
                bleDevice,
                "0000ffe0-0000-1000-8000-00805f9b34fb",
                "0000ffe1-0000-1000-8000-00805f9b34fb",
                inputValue.getBytes(),     //String.getBytes()
                new BleWriteCallback() {
                    @Override
                    public void onWriteSuccess(int current, int total, byte[] justWrite) {
                        // 发送数据到设备成功（分包发送的情况下，可以通过方法中返回的参数可以查看发送进度）
                    }

                    @Override
                    public void onWriteFailure(BleException exception) {
                        // 发送数据到设备失败
                    }
                });
6.断开连接

EmpBleManager.getInstance().disconnect(bleDevice);
or
EmpBleManager.getInstance().disconnectAllDevice();
7.获取和设置上一次连接的MAC值

EmpBleManager.getInstance().getSpMac()
and
EmpBleManager.getInstance().setSpMac(mac)
```
