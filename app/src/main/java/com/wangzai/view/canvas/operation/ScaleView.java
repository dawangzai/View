package com.wangzai.view.canvas.operation;

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

public class ScaleView extends View {
    private Paint mPaint = new Paint();
    private int mWidth;
    private int mHeight;

    public ScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10f);
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

        canvas.translate(mWidth / 2, mHeight / 2);
        RectF rectF = new RectF(0, -400, 400, 0);
        canvas.drawRect(rectF, mPaint);

        canvas.scale(0.5f, 0.5f); //以画布画布中心点为原点缩放一半
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(rectF, mPaint);

        canvas.scale(0.5f, 0.5f, 200, 0); //以（200,0）为原点缩放画布
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(rectF, mPaint);

    }
}
