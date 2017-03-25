package com.example.hello.adapter;

import java.util.List;

import com.example.hello.R;
import com.example.hello.R.id;
import com.example.hello.R.layout;
import com.example.hello.activity.TeacherActivity;
import com.example.hello.dto.Teacher;

import android.R.raw;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TeacherAdapter extends ArrayAdapter<Teacher> {

	public TeacherAdapter(Context context, int resource, List<Teacher> objects) {
		super(context, resource, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// 获取老师的数据
		final Teacher teacher = getItem(position); 
		// 创建布局
		View view = LayoutInflater.from(getContext()).inflate(R.layout.aa, 
				parent, false);
		// 获取ImageView和TextView
		ImageView imageView = (ImageView) view.findViewById(R.id.t_image);
		//TextView textView = (TextView) view.findViewById(R.id.t_text);
		// 根据老师数据设置ImageView和TextView的展现
		imageView.setImageResource(teacher.getImageId());
		TextView nameView = (TextView) view.findViewById(R.id.t_name);
		TextView ageView = (TextView) view.findViewById(R.id.t_age);
		//textView.setText(teacher.getName());
		nameView.setText(teacher.getName());
		ageView.setText("20"); 
		int width = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
		int height = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
		System.out.println(width);
		imageView.measure(width, height);
		System.out.println("imageView:"+imageView.getMeasuredWidth());
		nameView.measure(width, height);
		System.out.println("nameView:"+nameView.getMeasuredWidth());
		System.out.println("ageView:"+ageView.getMeasuredWidth());
		//事件
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getContext(), TeacherActivity.class);
				intent.putExtra("t_image", teacher.getImageId());
				intent.putExtra("t_desc", teacher.getDesc());
				getContext().startActivity(intent);
			}
		});
		return view;
	}


}
