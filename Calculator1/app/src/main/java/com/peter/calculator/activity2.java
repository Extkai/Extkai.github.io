package com.peter.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ydkf051 on 2017/12/27.
 */

    public class activity2 extends Activity{
    private Button bt;
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}

