package top.zhost.opencvtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

public class MainActivity extends Activity {
    private String TAG = "OPenCV-Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onResume() {
        super.onResume();
        boolean success = OpenCVLoader.initDebug();
        if(success) {
            Log.i(TAG, "OpenCV Library loaded...");
        } else {
            Toast.makeText(this.getApplicationContext(), "could not load opencv lib...", Toast.LENGTH_LONG).show();
        }


    }

}
