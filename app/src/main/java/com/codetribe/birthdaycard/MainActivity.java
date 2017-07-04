package com.codetribe.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtm=(TextView)findViewById(R.id.textView4);
        String message="To my lovely Niece Karabo Hope Machabaphala, may dearest God bless you, Have a nice day. 30-May-2017";
        txtm.setText(message);





    }
}
