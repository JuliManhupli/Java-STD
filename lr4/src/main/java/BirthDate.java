public class BirthDate {
    private int _day, _month, _year;

    public BirthDate(int day, int month, int year) {
        _day = day;
        _month = month;
        _year = year;
    }

    int get_day() {return _day; }
    int get_month() {return _month; }
    int get_year() {return _year; }

    @Override
    public String toString() {
        return get_day() + "." + get_month() + "." + get_year();
    }
}
