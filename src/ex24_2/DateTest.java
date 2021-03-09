package ex24_2;

public class DateTest {
    public static void main(String[] args) {

// Create Test Date object and enter date
        Date dpAuto = new Date(2, 29, 2000); // may test different values
        dpAuto.displayDate();

    /*    // Print separate Date
        System.out.println("Month: " + dpAuto.getMonth());
        System.out.println("Day: " + dpAuto.getDay());
        System.out.println("Year: " + dpAuto.getYear());

     */

        // Create Date object and enter date
        Date dp = new Date();

        System.out.println("Enter Year");
        dp.scannerProcess("Year");
        System.out.println("Enter Month");
        dp.scannerProcess("Month");
        System.out.println("Enter Day");
        dp.scannerProcess("Day");
        // Print separate Date
        System.out.println("Month: " + dp.getMonth());
        System.out.println("Day: " + dp.getDay());
        System.out.println("Year: " + dp.getYear());
        // Print Complete Date
        dp.displayDate();

    }


}

