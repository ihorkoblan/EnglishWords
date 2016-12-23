package com.company.ihor.wordlearner;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by ihor on 11/18/16.
 */
public class AddWordsActivity extends Activity {

    private EditText englishWordEditText;
    private EditText translatedWordEditText;
    private Word word;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_words_layout);
        word = new Word();
        englishWordEditText = (EditText) findViewById(R.id.english_word_editText);
        translatedWordEditText = (EditText) findViewById(R.id.translated_word_editText);


        englishWordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                word.setName(String.valueOf(s.toString()));
            }
        });
        translatedWordEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                word.setTranslation(String.valueOf(s.toString()));
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onSaveButton(View view) {

//        if (checkData()) {
            //save
//        }
    }

    private Boolean checkData() {

        if (word == null) {
            englishWordEditText.setBackgroundColor(Color.RED);
            translatedWordEditText.setBackgroundColor(Color.RED);
            return false;
        }

        if (word.getName().isEmpty()) {
            englishWordEditText.setBackgroundColor(Color.RED);
            return false;
        }

        if (word.getTranslation().isEmpty()) {
            translatedWordEditText.setBackgroundColor(Color.RED);
            return false;
        }
        return true;
    }

}
