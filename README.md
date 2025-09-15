# ✅ Task Tracker - Full Stack Todo Application

A full-stack **Todo Application** with a Java backend that allows users to manage tasks efficiently.  
Users can **create, edit, mark as complete, and delete tasks** with real-time UI updates.  
All actions are persisted in the database via **RESTful APIs**, ensuring synchronization between frontend and backend.

---

## 🚀 Features

- ➕ Add new tasks  
- ✏️ Edit existing tasks  
- ✅ Mark tasks as completed  
- ❌ Delete tasks  
- 🔄 Real-time UI updates  
- 💾 Persistent storage using RESTful APIs  

---

## 🛠️ Tech Stack

**Backend:** Java, Spring Boot, Spring Data JPA  
**Database:** H2 Database (in-memory, dev mode)  
**Frontend:** JavaScript, HTML, CSS  
**Build Tool:** Maven  

---

## 📂 Project Structure

```bash
Task-Tracker/
│
├── backend/                        # Java Spring Boot Backend
│   ├── src/main/java/com/tasktracker/
│   │   ├── controller/
│   │   │   └── TodoController.java       # Handles REST API endpoints
│   │   ├── service/
│   │   │   └── TodoService.java          # Business logic
│   │   ├── model/
│   │   │   └── Todo.java                 # Entity class (represents Task table)
│   │   ├── repository/
│   │   │   └── TodoRepo.java             # JPA Repository interface
│   │   └── ToDoSpringApplication.java    # Main Spring Boot entry point
│   │
│   ├── src/main/resources/
│   │   └── application.properties        # Database & Server configurations
│   │
│   └── pom.xml                           # Maven dependencies
│
├── frontend/                             # Frontend (HTML, CSS, JS)
│   ├── todo.html
│   ├── liststyle.css
│   └── todo.js
│
└── README.md
```
## ⚙️ Installation & Setup

Clone the repository

git clone https://github.com/leelamadhav07/Task-Tracker.git
cd Task-Tracker


Run Backend (Spring Boot)

cd backend
mvn spring-boot:run


Backend will start at 👉 http://localhost:8080

Run Frontend

Simply open todo.html in your browser

Or use VS Code Live Server for live updates

The frontend will interact with backend APIs in real-time.

## 🌟 Future Enhancements

⏰ Add task scheduling (due dates, reminders)

📩 Email/SMS notifications when tasks are due or completed

☁️ Deploy on cloud (Google Cloud Run, AWS, or Heroku)

🗂️ Separate completed & pending tasks in UI

🛢️ Switch to persistent database (MySQL/PostgreSQL) for production

## 🤝 Contribution

Fork this repository

Create your feature branch:

git checkout -b feature-name


Commit your changes:

git commit -m "Added new feature"


Push to the branch:

git push origin feature-name


Open a Pull Request

## 📜 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Developed by Leela Madhav
