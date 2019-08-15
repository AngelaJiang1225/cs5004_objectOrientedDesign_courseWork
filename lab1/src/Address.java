public class Address {
    private String streetNumber;
    private String streetName;
    private String cityName;
    private String stateAcronym;
    private Integer zipCode;
    private String countryName;

    public Address(
            String streetNumber, String streetName, String cityName, String stateAcronym,
            Integer zipCode, String countryName){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAcronym = stateAcronym;
        this.zipCode = zipCode;
        this.countryName = countryName;

    }
    public String getStreetNumber() {
        return this.streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateAcronym() {
        return this.stateAcronym;
    }

    public void setStateAcronym(String stateAcronym) {
        this.stateAcronym = stateAcronym;
    }

    public Integer getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
