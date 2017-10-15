package c4q.nyc.myhelloworldandroidproject;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, " onCreate method has run!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart method has run!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume method has run!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause method has started!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop method has run!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy method has run!");
    }
}
