package br.com.randinc.randhavamal;

import java.io.IOException;

import org.apache.http.impl.entity.StrictContentLengthStrategy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
	
public class Edit extends Activity {
	
	TextView txtDados;
	EditText txtNome;
	EditText txtIdade;
	Button btnCreate;
	Button bntUpdate;
	Button btnDelete;
	Button btnRead;
	Button btnRecarregar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
		
		
		txtDados = (TextView) findViewById(R.id.txtDados);
		txtNome = (EditText) findViewById(R.id.txtNome);
		txtIdade = (EditText) findViewById(R.id.txtIdade);
		btnCreate = (Button) findViewById(R.id.btnCreate);
		bntUpdate = (Button) findViewById(R.id.btnUpdate);
		btnDelete = (Button) findViewById(R.id.btnDelete);
		btnRead = (Button) findViewById(R.id.btnRead);
		btnRecarregar = (Button) findViewById(R.id.btnRecarregar);
		
		btnCreate.setOnClickListener(new View.OnClickListener() {
			@TargetApi(Build.VERSION_CODES.GINGERBREAD)
			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				try {
					StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
					StrictMode.setThreadPolicy(policy);
					
					OkHttpClient client = new OkHttpClient();
					
					HttpUrl.Builder urlBuilder = HttpUrl.parse("http://192.168.10.101/extern/create.php").newBuilder();
					urlBuilder.addQueryParameter("nome", txtNome.getText().toString());
					urlBuilder.addQueryParameter("idade", txtIdade.getText().toString());
					
					
					String url = urlBuilder.build().toString();
					
					Request request = new Request.Builder()
							.url(url)
							.build();
					
					client.newCall(request).enqueue(new Callback() {
						@Override
						public void onFailure(Call call, IOException e) {
							txtDados.setText("erro");
						}
						
						@Override
						public void onResponse(Call call, final Response response) throws IOException {
							runOnUiThread(new Runnable() {
								public void run() {
									try {
										txtDados.setText(response.body().toString());
									} catch (Exception e) {
										e.printStackTrace();
									}
									
								}
							});
						}
						
						;
					});
				
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit, menu);
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
	
	
}
