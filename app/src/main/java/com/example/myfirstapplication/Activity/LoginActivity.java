package com.example.myfirstapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfirstapplication.MainActivity;
import com.example.myfirstapplication.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;

    private TextView mTvLoginPgRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);

        mEtUsername = findViewById(R.id.et_username);
        mEtPassword = findViewById(R.id.et_password);

        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(mEtUsername.getText())
                        && !TextUtils.isEmpty(mEtPassword.getText())) {

                    // 把基础数据存储到MyApplication

                    //　启动主页面
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this,"请输入正确的账号密码！",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mTvLoginPgRegister = findViewById(R.id.tv_login_page_register);
        mTvLoginPgRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        }

    }

