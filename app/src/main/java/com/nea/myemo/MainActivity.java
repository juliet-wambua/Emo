  package com.nea.myemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      @BindView(R.id.findEmojisButton)
      Button mFindEmojisButton;
      @BindView(R.id.emojisEditText)
      EditText mEmojiEditText;
      @BindView(R.id.appNameTextView)
      TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        ButterKnife.bind ( this );

        mFindEmojisButton.setOnClickListener ( this );
    }

      @Override
      public void onClick(View v) {
          if (v == mFindEmojisButton) {
              String emojis = mEmojiEditText.getText ().toString ();
              Intent intent = new Intent ( MainActivity.this, EmoActivity.class );
              intent.putExtra ( "emojis", emojis );
              startActivity ( intent );
          }
      }
}
