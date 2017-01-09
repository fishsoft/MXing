package com.morse.mxing.zxing.interfaces;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;

import com.google.zxing.Result;

/**
 * Created by Administrator on 2017/1/9.
 */

public interface ZxingInterface {

    public void drawViewfinder();
    public void handleDecode(Result rawResult, Bitmap barcode, float scaleFactor);
    public View getViewfinderView();
    public Handler getHandler();
    public Object getCameraManager();

}
