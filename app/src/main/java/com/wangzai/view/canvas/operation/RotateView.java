package com.wangzai.view.canvas.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangzai on 2017/6/15.
 */

public class RotateView extends View {
    private Paint mPaint = new Paint();
    private int mHeight;
    private int mWidth;

    public RotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10f);
        mPaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mHeight = h;
        mWidth = w;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate(mWidth / 2, mHeight / 2);  //把画布原点移动到控件中心

        canvas.drawCircle(0, 0, 300, mPaint);  //大圆套小圆
        canvas.drawCircle(0, 0, 500, mPaint);

        for (int i = 0; i < 36; i++) {
            canvas.drawLine(0, -300, 0, -500, mPaint);
            canvas.rotate(10);
        }
    }
}
