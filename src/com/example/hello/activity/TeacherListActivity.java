package com.example.hello.activity;

import com.example.hello.R;
import com.example.hello.adapter.TeacherAdapter;
import com.example.hello.dto.Teacher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class TeacherListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher_list);

		TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_list_item, Teacher.getAllTeachers());
		ListView listView = (ListView) findViewById(R.id.teacher_listView);
		listView.setAdapter(teacherAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.teacher, menu);
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
