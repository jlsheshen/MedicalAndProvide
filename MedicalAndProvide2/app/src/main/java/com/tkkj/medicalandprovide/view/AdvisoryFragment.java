package com.tkkj.medicalandprovide.view;

import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.adapter.AdvisoryAdapter;
import com.tkkj.medicalandprovide.base.BaseApplication;
import com.tkkj.medicalandprovide.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl on 2016/8/26.
 */
public class AdvisoryFragment extends BaseFragment{

    ListView listView;
    List<String> datas;
    AdvisoryAdapter advisoryAdapter;
    @Override
    protected int setLayout() {
        return R.layout.fragment_advisory;
    }

    @Override
    protected void initView(View view) {
        listView = bindView(R.id.fragment_main_list);



    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        datas.add("测试数据第一行");
        datas.add("测试数据第二行");
        datas.add("测试数据第三行");
        datas.add("测试数据第四行");
        advisoryAdapter = new AdvisoryAdapter(BaseApplication.getContext());
        advisoryAdapter.setData(datas);
        listView.setAdapter(advisoryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(BaseApplication.getContext(), datas.get(i), Toast.LENGTH_SHORT).show();
                FragmentTransaction traMain = getActivity().getSupportFragmentManager().beginTransaction();
                traMain.replace(R.id.main_vp,new DetailAdxisoryFragment());
                //提交业务
                traMain.commit();

            }
        });



    }
}
