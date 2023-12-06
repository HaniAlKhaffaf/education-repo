public class MyDate {

    public int year;
    public int month;
    public int day;

    public MyDate(int theYear, int theMonth, int theDay) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int theYear) {
        if (theYear >= 1 && theYear <= 3000)
            year = theYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int theMonth) {
        if (theMonth >= 1 && theMonth <= 12)
            month = theMonth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int theDay) {
        if (theDay >= 1 && theDay <= 30)
            day = theDay;
    }

    public String formatDate() {
        return String.format("%d/%d/%d", year, month, day);
    }
}
