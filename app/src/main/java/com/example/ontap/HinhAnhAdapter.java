package com.example.ontap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {
    private Context context;
    private List<HinhAnh>hinhAnhList;
    private int layout;

    public HinhAnhAdapter(Context context, List<HinhAnh> hinhAnhList, int layout) {
        this.context = context;
        this.hinhAnhList = hinhAnhList;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imageHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView ==null){
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =inflater.inflate(layout,null);
            holder.imageHinh=convertView.findViewById(R.id.image_ha);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        HinhAnh hinhAnh=hinhAnhList.get(position);
        holder.imageHinh.setImageResource(hinhAnh.getImage());
        return convertView;
    }
}
