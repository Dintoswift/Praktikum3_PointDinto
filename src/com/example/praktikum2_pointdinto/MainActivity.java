package com.example.praktikum2_pointdinto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void klikinput(View view) {
    	EditText inputNamaTimA = (EditText) findViewById(R.id.input1a);
    	EditText inputNamaTimB = (EditText) findViewById(R.id.input1b);
    	
    	String namaTimA = inputNamaTimA.getText().toString();
    	Log.d(TAG, namaTimA);
    	
    	String namaTimB = inputNamaTimB.getText().toString();
    	Log.d(TAG, namaTimB);
    	
        Intent i = new Intent (MainActivity.this, Skor_activity.class);
		i.putExtra("Tim A", namaTimA);
		i.putExtra("Tim B", namaTimB);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
