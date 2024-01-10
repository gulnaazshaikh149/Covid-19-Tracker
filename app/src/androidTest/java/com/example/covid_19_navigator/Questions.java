package com.example.covid_19_navigator;

public class Questions {
    public String ques[] = {
            "Do you feel frequent body ache?",
            "Are you suffering from Fever, cold and sore throat?",
            "Hold your breath for 10 seconds and answer yes if you feel shortness of breath",
    };
     public  String ans[] = {
             "YES",
             "YES",
             "YES",

     }
;
     public  String getQuestion(int number){
         return ques[number];
     }

    public  String getAnswer(int number){
        return ans[number];
    }
}
