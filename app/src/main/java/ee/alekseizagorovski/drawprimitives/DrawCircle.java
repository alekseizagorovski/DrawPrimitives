package ee.alekseizagorovski.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class DrawCircle extends DrawCanvasCircle {

    public DrawCircle(Context context) {super(context);  }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
       mPaint.setColor(Color.RED);
      mCanvas.drawCircle(550, 650, 300, mPaint);

    }


}