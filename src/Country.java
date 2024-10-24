public class Country {
    String name;
    String nationality;
    double area;
    String language;

    public Country(String name, String nationality, double area, String language) {
        this.name = name;
        this.nationality = nationality;
        this.area = area;
        this.language = language;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }


    public static Country findLargestCountry(Country[] countries) {
        Country largest = countries[0];
        for (Country country : countries) {
            if (country.getArea() > largest.getArea()) {
                largest = country;
            }
        }
        return largest;
    }}
