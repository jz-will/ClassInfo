package com.zusin.classinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

// TODO: 2019/4/16 完成login控件的响应来跳转页面 
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }
}
