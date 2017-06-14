package com.wangzai.view.canvas.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangzai on 2017/6/14.
 */

public class DrawRectView extends View {
    private Paint mPaint = new Paint();

    public DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.DKGRAY);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint.setTextSize(70);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(100, 100, 500, 300);
        RectF rectF1 = new RectF(600, 100, 1100, 300);
        canvas.drawRect(rectF, mPaint);
        canvas.drawRoundRect(rectF1, 30, 30, mPaint);

        String text = "画矩形";
        canvas.drawText(text, 800, 500, mPaint);
    }
}
