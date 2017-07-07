package com.zqg.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.zqg.annotationdemo.rapper.Rapper;
import com.zqg.annotationdemo.rapper.RapperUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView test = (TextView) findViewById(R.id.test);
        test.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                RapperUtils.getRapperInfo(Rapper.class);
            }
        });
    }
}
