package com.example.minapplikation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("AppInfo", "Activity created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        Log.i("AppInfo","Activity started");
        super.onStart();
    }


    @Override
    protected void onRestart() {
        Log.i("AppInfo","Activity restarted");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("AppInfo","Activity paused");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i("AppInfo","Activity resumed");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i("AppInfo","Activity stopped");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("AppInfo","Activity destroyed");
        super.onDestroy();
    }
}


 // TODO Implement the 6 lifecycle callback methods:
//onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
// TODO Write a Log message in each of these methods and look up in the logcat to see when they a called