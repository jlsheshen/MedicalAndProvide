package com.tkkj.medicalandprovide.view;

import android.view.View;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.base.BaseFragment;

/**
 * Created by jl on 2016/8/26.
 */
public class MyFragment extends BaseFragment{

    @Override
    protected int setLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onStart() {
        getActivity().findViewById(R.id.my_save).setVisibility(View.VISIBLE);

        super.onStart();
    }

    @Override
    public void onResume() {
        getActivity().findViewById(R.id.my_save).setVisibility(View.VISIBLE);

        super.onResume();
    }

    @Override
    public void onStop() {
       getActivity().findViewById(R.id.my_save).setVisibility(View.GONE);
        super.onStop();
    }
}
