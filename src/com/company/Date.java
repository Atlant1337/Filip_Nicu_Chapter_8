package com.company;

public class Date
{
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Date(int month, int day, int year)
    {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }
    public void setDay(int day){
        this.day = checkDay(day);
    }
    public void setMonth(int month){
        this.month = checkMonth(month);
    }
    public void setYear(int year){
        this.year = checkYear(year);
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    private int checkMonth(int M){
        if(M > 0 && M <= 12)
            return M;
        else
            return 0;
    }
    private int checkDay(int D){
        if(D > 0 && D <= daysPerMonth[this.month])
            return D;
        if(this.month == 2 && D == 29 && (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)))
            return D;
        else
            return 0;
    }
    private int checkYear(int Y){
        if(Y > 0 && Y <= 2021)
            return Y;
        else
            return 0;
    }
    public void nextDay(){
        if(getDay() + 1 <= daysPerMonth[getMonth()])
            setDay(getDay() + 1);
        else{
            setDay(1);
            nextMonth();
        }
    }
    public void nextMonth(){
        if(getMonth() + 1 <= 12)
            setMonth(getMonth() + 1);
        else{
            setMonth(1);
            setYear(getYear() + 1);
        }
    }
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
