package com.example.praktikum2_pointdinto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Skor_activity extends Activity {
	int pointA = 0;
	int pointB = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skor_activity);
		
		TextView namaTimA = (TextView) findViewById(R.id.TV1a);
		TextView namaTimB = (TextView) findViewById(R.id.TV1b);
		
		String namaA = getIntent().getStringExtra("Tim A");
		String namaB = getIntent().getStringExtra("Tim B");
		
		namaTimA.setText("Team" + " " + namaA);
		namaTimB.setText("Team" + " " + namaB);
	}
	
	public void Tambah (View view){
		if (view.getId()== R.id.skora1){
			pointA = pointA + 1;
		}else if (view.getId()== R.id.skora2){
			pointA = pointA + 2;
		}else if (view.getId()== R.id.skora3){
			pointA = pointA + 3;
		}else if (view.getId()== R.id.skorb1){
			pointB = pointB + 1;
		}else if (view.getId()== R.id.skorb2){
			pointB = pointB + 2;
		}else if (view.getId()== R.id.skorb3){
			pointB = pointB + 3;	
		}
		TextView skorTimA = (TextView) findViewById(R.id.point_a);
		TextView skorTimB = (TextView) findViewById(R.id.point_b);
		
		skorTimA.setText(String.valueOf(pointA));
		skorTimB.setText(String.valueOf(pointB));
	}
	
	public void Reset (View view){
		if(view.getId()== R.id.reset1a){
			pointA=0;
		}else if (view.getId()== R.id.reset1b){
			pointB=0;
		}
		TextView skorTimA = (TextView) findViewById(R.id.point_a);
		TextView skorTimB = (TextView) findViewById(R.id.point_b);
		
		skorTimA.setText(String.valueOf(pointA));
		skorTimB.setText(String.valueOf(pointB));
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.skor_activity, menu);
		return true;
	}

}
