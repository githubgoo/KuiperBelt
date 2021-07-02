package com.kuiper.belt.viewmodel;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 * @ClassName: MainFragmentViewModel
 * @Description:
 * @Author: zhangdi
 * @Date: 2021/7/1 下午3:42
 */
public class MainFragmentViewModel extends AndroidViewModel {
    public MainFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public void onTestWorker() {
        Toast.makeText(getApplication(), "TODO", Toast.LENGTH_SHORT).show();
    }
}
