package com.mehedi.j_customview.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.mehedi.j_customview.R;

public class FirstCustomView extends View {
    Rect rect;
    Paint paint;


    public FirstCustomView(Context context) {
        super(context);
        init(null);
    }

    public FirstCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FirstCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public FirstCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {
        rect = new Rect();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(getResources().getColor(R.color.purple_200));


    }

    public void swapColor() {

        paint.setColor(paint.getColor() == getResources().getColor(R.color.purple_200) ? getResources().getColor(R.color.teal_200) : getResources().getColor(R.color.purple_200));
       invalidate();


    }


    @Override
    protected void onDraw(Canvas canvas) {
        //  canvas.drawColor(Color.BLUE);


        rect.left = 0;
        rect.top = 0;
        rect.right = rect.left + 1000;
        rect.bottom = rect.top + 140;


        canvas.drawRect(rect, paint);


    }
}
