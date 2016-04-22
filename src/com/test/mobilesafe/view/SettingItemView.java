package com.test.mobilesafe.view;

import com.test.mobilesafe.R;

/**
 * �������ĵ��Զ�����Ͽؼ�
 * 
 * @author Kevin
 * 
 */

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SettingItemView extends RelativeLayout {
	
	private static final String NAMESPACE = "http://schemas.android.com/apk/res/com.test.mobilesafe";	
	private TextView tvTitle;
	private TextView tvDesc;
	private CheckBox cbStatus;
	private String mTitle;
	private String mDescOn;
	private String mDescOff;

	public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView();
		// TODO Auto-generated constructor stub
	}

	public SettingItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		mTitle = attrs.getAttributeValue(NAMESPACE, "title");// ������������,��ȡ���Ե�ֵ
		mDescOn = attrs.getAttributeValue(NAMESPACE, "desc_on");
		mDescOff = attrs.getAttributeValue(NAMESPACE, "desc_off");
		initView();
		// TODO Auto-generated constructor stub
	}

	public SettingItemView(Context context) {
		super(context);
		initView();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ��ʼ������
	 */
	private void initView() {
		// ���Զ���õĲ����ļ����ø���ǰ��SettingItemView
		View.inflate(getContext(), R.layout.view_setting_item, this);
		 tvTitle = (TextView) findViewById(R.id.tv_title);
		 tvDesc = (TextView) findViewById(R.id.tv_desc);
		 cbStatus = (CheckBox) findViewById(R.id.cb_status);

		setTitle(mTitle);// ���ñ���	
	}

	public void setTitle(String title) {
		tvTitle.setText(title);
	}

	public void setDesc(String desc) {
		tvDesc.setText(desc);
	}

	
	/**
	 * ���ع�ѡ״̬
	 * 
	 * @return
	 */
	
	public boolean isChecked() {
		// TODO Auto-generated method stub
		return cbStatus.isChecked();
	}
	
	public void setChecked(boolean check) {
		cbStatus.setChecked(check);

		// ����ѡ���״̬,�����ı�����
		if (check) {
			setDesc(mDescOn);
		} else {
			setDesc(mDescOff);
		}
	}


}