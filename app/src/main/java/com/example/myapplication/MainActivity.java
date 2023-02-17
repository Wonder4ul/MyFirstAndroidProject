package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected static final String TAG = "MyApplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText( getApplicationContext(), "Initialize onCreate", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
    }
    @Override
    protected void onStart() {
        Toast.makeText( getApplicationContext(), "Initialize onStart", Toast.LENGTH_LONG).show();
        super.onStart();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");

    }
    @Override
    protected void onResume() {
        Toast.makeText( getApplicationContext(), "Initialize onResume", Toast.LENGTH_LONG).show();
        super.onResume();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
    }
    @Override
    protected void onPause() {
        Toast.makeText( getApplicationContext(), "Initialize onPause", Toast.LENGTH_LONG).show();
        super.onPause();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText( getApplicationContext(), "Initialize onStop", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
        if (isFinishing())
            finish();

    }
    @Override
    protected void onDestroy() {
        Toast.makeText( getApplicationContext(), "Initialize onDestroy", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText( getApplicationContext(), "Initialize onRestart", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Initialize error log string");
        Log.w(TAG, "Initialize warning log string");
        Log.i(TAG, "Initialize information log string");
        Log.d(TAG, "Initialize debug log string");
        Log.v(TAG, "Initialize verbose log string");
    }
}