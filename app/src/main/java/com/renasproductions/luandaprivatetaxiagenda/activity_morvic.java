package com.renasproductions.luandaprivatetaxiagenda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

public class activity_morvic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_morvic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TabHost tabHost= (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();
        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Contactos");
        tabSpec.setContent(R.id.Tab_Contacts);
        tabSpec.setIndicator("Contactos");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Actualizar");
        tabSpec.setContent(R.id.Tab_Actualizar);
        tabSpec.setIndicator("Actualizar");
        tabHost.addTab(tabSpec);



    }




}
