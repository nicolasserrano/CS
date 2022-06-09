import java.util.Vector;

public class CountryDataMockup {
    int    countryId;
    String countryCode;
    String countryName;
    String flagFile;
    
    CountryDataMockup (int countryId, String countryCode,
                       String countryName,String flagFile) {
        this.countryId   = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.flagFile = flagFile;
    }
    public static Vector<CountryDataMockup> getCountryList() {
        Vector<CountryDataMockup> vec = new Vector<CountryDataMockup>();
        vec.addElement(new CountryDataMockup( 1, "AT", "Austria", "flag-austria.jpg"));
        vec.addElement(new CountryDataMockup( 2, "BE", "Belgium", "flag-belgium.jpg"));
        vec.addElement(new CountryDataMockup( 3, "BG", "Bulgaria", "flag-bulgaria.jpg"));
        vec.addElement(new CountryDataMockup( 4, "CY", "Cyprus", "flag-cyprus.jpg"));
        vec.addElement(new CountryDataMockup( 5, "CZ", "Czechia", "flag-czech-republic.jpg"));
        vec.addElement(new CountryDataMockup( 6, "DE", "Germany", "flag-germany.jpg"));
        vec.addElement(new CountryDataMockup( 7, "DK", "Denmark", "flag-denmark.jpg"));
        vec.addElement(new CountryDataMockup( 8, "EE", "Estonia", "flag-estonia.jpg"));
        vec.addElement(new CountryDataMockup( 9, "ES", "Spain", "flag-spain.jpg"));
        vec.addElement(new CountryDataMockup(10, "FI", "Finland", "flag-finland.jpg"));
        vec.addElement(new CountryDataMockup(11, "FR", "France", "flag-france.jpg"));
        vec.addElement(new CountryDataMockup(12, "GR", "Greece", "flag-greece.jpg"));
        vec.addElement(new CountryDataMockup(13, "HR", "Croatia", "flag-croatia.jpg"));
        vec.addElement(new CountryDataMockup(14, "HU", "Hungary", "flag-hungary.jpg"));
        vec.addElement(new CountryDataMockup(15, "IE", "Ireland", "flag-ireland.jpg"));
        vec.addElement(new CountryDataMockup(16, "IT", "Italy", "flag-italy.jpg"));
        vec.addElement(new CountryDataMockup(17, "LT", "Lithuania", "flag-lithuania.jpg"));
        vec.addElement(new CountryDataMockup(18, "LU", "Luxembourg", "flag-luxembourg.jpg"));
        vec.addElement(new CountryDataMockup(19, "LV", "Latvia", "flag-latvian.jpg"));
        vec.addElement(new CountryDataMockup(20, "MT", "Malta", "flag-malta.jpg"));
        vec.addElement(new CountryDataMockup(21, "NL", "Netherlands", "flag-netherlands.jpg"));
        vec.addElement(new CountryDataMockup(22, "PO", "Poland", "flag-poland.jpg"));
        vec.addElement(new CountryDataMockup(23, "PT", "Portugal", "flag-portugal.jpg"));
        vec.addElement(new CountryDataMockup(24, "RO", "Romania", "flag-romania.jpg"));
        vec.addElement(new CountryDataMockup(25, "SE", "Sweden", "flag-sweden.jpg"));
        vec.addElement(new CountryDataMockup(26, "SI", "Slovenia", "flag-slovenia.jpg"));
        vec.addElement(new CountryDataMockup(27, "SK", "Slovakia", "flag-slovakia.jpg"));
        return vec;
    }
    public static CountryDataMockup getCountry(int i) {
        return getCountryList().elementAt(i - 1);
    }
}