package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myfirstapplication.R;

public class RatingsUploadActivity extends AppCompatActivity {

    private EditText mEtUploadText;
    private ImageView mIvUploadPic;
    private Button mBtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_ratings);

        mEtUploadText = findViewById(R.id.et_upload_text);
        mIvUploadPic = findViewById(R.id.iv_upload_pic);
        mBtnUpload = findViewById(R.id.btn_upload_btn);

    }
}
