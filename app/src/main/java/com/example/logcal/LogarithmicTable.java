package com.example.logcal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class LogarithmicTable extends AppCompatActivity {
    TextView tv,tv1;
ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logarithmic_table);
        tv=(TextView) findViewById(R.id.textt);
        tv.setText("In mathematics, the logarithm table is used to find the value of the logarithmic function. \n" +
                "The simplest way to find the value of the given logarithmic function is by using the log table.");
        tv1=(TextView) findViewById(R.id.text1);
        im=(ImageView) findViewById(R.id.img);

        tv1.setText("Understand the concept of the logarithm.\n Each log table is only usable with a certain base.\n The most common type of logarithm table is used is log base 10.");
        ActionBar actionBar=getSupportActionBar();

        //  mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
        Intent i=getIntent();
        String title=i.getStringExtra("title");
        actionBar.setTitle(title);

        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
