package com.wangzai.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wangzai.view.canvas.draw.DrawActivity;
import com.wangzai.view.canvas.operation.OperationActivity;
import com.wangzai.view.touchevent.TouchEventActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
    }


    private void findView() {

        findViewById(R.id.llExamples);
        findViewById(R.id.tvDrawColor).setOnClickListener(this);
        findViewById(R.id.tvOperation).setOnClickListener(this);
        findViewById(R.id.tvTouchEvent).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvDrawColor:
                Intent drawIntent = new Intent(this, DrawActivity.class);
                startActivity(drawIntent);
                break;
            case R.id.tvOperation:
                Intent operationIntent = new Intent(this, OperationActivity.class);
                startActivity(operationIntent);
                break;
            case R.id.tvTouchEvent:
                Intent touchEventIntent = new Intent(this, TouchEventActivity.class);
                startActivity(touchEventIntent);
                break;
        }
    }
}
