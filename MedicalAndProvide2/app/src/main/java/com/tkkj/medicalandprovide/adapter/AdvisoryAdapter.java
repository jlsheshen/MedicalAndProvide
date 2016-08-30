package com.tkkj.medicalandprovide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tkkj.medicalandprovide.R;

import java.util.List;

/**
 * Created by jl on 2016/8/29.
 */
public class AdvisoryAdapter extends BaseAdapter {
    private Context context;
    List<String> data;


    public AdvisoryAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data == null?0:data.size();
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
            view = LayoutInflater.from(context).inflate(R.layout.item_one_string_list,viewGroup,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) view.getTag();
        viewHolder.text.setText(data.get(i));
        return view;
    }
    class ViewHolder{
        TextView text;

        public ViewHolder(View view) {
            text = (TextView) view.findViewById(R.id.one_string_list_tv);
        }
    }
}
