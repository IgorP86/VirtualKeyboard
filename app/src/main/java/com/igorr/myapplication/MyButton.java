package com.igorr.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewParentCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;

public class MyButton extends android.support.v7.widget.AppCompatButton {
    @SuppressLint("RestrictedApi")
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        //определение размеров экрана в рх
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float width = metrics.widthPixels/metrics.density - 80;

        int padding = (int) ((width / 3) * 0.2f);
        setPadding(padding, padding, padding, padding);
    //    setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        setAutoSizeTextTypeUniformWithConfiguration(5,100,2, TypedValue.COMPLEX_UNIT_SP);
    }
}