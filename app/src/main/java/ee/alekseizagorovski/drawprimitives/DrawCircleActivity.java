package ee.alekseizagorovski.drawprimitives;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kasutaja on 21.04.2015.
 */
public class DrawCircleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawCircle rect = new DrawCircle(this);
        setContentView(rect);
    }


}
