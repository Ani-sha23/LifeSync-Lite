LifeSync Lite – Smart Personal Management System
A Java-based personal management system that brings expenses, tasks, habits, and productivity insights together in one simple console application.

Overview
LifeSync Lite is a Java-based console application designed to help students and professionals organize and manage important aspects of their daily lives from a single platform.
Instead of relying on separate applications for budgeting, task management, and habit tracking, LifeSync Lite combines these functionalities into one lightweight system.
The application demonstrates practical implementation of Object-Oriented Programming, Java Collections, Streams, File Handling, Serialization, and modular application design.
Problem Statement
Managing personal expenses, deadlines, and daily habits across multiple platforms can become inconvenient and fragmented.
This often results in:
- Poor visibility into spending
- Missed or poorly prioritized tasks
- Difficulty maintaining consistent habits
- Lack of meaningful personal insights
LifeSync Lite addresses these challenges by providing a unified personal management system.
Solution
LifeSync Lite provides a centralized platform to:
- Track and categorize daily expenses
- Create and prioritize tasks
- Track habits and maintain streaks
- Generate basic productivity and spending insights
- Persist user data using file-based storage
Features
Expense Tracker
Manage and monitor personal spending efficiently.
Capabilities:
- Add new expenses
- Categorize expenses such as Food, Travel, Shopping, etc.
- View recorded expenses
- Calculate total spending
- Analyze basic spending patterns
Task Manager
Organize daily responsibilities and deadlines.
Capabilities:
- Create tasks
- Assign priorities:
  - High
  - Medium
  - Low
- Automatically organize tasks based on priority
- View pending tasks
Habit Tracker
Build consistency by monitoring daily habits.
Capabilities:
- Add personal habits
- Track daily completion
- Maintain habit streaks
- Identify consistently performed habits
- View best-performing habits
Insights Engine
Convert stored data into simple actionable insights.
The Insights Engine provides information such as:
- Spending trends
- High-priority tasks
- Strongest habit streaks
- Basic activity patterns
Technologies Used
Technology	Purpose
Java	Core application development
OOP	Modular and maintainable architecture
Collections Framework	Data management
Stream API	Filtering, sorting & analysis
File I/O	Data persistence
Serialization	Storing application objects
Console UI	User interaction


Project Structure
LifeSync-Lite/
│
├── Main.java
├── Expense.java
├── Task.java
├── Habit.java
├── FileHandler.java
├── ConsoleUI.java
│
└── README.md

Core Components
Main.java
Entry point of the application.
Expense.java
Represents expense records and their associated information.
Task.java
Handles task details and priority management.
Habit.java
Manages habits, completion status, and streak tracking.
FileHandler.java
Handles persistent storage using file handling and serialization.
ConsoleUI.java
Provides the interactive command-line interface.
Getting Started
Prerequisites
Make sure you have:
- Java JDK 8 or higher
- A terminal / command prompt
- Git (optional, for cloning the repository)
Check your Java installation:
java -version
javac -version

Installation
Clone the repository:
git clone <YOUR_GITHUB_REPOSITORY_URL>

Navigate to the project directory:
cd LifeSync-Lite

Run the Application
1. Compile
javac *.java

2. Run
java Main

Sample Workflow
A typical user workflow might look like:
1. Add Expense
   → Food – ₹200

2. Add Task
   → Complete Assignment – HIGH

3. Add Habit
   → Study for 2 Hours – Daily

4. View Tasks
   → High-priority assignment displayed first

5. View Insights
   → Total spending
   → High-priority tasks
   → Best habit streak

Key Concepts Demonstrated
LifeSync Lite was developed to apply important Java programming concepts in a practical project.
Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Modular design
Java Collections
- ArrayList
- Lists
- Sorting
- Filtering
Stream API
Used for:
- Filtering records
- Sorting tasks
- Calculating totals
- Generating insights
File Handling
The application uses:
- File I/O
- Object serialization
- Persistent local storage
Software Design
The project separates responsibilities into dedicated classes, making the application easier to maintain and extend.
Architecture
                 ┌──────────────────┐
                 │     Console UI   │
                 └────────┬─────────┘
                          │
            ┌─────────────┼─────────────┐
            │             │             │
            ▼             ▼             ▼
      ┌──────────┐  ┌──────────┐  ┌──────────┐
      │ Expenses │  │  Tasks   │  │  Habits  │
      └────┬─────┘  └────┬─────┘  └────┬─────┘
           │             │             │
           └─────────────┼─────────────┘
                         ▼
                ┌─────────────────┐
                │ Insights Engine │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │  File Handler   │
                │  Serialization  │
                └─────────────────┘

Challenges Faced
During development, the major challenges included:
- Designing multiple modules within a single application
- Maintaining clean separation between application components
- Implementing persistent storage using serialization
- Sorting and filtering data efficiently
- Creating a simple but intuitive console interface
- Generating meaningful insights from stored data
Future Enhancements
LifeSync Lite can be extended into a full-fledged personal productivity platform.
Planned Improvements
- JavaFX GUI
- MySQL / PostgreSQL database integration
- Interactive analytics and charts
- Mobile application
- Cloud-based synchronization
- User authentication
- Task and habit reminders
- Advanced spending analytics
- AI-powered productivity recommendations
Learning Outcomes
Through this project, the following skills were strengthened:
- Java programming
- Object-Oriented Programming
- Data structures and collections
- Stream API
- File handling and serialization
- Modular software development
- Problem-solving
- Basic data analysis
- Application architecture
Author
Anisha Garg
B.Tech CSE – Artificial Intelligence & Machine Learning
VIT Bhopal University
Student ID: 24BAI10375
License
This project is developed for educational and learning purposes.
You are welcome to explore, modify, and build upon the project for educational use.
