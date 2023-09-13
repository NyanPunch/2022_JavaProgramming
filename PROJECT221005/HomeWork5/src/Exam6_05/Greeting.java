package Exam6_05;

import java.util.Calendar;

public class Greeting {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hourofday = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        System.out.println("현재 시간은 "+ hourofday + "시 "+ min + "분입니다.");

        if(hourofday > 4 && hourofday < 12)
            System.out.println("Good Morning");
        else if(hourofday >= 12 && hourofday < 18)
            System.out.println("Good Afternoon");
        else if(hourofday >= 18 && hourofday < 22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");

    }
}
