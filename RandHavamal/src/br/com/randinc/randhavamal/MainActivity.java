package br.com.randinc.randhavamal;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	Random rand = new Random();
	Strings strings = new Strings();
	
	ImageButton btnBack;
	ImageButton btnShuffle;
	ImageButton btnAbout;
	ImageButton btnNext;
	
	TextView txtMessage;
	int var;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnBack = (ImageButton) findViewById(R.id.btnBack);
		btnShuffle = (ImageButton) findViewById(R.id.btnShuffle);
		btnAbout = (ImageButton) findViewById(R.id.btnAbout);
		btnNext = (ImageButton) findViewById(R.id.btnNext);
		txtMessage = (TextView) findViewById(R.id.txtMessage);
		
		
		txtMessage.setText(Html.fromHtml((getMessage())));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public String getMessage() {
		var = randonize();
		
		do {
			var = randonize();
		}while(var == 0 || var == 66);

		return strings.palavras[var];		
	}
	
	public String getMessageWithType(int type) {
		if(type == 0) {
			var--;
			if(var == 0) {
				var = 164;
			}
			return strings.palavras[var];
			
		}else {
			var++;
			
			if(var == 165) {
				var = 1;
			}
			return strings.palavras[var];
		}
	}
	
	public int randonize() {
		return rand.nextInt(165);
	}
	
	public void back(View v) {
		txtMessage.setText(Html.fromHtml(getMessageWithType(0)));
	}
	
	public void shuffle(View v) {
		txtMessage.setText(Html.fromHtml(getMessage()));
	}
	
	public void about(View v) {
		setContentView(R.layout.activity_edit);
	}
	
	public void next(View v) {
		txtMessage.setText(Html.fromHtml(getMessageWithType(1)));
	}
}
