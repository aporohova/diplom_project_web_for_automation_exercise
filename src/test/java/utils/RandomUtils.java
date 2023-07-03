package utils;
import java.util.Random;

public class RandomUtils {
    static String [] countries = {"India", "United States", "Canada", "Australia", "Israel", "New Zealand", "Singapore"};
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    public static String getRandomCountry(){
        return getRandom(countries);
    }
}
