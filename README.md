📚 Library Management System (Java CLI)

## 📌 Objective
A mini **Library Management System** built in **Java** using **Object-Oriented Programming (OOP)** concepts to manage books and users.  
This is a **Command Line Interface (CLI)** project where users can view, issue, and return books.

---

## 🛠️ Tools & Technologies
- **Java**
- **VS Code**
- **Terminal / Command Prompt**
- **OOP Principles** (Encapsulation, Classes, Objects)

---

## 📂 Project Structure
LibraryManagementSystem/
├── Book.java # Represents a book object
├── User.java # Represents a library user
├── Library.java # Manages books (add, issue, return)
└── Main.java # Entry point & CLI menu

yaml
Copy
Edit

---

## 🚀 Features
- 📖 **View Available Books** – Displays all books with their status.
- 📕 **Issue Book** – Borrow a book if available.
- 📗 **Return Book** – Return a previously issued book.
- 👤 **User Input** – User enters name and selects menu options.
- ✅ **Simple CLI Interface** – Works directly in the terminal.

---

## 📜 How to Run the Project
1. **Clone or Download** this project.
2. **Open the folder** in VS Code.
3. **Compile all Java files**:
   ```bash
   javac *.java
Run the program:

bash
Copy
Edit
java Main
Follow the menu in the terminal to interact with the system.

🧠 OOP Concepts Used
Class & Object – Defined Book, User, and Library classes.

Encapsulation – Private fields with public getters/setters.

Method Interaction – Library methods operate on Book objects.

ArrayList – Used for dynamic storage of books.

📌 Example Output
markdown
Copy
Edit
Enter your name: Geo
--- Library Menu ---
1. Show Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 1

1. Harry Potter by J.K. Rowling [Available]
2. The Hobbit by J.R.R. Tolkien [Available]
3. 1984 by George Orwell [Available]
4. 
