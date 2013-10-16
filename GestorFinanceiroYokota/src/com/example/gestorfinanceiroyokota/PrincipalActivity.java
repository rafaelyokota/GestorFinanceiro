package com.example.gestorfinanceiroyokota;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
	public void onClick(View v){
		
		
		switch(v.getId()){
		case R.id.button1:
			break;
		case R.id.button2:
			break;
		case R.id.button3:
			break;
		case R.id.button4:
			this.finish();
			break;
		default:
			break;
		
		}
		
		
	}

}
