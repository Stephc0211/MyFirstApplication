package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myfirstapplication.R;

public class TutorialUploadActivity extends AppCompatActivity {

    private EditText mEtUploadText;
    private TextureView mTxtvUploadPic;
    private Button mBtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_upload);

        mEtUploadText = findViewById(R.id.et_upload_tutorial_text);
        mTxtvUploadPic = findViewById(R.id.txtv_upload_tutorial_pic);
        mBtnUpload = findViewById(R.id.btn_upload_tutorial_btn);
    }
}
