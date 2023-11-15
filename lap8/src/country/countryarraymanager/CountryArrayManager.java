package country.countryarraymanager;

import java.util.ArrayList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[j].getPopulation() < newArray[min].getPopulation()) {
                    min = j;
                }
            }
            Country country = newArray[i];
            newArray[i] = newArray[min];
            newArray[min] = country;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[j].getPopulation() > newArray[max].getPopulation()) {
                    max = j;
                }
            }
            Country country = newArray[i];
            newArray[i] = newArray[max];
            newArray[max] = country;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country country = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country country = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < length - 1; i++) {
            int j = i;
            Country country;
            while (j >= 0 && newArray[j - 1].getGdp() > newArray[j].getGdp()) {
                country = newArray[j - 1];
                newArray[j - 1] = newArray[j];
                newArray[j] = country;
                j -= 1;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < length - 1; i++) {
            int j = i;
            Country country;
            while (j >= 0 && newArray[j - 1].getGdp() < newArray[j].getGdp()) {
                country = newArray[j - 1];
                newArray[j - 1] = newArray[j];
                newArray[j] = country;
                j -= 1;
            }
        }
        return newArray;
    }

    public List<AfricaCountry> filterAfricaCountry() {
        List<AfricaCountry> africaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }
        return africaCountries;
    }

    public List<AsiaCountry> filterAsiaCountry() {
        List<AsiaCountry>asiaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }
        return asiaCountries;
    }

    public List<EuropeCountry> filterEuropeCountry() {
        List<EuropeCountry> europeCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        return europeCountries;
    }

    public List <NorthAmericaCountry> filterNorthAmericaCountry() {
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for(Country country : countries){
            if(country instanceof NorthAmericaCountry ){
                northAmericaCountries.add((NorthAmericaCountry) country );
            }
        }
        return northAmericaCountries;
    }

    public List<OceaniaCountry> filterOceaniaCountry() {
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for(Country country : countries){
            if(country instanceof OceaniaCountry ){
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        return oceaniaCountries;
    }

    public List<SouthAmericaCountry> filterSouthAmericaCountry() {
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for(Country country : countries){
            if(country instanceof SouthAmericaCountry){
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulationCountries = sortByDecreasingPopulation();
        Country [] newList = new Country[howMany];
        System.arraycopy(mostPopulationCountries, 0, newList, 0, howMany);
        return newList;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        return null;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        return null;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        return null;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        return null;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        return null;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
