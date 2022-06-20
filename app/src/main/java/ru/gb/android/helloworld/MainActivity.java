package ru.gb.android.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    public void onClick(View view) {
        String srcTxt  = mEditText.getText().toString();
        String result = srcTxt.toUpperCase();
        mTextView.setText(result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mEditText = findViewById(R.id.editText);
        mTextView = findViewById(R.id.resultTextView);
        mButton.setOnClickListener(this);
    }
}