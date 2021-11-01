public class Student {
    private String _fullStName, _group;
    private BirthDate _date;
    private float _averageGrade;

    public Student(String fullStName, String group, BirthDate date, float averageGrade){
        _fullStName = fullStName;
        _group = group;
        _date = date;
        _averageGrade = averageGrade;
    }

    String get_fullStName() { return _fullStName; }
    String get_group() { return _group; }
    String get_date() { return _date.toString(); }
    float get_averageGrade() { return _averageGrade; }

    @Override
    public String toString() {
        return "Студент: " + get_fullStName() + ", группа " + get_group() + ", дата рождения " + get_date() + " средняя оценка " + get_averageGrade();
    }
}
