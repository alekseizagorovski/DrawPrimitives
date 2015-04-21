package ee.alekseizagorovski.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class DrawCanvasCircle extends View {

    public Paint mPaint = new Paint();

    public DrawCanvasCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        mCanvas.drawPaint(mPaint);


    }

}