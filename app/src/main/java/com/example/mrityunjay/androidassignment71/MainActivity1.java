package com.example.mrityunjay.androidassignment71;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {
// decleration
    private EditText searchField;
    private String searchString;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchField=(EditText) findViewById(R.id.search_field);// find id

    }  // open webpage
   public void openWebPage(View view){
       searchString = searchField.getText().toString();

// using intent to show another screen
       Intent intent=new Intent();
       intent.setAction(Intent.ACTION_VIEW);
       intent.setData(Uri.parse("https://www.google.com/search?q="+searchString));// set data
       startActivity(intent); // start activity




    }


    }
