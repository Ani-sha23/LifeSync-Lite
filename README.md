# LifeSync Lite  

##Smart Personal Management System

> **A Java-based personal management system that brings expenses, tasks, habits, and productivity insights together in one simple console application.**

---

## Overview

**LifeSync Lite** is a Java-based console application designed to help students and professionals organize and manage important aspects of their daily lives from a single platform.

Instead of relying on separate applications for budgeting, task management, and habit tracking, LifeSync Lite combines these functionalities into one lightweight system.

The application demonstrates practical implementation of **Object-Oriented Programming, Java Collections, Streams, File Handling, Serialization, and modular application design**.

---

## Problem Statement

Managing personal expenses, deadlines, and daily habits across multiple platforms can become inconvenient and fragmented.

This often results in:

- Poor visibility into spending
- Missed or poorly prioritized tasks
- Difficulty maintaining consistent habits
- Lack of meaningful personal insights

**LifeSync Lite** addresses these challenges by providing a unified personal management system.

---

## Solution

LifeSync Lite provides a centralized platform to:

- Track and categorize daily expenses
- Create and prioritize tasks
- Track habits and maintain streaks
- Generate basic productivity and spending insights
- Persist user data using file-based storage

---

# Features

## Expense Tracker

Manage and monitor personal spending efficiently.

**Capabilities:**

- Add new expenses
- Categorize expenses such as Food, Travel, Shopping, etc.
- View recorded expenses
- Calculate total spending
- Analyze basic spending patterns

---

## Task Manager

Organize daily responsibilities and deadlines.

**Capabilities:**

- Create tasks
- Assign priorities:
  - High
  - Medium
  - Low
- Automatically organize tasks based on priority
- View pending tasks

---

## Habit Tracker

Build consistency by monitoring daily habits.

**Capabilities:**

- Add personal habits
- Track daily completion
- Maintain habit streaks
- Identify consistently performed habits
- View best-performing habits

---

## Insights Engine

Convert stored data into simple actionable insights.

The Insights Engine provides information such as:

- Spending trends
- High-priority tasks
- Strongest habit streaks
- Basic activity patterns

---

# Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Core application development |
| **OOP** | Modular and maintainable architecture |
| **Collections Framework** | Data management |
| **Stream API** | Filtering, sorting & analysis |
| **File I/O** | Data persistence |
| **Serialization** | Storing application objects |
| **Console UI** | User interaction |

---

# Project Structure

```text
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
