package com.lizhidu.scrollview_title;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnScrollChangeListener, View.OnTouchListener {
    private LinearLayout title;
    private ScrollView mScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (LinearLayout) findViewById(R.id.ll_title);
        mScrollView = (ScrollView) findViewById(R.id.sl_view);
        mScrollView.setOnScrollChangeListener(this);
        mScrollView.setOnTouchListener(this);
    }

    @Override
    public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

        if (v!=null){
            Log.d("log","new"+"="+"x="+scrollX+"--"+"y="+scrollY);
            Log.d("log","old"+"="+"x="+oldScrollX+"--"+"y="+oldScrollY);
//            if (){
//
//            }


        }else{
            Toast.makeText(this,"scrollview is null!",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {


        return false;
    }
}
