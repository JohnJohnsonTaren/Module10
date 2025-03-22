import Task1.NumberScanner;
import Task2.UserProcess;
import Task3.CountWords;

public class Main {
    public static void main(String[] args) {
        NumberScanner.validatePhoneNumbers("src/main/resources/NumberBook.txt");

        CountWords countWords = new CountWords();
        countWords.countWords(
                "src/main/resources/words.txt");

        UserProcess userProcess = new UserProcess();
        userProcess.processUsers(
                "src/main/resources/file.txt",
                "src/main/resources/user.json");
    }
}

