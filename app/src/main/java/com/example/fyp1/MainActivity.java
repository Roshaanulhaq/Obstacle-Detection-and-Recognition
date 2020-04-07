package com.example.fyp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Toast;

//import com.google.android.material.tabs.TabItem;
//import com.google.android.material.tabs.TabLayout;

import java.util.Locale;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment startingfrag=new homefrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                startingfrag).addToBackStack(null).commit();



    }




    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
