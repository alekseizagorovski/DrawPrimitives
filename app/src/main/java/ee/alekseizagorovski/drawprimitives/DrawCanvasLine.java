package ee.alekseizagorovski.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by kasutaja on 21.04.2015.
 */
public class DrawCanvasLine extends View {

    public Paint mPaint = new Paint();

    public DrawCanvasLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawPaint(mPaint);


    }

}