package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberScanner {
    public static void validatePhoneNumbers(String fileNumbBook) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNumbBook))) {
            String line;
            Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");

            while ((line = reader.readLine()) != null) {
                Matcher sample = pattern.matcher(line);

                if (sample.matches()) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error while reading: " + e.getMessage());
        }
    }
}
