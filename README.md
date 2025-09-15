✅ Task Tracker - Full Stack Todo Application

A sleek and interactive Todo Application built with Java, Spring Boot, and a simple frontend using HTML, CSS, and JavaScript.
It allows users to create, edit, mark as complete, and delete tasks with real-time updates, and all data is stored via RESTful APIs.

🚀 Features

➕ Add new tasks

✏️ Edit existing tasks

✅ Mark tasks as completed

❌ Delete tasks

🔄 Real-time UI updates

💾 Persistent storage using RESTful APIs

📂 Project Structure
Task-Tracker/
│
│── backend/                        # Java Spring Boot Backend
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
│── frontend/                             # Frontend files
│   ├── todo.html
│   ├── liststyle.css
│   └── todo.js
│
└── README.md

⚙️ Setup & Usage

Clone the repository

git clone https://github.com/leelamadhav07/Task-Tracker.git
cd Task-Tracker


Run Backend

cd backend
mvn spring-boot:run


Backend will start at 👉 http://localhost:8080

Run Frontend

Simply open todo.html in your browser

Or use VS Code Live Server for live updates

🌟 API Integration

The backend exposes RESTful APIs for managing tasks:

GET /api/todos → Get all tasks

POST /api/todos → Create a new task

PUT /api/todos/{id} → Update a task

DELETE /api/todos/{id} → Delete a task

The frontend interacts with these APIs automatically in real-time.

🌟 Future Enhancements

⏰ Add task scheduling (due dates, reminders)

📩 Email/SMS notifications when tasks are due or completed

☁️ Deploy on cloud (Google Cloud Run, AWS, or Heroku)

🗂️ Separate completed & pending tasks in UI

🛢️ Switch to persistent database (MySQL/PostgreSQL) for production

🤝 Contributing

Contributions are welcome! To contribute:

Fork the repository

Create a new branch

git checkout -b feature/your-feature


Commit your changes

Open a Pull Request

📜 License

This project is licensed under the MIT License.

👨‍💻 Author

Developed by Leela Madhav ✨ If you like this project, consider giving it a ⭐ on GitHub!
