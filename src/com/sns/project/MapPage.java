package com.sns.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapPage extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map_page, menu);
        return true;
    }
}
