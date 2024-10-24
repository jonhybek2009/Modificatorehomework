public static void main (String[] args) {

    Country kyrgyzstan = new Country("Кыргызстан", "Кыргыз", 199951.0, "Кыргызский");
    Country russia = new Country("Россия", "Русский", 17098242.0, "Русский");
    Country japan = new Country("Япония", "Японец", 377975.0, "Японский");
    Country[] countries = {kyrgyzstan, russia, japan};
    Country largest = Country.findLargestCountry(countries);
    System.out.println("Самая большая страна: " + largest.getName());
}
