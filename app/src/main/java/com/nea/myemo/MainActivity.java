  package com.nea.myemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      @BindView(R.id.findEmojisButton)
      Button mFindRestaurantsButton;
      @BindView(R.id.emojiEditText)
      EditText mLocationEditText;
      @BindView(R.id.appNameTextView)
      TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}
