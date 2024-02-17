import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String name;
    double amount;

    Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

class ExpenseTracker {
    ArrayList<Expense> expenses;

    ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    void addExpense(String name, double amount) {
        expenses.add(new Expense(name, amount));
        System.out.println("Expense added successfully.");
    }

    double calculateTotalExpense() {
        double totalExpense = 0;
        for (Expense expense : expenses) {
            totalExpense += expense.amount;
        }
        return totalExpense;
    }

    void displayExpenses() {
        System.out.println("Expenses:");
        for (Expense expense : expenses) {
            System.out.println("Name: " + expense.name + ", Amount: " + expense.amount);
        }
        System.out.println("Total Expense: " + calculateTotalExpense());
    }
}

public class Main {
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense name: ");
                    String expenseName = scanner.next();
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    expenseTracker.addExpense(expenseName, expenseAmount);
                    break;
                case 2:
                    expenseTracker.displayExpenses();
                    break;
                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
