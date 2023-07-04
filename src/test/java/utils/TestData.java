package utils;
import com.github.javafaker.Faker;
import static utils.RandomUtils.getRandomCountry;

public class TestData {
    static Faker faker = new Faker();
    public static String userName = faker.name().name(),
    userEmail = faker.internet().emailAddress(),
    userPassword = faker.internet().password(),
    userFirstName = faker.name().firstName(),
    userLastName = faker.name().lastName(),
    userAddress = faker.address().streetAddress(),
    country = getRandomCountry(),
    state = faker.address().state(),
    city = faker.address().city(),
    mobilePhone = faker.phoneNumber().phoneNumber();

    public static int zipcode = faker.number().numberBetween(1,6);
}
