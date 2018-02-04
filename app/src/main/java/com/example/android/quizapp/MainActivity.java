package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.R;

public class MainActivity extends AppCompatActivity {
    /**
     * This app calculates qiuz result.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the Check button is clicked.
     */
    public void sumPoints(View view) {
        int score = checkBoxesResult();
        String result = " ";
        EditText korname = (EditText) findViewById(R.id.korname);
        String korname_check = korname.getText().toString().toUpperCase();
        if (korname_check.equals("GOLDSZMIDT")) {
            score += 1;
        }
        RadioButton quote1_radio_button_yes = (RadioButton) findViewById(R.id.quote1_radio_button_yes);
        if (quote1_radio_button_yes.isChecked()) {
            score += 1;
        }
        RadioButton quote2_radio_button_yes = (RadioButton) findViewById(R.id.quote2_radio_button_yes);
        if (quote2_radio_button_yes.isChecked()) {
            score += 1;
        }
        RadioButton quote3_radio_button_yes = (RadioButton) findViewById(R.id.quote3_radio_button_yes);
        if (quote3_radio_button_yes.isChecked()) {
            score += 1;
        }
        RadioButton quote4_radio_button_yes = (RadioButton) findViewById(R.id.quote4_radio_button_yes);
        if (quote4_radio_button_yes.isChecked()) {
            score += 1;
        }
        if (score == 6) {
            result = getString(R.string.you_have_answered_correctly) + score
                    + getString(R.string.of_6_questions) + getString(R.string.great);
        } else {
            result = getString(R.string.you_have_answered_correctly) + score
                    + getString(R.string.of_6_questions);
        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
    /**
     * This method calculates and returns the score of 2nd question.
     */
    private int checkBoxesResult() {
        int checkBoxesscore = 0;
        CheckBox pediatrician = (CheckBox) findViewById(R.id.pediatrician);
        if (pediatrician.isChecked()) {
            checkBoxesscore += 1;
        }
        CheckBox lawyer = (CheckBox) findViewById(R.id.lawyer);
        if (!lawyer.isChecked()) {
            checkBoxesscore += 1;
        }
        CheckBox journalist = (CheckBox) findViewById(R.id.journalist);
        if (journalist.isChecked()) {
            checkBoxesscore += 1;
        }
        CheckBox painter = (CheckBox) findViewById(R.id.painter);
        if (!painter.isChecked()) {
            checkBoxesscore += 1;
        }
        if (checkBoxesscore < 4) {
            checkBoxesscore = 0;
        } else {
            checkBoxesscore = 1;
        }
        return checkBoxesscore;
    }
}


