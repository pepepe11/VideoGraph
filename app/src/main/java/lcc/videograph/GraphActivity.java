package lcc.videograph;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        final List<Integer> time = DrawView.getTime();
        //final List<Point> circlePoints = DrawView.getCirclePoints();
        String timeTest = String.valueOf(time);
        Log.d("GraphActivity", timeTest);
        //String pointTest = String.valueOf(circlePoints);
        //Log.d("GraphActivity", pointTest);
    }


}
