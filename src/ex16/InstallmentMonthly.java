/*
    The online store offers installment sale.
    Write a program calculating the monthly installment for the purchased tower.
    Input data for the program are:

    the price of the goods (from $ 100 to $ 10,000)
    number of installments (from 6 to 48).
    The loan bears interest depending on the number of installments:

    from 6-12 is 2.5%,
    from 13-24 is 5%,
    from 25-48 is 10%.
    The user indicates the number of installments and the amount lent.
 */

package ex16;

import javax.swing.*;
import java.util.Scanner;

public class InstallmentMonthly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input Installment number (6 -48) : ");
        int numberOfInstallments = sc.nextInt();
        System.out.println("Input loan amount (< 10001): ");
        double loan = sc.nextDouble();

        if (loan < 100 || loan > 10000) {
            System.out.println("Invalid loan size");
            return;
        }

        if (numberOfInstallments < 6 || numberOfInstallments > 48) {
            System.out.println("Invalid number of Installments");
            return;
        }

        double interest;
        if (numberOfInstallments <= 12) {
            interest = 0.025;
        } else if (numberOfInstallments <= 24) {
            interest = 0.05;
        } else {
            interest = 0.1;
        }
        double monthlyLoanInstallment = (loan + loan * interest) / numberOfInstallments;

        System.out.println(monthlyLoanInstallment);
    }

}

/*
    public int getSum() {
        return sum;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
*/