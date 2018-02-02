package com.medhatmhtt.tassbeh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForU extends Activity {
    private int Adad=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_u);
    }
    public void press(View view){
        Adad++;
        TextView t3dadText=(TextView) findViewById(R.id.AdadForU);
        t3dadText.setText(""+Adad);
    }
    public void reset(View view){
        Adad=0;
        TextView t3dadText=(TextView) findViewById(R.id.AdadForU);
        t3dadText.setText(""+Adad);
    }
}
