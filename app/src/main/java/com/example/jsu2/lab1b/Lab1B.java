package com.example.jsu2.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.*;
import android.widget.*;

public class Lab1B extends AppCompatActivity {


    ArrayList<String> helpList = new ArrayList<String>();
    ArrayList<String> inactiveList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_b);
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
        //ArrayList<String> helpList = new ArrayList<String>();
        helpList.add("you get knocked out");
        helpList.add("you go somewhere else");
        helpList.add("you find a dead man");
        helpList.add("you find a dead woman");
        helpList.add("you meet a buxom blonde");
        helpList.add("someone has searched the place");
        helpList.add("a crooked cop warns you");
        helpList.add("you are arrested");
        helpList.add("you find a gun");
        helpList.add("you find a knife");
        helpList.add("you find a frayed rope");
        helpList.add("a bullet whizzes past your ear!");
        helpList.add("you are almost run over");
        helpList.add("you are being followed");
        helpList.add("you smell familiar perfume");
        helpList.add("the telephone rings");
        helpList.add("there is a knock at the door");
        helpList.add("you hear footsteps behind you ...");
        helpList.add("you hear a gunshot!");
        helpList.add("you hear a scream!");
        helpList.add("you are not alone ...");
        helpList.add("        ... forget this story, it stinks!");
    }



    public void helpButtonClicked(View v) {
        //select random phrase
        Random rand = new Random();
        int index = rand.nextInt(helpList.size());
        //put phrase into the text box
        TextView t = (TextView) findViewById(R.id.helpMessage);
        t.setText(helpList.get(index));
        //add phrase to inactive phrases list
        inactiveList.add(helpList.get(index));
        //remove phrase from helpList
        helpList.remove(index);
        //if that was the last phrase, make helpList = inactiveList, then empty the contents of inactiveList.
        if(helpList.size() == 0) {
            helpList.addAll(inactiveList);
            inactiveList = new ArrayList<String>();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lab1_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
