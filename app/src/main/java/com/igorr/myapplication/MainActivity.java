package com.igorr.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.ViewParent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyButton b = findViewById(R.id.b_one0);
        CardView parent = (CardView) b.getParent().getParent().getParent().getParent();
        parent.measure(0, 0);
        int h = parent.getMeasuredHeight();
        int w = parent.getMeasuredWidth();
    }
}
