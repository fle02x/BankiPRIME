package com.example.banki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapterBANK extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataFlagsBANK> list;
    public MyListAdapterBANK(Context context, ArrayList<DataFlagsBANK> data){
        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return  list.size();
    }

    @Override
    public DataFlagsBANK getItem(int position)
    {
        return list.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        View v = convertView;
        if( v == null) {
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.listviewBANK, parent,false);
            holder.hourse = (TextView) v.findViewById(R.id.hourse);
            holder.state = ((TextView) v.findViewById(R.id.state));
            holder.bank = ((TextView) v.findViewById(R.id.bank));
            holder.street = ((TextView) v.findViewById(R.id.street));
            v.setTag(holder);

        }
        holder = (ViewHolder) v.getTag();
        DataFlagsBANK dataFlagsBANK = getData(position);


        holder.hourse.setText(v.getResources().getString(dataFlagsBANK.getHourseID()));
        holder.state.setText(v.getResources().getString(dataFlagsBANK.getStateID()));
        holder.bank.setText(v.getResources().getString(dataFlagsBANK.getBankID()));
        holder.street.setText(v.getResources().getString(dataFlagsBANK.getStreetID()));



        return v;
    }

    DataFlagsBANK getData(int position){return (getItem(position)); }

    private static class ViewHolder{
        private TextView hourse;
        private TextView state;
        private TextView bank;
        private TextView street;

    }
}