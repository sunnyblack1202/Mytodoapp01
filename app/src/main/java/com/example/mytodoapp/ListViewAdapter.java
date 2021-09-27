package com.example.mytodoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

    static class ViewHolder {
        TextView textView1;
    }

    private LayoutInflater inflater;
    private int itemLayoutId;
    private String[] titleS;

    ListViewAdapter(Context context, int itemLayoutId, String[] titles) {

        super();
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.itemLayoutId = itemLayoutId;
        this.titleS = titles;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(itemLayoutId, parent, false);

            holder = new ViewHolder();
            holder.textView1 = convertView.findViewById(R.id.titleView);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView1.setText(titleS[position]);

        return convertView;
    }

    @Override
    public int getCount() {
        return titleS.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
