package com.company.ihor.wordlearner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.company.ihor.wordlearner.Word;
import com.company.ihor.wordlearner.WordAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        listView = (ListView) findViewById(R.id.listView);

        final List<Word> items = initData();
        WordAdapter adapter = new WordAdapter(this, items);
        listView.setAdapter(adapter);

        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_item_add:

                Intent intent = new Intent(getApplicationContext(), AddWordsActivity.class);
                startActivity(intent);

                break;
            case R.id.menu_item_filter:
                break;
            case R.id.menu_item_search:
                break;
            case R.id.menu_item_settings:
                break;
            case R.id.menu_item_sort:
                break;
        }
        return true;
    }

    public void addWordsButtonPressed(View v) {
        Intent intent = new Intent(this, AddWordsActivity.class);
        startActivity(intent);
    }

    private List<Word> initData() {
        List<Word> list = new ArrayList<Word>();
        list.add(new Word("One", "Один"));
        list.add(new Word("Two", "Два"));
        list.add(new Word("Three", "Три"));
        list.add(new Word("Four", "Чотири"));
        list.add(new Word("Five", "Пять"));
        list.add(new Word("Six", "Шість"));
        list.add(new Word("Seven", "Сім"));
        list.add(new Word("Eight", "Вісім"));
        list.add(new Word("Nine", "Девять"));
        list.add(new Word("Ten", "Десять"));
        return list;
    }
}