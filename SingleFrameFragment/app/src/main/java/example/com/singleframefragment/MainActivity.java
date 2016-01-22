package example.com.singleframefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // check the device orientation and act accordingly

        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            LMFragment lmFragment = new LMFragment();

            fragmentTransaction.replace(android.R.id.content, lmFragment);
        } else {
            PMFragment pmFragment = new PMFragment();
            fragmentTransaction.replace(android.R.id.content, pmFragment);
        }

        fragmentTransaction.commit();
    }
}
