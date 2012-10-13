package com.example.voicerec05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    	final EditText edttxt_fb = (EditText) findViewById(R.id.edttxt_fb);
        Button btn_speak = (Button) findViewById(R.id.btn_speak);
        Button btn_translate = (Button) findViewById(R.id.btn_translate);

        btn_speak.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
          	    if (v.getId() == R.id.btn_speak) {
        		  edttxt_fb.setText("shut up it's not that bad!!!");
                }   
          }
        });

        btn_translate.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
          	    if (v.getId() == R.id.btn_translate) {
        		  edttxt_fb.setText("dushbag!!!");
                }   
          }
        });
    
    
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

    
    
    
    
	private static final int VR_REQUEST = 999;
	//ListView for displaying suggested words
	private ListView wordList;
	//Log tag for output information
	private final String LOG_TAG = "SpeechRepeatActivity";//***enter your own tag here***
	//TTS variables
	//variable for checking TTS engine data on user device
	private int MY_DATA_CHECK_CODE = 0;
	//Text To Speech instance
	private TextToSpeech repeatTTS;

	//find out whether speech recognition is supported
//	PackageManager packManager = getPackageManager();
//	List<ResolveInfo> intActivities = packManager.queryIntentActivities(new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);

	    
    
}
