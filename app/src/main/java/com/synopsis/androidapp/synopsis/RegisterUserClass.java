package com.synopsis.androidapp.synopsis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * Created by User on 7/13/2016.
 */
public class RegisterUserClass extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_user_page);
    }
    public  void termsfn(View view)
    {
        startActivity(new Intent(getApplicationContext(),Terms_conditionsClass.class));

    }
}
