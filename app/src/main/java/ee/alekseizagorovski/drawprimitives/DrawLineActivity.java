package ee.alekseizagorovski.drawprimitives;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kasutaja on 21.04.2015.
 */
public class DrawLineActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawLine rect = new DrawLine(this);
        setContentView(rect);
    }


}
