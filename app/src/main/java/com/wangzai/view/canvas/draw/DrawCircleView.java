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

public class DrawCircleView extends View {
    private Paint mPaint = new Paint();

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.GREEN);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint.setTextSize(70);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(500, 300, 200, mPaint);

        String text = "画圆";
        canvas.drawText(text, 800, 300, mPaint);
    }
}
