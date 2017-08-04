package com.example.raodanish.dani1;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signup(View view)
    {
        Intent startNewActivity =new Intent(this, signupactivity.class);
        startActivity(startNewActivity);
    }
    public void signin(View view)
    {
        Intent startNewActivity =new Intent(this, signinactivity.class);
        startActivity(startNewActivity);
    }

}
