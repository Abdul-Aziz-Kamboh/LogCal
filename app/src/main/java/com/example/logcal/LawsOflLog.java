package com.example.logcal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class LawsOflLog extends AppCompatActivity {
TextView tv;
    private float mScaleFactor = 1.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_ofl_log);
        tv=(TextView) findViewById(R.id.textView);

        tv.setText("Laws of Logarithms:\n" +
                "\n" +
                "First Law: log10 5 + log10 4 = log10(5 × 4) = log10 20\n" +
                "\n" +
                "Second Law: logA − logB = log A/B\n" +
                "\n" +
                "Third Law: logAn = nlogA\n" +
                "\n" +
                "log10 10 = 1\n" +
                "\n" +
                " loge e = 1");

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
