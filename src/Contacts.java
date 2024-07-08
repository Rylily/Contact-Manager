public class Contacts {
    private String Name;
    private int Number;
    private int CountryCode;

    public Contacts(String Name, int Number, int CountryCode) {
        this.Name = Name;
        this.Number = Number;
        this.CountryCode = CountryCode;
    }

    public String name() {
        return Name;
    }

    public String toString() {
        return "Name: " + Name + "\nNumber: " + Number + "\nCountry Code: " + CountryCode;
    }

}


