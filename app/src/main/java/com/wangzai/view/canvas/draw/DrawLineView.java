package com.wangzai.view.canvas.draw;

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

public class DrawLineView extends View {
    private Paint mPaint = new Paint();

    public DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint.setTextSize(70);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(200, 100, 500, 100, mPaint);
        canvas.drawLines(new float[]{
                200, 200, 300, 200,
                200, 300, 300, 300
        }, mPaint);

        String text = "画线";
        canvas.drawText(text, 700, 300, mPaint);
    }
}
