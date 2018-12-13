package com.example.xxcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.et);
        button=(Button) findViewById(R.id.but);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关联两个Activity
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                String putText=editText.getText().toString();
                intent.putExtra("信息",putText);
                startActivity(intent);
            }
        });





    }
}
