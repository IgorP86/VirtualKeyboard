package com.igorr.myapplication;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

public class MyConstraint extends ConstraintLayout {
    public MyConstraint(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }
}
