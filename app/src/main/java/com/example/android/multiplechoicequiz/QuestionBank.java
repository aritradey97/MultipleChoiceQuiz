package com.example.android.multiplechoicequiz;

/**
 * Created by 1605180 on 04-Jan-18.
 */

public class QuestionBank {
    private String questions[] = {
            "Which of these is a proggramming language ?",
            "What is the built in library function to adjust the allocated dynamic memory size.",
            "The default executable generation on UNIX for a C program is ",
            "Where to place “f” with a double constant 3.14 to specify it as a float?",
            "Which library function can convert an integer/long to a string?"
    };
    private String options[][] = {
            {"Esolang","Lisp","CSS","Aba"},
            {"malloc","calloc","realloc","resize"},
            {"a.exe", "a.out", "a", "out.a"},
            {"(float)(3.14)(f)", "(f)(3.14)", "3.14f", "f(3.14)"},
            {"ltoa()", "ultoa()", "sprintf()", "None of the above"},

    };
    private String correctOptions[] = {"Lisp","realloc","a.out","3.14f","ltoa()"};
    public String getQuestion(int a)
    {
        return questions[a];
    }
    public String getOption1(int a)
    {
        return options[a][0];
    }
    public String getOption2(int a)
    {
        return options[a][1];
    }
    public String getOption3(int a)
    {
        return options[a][2];
    }
    public String getOption4(int a)
    {
        return options[a][3];
    }
    public String getCorrectOption(int a)
    {
        return correctOptions[a];
    }
}
