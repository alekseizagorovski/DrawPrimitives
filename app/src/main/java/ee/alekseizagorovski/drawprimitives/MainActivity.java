package ee.alekseizagorovski.drawprimitives;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawRect(View view) {
        Intent drawRectIntent=new Intent(this, DrawRectActivity.class);
        startActivity(drawRectIntent);

    }
    public void drawCircle(View view) {
        Intent drawCircleIntent=new Intent(this, DrawCircleActivity.class);
        startActivity(drawCircleIntent);

    }
    public void drawLine(View view) {
        Intent drawLineIntent=new Intent(this, DrawLineActivity.class);
        startActivity(drawLineIntent);

    }


}