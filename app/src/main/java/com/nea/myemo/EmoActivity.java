package com.nea.myemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmoActivity extends AppCompatActivity {
    @BindView( R.id.emojisTextView) TextView mEmojiTextView;
    @BindView ( R.id.listView ) ListView mListView;
    private String[] emojis = new String[] {"Smiley", "Wink", "Wink with tongue out", "Love eyes", "Hi5 hand", "Love eyes wink"};
    private String[] meaning = new String[] {"Express the the smiling effect", "Crushing effect best emoji", "Express love especially when you fall in love", "A simple salutation hi5", "Expess that in love happy kafeeling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emo);
        ButterKnife.bind ( this );

        MyEmojisArrayAdapter adapter = new MyEmojisArrayAdapter(this, android.R.layout.simple_list_item_1, emojis, meaning); // must match constructor!
        mListView.setAdapter ( adapter );

        mListView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String emojis = ((TextView)view).getText().toString();
                Toast.makeText(EmoActivity.this, emojis, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String emojis = intent.getStringExtra("emojis");
        mEmojiTextView.setText("Here is results on : " + emojis);
    }
}
