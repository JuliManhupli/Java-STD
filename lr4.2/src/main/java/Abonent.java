public class Abonent {
    private String _surname, _name, _patronymic, _address;

    public Abonent(String surname, String name, String patronymic, String address) {
        _surname = surname;
        _name = name;
        _patronymic = patronymic;
        _address = address;
    }

    String get_surname() { return _surname; }
    String get_name() { return _name; }
    String get_patronymic() { return _patronymic; }
    String get_address() {return _address; }

    @Override
    public String toString() {
        return get_surname() + " " + get_name() + " " + get_patronymic() + ", адрес " + get_address();
    }
}
