package com.example.user.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.user.app2.R.layout.activity_right;

/**
 * Created by user on 08.10.2015.
 */
public class Activity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_right);
    }

    public void onClickRight(View view) {
        Intent intent = new Intent(Activity3.this, Activity2.class);
        startActivity(intent);
        finish();
    }

    public void onClickLeft(View view) {
        Intent intent = new Intent(Activity3.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
