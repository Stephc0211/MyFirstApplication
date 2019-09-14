package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myfirstapplication.Adapter.TutorialsAdapter;
import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.TutorialItem;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private TutorialsAdapter mTutorialAdapter;
    private List<TutorialItem> mItemList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        mRecyclerView = findViewById(R.id.rv_tutorial);

        for (int i = 0; i<20;  i++) {
            TutorialItem tutorialItem = new TutorialItem();
            tutorialItem.setmTutorialPicUrl(R.drawable.pic_sell);
            tutorialItem.setmTutorialIntro("This is my recent project");
            mItemList.add(tutorialItem);
        }

        mTutorialAdapter = new TutorialsAdapter(TutorialActivity.this,
                R.layout.item_tutorials_recycler_view, mItemList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TutorialActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mTutorialAdapter);

    }
}
