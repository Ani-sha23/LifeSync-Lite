import java.util.*;

public class ConsoleUI {

    private Scanner sc = new Scanner(System.in);

    private List<Expense> expenses = FileHandler.load("expenses.dat");
    private List<Task> tasks = FileHandler.load("tasks.dat");
    private List<Habit> habits = FileHandler.load("habits.dat");

    public void start() {
        while (true) {
            System.out.println("\n===== LifeSync Lite =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Add Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Add Habit");
            System.out.println("6. Complete Habit");
            System.out.println("7. View Habits");
            System.out.println("8. Show Insights");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addExpense();
                case 2 -> viewExpenses();
                case 3 -> addTask();
                case 4 -> viewTasks();
                case 5 -> addHabit();
                case 6 -> completeHabit();
                case 7 -> viewHabits();
                case 8 -> showInsights();
                case 0 -> exitApp();
            }
        }
    }

    // ---------------- EXPENSE ----------------
    private void addExpense() {
        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        expenses.add(new Expense(category, amount));
        System.out.println("Expense Added!");
    }

    private void viewExpenses() {
        double total = 0;

        System.out.println("\n--- Expenses ---");
        for (Expense e : expenses) {
            System.out.println(e);
            total += e.getAmount();
        }

        System.out.println("Total Spending: ₹" + total);
    }

    // ---------------- TASK ----------------
    private void addTask() {
        System.out.print("Enter Task: ");
        String title = sc.nextLine();

        System.out.print("Enter Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        tasks.add(new Task(title, priority));
        System.out.println("Task Added!");
    }

    private void viewTasks() {
        System.out.println("\n--- Tasks ---");

        tasks.stream()
                .sorted(Comparator.comparing(Task::getPriority))
                .forEach(System.out::println);
    }

    // ---------------- HABIT ----------------
    private void addHabit() {
        System.out.print("Enter Habit: ");
        String name = sc.nextLine();

        habits.add(new Habit(name));
        System.out.println("Habit Added!");
    }

    private void completeHabit() {
        for (int i = 0; i < habits.size(); i++) {
            System.out.println(i + ". " + habits.get(i));
        }

        System.out.print("Select Habit: ");
        int index = sc.nextInt();

        habits.get(index).completeToday();
        System.out.println("Habit Updated!");
    }

    private void viewHabits() {
        System.out.println("\n--- Habits ---");
        habits.forEach(System.out::println);
    }

    // ---------------- INSIGHTS ----------------
    private void showInsights() {
        System.out.println("\n--- Insights ---");

        double total = expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();

        System.out.println("Total Spending: ₹" + total);

        long highPriority = tasks.stream()
                .filter(t -> t.getPriority().equalsIgnoreCase("High"))
                .count();

        System.out.println("High Priority Tasks: " + highPriority);

        habits.stream()
                .max(Comparator.comparing(Habit::getStreak))
                .ifPresent(h -> System.out.println("Best Habit: " + h.getName()));
    }

    // ---------------- EXIT ----------------
    private void exitApp() {
        FileHandler.save("expenses.dat", expenses);
        FileHandler.save("tasks.dat", tasks);
        FileHandler.save("habits.dat", habits);

        System.out.println("Data Saved. Exiting...");
        System.exit(0);
    }
}