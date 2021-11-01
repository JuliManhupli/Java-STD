public class QueuePerson {
    private String _fullName;
    private AddressValue _address;
    private int _priority;

    public QueuePerson(String fullName, AddressValue address, int priority) {
        _fullName = fullName;
        _address = address;
        _priority = priority;
    }

    public void set_priority(int priority) {
        _priority = priority;
    }

    String get_fullName() { return _fullName; }
    String get_address() { return _address.toString(); }
    int get_priority() { return _priority; }

    @Override
    public String toString() {
        return get_fullName() + ", адрес " + get_address() + ", приоритет " + get_priority();
    }
}
