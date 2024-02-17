Let's dive into how the provided expense tracker works step by step:

Expense Class:

The Expense class is a simple data structure representing an expense.
Each expense has a name (a string) and an amount (a double), initialized through the constructor.
Example: Creating an expense with the name "Groceries" and an amount of 50.0: new Expense("Groceries", 50.0).
ExpenseTracker Class:

The ExpenseTracker class manages a list of expenses using an ArrayList<Expense>.
It has three main methods:
addExpense(String name, double amount): Adds a new expense to the list. It creates an Expense object and adds it to the expenses ArrayList.
calculateTotalExpense(): Iterates through the list of expenses and calculates the total expenditure by summing up the amounts.
displayExpenses(): Displays all the expenses, showing the name and amount for each, and then prints the total expenditure.
Main Class:

The Main class contains the main method where the program starts executing.
It creates an instance of the ExpenseTracker class and a Scanner object to get user input.
Inside a continuous while loop, it displays a simple menu to the user with three options:
Add Expense: Takes input for the name and amount of the expense, then calls the addExpense method of the ExpenseTracker to add it to the list.
View Expenses: Calls the displayExpenses method of the ExpenseTracker to show a list of all expenses and the total expenditure.
Exit: Terminates the program.
User Interaction:

The program uses the Scanner to get user input for menu options and expense details.
It continuously loops until the user chooses to exit.
Example Usage:

User chooses to add an expense: "Groceries" with an amount of 50.0.
User chooses to add another expense: "Dinner" with an amount of 30.0.
User chooses to view expenses, and the program displays:

![image](https://github.com/hardik5555/Expense-Tracker-/assets/103363985/80b09f99-e248-492e-b7c4-eeca5c724bda)

User can repeat these steps or choose to exit the program.
