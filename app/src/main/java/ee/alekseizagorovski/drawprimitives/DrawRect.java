package ee.alekseizagorovski.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;


public class DrawRect extends DrawCanvas {

    public DrawRect(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GREEN);
        mCanvas.drawRect(300, 400, 800, 1000, mPaint);
    }

}