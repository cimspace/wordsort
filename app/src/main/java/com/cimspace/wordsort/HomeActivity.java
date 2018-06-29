package com.cimspace.wordsort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView txtAppName;
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
        initModel();
    }

    private void initView() {
        txtAppName = (TextView) findViewById(R.id.tv_app_name);
        btnPlay = (Button) findViewById(R.id.btn_play);
    }

    private void initModel() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumeGameActivity();
            }
        });
    }

    private void resumeGameActivity(){
        Intent intent = new Intent(HomeActivity.this, GameActivity.class);
        startActivity(intent);
    }
}
