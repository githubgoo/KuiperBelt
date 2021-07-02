package com.kuiper.belt.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kuiper.belt.databinding.FragmentWorkerBinding;
import com.kuiper.belt.viewmodel.WorkerFragmentViewModel;

public class WorkerFragment extends Fragment {
    public static final String TAG = "#WorkerFragment";

    private FragmentWorkerBinding mBinding;
    private WorkerFragmentViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = FragmentWorkerBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    private void initView() {
        mViewModel = new ViewModelProvider(this).get(WorkerFragmentViewModel.class);
        mBinding.tvMsg.setText(TAG);
    }

    private void initData() {
        mViewModel.doWork();
    }
}
