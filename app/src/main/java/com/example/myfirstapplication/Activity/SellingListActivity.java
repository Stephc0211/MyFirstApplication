package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myfirstapplication.Adapter.SellingListAdapter;
import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.RatingsItem;
import com.example.myfirstapplication.bean.SellingItem;

import java.util.ArrayList;
import java.util.List;

public class SellingListActivity extends AppCompatActivity {

    private ListView mSellingLv;

    private SellingListAdapter sellingListAdapter;
    private List<SellingItem> mSellingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling_list);
        mSellingLv = findViewById(R.id.lv_selling_list);

        for (int i = 0; i<20 ; i++) {
            SellingItem sellingItem = new SellingItem();
            sellingItem.setProfilePicUrl(R.drawable.pic_profile_pic);
            sellingItem.setUserName("Stephanie");
            mSellingList.add(sellingItem);
        }

        sellingListAdapter = new SellingListAdapter(SellingListActivity.this,
                R.layout.item_selling, mSellingList);

        mSellingLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SellingListActivity.this, "you clicked item" + i + " " +
                        mSellingList.get(i).getUserName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
