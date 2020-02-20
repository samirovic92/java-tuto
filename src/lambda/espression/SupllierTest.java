package lambda.espression;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupllierTest {

    public static void main(String... args) {

        System.out.println("========== Supplier Interface ==========");
        Supplier<LocalDate> s1 = () -> LocalDate.now();

        System.out.println("Local date is : " + s1.get());

        Supplier<String> s2 = () -> {
            String[] names = {"Samirovic", "Ibrahim", "Yassine"};
            int i = (int) (Math.random() * 4);
            return names[i];
        };
        System.out.println("Get the random name ");
        System.out.println(s2.get());

        System.out.println("========== Supplier : Random Password ==========");
        Supplier<String> s3 = () -> {
            String password = "";
            Supplier<Integer> digit = () -> (int) (Math.random() * 10);
            Supplier<Character> character = () -> {
                String alphabe = "azertyuiopqsdfghjklmwxcvbn$#!";
                return alphabe.charAt((int) (Math.random() * 29));
            };
            for (int j = 0; j < 8; j++) {
                    if (j % 2 == 1) password += digit.get();
                    if (j % 2 == 0) password += character.get();
            }
            return password;
        };
        System.out.println(s3.get());
        System.out.println(s3.get());
        System.out.println(s3.get());
    }
}
