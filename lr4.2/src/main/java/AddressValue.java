public class AddressValue {
    private String _city, _street, _house;
    private int _flat;

    public AddressValue(String city, String street, String house, int flat) {
        _city = city;
        _street = street;
        _house = house;
        _flat = flat;
    }

    String get_city() { return _city; }
    String get_street() { return _street; }
    String get_house() { return _house; }
    int get_flat() {return _flat; }

    @Override
    public String toString() {
        if (_flat == 0) {
            return "г " + get_city() + ", ул " + get_street() + " " + get_house();
        }
        else return "г " + get_city() + ", ул " + get_street() + " " + get_house() + ", кв " + get_flat();
    }
}
