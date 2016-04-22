package com.test.mobilesafe.activity;

import com.test.mobilesafe.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

/**
 * �ֻ�����ҳ��
 * 
 * @author Kevin
 * 
 */
public class LostFindActivity extends Activity {
	private SharedPreferences mPrefs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		mPrefs = getSharedPreferences("config", MODE_PRIVATE);

		boolean configed = mPrefs.getBoolean("configed", false);// �ж��Ƿ�����������
		if (configed) {
			setContentView(R.layout.activity_lost_find);
		} else {
			// ��ת������ҳ
			startActivity(new Intent(this, Setup1Activity.class));
			finish();
			}
	}
	
	/**
	 * ���½���������
	 * 
	 * @param view
	 */
	public void reEnter(View view) {
		startActivity(new Intent(this, Setup1Activity.class));
		finish();
	}

}
