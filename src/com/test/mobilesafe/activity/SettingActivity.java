package com.test.mobilesafe.activity;

import com.test.mobilesafe.R;
import com.test.mobilesafe.view.SettingItemView;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * ��������
 * 
 * @author Kevin
 * 
 */
public class SettingActivity  extends Activity{
	
	private SettingItemView sivUpdate;// ��������
	private SharedPreferences mPref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		mPref = getSharedPreferences("config", MODE_PRIVATE);
		sivUpdate = (SettingItemView) findViewById(R.id.siv_update);
		 //sivUpdate.setTitle("�Զ���������");
		 boolean autoUpdate = mPref.getBoolean("auto_update", true);

			if (autoUpdate) {
				// sivUpdate.setDesc("�Զ������ѿ���");
				sivUpdate.setChecked(true);
			} else {
				// sivUpdate.setDesc("�Զ������ѹر�");
				sivUpdate.setChecked(false);
			}
			sivUpdate.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// �жϵ�ǰ�Ĺ�ѡ״̬
					if (sivUpdate.isChecked()) {
						// ���ò���ѡ
						sivUpdate.setChecked(false);
						// sivUpdate.setDesc("�Զ������ѹر�");
						// ����sp
						mPref.edit().putBoolean("auto_update", false).commit();
					} else {
						sivUpdate.setChecked(true);
						// sivUpdate.setDesc("�Զ������ѿ���");
						// ����sp
						mPref.edit().putBoolean("auto_update", true).commit();
					}
				}
			});
		}
		 
	}
	


