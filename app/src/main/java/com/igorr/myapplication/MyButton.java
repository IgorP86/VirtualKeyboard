package com.igorr.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewParentCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;

public class MyButton extends android.support.v7.widget.AppCompatButton {
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        //определение размеров экрана в рх
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int width = metrics.widthPixels - (48 + 14) * (int) metrics.density;

        int padding = (int) (((float) (width / 6)) * 0.35f);
        setPadding(padding, padding, padding, padding);
    }
}