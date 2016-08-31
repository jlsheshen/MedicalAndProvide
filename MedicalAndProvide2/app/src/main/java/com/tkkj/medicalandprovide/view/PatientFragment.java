package com.tkkj.medicalandprovide.view;

import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.adapter.PatientAdapter;
import com.tkkj.medicalandprovide.base.BaseApplication;
import com.tkkj.medicalandprovide.base.BaseFragment;
import com.tkkj.medicalandprovide.model.PatientBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl on 2016/8/26.
 */
public class PatientFragment extends BaseFragment implements View.OnClickListener{
    ListView listView;
    PatientAdapter patientAdapter;

    @Override
    protected int setLayout() {
        return R.layout.fragment_one_lv;
    }

    @Override
    protected void initView(View view) {
        listView = bindView(R.id.fragment_main_list);


    }

    @Override
    protected void initData() {
        List<PatientBean> data = new ArrayList<>();
        for (int i  = 0; i < 8;i++){
            PatientBean patientBean = new PatientBean();
            patientBean.setName("www" + i);
            patientBean.setPhone("138888888" + i);
            patientBean.setDisease("汤料" + i);
            data.add(patientBean);
            Log.e("PatientFragment", "initData:" +  data.get(i).getName());
        }
        patientAdapter = new PatientAdapter(BaseApplication.getContext());
        patientAdapter.setData(data);
        listView.setAdapter(patientAdapter);
        View view = View.inflate(BaseApplication.getContext(),R.layout.item_patient_list,null);
        listView.addHeaderView(view);
        Log.d("PatientFragment", "点击事件执勤啊");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("PatientFragment", "点击事件触发");
                FragmentTransaction traMain = getActivity().getSupportFragmentManager().beginTransaction();
                getActivity().findViewById(R.id.main_vp).setVisibility(View.VISIBLE);
                getActivity().findViewById(R.id.main_flay).setVisibility(View.GONE);
                traMain.replace(R.id.main_vp,new PatientDetail());

                traMain.commit();
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
