package com.technohack.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class CustomButton extends AppCompatButton {


    private Context mContext;

    public CustomButton(Context context) {
        super(context);
        init(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context){

        mContext=context;

    }

    //this method will help you to customise your button
    @Override
    protected void onDraw(Canvas canvas) {
        if(isPressed()){
            setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_pressed));
        }else{
            setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_not_pressed));

        }
        setTextColor(getResources().getColor(R.color.custom_btn_color));
        super.onDraw(canvas);

    }
}
