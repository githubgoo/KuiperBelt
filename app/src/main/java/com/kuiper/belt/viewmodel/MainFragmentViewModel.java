package com.kuiper.belt.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AndroidViewModel;

import com.kuiper.belt.R;
import com.kuiper.belt.view.WorkerFragment;

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

    public void onTestWorker(FragmentManager fm) {
        WorkerFragment fragment = new WorkerFragment();
        fm.beginTransaction().addToBackStack(WorkerFragment.TAG).add(R.id.fragment_container, fragment).commit();
    }
}
