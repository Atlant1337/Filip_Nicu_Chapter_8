package com.company;

public class EnhancingTime2 {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public EnhancingTime2() {
        this(0, 0, 0);
    }

    public EnhancingTime2(int h) {
        this(h, 0, 0);
    }

    public EnhancingTime2(int h, int m) {
        this(h, m, 0);
    }

    public EnhancingTime2(int h, int m, int s) {
        setTime(h, m, s);
    }

    public EnhancingTime2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = ((h >= 0 || h <= 24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m >= 0 || m <= 60) ? m : 0);
    }

    public void setSecond(int s) {
        second = ((s >= 0 || s <= 60) ? s : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(),
                getSecond());

    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));

    }

    private void midnightToString(String t3) {
        if ((t3.contains("AM")))
        {
            hour *= 3600;
            minute *= 60;
            int total = hour + minute + second;
            System.out.printf("Total %02d seconds since midnight",total);
        }
    }
    public void tick()

    {
        if(second < 23)
        {
            second++;
        }
        else if(minute < 59)
        {
            second = 0;
            minute++;
        }
        else if(hour < 23)
        {
            second = 0;
            minute = 0;
            hour++;
        }
        else
        {
            second = 0;
            minute = 0;
            hour = 0;
        }
    }
    public void incrementMinute()
    {
        if(minute < 59)
        {
            minute++;
        }
        else if(hour < 23)
        {
            minute = 0;
            hour++;
        }
        else
        {
            minute = 0;
            hour = 0;
        }
    }
    public void incrementHour()
    {
        if(hour < 23)
        {
            hour++;
        }
        else
        {
            hour = 0;
        }
    }

    public static void main(String[] args) {
        EnhancingTime2 t1 = new EnhancingTime2(23, 59, 59);

        String t2 = t1.toUniversalString();

        String t3 = t1.toString();
        System.out.println("Universal-time Format (HH:MM:SS): " + t2);
        System.out.println("Standard-time Format (H:MM:SS AM or PM): " + t3);
        t1.midnightToString(t3);

        t1.tick();
        System.out.println("\nAfter incrementing one second: ");
        System.out.println("Standard-time Format (H:MM:SS AM or PM): " + t1);

        t1.incrementMinute();
        System.out.println("\nAfter incrementing one minute: ");
        System.out.println("Standard-time Format (H:MM:SS AM or PM): " + t1);

        t1.incrementHour();
        System.out.println("\nAfter incrementing one hour: ");
        System.out.println("Standard-time Format (H:MM:SS AM or PM): " + t1);

    }
}