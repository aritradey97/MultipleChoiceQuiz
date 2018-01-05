package com.example.android.multiplechoicequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    TextView question;
    TextView score;
    Button option1, option2, option3, option4;
    QuestionBank q = new QuestionBank();
    int qno = 0, sc = 0;
    String ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        setUpUIViews();
        updateQuestion();
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option1.getText().toString().equalsIgnoreCase(ans))
                {
                    sc += 10;
                    updateScore(sc);
                    //option1.setBackgroundColor(136);
                    Toast.makeText(QuizActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //option1.setBackgroundColor(100);
                    Toast.makeText(QuizActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option2.getText().toString().equalsIgnoreCase(ans))
                {
                    sc += 10;
                    updateScore(sc);
                    //option1.setBackgroundColor(136);
                    Toast.makeText(QuizActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //option1.setBackgroundColor(100);
                    Toast.makeText(QuizActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option3.getText().toString().equalsIgnoreCase(ans))
                {
                    sc += 10;
                    updateScore(sc);
                    //option1.setBackgroundColor(136);
                    Toast.makeText(QuizActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //option1.setBackgroundColor(100);
                    Toast.makeText(QuizActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option4.getText().toString().equalsIgnoreCase(ans))
                {
                    sc += 10;
                    updateScore(sc);
                    //option1.setBackgroundColor(136);
                    Toast.makeText(QuizActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //option1.setBackgroundColor(100);
                    Toast.makeText(QuizActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }
        });
    }
    private void setUpUIViews()
    {
        question = (TextView)findViewById(R.id.question);
        score = (TextView)findViewById(R.id.score);
        option1 = (Button)findViewById(R.id.option1);
        option2 = (Button)findViewById(R.id.option2);
        option3 = (Button)findViewById(R.id.option3);
        option4 = (Button)findViewById(R.id.option4);
    }
    private void updateQuestion()
    {
        try {
            question.setText(q.getQuestion(qno));
            option1.setText(q.getOption1(qno));
            option2.setText(q.getOption2(qno));
            option3.setText(q.getOption3(qno));
            option4.setText(q.getOption4(qno));
            ans = q.getCorrectOption(qno);
            qno++;
        }
        catch(Exception e)
        {
            Toast.makeText(QuizActivity.this,"Quize Over\nYou scored " + Integer.toString(sc) + " points", Toast.LENGTH_LONG).show();
            qno = 0;
            sc = 0;
        }
    }
    private void updateScore(int a)
    {
        score.setText(Integer.toString(a));
    }

}
