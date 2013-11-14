package com.maxhorstmann.whatshouldidonow;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button mButton;
	TextView mSuggestion;
	Random random = new Random();
	int last = -1;

	String[] suggestions = new String[] { 
			"Read a book!",
			"Call a friend!",
			"Sign up for a volunteer project!",
			"Go for a walk outside!",
			"Call someone in your family you haven't talked to in a while!",
			"Cook something!",
			"Work out!",
			"Sign up for a dance class!",
			"Clean your apartment!",
			"Say hi to your neighbor!",
			"Take a nap!",
			"Read another book!",
			"Write a short story!",
			"Look at some old photos!",
			"Plan your next vacation!",
			"Read a newspaper!",
			"Apologize to someone!",
			"Buy a gift for a friend!",
			"Send a postcard to a friend",
			"Do ten push-ups!",
			"Sing a song!",
			"Buy concert tickets!",
			"Lit a few candles!",
			"Take a bath!",
			"Write a poem!",
			"Smile!"			
			};
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton = (Button)findViewById(R.id.button);
		mSuggestion = (TextView)findViewById(R.id.suggestion);
		
		mButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int i=last;
				while (i==last) {
					i = random.nextInt(suggestions.length);
				}
				mSuggestion.setText(suggestions[i]);
			
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
