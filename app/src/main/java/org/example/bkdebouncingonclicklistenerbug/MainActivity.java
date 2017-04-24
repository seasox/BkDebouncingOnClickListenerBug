package org.example.bkdebouncingonclicklistenerbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchFragmentA();
    }

    /**
     * Called from FragmentA
     */
    public void launchFragmentB() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragmentB()).addToBackStack("b").commit();
    }

    /**
     * Called from FragmentB
     */
    public void launchFragmentA() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragmentA()).addToBackStack("a").commit();
    }
}
