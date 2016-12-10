package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by salim on 09/10/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceID;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        this.colorResourceID = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        // get the current object
        Word currentWord = getItem(position);

        // get the desired xml object from the view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // only if we have an image
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
            // set it to visible in case we are re-using a gone view image
            imageView.setVisibility(View.VISIBLE);

        }else{
            imageView.setVisibility(View.GONE);
        }

        // set the appropriate color
        // first extract the color
        int color = ContextCompat.getColor(getContext(), colorResourceID);
        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
