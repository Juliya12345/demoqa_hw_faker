package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestData {
    Faker faker = new Faker(new Locale("en-GB"));
    SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy/LLLL",Locale.UK);

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String userGender = faker.options().option("Male", "Female", "Other");
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public Date birthday = faker.date().birthday(18, 70);
    String dob = sdf.format(birthday);
    public String day = dob.substring(0,2);
    public String year = dob.substring(3,7);
    public String month = dob.substring(8);
    public String subject = faker.options().option("Accounting", "Arts", "Biology", "Chemistry", "Civics", "Commerce", "Computer Science", "Economics", "English",
            "Hindi", "History", "Maths", "Physics", "Social Studies");
    public String hobbies = faker.options().option("Sports", "Reading", "Music");
    public String picture = faker.options().option("picture.jpg", "picture1.jpg");
    public String address = faker.address().fullAddress();
    public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public String city = chooseCity(state);


    public String chooseCity(String state) {
        switch (state) {
            case "NCR":
                return faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return faker.options().option("Karnal", "Panipat");
            case "Rajasthan":
                return faker.options().option("Jaipur", "Jaiselmer");
            default:
                return null;

        }
    }
}