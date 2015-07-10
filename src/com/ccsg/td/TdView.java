package com.ccsg.td;

import javax.microedition.khronos.opengles.GL10;

import android.util.Log;

public class TdView {
	private final static String TAG = "TdView";
	
	private Cube mCube;
	public TdView()
	{
		mCube = new Cube();
	}
	public int onDrawSelf(GL10 gl)
	{
		Log.v(TAG,"onDrawSelf");
		mCube.draw(gl);
		return 0;
	}
}
