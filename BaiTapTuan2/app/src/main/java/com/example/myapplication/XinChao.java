package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class XinChao extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tạo TextView trực tiếp bằng Java
        TextView tv = new TextView(this);
        tv.setText("Xin chào Trần Đặng Tuấn Khanh");
        tv.setTextSize(24);

        // Hiển thị TextView làm giao diện chính
        setContentView(tv);
    }
}
