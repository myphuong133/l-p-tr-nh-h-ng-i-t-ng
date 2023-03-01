package bai4_oop;

public class th_date {
    private int day,month,year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31){
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0){
            this.year = year;
        }
    }

    public th_date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
