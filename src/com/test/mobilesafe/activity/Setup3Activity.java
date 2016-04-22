package com.test.mobilesafe.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.test.mobilesafe.R;

/**
 * ��3��������ҳ
 * 
 * @author Kevin
 * 
 */
public class Setup3Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup3);
	}

	// ��һҳ
	public void next(View view) {
		startActivity(new Intent(this, Setup4Activity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_in, R.anim.tran_out);// ���붯�����˳�����
	}

	// ��һҳ
	public void previous(View view) {
		startActivity(new Intent(this, Setup2Activity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_previous_in,
				R.anim.tran_previous_out);// ���붯�����˳�����
	}
}
