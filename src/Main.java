import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int ticket = 10_000;
        int bonus = 20;

        int miles = (ticket / bonus);
        System.out.println(miles);
    }

}

