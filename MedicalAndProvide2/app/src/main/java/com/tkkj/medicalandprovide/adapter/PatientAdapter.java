package com.tkkj.medicalandprovide.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.model.PatientBean;

import java.util.List;

/**
 * Created by jl on 2016/8/29.
 */
public class PatientAdapter extends BaseAdapter {
    private Context context;
    List<PatientBean> data;


    public PatientAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<PatientBean> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return (data == null?15:data.size())<15?15:data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_patient_list,viewGroup,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) view.getTag();

        if (data.size()<i +1){
            viewHolder.name.setText("");
            viewHolder.phone.setText("");
            viewHolder.disease.setText("");

        }else {
            Log.d("PatientAdapter", "getView: i=" + i + data.get(i).getName());

        viewHolder.name.setText(data.get(i).getName());
        viewHolder.phone.setText(data.get(i).getDisease());
        viewHolder.disease.setText(data.get(i).getPhone());}
        return view;
    }
    class ViewHolder{
        TextView name,phone,disease;


        public ViewHolder(View view) {
            name = (TextView) view.findViewById(R.id.patient_name);
            phone  = (TextView) view.findViewById(R.id.patient_phone);
            disease = (TextView) view.findViewById(R.id.patient_disease);
        }
    }
}
