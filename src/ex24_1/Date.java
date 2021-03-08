package ex24_1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int myMonth, int myDay, int myYear) {
        // Constructor code
        day = myDay;
        month = myMonth;
        year = myYear;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int myMonth) {
        month = myMonth;
    }

    public void setDay(int myDay) {
        day = myDay;
    }

    public void setYear(int myYear) {
        year = myYear;
    }

    public void displayDate() {
        System.out.println("Print Complete Date");
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }

    public void dateLogic() {
        Scanner input = new Scanner(System.in);
        // Year input
        System.out.println("Enter Year");
        while (true) {
            int number = input.nextInt();
            if (number >= 1900 && number <= 2050) {
                setYear(number);
                break;
            } else {
                System.out.println("Wrong input! Enter Year between 1900 and 2050");
            }
        }
        // Month input
        System.out.println("Enter Month");
        while (true) {
            int number = input.nextInt();
            if (number >= 1 && number <= 12) {
                setMonth(number);
                break;
            } else {
                System.out.println("Wrong input! Enter Month between 1 and 12");
            }
        }
        // Day input
        if (getYear() % 4 == 0 && getMonth() == 2) {
            while (true) {
                System.out.println("Enter Day (1-29)");
                int number = input.nextInt();
                if (number >= 1 && number <= 29) {
                    setDay(number);
                    break;
                } else {
                    System.out.println("Wrong input! Enter Day between 1 and 29");
                }
            }
        } else if (getMonth() == 2 && getYear() % 4 != 0) {
            while (true) {
                System.out.println("Enter Day (1-28)");
                int number = input.nextInt();
                if (number >= 1 && number <= 28) {
                    setDay(number);
                    break;
                } else {
                    System.out.println("Wrong input! Enter Day between 1 and 28");

                }
            }
        } else if ((getMonth() < 8 && getMonth() % 2 != 0) || (getMonth() >= 8 && getMonth() % 2 == 0)) {
            while (true) {
                System.out.println("Enter Day (1-31)");
                int number = input.nextInt();
                if (number >= 1 && number <= 31) {
                    setDay(number);
                    break;
                } else {
                    System.out.println("Wrong input! Enter Day between 1 and 31");
                }
            }
        } else if ((getMonth() < 8 && getMonth() % 2 == 0) || (getMonth() >= 8 && getMonth() % 2 != 0)) {
            while (true) {
                System.out.println("Enter Day (1-30)");
                int number = input.nextInt();
                if (number >= 1 && number <= 30) {
                    setDay(number);
                    break;
                } else {
                    System.out.println("Wrong input! Enter number between 1 and 30");
                }
            }
        }
    }
}
