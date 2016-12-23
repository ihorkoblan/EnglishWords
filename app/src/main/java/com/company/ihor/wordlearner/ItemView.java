package com.company.ihor.wordlearner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ihor on 11/20/16.
 */
public class ItemView extends LinearLayout {

    private TextView headerTextView;
    private TextView detailsTextView;

    public ItemView(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        headerTextView = (TextView) findViewById(R.id.header_text_viewiew);
        detailsTextView = (TextView) findViewById(R.id.details_text_view);
    }

    public void setHeaderText(String text) {
        this.headerTextView.setText(text);
    }

    public void setDetailsText(String text) {
        this.detailsTextView.setText(text);
    }
}
