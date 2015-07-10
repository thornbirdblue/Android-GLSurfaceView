package com.ccsg.td;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;

public class TdGLSurfaceView extends GLSurfaceView{
	private final static String TAG = "TdGLSurfaceView";
	public TdView mView;
	private SceneRenderer mRenderer;
	public TdGLSurfaceView(Context context)
	{
		super(context);
		mRenderer = new SceneRenderer();
		setRenderer(mRenderer);
		mView =  new TdView();
		Log.v(TAG,"TdGLSurfaceView create!!!");		
	}
	
	private class SceneRenderer implements GLSurfaceView.Renderer{
		public SceneRenderer()
		{
			Log.v(TAG,"SceneRenderer create!!!");
		}
		@Override
		public void onSurfaceCreated(GL10 gl,EGLConfig config)
		{
			Log.v(TAG,"onSurfaceCreated!!!"); 	
		}
		@Override
		public void onSurfaceChanged(GL10 gl,int width,int height)
		{
			Log.v(TAG,"onSurfaceChanged!!!");
		}
		@Override
		public void onDrawFrame(GL10 gl)
		{
			Log.v(TAG,"onDrawFrame!!!");
	
			mView.onDrawSelf(gl);
		}
	}

}
