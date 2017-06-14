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

public class DrawArcView extends View {
    private Paint mPaint = new Paint();

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.CYAN);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint.setTextSize(70);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        RectF rectF1 = new RectF(100, 100, 500, 500);
        RectF rectF2 = new RectF(600, 100, 1100, 500);
        /**
         * 0, 90, true
         * 三个参数：开始角度，扫过的角度，是否使用中心点
         */
        canvas.drawArc(rectF1, 0, 90, true, mPaint);
        canvas.drawArc(rectF2, 0, 90, false, mPaint);

        String text = "画圆弧,使用中心点和不使用中心点";
        canvas.drawText(text, 200, 150, mPaint);
    }
}
