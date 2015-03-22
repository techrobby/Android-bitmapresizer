package com.gk.bitmap.resizer.sample;

import com.gk.bitmap.resizer.BitmapResizerFactory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class ResizerSample
{

	private Context ctx;

	public ResizerSample(Context c, int imageWidth, int imageHeight, int resId)
	{
		this.ctx = c;
		Bitmap resizedBitmap = BitmapResizerFactory.scaleDownBitmap(ctx.getResources(), resId, imageWidth, imageHeight, Config.RGB_565, true, false);
	}

}
