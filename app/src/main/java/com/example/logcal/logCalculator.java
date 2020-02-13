package com.example.logcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logCalculator extends AppCompatActivity {
    Button cl,log,anti;
    EditText nu,ba,re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_calculator);
        //setting action bar title
        Intent i=getIntent();
        String title=i.getStringExtra("title");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cl=(Button) findViewById(R.id.clear);
        log=(Button) findViewById(R.id.log);
        anti=(Button) findViewById(R.id.antilog);
        nu=(EditText) findViewById(R.id.num);
        ba=(EditText) findViewById(R.id.base);
        re=(EditText) findViewById(R.id.res);


        String number=nu.getText().toString();
        String base=nu.getText().toString();

    }

    public void clear(View view) {
        nu.setText("");
        ba.setText("");
        re.setText("");
    }

    public void log(View view) {
        re.setVisibility(View.VISIBLE);

        String number=nu.getText().toString();
        String base=nu.getText().toString();
        double b=Double.parseDouble(base);
        double n=Double.parseDouble(number);
        double result=Math.log(n)/Math.log(b);
        String finalresult=new Double(result).toString();
        re.setText(finalresult);
    }


    public void antilog(View view) {
        re.setVisibility(View.VISIBLE);
        String number=nu.getText().toString();
        String base=nu.getText().toString();
        double b=Double.parseDouble(base);
        double n=Double.parseDouble(number);
        double as= Math.pow(b,n);

      String finalres=new Double(as).toString();
          re.setText(finalres);
    }

}
