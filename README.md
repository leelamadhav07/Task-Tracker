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

### 1. Clone the repository
```bash
git clone https://github.com/leelamadhav07/Task-Tracker.git
cd Task-Tracker
```
### 2. Run Backend (Spring Boot)
```bash
cd backend
mvn spring-boot:run
```
The backend will start at 👉 http://localhost:8080
### 3. Run Frontend
  Simply open todo.html in your browser

  Or use VS Code Live Server for live updates

## 🌟 Future Enhancements

⏰ Add task scheduling (due dates, reminders)

📩 Email/SMS notifications when tasks are due or completed

☁️ Deploy on cloud (Google Cloud Run, AWS, or Heroku)

🗂️ Separate completed & pending tasks in UI

🛢️ Switch to persistent database (MySQL/PostgreSQL) for production

## 🤝 Contribution

Contributions are welcome! Follow these steps to contribute:

1. ### **Fork the repository**  

2. ### **Create your feature branch**  
```bash
git checkout -b feature-name
```
3. ### **Commit your changes**
```bash
git commit -m "Added new feature"
```
4. ### **Push to your branch**
```bash
git push origin feature-name
```
5. ### **Open a Pull Request**

## 📜 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Developed by S.Leela Madhav ✨ If you like this project, consider giving it a ⭐ on GitHub!
