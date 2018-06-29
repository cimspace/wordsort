package com.cimspace.wordsort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TableLayout badWordPanel, correctWordPanel;
    TextView tvName;
    String[] wordArray;
    String data, correctWord="";
    int index;
    Button[] btnBad, btnCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        initView();
        initModel();
    }

    private void initView() {
        badWordPanel = (TableLayout) findViewById(R.id.bad_word);
        correctWordPanel = (TableLayout) findViewById(R.id.correct_word);
//        tvName = (TableLayout) findViewById(R.id.tv_app_name);
    }

    private void initModel() {
    }
}
