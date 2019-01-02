package com.example.sonice1024.bletest.databinding;
import com.example.sonice1024.bletest.R;
import com.example.sonice1024.bletest.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edit, 4);
        sViewsWithIds.put(R.id.send, 5);
        sViewsWithIds.put(R.id.recycler_view, 6);
    }
    // views
    @NonNull
    public final android.widget.EditText edit;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.Button send;
    // variables
    @Nullable
    private java.lang.String mStatus;
    @Nullable
    private java.lang.String mDataValue;
    @Nullable
    private java.lang.String mStatusData;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.edit = (android.widget.EditText) bindings[4];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[6];
        this.send = (android.widget.Button) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.status == variableId) {
            setStatus((java.lang.String) variable);
        }
        else if (BR.dataValue == variableId) {
            setDataValue((java.lang.String) variable);
        }
        else if (BR.statusData == variableId) {
            setStatusData((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable java.lang.String Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getStatus() {
        return mStatus;
    }
    public void setDataValue(@Nullable java.lang.String DataValue) {
        this.mDataValue = DataValue;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dataValue);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getDataValue() {
        return mDataValue;
    }
    public void setStatusData(@Nullable java.lang.String StatusData) {
        this.mStatusData = StatusData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.statusData);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getStatusData() {
        return mStatusData;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String status = mStatus;
        java.lang.String dataValue = mDataValue;
        java.lang.String statusJavaLangObjectNullStatusStatus = null;
        boolean statusJavaLangObjectNull = false;
        boolean statusDataJavaLangObjectNull = false;
        java.lang.String mboundView3AndroidStringDataValueDataValue = null;
        java.lang.String statusData = mStatusData;
        boolean mboundView3AndroidStringDataValueDataValueJavaLangObjectNull = false;
        java.lang.String mboundView3AndroidStringDataValueDataValueJavaLangObjectNullDataValueMboundView3AndroidStringDataValueDataValue = null;
        java.lang.String statusDataJavaLangObjectNullStatusDataStatusData = null;

        if ((dirtyFlags & 0x9L) != 0) {



                // read status == null
                statusJavaLangObjectNull = (status) == (null);
            if((dirtyFlags & 0x9L) != 0) {
                if(statusJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read (@android:string/data_value) + (dataValue)
                mboundView3AndroidStringDataValueDataValue = (mboundView3.getResources().getString(R.string.data_value)) + (dataValue);


                // read (@android:string/data_value) + (dataValue) == null
                mboundView3AndroidStringDataValueDataValueJavaLangObjectNull = (mboundView3AndroidStringDataValueDataValue) == (null);
            if((dirtyFlags & 0xaL) != 0) {
                if(mboundView3AndroidStringDataValueDataValueJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read statusData == null
                statusDataJavaLangObjectNull = (statusData) == (null);
            if((dirtyFlags & 0xcL) != 0) {
                if(statusDataJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x9L) != 0) {

                // read status == null ? status : status
                statusJavaLangObjectNullStatusStatus = ((statusJavaLangObjectNull) ? (status) : (status));
        }
        if ((dirtyFlags & 0xaL) != 0) {

                // read (@android:string/data_value) + (dataValue) == null ? dataValue : (@android:string/data_value) + (dataValue)
                mboundView3AndroidStringDataValueDataValueJavaLangObjectNullDataValueMboundView3AndroidStringDataValueDataValue = ((mboundView3AndroidStringDataValueDataValueJavaLangObjectNull) ? (dataValue) : (mboundView3AndroidStringDataValueDataValue));
        }
        if ((dirtyFlags & 0xcL) != 0) {

                // read statusData == null ? statusData : statusData
                statusDataJavaLangObjectNullStatusDataStatusData = ((statusDataJavaLangObjectNull) ? (statusData) : (statusData));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, statusJavaLangObjectNullStatusStatus);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, statusDataJavaLangObjectNullStatusDataStatusData);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3AndroidStringDataValueDataValueJavaLangObjectNullDataValueMboundView3AndroidStringDataValueDataValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.sonice1024.bletest.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.sonice1024.bletest.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): dataValue
        flag 2 (0x3L): statusData
        flag 3 (0x4L): null
        flag 4 (0x5L): status == null ? status : status
        flag 5 (0x6L): status == null ? status : status
        flag 6 (0x7L): (@android:string/data_value) + (dataValue) == null ? dataValue : (@android:string/data_value) + (dataValue)
        flag 7 (0x8L): (@android:string/data_value) + (dataValue) == null ? dataValue : (@android:string/data_value) + (dataValue)
        flag 8 (0x9L): statusData == null ? statusData : statusData
        flag 9 (0xaL): statusData == null ? statusData : statusData
    flag mapping end*/
    //end
}