package com.test.mobilesafe.activity;

import com.test.mobilesafe.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * ��һ��������ҳ
 * 
 * @author Kevin
 */
public class Setup1Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup1);
	}

	// ��һҳ
	public void next(View view) {
		startActivity(new Intent(this, Setup2Activity.class));
		finish();
		
		//���������л��Ķ���
		overridePendingTransition(R.anim.tran_in, R.anim.tran_out);//���붯�����˳�����
	}
	

}
