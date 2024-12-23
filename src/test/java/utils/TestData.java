package utils;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String userGender = faker.options().option("Male", "Female", "Other");
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public int dayOfBirth = faker.number().numberBetween(1, 28);
    public String monthOfBirth = faker.options().option("January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December");
    public int yearOfBirth = faker.number().numberBetween(1900, 2024);
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