package com.example.myfirstapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.RatingsItem;

import java.util.List;

public class RatingsListAdapter extends ArrayAdapter<RatingsItem> {

    private Context mContext;
    private int mResourceID;
    private List<RatingsItem> mItemList;

    public RatingsListAdapter(Context context, int resource, List<RatingsItem> itemList) {
        super(context, resource, itemList);
        this.mContext = context;
        this.mItemList = itemList;
        this.mResourceID = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final RatingsItem item = getItem(position);

        View view = null;
        ViewHolder viewHolder;

        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(mResourceID, parent,false);
            viewHolder = new ViewHolder();

            viewHolder.mIvPic1 = (ImageView) view.findViewById(R.id.iv_ratings_item_pic1);
            viewHolder.mIvPic2 = (ImageView) view.findViewById(R.id.iv_ratings_item_pic2);
            viewHolder.mIvPic3 = (ImageView) view.findViewById(R.id.iv_ratings_item_pic3);
            viewHolder.mIvPic4 = (ImageView) view.findViewById(R.id.iv_ratings_item_pic4);
            viewHolder.mIvPic5 = (ImageView) view.findViewById(R.id.iv_ratings_item_pic5);

            viewHolder.mBtnSubscribe = (Button) view.findViewById(R.id.btn_ratings_follow);

            viewHolder.mIvPofilePic = (ImageView) view.findViewById(R.id.iv_ratings_profile_pic);

            viewHolder.mTvDescription = (TextView) view.findViewById(R.id.tv_ratings_item_intro);

            viewHolder.mTvUserName = (TextView) view.findViewById(R.id.tv_ratings_username);

            viewHolder.mStar1 = (ImageView) view.findViewById(R.id.iv_ratings_star1);
            viewHolder.mStar2 = (ImageView) view.findViewById(R.id.iv_ratings_star2);
            viewHolder.mStar3 = (ImageView) view.findViewById(R.id.iv_ratings_star3);
            viewHolder.mStar4 = (ImageView) view.findViewById(R.id.iv_ratings_star4);
            viewHolder.mStar5 = (ImageView) view.findViewById(R.id.iv_ratings_star5);

            //viewHolder.mTvHot = (TextView) view.findViewById(R.id.tv_ratings_hot);
            //viewHolder.mTvMine = (TextView) view.findViewById(R.id.tv_ratings_mine);

            view.setTag(viewHolder);

        }else{
            view = convertView;
            viewHolder = (ViewHolder) convertView.getTag();

        }

        if (null != item) {
            viewHolder.mIvPic1.setImageResource(item.getPic1Url());
            viewHolder.mIvPic2.setImageResource(item.getPic2Url());
            viewHolder.mIvPic3.setImageResource(item.getPic3Url());
            viewHolder.mIvPic4.setImageResource(item.getPic4Url());
            viewHolder.mIvPic5.setImageResource(item.getPic5Url());

            viewHolder.mIvPofilePic.setImageResource(item.getProfilePicUrl());

            viewHolder.mTvUserName.setText(item.getUserName());
            viewHolder.mTvDescription.setText(item.getDescription());


            return view;

        }



        return super.getView(position, convertView, parent);
    }

    class ViewHolder {

        ImageView mIvPofilePic;
        TextView mTvUserName;
        Button mBtnSubscribe;
        TextView mTvDescription;


        ImageView mIvPic1;
        ImageView mIvPic2;
        ImageView mIvPic3;
        ImageView mIvPic4;
        ImageView mIvPic5;

        ImageView mStar1;
        ImageView mStar2;
        ImageView mStar3;
        ImageView mStar4;
        ImageView mStar5;

        TextView mTvHot;
        TextView mTvMine;

    }

    @Override
    public int getCount() {
        return mItemList.isEmpty() ? 0 : mItemList.size();
    }

    @Override
    public RatingsItem getItem(int position) {
        return mItemList.isEmpty() ? null : mItemList.get(position);
    }
}
