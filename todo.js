function display() {
    let data = document.getElementById("todoDisplay").value.trim();
    if (!data) return alert("Please Enter a task!");

    fetch("http://localhost:8080/todo", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ mssg: data })
    })
    .then(res => res.json())
    .then(savedTask => {
        addTaskToUI(savedTask.id, savedTask.mssg);
        document.getElementById("todoDisplay").value = "";
    });
}

function addTaskToUI(id, text) {
    let taskList = document.getElementById("taskList");

    let taskBox = document.createElement("div");
    taskBox.id = `task-${id}`;

    let taskText = document.createElement("span");
    taskText.id = `task-text-${id}`;
    taskText.textContent = text;

    let buttonsDiv = document.createElement("div");
    buttonsDiv.className = "task-buttons";

    let completeBtn = document.createElement("button");
    completeBtn.textContent = "✅ Complete";
    completeBtn.onclick = () => {
        taskText.style.textDecoration = "line-through";
        fetch(`http://localhost:8080/todo/${id}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ status: "completed" })
        });
    };

    let editBtn = document.createElement("button");
    editBtn.textContent = "✏️ Edit";
    editBtn.onclick = () => {
        let newTask = prompt("Edit task:", taskText.textContent);
        if (newTask && newTask.trim() !== "") {
            taskText.textContent = newTask.trim();
            fetch(`http://localhost:8080/todo/${id}`, {
                method: "PUT",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ mssg: newTask.trim() })
            });
        }
    };

    let deleteBtn = document.createElement("button");
    deleteBtn.textContent = "🗑️ Delete";
    deleteBtn.onclick = () => {
        taskBox.remove();
        fetch(`http://localhost:8080/todo/${id}`, {
            method: "DELETE"
        });
    };

    buttonsDiv.append(completeBtn, editBtn, deleteBtn);

    taskBox.append(taskText, buttonsDiv);

    taskList.appendChild(taskBox);
}
