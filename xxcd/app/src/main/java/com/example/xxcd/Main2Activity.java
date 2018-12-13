package com.example.xxcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //获取传递过来的数据
        Intent intent=getIntent();
        tx= (TextView)findViewById(R.id.tx1);
        //读取消息
        String xiaoxi=intent.getStringExtra("信息");
        tx.setText(xiaoxi);
    }
}
