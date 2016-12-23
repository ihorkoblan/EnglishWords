package com.company.ihor.wordlearner;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.util.Log;
import com.company.ihor.wordlearner.Word;
import com.company.ihor.wordlearner.R;

import java.util.List;

public class WordAdapter extends BaseAdapter {

    private static final String TAG = "LessonModelAdapter";
    private List<Word> list;
    private LayoutInflater layoutInflater;

    public WordAdapter(Context context, List<Word> list) {
        this.list = list;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, parent, false);
        }
        Word word = getWord(position);

        TextView headerTView = (TextView)view.findViewById(R.id.header_text_viewiew);
        TextView detailsTView = (TextView)view.findViewById(R.id.details_text_view);
        headerTView.setText(word.getName());
        detailsTView.setText(word.getTranslation());
        return view;
    }

    private Word getWord(int position) {
        return (Word) getItem(position);
    }
}