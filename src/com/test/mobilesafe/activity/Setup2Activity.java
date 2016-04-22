package com.test.mobilesafe.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.test.mobilesafe.R;

/**
 * ��2��������ҳ
 * 
 * @author Kevin
 * 
 */
public class Setup2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup2);
	}

	// ��һҳ
	public void next(View view) {
		startActivity(new Intent(this, Setup3Activity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_in, R.anim.tran_out);// ���붯�����˳�����
	}

	// ��һҳ
	public void previous(View view) {
		startActivity(new Intent(this, Setup1Activity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_previous_in,
				R.anim.tran_previous_out);// ���붯�����˳�����
	}
}
