public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;


    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getAddres() {
        return this.address;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    public String getCity() {
        return this.city;
    }
    public int getDrivingLicenseNumber() {
        return this.drivingLicenseNumber;
    }
    public int getYearOfIssue() {
        return this.yearOfIssue;
    }
    public String getDrivingLicenseCategory() {
        return this.drivingLicenseCategory;
    }


    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            String firstLetter = name.substring(0,1).toUpperCase();
            String rest = name.substring(1).toLowerCase();
            this.name = firstLetter + rest;
        }else {
            System.out.println("Set a name");
        }
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDrivingLicenseNumber(int drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue >= 1980 || yearOfIssue <= 2023){
            this.yearOfIssue = yearOfIssue;
        };
    }
    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public void displayDrivingLicense() {
        System.out.printf("Name and surname: %s %s \nAddres: %s \nPostal code: %s \nCity: %s \nDriving License number: %d \nYear of issue: %d \nDriving License category: %s",
        getName(),getSurname(),getAddres(),getPostalCode(),getCity(),getDrivingLicenseNumber(),getYearOfIssue(),getDrivingLicenseCategory());
    }

    public static void main(String[] args) {
        DrivingLicense one = new DrivingLicense();
        one.setName("emil");
        one.setSurname("Kulka");
        one.setAddress("Sybiraków 5");
        one.setPostalCode("37-100");
        one.setCity("Łańcut");
        one.setDrivingLicenseNumber(12345);
        one.setYearOfIssue(2003);
        one.setDrivingLicenseCategory("B");
        one.displayDrivingLicense();
    }
}
