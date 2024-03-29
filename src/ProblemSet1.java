/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.lang.Math;
import java.text.DecimalFormat;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final float INCH_TO_MILLIMETER = 25.4f;

        final float LENGTH = 8.5f;
        final float WIDTH = 11f;

        double answerEx1 = (INCH_TO_MILLIMETER*LENGTH)*(INCH_TO_MILLIMETER*WIDTH);
        DecimalFormat commaTwoDecimals = new DecimalFormat("#,###.00");
        String answerEx1Final = commaTwoDecimals.format(answerEx1);

        System.out.println("\n" + answerEx1Final + " square millimeters.\n");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final double INCH_TO_CENTIMETER = 2.54;
        double answerEx2 = ((LENGTH* 2* INCH_TO_CENTIMETER) + (WIDTH * 2* INCH_TO_CENTIMETER));

        System.out.println(answerEx2 + " centimeters.\n");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

        double answerEx3 = Math.hypot(LENGTH, WIDTH);
        String answerEx3Final = commaTwoDecimals.format(answerEx3);
        System.out.println(answerEx3Final + " inches.\n");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;

        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;

        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        float percentHomework = ((homework1 + homework2 + homework3)/3f);

        float percentQuiz = ((quiz1 + quiz2 + quiz3)/3f);

        float percentTest = ((test1 + test2 + test3)/3f);

        double grade = ((percentHomework * 0.15) + (percentQuiz * 0.35) + (percentTest * 0.5));
        String gradeFinal = commaTwoDecimals.format(grade);
        System.out.println(gradeFinal + "%.\n");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        DecimalFormat moneyFormat = new DecimalFormat("$#,###.00");

        final float HOURLY_WAGE = 12.5f;
        float hours = 7.5f + 8f + 10.5f + 9.5f + 6f + 11.5f;

        float earnings = hours * HOURLY_WAGE;

        String earningsFinal = moneyFormat.format(earnings);

        System.out.println(earningsFinal + ".\n");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

        final int YEARLY_PAY = 117000;
        final float FEDERAL_TAX = 1 - 0.24f;
        final float STATE_TAX = 1 - 0.0637f;
        final float RETIREMENT_FUND = 1 - 0.07f;

        float weeklyCheck = YEARLY_PAY / 24f;

        double takeHomePay = weeklyCheck * RETIREMENT_FUND;
        takeHomePay = takeHomePay * FEDERAL_TAX;
        takeHomePay = takeHomePay * STATE_TAX;

        String takeHomePayFinal = moneyFormat.format(takeHomePay);

        System.out.println(takeHomePayFinal + ".\n");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

        final int STUDENTS = 273;
        final int TEACHERS = 28;
        final int BUS_CAPACITY = 54;

        int totalPeople = STUDENTS + TEACHERS;
        int busNumber = (totalPeople / BUS_CAPACITY) + 1;
        int lastBus = totalPeople % BUS_CAPACITY;
        System.out.println(busNumber + " are needed, with " + lastBus + " passengers on the last bus.\n");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

        final int LEGNTH_EX8 = 48;
        final int WIDTH_EX8 = 24;
        final int DIAMETER = 6;

        float rectangleSize = LEGNTH_EX8 * WIDTH_EX8;
        int radius = DIAMETER / 2;
        double circleSize = Math.PI * Math.pow(radius, 2);

        String areaEx8 = commaTwoDecimals.format(rectangleSize - circleSize);

        System.out.println(areaEx8 + " square inches.\n");

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

        int year = 2020;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(year + " is a leap year..." + leapYear);

        year = 2100;
        leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(year + " is a leap year..." + leapYear);

        year = 2400;
        leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(year + " is a leap year..." + leapYear + "\n");

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

        DecimalFormat degreeFormat = new DecimalFormat("##.0 degrees");

        int temperature  = 38;
        int windSpeed = 14;

        double windChill;
        windChill = 0.4275 * temperature;
        windChill -= 35.75;
        windChill = windChill * Math.pow(windSpeed, 0.16);
        windChill +=  (0.6215 * temperature);
        windChill += 35.74;
        System.out.println(degreeFormat.format(windChill) + ".");
    }
}
