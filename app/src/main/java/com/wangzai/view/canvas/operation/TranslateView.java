package com.wangzai.view.canvas.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangzai on 2017/6/14.
 */

public class TranslateView extends View {
    private Paint mPaint = new Paint();

    public TranslateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint.setTextSize(70);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate(200, 200);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(0, 0, 200, mPaint);

        canvas.translate(300, 300);  //位移是叠加的
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(0, 0, 200, mPaint);
    }
}
