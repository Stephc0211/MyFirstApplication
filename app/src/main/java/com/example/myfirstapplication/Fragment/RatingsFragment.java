package com.example.myfirstapplication.Fragment;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myfirstapplication.Activity.RatingsListActivity;
import com.example.myfirstapplication.Adapter.RatingsListAdapter;
import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.RatingsItem;

import java.util.ArrayList;
import java.util.List;

public class RatingsFragment extends Fragment {


    private ListView mLvRatings;
    private RatingsListAdapter ratingsListAdapter;
    private List<RatingsItem> mMyItemList = new ArrayList<>(); //mine
    private List<RatingsItem> mHotItemList = new ArrayList<>(); //hot
    private List<RatingsItem> mItemList = new ArrayList<>(); //general

    private TextView mTvHot;
    private TextView mTvMine;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_ratings_list, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLvRatings = getActivity().findViewById(R.id.lv_ratings_list);

        mTvMine = getActivity().findViewById(R.id.tv_ratings_mine);
        mTvMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemList.clear();
                mItemList.addAll(mMyItemList);
                ratingsListAdapter.notifyDataSetChanged();
            }
        });

        mTvHot = getActivity().findViewById(R.id.tv_ratings_hot);
        mTvHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemList.clear();
                mItemList.addAll(mHotItemList);
                ratingsListAdapter.notifyDataSetChanged();
            }
        });

        for (int i = 0; i <20; i++) {
            RatingsItem ratingsItem = new RatingsItem();
            ratingsItem.setProfilePicUrl(R.drawable.pic_profile_pic);
            ratingsItem.setUserName("Stephanie_" + i);
            ratingsItem.setDescription("description_" + i);
            ratingsItem.setPic1Url(R.mipmap.ic_launcher);
            ratingsItem.setPic2Url(R.mipmap.ic_launcher);
            ratingsItem.setPic3Url(R.mipmap.ic_launcher);
            ratingsItem.setPic4Url(R.mipmap.ic_launcher);
            ratingsItem.setPic5Url(R.mipmap.ic_launcher);
            mHotItemList.add(ratingsItem);
        }

        for (int i = 0; i <20; i++) {
            RatingsItem ratingsItem = new RatingsItem();
            ratingsItem.setProfilePicUrl(R.drawable.pic_profile_pic);
            ratingsItem.setUserName("Mine_" + i);
            ratingsItem.setDescription("description_" + i);
            ratingsItem.setPic1Url(R.mipmap.ic_launcher);
            ratingsItem.setPic2Url(R.mipmap.ic_launcher);
            ratingsItem.setPic3Url(R.mipmap.ic_launcher);
            ratingsItem.setPic4Url(R.mipmap.ic_launcher);
            ratingsItem.setPic5Url(R.mipmap.ic_launcher);
            mMyItemList.add(ratingsItem);
        }

        mItemList.clear();
        mItemList.addAll(mHotItemList);


        ratingsListAdapter = new RatingsListAdapter(getActivity(), R.layout.item_ratings, mItemList);
        mLvRatings.setAdapter(ratingsListAdapter);
    }

}

