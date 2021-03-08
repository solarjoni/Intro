package ex24_1;

public class DateTest {
    public static void main(String[] args) {

        // Create Date object and enter date
        Date dp;
        dp = new Date(30, 2, 2000);

        // Print separate Date
        System.out.println("Month: " + dp.getMonth());
        System.out.println("Day: " + dp.getDay());
        System.out.println("Year: " + dp.getYear());

        dp.dateLogic();
        // Print Complete Date
        dp.displayDate();
    }


}

