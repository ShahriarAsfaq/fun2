package com.example.funjokes;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
//import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Jokes factbook = new Jokes();
    private Button igmb;
    private Button yes;
    private Button no;
    private RelativeLayout layout;
    private TextView text;
    //private ScrollView scroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView)findViewById(R.id.textView);
        igmb= (Button) findViewById(R.id.Button);
        layout= findViewById(R.id.layout);
        //scroll= (ScrollView)findViewById(R.id.scroll);
        yes= (Button)findViewById(R.id.yes);
        no= (Button)findViewById(R.id.no);


        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            String fact= factbook.getfact();
            text.setText(fact);
            layout.setBackgroundColor(Color.GRAY);
            text.setTextColor(Color.BLUE);
            igmb.setText("Wanna hear another?");
            }
        };
        yes.setOnClickListener(listener);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
