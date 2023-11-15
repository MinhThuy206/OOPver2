package country.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
//        testOriginalData();
        testSortIncreasingByPopulation();
//        testFilterAfricaCountry();
//        testSortDecreasingByPopulation();



        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into
                * CountryArrayManager here.
                */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));

                switch (dataList.get(5)) {
                    case "Asia" -> {
                        Country asiaCountry = new AsiaCountry(code, name, population, area, gdp);
                        countryManager.append(asiaCountry);
                    }
                    case "Africa" -> {
                        Country africaCountry = new AfricaCountry(code, name, population, area, gdp);
                        countryManager.append(africaCountry);
                    }
                    case "Europe" -> {
                        Country europeCountry = new EuropeCountry(code, name, population, area, gdp);
                        countryManager.append(europeCountry);
                    }
                    case "North American" -> {
                        Country northAmericanCountry = new NorthAmericaCountry(code, name, population, area, gdp);
                        countryManager.append(northAmericanCountry);
                    }
                    case "Oceania" -> {
                        Country oceaniaCountry = new OceaniaCountry(code, name, population, area, gdp);
                        countryManager.append(oceaniaCountry);
                    }
                    default -> {
                        Country southAmericanCountry = new SouthAmericaCountry(code, name, population, area, gdp);
                        countryManager.append(southAmericanCountry);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "E:\\OOPver2\\lap8\\src\\country\\countryarraymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation()   ;
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
       List<AfricaCountry> countries;
       countries = countryManager.filterAfricaCountry();
       String codeString = CountryArrayManager.codeOfCountriesToString((Country[]) countries.toArray());
       System.out.println(codeString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
    }

    public static void testFilterMostPopulousCountries() {

    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
    }
}
