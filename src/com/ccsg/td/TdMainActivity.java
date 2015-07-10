package com.ccsg.td;

import android.app.Activity;
import android.os.Bundle;


public class TdMainActivity extends Activity {
	private TdGLSurfaceView mTdView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mTdView = new TdGLSurfaceView(this);
		
		//setContentView(R.layout.activity_td_main);
		setContentView(mTdView);
	}
}
