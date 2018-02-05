package com.medhatmhtt.tassbeh;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AfterSalah extends Activity {
    private int t3dadSob7an=0,t3dadElhamd=0,t3dadTakber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_layout);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void sob7an(View view){
        TextView t3dadText=(TextView) findViewById(R.id.Adad);
        if(t3dadSob7an<33){
            t3dadSob7an++;
            t3dadText.setText("أكملت سبحان الله "+t3dadSob7an);
        }
        else{
            t3dadText.setText("لقد أكملت سبحان الله");
        }
    }
    public void elhamdulillah(View view){
        TextView t3dadText=(TextView) findViewById(R.id.Adad);
        if(t3dadElhamd<33){
            t3dadElhamd++;
            t3dadText.setText("أكملت الحمد لله "+t3dadElhamd);
        }
        else{
            t3dadText.setText("لقد أكملت الحمد لله");
        }
    }
    public void allahAkber(View view){
        TextView t3dadText=(TextView) findViewById(R.id.Adad);
        if(t3dadTakber<33){
            t3dadTakber++;
            t3dadText.setText("أكملت اللهُ أكبر "+t3dadTakber);
        }
        else{
            t3dadText.setText("لقد أكملت اللهُ أكبر");
        }

    }
}
