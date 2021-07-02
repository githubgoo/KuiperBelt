package com.kuiper.belt.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.work.WorkManager;

public class WorkerFragmentViewModel extends AndroidViewModel {
    private static final String TAG = "#WorkerFragmentViewModel";
    private final WorkManager mWorkManager;

    public WorkerFragmentViewModel(@NonNull Application application) {
        super(application);
        mWorkManager = WorkManager.getInstance(application);
    }

    public void doWork() {

    }
}
