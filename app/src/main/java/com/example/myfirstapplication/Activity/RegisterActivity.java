package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.Toast;

import com.example.myfirstapplication.MainActivity;
import com.example.myfirstapplication.R;

public class RegisterActivity extends AppCompatActivity {

    private Button mBtnRegister;

    private EditText mUsername;
    private EditText mPassword;
    private EditText mConfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUsername = findViewById(R.id.et_set_username);
        mPassword = findViewById(R.id.et_set_password);
        mConfirmPassword = findViewById(R.id.et_confirm_password);

        mBtnRegister = findViewById(R.id.btn_register);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(mUsername.getText())
                        && !TextUtils.isEmpty(mPassword.getText())
                            && !TextUtils.isEmpty(mConfirmPassword.getText())) {
                    if(mPassword.equals(mConfirmPassword)){
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(RegisterActivity.this,"请同一密码!", Toast.LENGTH_SHORT).show();
                    }
                    // 把基础数据存储到MyApplication

                    //　启动主页面
                }else {
                    Toast.makeText(RegisterActivity.this,"请输入信息！",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
