package com.tkkj.medicalandprovide.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tkkj.medicalandprovide.R;
import com.tkkj.medicalandprovide.model.CallBean;

import java.util.List;

/**
 * Created by jl on 2016/8/29.
 */
public class CallAdapter extends BaseAdapter {
    private Context context;
    List<CallBean> data;


    public CallAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<CallBean> data) {
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
            view = LayoutInflater.from(context).inflate(R.layout.item_call_list,viewGroup,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) view.getTag();

        if (data.size()<i +1){
            viewHolder.name.setText("");
            viewHolder.date.setText("");
            viewHolder.phone.setText("");
            viewHolder.content.setText("");
        }else {
            viewHolder.name.setText(data.get(i).getName());
            viewHolder.date.setText(data.get(i).getDate());
            viewHolder.phone.setText(data.get(i).getPhone());
            viewHolder.content.setText(data.get(i).getContent());}
        return view;
    }
    class ViewHolder{
        TextView name,date,phone,content;
        public ViewHolder(View view) {
            name = (TextView) view.findViewById(R.id.call_name);
            date = (TextView) view.findViewById(R.id.call_date);
            phone  = (TextView) view.findViewById(R.id.call_phone);
            content = (TextView) view.findViewById(R.id.call_content);
        }
    }
}
