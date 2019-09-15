package com.example.myfirstapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myfirstapplication.Activity.LoginActivity;
import com.example.myfirstapplication.Activity.RatingsListActivity;
import com.example.myfirstapplication.Activity.SellingListActivity;
import com.example.myfirstapplication.Activity.TutorialActivity;
import com.example.myfirstapplication.Adapter.RatingsListAdapter;
import com.example.myfirstapplication.R;

public class MainFragment extends Fragment {

    private TextView mTvRatings;
    private TextView mTvSelling;
    private TextView mTvTutorials;
    private TextView mTvVolunteerOpp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mTvSelling = view.findViewById(R.id.tv_sell);
        mTvSelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SellingListActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        mTvTutorials = view.findViewById(R.id.tv_tutorials);
        mTvTutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TutorialActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        mTvRatings = view.findViewById(R.id.tv_ratings);
        mTvRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "暂未开放", Toast.LENGTH_SHORT).show();
            }
        });

        mTvVolunteerOpp = view.findViewById(R.id.tv_volunteer_opportunities);
        mTvVolunteerOpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "暂未开放", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();
        initData();

    }

    // 初始化布局
    private void initView(){

    }

    // 初始化数据
    private void initData(){

    }
}
