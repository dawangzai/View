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

public class DrawPointView extends View {
    private Paint mPaint = new Paint(); //创建一个画笔

    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();

    }

    private void initPaint() {
        mPaint.setColor(Color.RED);         //设置画笔颜色
        /**
         * Paint.Style.FILL 只填充
         * Paint.Style.STROKE 只描边
         * Paint.Style.FILL_AND_STROKE 填充加描边
         */
        mPaint.setStyle(Paint.Style.FILL);  //设置画笔模式为填充
        mPaint.setStrokeWidth(30f);         //设置画笔的宽度为10px

        mPaint.setTextSize(70);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPoint(200, 100, mPaint);       //在坐标（200,200）位置绘制一个点
        canvas.drawPoints(new float[]{
                300, 200,
                300, 300,
                300, 400}, mPaint);

        String text = "画点";
        canvas.drawText(text, 700, 300, mPaint);
    }
}
