package com.jahanzaib.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetAll(View view) {
        int resultA = 0;
        int resultB = 0;
        display(1);
    }

    protected void display(int num) {
        TextView result = (TextView) findViewById(R.id.resetall);
        result.setText(num);
    }

}