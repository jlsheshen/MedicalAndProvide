package com.tkkj.medicalandprovide.view;

import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.adapter.CallAdapter;
import com.tkkj.medicalandprovide.base.BaseApplication;
import com.tkkj.medicalandprovide.base.BaseFragment;
import com.tkkj.medicalandprovide.model.CallBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl on 2016/8/26.
 */
public class CallFragment extends BaseFragment{
    ListView listView;
    CallAdapter callAdapter;
    List<CallBean> data;

    @Override
    protected int setLayout() {
        return R.layout.fragment_one_lv;
    }

    @Override
    protected void initView(View view) {
        listView = (ListView) view.findViewById(R.id.fragment_main_list);
        callAdapter = new CallAdapter(BaseApplication.getContext());
        data = new ArrayList<>();
        for (int i = 0; i<5;i++){
            CallBean callBean = new CallBean();
            callBean.setName("姓名" + i);
            callBean.setDate("1201560");
            callBean.setPhone("18624386");
            callBean.setContent("sadasdasasdas" + i);
            data.add(callBean);
        }
        callAdapter.setData(data);
        listView.setAdapter(callAdapter);
        View view1 = View.inflate(BaseApplication.getContext(),R.layout.item_call_list,null);
        listView.addHeaderView(view1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentTransaction traMain = getActivity().getSupportFragmentManager().beginTransaction();
                getActivity().findViewById(R.id.main_vp).setVisibility(View.VISIBLE);
                getActivity().findViewById(R.id.main_flay).setVisibility(View.GONE);
                traMain.replace(R.id.main_vp,new DetailAdxisoryFragment());
                traMain.commit();

            }
        });


    }

    @Override
    protected void initData() {

    }
}
