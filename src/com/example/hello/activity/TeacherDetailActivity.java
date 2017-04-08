package com.example.hello.activity;

import com.example.hello.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class TeacherDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher_detail);
		
		// 从Intent获取数据
		int imageId = getIntent().getIntExtra("t_image", 0);
		String desc = getIntent().getStringExtra("t_desc");
		
		// 获取特定的视图
        ImageView imageView = (ImageView) findViewById(R.id.teacher_detail_image);
        TextView textView = (TextView) findViewById(R.id.teacher_detail_text);

        // 根据数据设置视图展现
        imageView.setImageResource(imageId);
        textView.setText(desc);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.teacher, menu);
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
