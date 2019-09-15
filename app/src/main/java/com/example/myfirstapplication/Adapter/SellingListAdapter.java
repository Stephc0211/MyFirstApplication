package com.example.myfirstapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.SellingItem;

import java.util.List;

public class SellingListAdapter extends ArrayAdapter<SellingItem> {

    private Context mContext;
    private int mResourceID;
    private List<SellingItem> mItemList;

    public SellingListAdapter(Context context, int resouce, List<SellingItem> itemList){
        super(context,resouce,itemList);
        this.mContext = context;
        this.mResourceID = resouce;
        this.mItemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final SellingItem item = getItem(position);

        View view = null;
        ViewHolder viewHolder;

        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(mResourceID, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.mIvProfilePic = (ImageView) view.findViewById(R.id.iv_selling_profile_pic);
            viewHolder.mTvUserName = (TextView) view.findViewById(R.id.tv_selling_username);

            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if(null != item){
            viewHolder.mIvProfilePic.setImageResource(item.getProfilePicUrl());

            viewHolder.mTvUserName.setText(item.getUserName());

            return view;
        }

        return super.getView(position, convertView, parent);
    }

    class ViewHolder{
        ImageView mIvProfilePic;
        TextView mTvUserName;
        TextView mTvDescription;
        }

    @Override
    public int getCount() {
        return mItemList.isEmpty() ? 0 : mItemList.size();
    }

    @Override
    public SellingItem getItem(int position) {
        return mItemList.isEmpty() ? null : mItemList.get(position);
    }
}

