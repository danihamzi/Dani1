package com.example.raodanish.dani1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signupactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
    }
    public void signin(View view)
    {
        Intent startNewActivity =new Intent(this, signinactivity.class);
        startActivity(startNewActivity);
    }
}
