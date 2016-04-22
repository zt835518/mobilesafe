package com.test.mobilesafe.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.test.mobilesafe.R;

/**
 * ��4��������ҳ
 * 
 * @author Kevin
 * 
 */
public class Setup4Activity extends Activity {

	private SharedPreferences mPref;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup4);

		mPref = getSharedPreferences("config", MODE_PRIVATE);
	}

	// ��һҳ
	public void next(View view) {
		startActivity(new Intent(this, LostFindActivity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_in, R.anim.tran_out);// ���붯�����˳�����

		mPref.edit().putBoolean("configed", true).commit();// ����sp,��ʾ�Ѿ�չʾ����������,�´ν����Ͳ�չʾ��
	}

	// ��һҳ
	public void previous(View view) {
		startActivity(new Intent(this, Setup3Activity.class));
		finish();

		// ���������л��Ķ���
		overridePendingTransition(R.anim.tran_previous_in,
				R.anim.tran_previous_out);// ���붯�����˳�����
	}
}

