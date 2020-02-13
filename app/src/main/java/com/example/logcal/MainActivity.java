package com.example.logcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class MainActivity extends AppCompatActivity {

    private PublisherAdView mPublisherAdView;
    Button bt,logarithm,lawoflog,commonlog,characterandMantisa,logTable,findmantisa,antilog,log1025,log2654,log5574,log7599,anti049,anti5099,uselogTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button) findViewById(R.id.logcal);

        mPublisherAdView = findViewById(R.id.publisherAdView);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();
        mPublisherAdView.loadAd(adRequest);

        AdSize customAdSize = new AdSize(250, 250);
        PublisherAdView adView = new PublisherAdView(this);
        adView.setAdSizes(customAdSize);
        logarithm=(Button) findViewById(R.id.logrithm);
        lawoflog=(Button) findViewById(R.id.lawoflog);
        commonlog=(Button) findViewById(R.id.commonlog);
        characterandMantisa=(Button) findViewById(R.id.characterandMantisa);
        logTable=(Button) findViewById(R.id.logTable);
        findmantisa=(Button) findViewById(R.id.findmantisa);
        antilog=(Button) findViewById(R.id.antilog);
        log1025=(Button) findViewById(R.id.log1025);
        log2654=(Button) findViewById(R.id.log2654);
        log5574=(Button) findViewById(R.id.log5574);
        log7599=(Button) findViewById(R.id.log7599);
        anti049=(Button) findViewById(R.id.anti049);
        anti5099=(Button) findViewById(R.id.anti5099);
        uselogTable=(Button) findViewById(R.id.uselogTable);

    }

    public void logcal(View view) {
        Intent i=new Intent(MainActivity.this,logCalculator.class);
        i.putExtra("title", "Logrithmic Calculator");
        startActivity(i);
    }

    public void uselogTable(View view) {
        Intent i=new Intent(MainActivity.this,howToUseLogTable.class);
        i.putExtra("title", "How To Use Log Table");
        startActivity(i);
    }

    public void anti5099(View view) {
        Intent i=new Intent(MainActivity.this,antilog99.class);
        i.putExtra("title", "AntiLog from 50 to 99");
        startActivity(i);
    }

    public void anti049(View view) {
        Intent i=new Intent(MainActivity.this,antilog00.class);
        i.putExtra("title", "AntiLog from 00 to 49");
        startActivity(i);
    }

    public void log7599(View view) {

        Intent i=new Intent(MainActivity.this,log7599.class);
        i.putExtra("title", "Logs From 75 to 99");
        startActivity(i);
    }

    public void log5574(View view) {
        Intent i=new Intent(MainActivity.this,log5574.class);
        i.putExtra("title", "Logs From 55 to 74");
        startActivity(i);
    }

    public void log2654(View view) {
        Intent i=new Intent(MainActivity.this,log2554.class);
        i.putExtra("title", "Logs From 25 to 54");
        startActivity(i);
    }

    public void log1025(View view) {
        Intent i=new Intent(MainActivity.this,log1025.class);
        i.putExtra("title", "Logs From 10 to 24");
        startActivity(i);
    }


    public void antilog(View view) {
        Intent i=new Intent(MainActivity.this,antilogrithm.class);
        i.putExtra("title", "Antilogarithm");
        startActivity(i);
    }

    public void findmantisa(View view) {
        Intent i=new Intent(MainActivity.this,findMantissa.class);
        i.putExtra("title", "How to Find Mantissa");
        startActivity(i);
    }

    public void logTable(View view) {
        Intent i=new Intent(MainActivity.this,LogarithmicTable.class);
        i.putExtra("title", "Logarithmic Table");
        startActivity(i);
    }

    public void characterandMantisa(View view) {
        Intent i=new Intent(MainActivity.this,CommonLogrithm.class);
        i.putExtra("title", "Characteristic and Mantissa");
        startActivity(i);
    }

    public void commonlog(View view) {
        Intent i=new Intent(MainActivity.this,CommonLogrithm.class);
        i.putExtra("title", "Common Logarithms");
        startActivity(i);
    }

    public void lawoflog(View view) {
        Intent i=new Intent(MainActivity.this,LawsOflLog.class);
        i.putExtra("title", "Laws Of Logarithms");
        startActivity(i);
    }

    public void logarithm(View view) {
        Intent i=new Intent(MainActivity.this,Logarithms.class);
        i.putExtra("title", "Logrithms");
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
                /* DO EDIT */
                Toast.makeText(this, "Help Initilized", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add:
                /* DO ADD */
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_delete:
                /* DO DELETE */
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
