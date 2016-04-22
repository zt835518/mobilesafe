package com.test.mobilesafe.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
/**
 * ��ȡ�����TextView
 * 
 * @author Kevin
 * 
 */
public class FocusedTextView extends TextView {
	// ��style��ʽ�Ļ����ߴ˷���
	public FocusedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
	}
	// ������ʱ�ߴ˷���
	public FocusedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
	}
	// �ô���new����ʱ,�ߴ˷���
	public FocusedTextView(Context context) {
		super(context);
		
	}
	/**
	 * ��ʾ�����л�ȡ����
	 * 
	 * �����Ҫ����,���ȵ��ô˺����ж��Ƿ��н���,��true�Ļ�,����ƲŻ���Ч�� �������ǲ���ʵ����textview��û�н���,
	 * ���Ƕ�ǿ�Ʒ���true, ���������Ϊ�н���
	 */
	@Override
	public boolean isFocused() {
		return true;
	}

}
