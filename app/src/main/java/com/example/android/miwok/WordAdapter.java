package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.onClick;
import static android.R.attr.src;

/**
 * Created by NoraElhariri on 7/28/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;



    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.list_item_1);

        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_2);

        defaultTextView.setText(currentWord.getDefaultTranslation());


        ImageView imageViewRes = (ImageView) listItemView.findViewById(R.id.image);

        imageViewRes.setVisibility(View.VISIBLE);

        ImageView imageViewPlayIcon = (ImageView) listItemView.findViewById(R.id.play_icon);

        imageViewPlayIcon.setImageResource(R.drawable.ic_play_arrow_white_24dp);

        View textContainer = (listItemView.findViewById(R.id.list_item));

        /*int color = ContextCompat.getColor(getContext(), mColorResourceId);*/

        textContainer.setBackgroundResource(mColorResourceId);

        if(currentWord.hasImage())
        {
            imageViewRes.setImageResource(currentWord.getImageResourceId());
        }
        else {
            imageViewRes.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
