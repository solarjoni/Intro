package ex24;

public class DateTest {
    public static void main(String[] args) {

        // Create Date object and enter date
        Date dp;
        dp = new Date();

        // Enter and process date
        dp.dateLogic();
        // Print separate Date
        System.out.println("Month: " + dp.getMonth());
        System.out.println("Day: " + dp.getDay());
        System.out.println("Year: " + dp.getYear());
        // Print Complete Date
        dp.displayDate();
    }


}

