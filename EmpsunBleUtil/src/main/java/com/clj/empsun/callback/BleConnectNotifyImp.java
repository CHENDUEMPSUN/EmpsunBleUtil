package com.clj.empsun.callback;


import android.bluetooth.BluetoothGatt;

import com.clj.empsun.data.BleDevice;
import com.clj.empsun.exception.BleException;

public interface BleConnectNotifyImp {
    void onConnectSuccess(BleDevice bleDevice, BluetoothGatt gatt, int status);
    void onConnectFail(BleDevice bleDevice, BleException exception);
    void onConnectDis(boolean isActiveDisConnected, BleDevice device, BluetoothGatt gatt, int status);

}
