package com.measure.measure.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMeasure(View v) {
        Log.d("aaa", "aaa");
    }

    public void setVal1(View v, String val) {
        TextView val1 = (TextView) findViewById(R.id.val1);
        val1.setText("Value 1 : " + val);
    }

    public void setVal2(View v, String val) {
        TextView val2 = (TextView) findViewById(R.id.val2);
        val2.setText("Value 2 : " + val);
    }

    public void setVal3(View v, String val) {
        TextView val3 = (TextView) findViewById(R.id.val3);
        val3.setText("Value 3 : " + val);
    }
}
