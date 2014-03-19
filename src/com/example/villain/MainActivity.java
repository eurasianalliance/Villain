package com.example.villain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	public final static String PLAYER1_CHOICE = "com.example.villain.PLAYER1_CHOICE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = getIntent();
		String playername = intent.getExtras().getString(StartScreen.PLAYER_NAME);
		
		TextView t1 = (TextView) findViewById(R.id.playerName1);
		TextView t2=(TextView) findViewById(R.id.playerName2);

		Log.i(playername, "before TextView edit (MainActivity)"+t1.isInEditMode()+" " + t2.isInEditMode());

		t1.setText(playername);
		
		t2.setText(playername);
		Log.i(playername, "after TextView edit (MainActivity)"+t1.isInEditMode()+" " + t2.isInEditMode());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 @Override
    protected void onResume() {
    	super.onResume();
    	Log.i("MY_MESSAGE", "in onResume (MainActivity)");
    }
	    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i("MY_MESSAGE", "in onPause (MainActivity)");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i("MY_MESSAGE", "in onStop (MainActivity)");
    }	

    public void onClick(View v) {
        // 1) Possibly check for instance of first 
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        TextView p1_choice = (TextView) findViewById(R.id.playerChoice);
        p1_choice.setText(buttonText);
    }
}
