package com.example.user.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by user on 03.10.2015.
 */
public class Activity2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    public void onClickMain(View view) {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickLeft(View view) {
        Intent intent = new Intent(Activity2.this, Activity3.class);
        startActivity(intent);
        finish();
    }
}
