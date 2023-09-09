package com.onyeka.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView hobbies;
    private EditText enterHobbies;
    private Button doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hobbies = findViewById(R.id.display_hobby_text);
        hobbies.setVisibility(View.GONE);

        enterHobbies = findViewById(R.id.enter_hobby_input);
        doneBtn = findViewById(R.id.done_btn);
    }

    public void doneBtnAction(View view){
        String text = "Hobbies: " + enterHobbies.getText().toString().trim();
        hobbies.setText(text);
        hobbies.setVisibility(View.VISIBLE);

//        hide keyboard after typing
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}