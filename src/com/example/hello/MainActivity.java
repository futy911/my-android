package com.example.hello;

import com.example.hello.activity.BaiduActivity;
import com.example.hello.activity.LocalWebActivity;
import com.example.hello.activity.TeacherListActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button baidu = (Button) findViewById(R.id.baidu);
		baidu.setOnClickListener(this);
		
		Button localweb = (Button) findViewById(R.id.localWeb);
		localweb.setOnClickListener(this);
		
		Button teacher = (Button) findViewById(R.id.teacher);
		teacher.setOnClickListener(this);
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

	@Override
	public void onClick(View v) {
		int id = v.getId();
		Intent intent = new Intent();
		switch (id) {
		case R.id.baidu:
			intent.setClass(this, BaiduActivity.class);
			startActivity(intent);
			break;
		case R.id.localWeb:
			intent.setClass(this, LocalWebActivity.class);
			startActivity(intent);
			break;
		case R.id.teacher:
			intent.setClass(this, TeacherListActivity.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
}
