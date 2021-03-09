package ex24_2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    private int number;
    private int startNumber;
    private int endNumber;
    private int numberOk;

    // Default Constructor
    public Date() {
        setDay(1);
        setMonth(1);
        setYear(1900);
    }

    // Parameterized Constructor
    public Date(int myMonth, int myDay, int myYear) {
        setYear(myYear);
        setMonth(myMonth);
        setDay(myDay);
    }

    // Getters
    public int getNumberOk() {
        return numberOk;
    }

    public int getNumber() {
        return number;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Setters

    public void setNumberOk(int numberOk) {
        this.numberOk = numberOk;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public void setEndNumber(int endNumber) {
        this.endNumber = endNumber;
    }

    public void setYear(int myYear) {
        checkInput("Year", myYear);
    }

    public void setMonth(int myMonth) {
        checkInput("Month", myMonth);
    }

    public void setDay(int myDay) {
        checkInput("Day", myDay);
    }

    // Print Complete Date method
    public void displayDate() {
        System.out.print("Print Complete Date: ");
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }

    // Check input method
    public void checkInput(String inputValue, int number) {
        if ("Year".equals(inputValue)) {
            setStartNumber(1900);
            setEndNumber(2050);
        } else if ("Month".equals(inputValue)) {
            setStartNumber(1);
            setEndNumber(12);
        } else if (getYear() % 4 == 0 && getMonth() == 2) {
            setStartNumber(1);
            setEndNumber(29);
        } else if (getMonth() == 2 && getYear() % 4 != 0) {
            setStartNumber(1);
            setEndNumber(28);
        } else if ((getMonth() < 8 && getMonth() % 2 != 0) || (getMonth() >= 8 && getMonth() % 2 == 0)) {
            setStartNumber(1);
            setEndNumber(31);
        } else if ((getMonth() < 8 && getMonth() % 2 == 0) || (getMonth() >= 8 && getMonth() % 2 != 0)) {
            setStartNumber(1);
            setEndNumber(30);
        }

        if (number >= getStartNumber() && number <= getEndNumber()) {
            setNumberOk(1);
            switch (inputValue) {
                case "Year":
                    year = number;
                    break;
                case "Month":
                    month = number;
                case "Day":
                    day = number;
            }

        } else {
            System.out.println("Wrong input! Enter "
                    + inputValue + " between "
                    + getStartNumber() + " and "
                    + getEndNumber());
            setNumberOk(0);
            scannerProcess(inputValue);
        }
    }

    // Scanner processing method
    public void scannerProcess(String str) {
        Scanner input = new Scanner(System.in);
        int myNumber;
        setNumberOk(0);

        while (true) {
            String string = input.nextLine();
            try {
                myNumber = (Integer.parseInt(string));
                break;
            } catch (Exception e) {
                System.out.println("Wrong input! " + string);
            }
        }
        setNumber(myNumber);
        while (getNumberOk() == 0) {
            checkInput(str, myNumber);
        }
    }

}
