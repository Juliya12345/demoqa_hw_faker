package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.TestData;


public class FakerPracticeTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void practiceFormTest() {

        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.userGender)
                .setUserNumber(testData.userNumber)
                .setDateOfBirth(testData.day, testData.month,testData.year)
                .setSubject(testData.subject)
                .setHobbies(testData.hobbies)
                .uploadPicture(testData.picture)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .submit();

        registrationPage.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.userEmail)
                .checkResult("Gender", testData.userGender)
                .checkResult("Mobile", testData.userNumber)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobbies)
                .checkResult("Picture", testData.picture)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);

    }


    @Test

    void minimalFormTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.userGender)
                .setUserNumber(testData.userNumber)
                .setDateOfBirth(testData.day, testData.month,testData.year)
                .submit();

        registrationPage.checkResult("Student Name",testData.firstName + " " + testData.lastName)
                .checkResult("Student Email",testData.userEmail)
                .checkResult("Gender", testData.userGender)
                .checkResult("Mobile",testData.userNumber)
                .checkResult("Date of Birth",  testData.day + " " + testData.month + "," + testData.year);

    }
    @Test

    void withoutUserNumberTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.userGender)
                .setDateOfBirth(testData.day, testData.month,testData.year)
                .submit();


        registrationPage.withoutNumberCheck();

    }
}

