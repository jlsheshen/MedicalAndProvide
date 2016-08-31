package com.tkkj.medicalandprovide.view;

import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.base.BaseFragment;

/**
 * Created by jl on 2016/8/30.
 */
public class PatientDetail extends BaseFragment implements View.OnClickListener{
    TextView healthTv,caseTv,videoTv;
    @Override
    protected int setLayout() {
        return R.layout.fragment_patient_detail;
    }

    @Override
    protected void initView(View view) {
        healthTv = bindView(R.id.patient_detail_health);
        caseTv = bindView(R.id.patient_detail_case);
        videoTv = bindView(R.id.patient_detail_video);

        healthTv.setOnClickListener(this);
        caseTv.setOnClickListener(this);
        videoTv.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        Log.d("PatientDetail", "触发点击事件");
        FragmentTransaction traMain = getActivity().getSupportFragmentManager().beginTransaction();
        getActivity().findViewById(R.id.main_thrid).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.main_vp).setVisibility(View.GONE);
        traMain.replace(R.id.main_thrid,new PatientHealthFragment());
        traMain.commit();

        switch (view.getId()){
            case R.id.patient_detail_health:
                break;
            case R.id.patient_detail_case:
                break;
            case R.id.patient_detail_video:
                break;

        }
    }
}
