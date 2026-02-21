package solid.interfacesegregation.baddesign;

// VIOLATION: A "Fat" or "Polluted" Interface
public interface SmartDevice {
    void print();
    void scan();
    void fax();
}
