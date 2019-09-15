package com.example.myfirstapplication.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfirstapplication.Adapter.RatingsListAdapter;
import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.RatingsItem;

import java.util.ArrayList;
import java.util.List;

public class RatingsListActivity extends AppCompatActivity {

    private ListView mRatingsLv;
    private TextView mTvUpload;

    private RatingsListAdapter ratingsListAdapter;
    private List<RatingsItem> mRatingsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings_list);
        mRatingsLv = findViewById(R.id.lv_ratings_list);

        mTvUpload = findViewById(R.id.tv_upload_ratings);
        mTvUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RatingsListActivity.this, RatingsUploadActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i<20 ; i++) {
            RatingsItem  ratingsItem = new RatingsItem();
            ratingsItem.setPic1Url(R.drawable.pic_profile_pic);
            ratingsItem.setUserName("Stephanie_" + i);
            ratingsItem.setDescription("description_" + i);
            ratingsItem.setPic1Url(R.drawable.pic_sell);
            ratingsItem.setPic2Url(R.drawable.pic_sell);
            ratingsItem.setPic3Url(R.drawable.pic_sell);
            ratingsItem.setPic4Url(R.drawable.pic_sell);
            ratingsItem.setPic5Url(R.drawable.pic_sell);
            mRatingsList.add(ratingsItem);
        }

        ratingsListAdapter = new RatingsListAdapter(RatingsListActivity.this,
                R.layout.item_ratings, mRatingsList);

        mRatingsLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RatingsListActivity.this, "you click item" + i + " " +
                        mRatingsList.get(i).getUserName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}
