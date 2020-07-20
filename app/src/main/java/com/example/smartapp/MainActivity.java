package com.example.smartapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

ImageView myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myImage =(ImageView) findViewById(R.id.mImageView);


    }


    myImage.setOnClickListener(new View.OnClickListener){
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        startActivity(intent);
    }
public void Audio_text(View view){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    Toast.makeText(getApplicationContext(), "text clicked", Toast.LENGTH_LONG).show();
}
    public void text_msg(View view){
        Intent intent = new Intent (this, ActivityTwo.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "text clicked", Toast.LENGTH_LONG).show();
    }



}