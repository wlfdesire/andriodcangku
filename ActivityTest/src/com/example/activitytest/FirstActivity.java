package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.firsr_layout);
		Button button1 = (Button)findViewById(R.id.button_1);
		
		button1.setOnClickListener(new OnClickListener(){
			@Override
			/*public void onClick(View v){
				Toast.makeText(FirstActivity.this, "You clicked button 1", 
						Toast.LENGTH_SHORT).show();
			}*/
			/*public void onClick(View v){
				finish();
			}*/
			public void onClick(View v){
				//Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				//Intent intent = new Intent("com.example.activitytest.ACTION_START");
				//intent.addCategory("com.example.activitytest.MY_CATEGORY");
				//Intent intent = new Intent(Intent.ACTION_VIEW);
				//intent.setData(Uri.parse("http://www.baidu.com"));
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		return true;
	}
}
