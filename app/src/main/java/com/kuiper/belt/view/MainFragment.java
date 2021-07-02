package com.kuiper.belt.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kuiper.belt.R;
import com.kuiper.belt.databinding.FragmentMainBinding;
import com.kuiper.belt.viewmodel.MainFragmentViewModel;

/**
 * @ClassName: MainFragment
 * @Description:
 * @Author: zhangdi
 * @Date: 2021/6/23 下午4:55
 */
public class MainFragment extends Fragment implements View.OnClickListener {
    public static final String TAG = "#MainFragment";

    private FragmentMainBinding mBinding;
    private MainFragmentViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = FragmentMainBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    private void initView() {
        mViewModel = new ViewModelProvider(this).get(MainFragmentViewModel.class);
        mBinding.btnTestWorker.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.btn_test_worker == id) {
            mViewModel.onTestWorker();
        }
    }
}
