package com.example.gestorfinanceiroyokota;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadDecActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cad_dec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cad_dec, menu);
		return true;
	}

}
