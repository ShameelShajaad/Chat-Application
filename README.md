# 💬 Chat Application

**Author:** Shameel Shajaad  
**Module:** Object-Oriented Programming (ICET Institute)  
**Language:** Java  

---

## 📝 Description
**Chat Application** is a **Java Swing-based chat system** developed for the **OOP module** at **ICET Institute**.  

This project demonstrates **real-time message broadcasting** between multiple sender windows, simulating a **public chatroom**. Users can create multiple sender instances and send messages that appear in all windows.  

> 💬 Built using **NetBeans IDE** for GUI design and project management.

---

## ⚡ Features

1. **Multi-Window Chatroom**
   - Multiple sender windows can be created dynamically
   - Each window represents a unique sender
   - Messages are broadcasted to all windows

2. **Message Display**
   - Messages from yourself are displayed as **“Me”**
   - Messages from others display the **sender’s name**
   - Maintains proper formatting for readability

3. **Dynamic Sender Management**
   - Add new senders through the `AddSenderForm`
   - Each sender window registers automatically with `ChatManager`

4. **Graphical User Interface (GUI)**
   - Built using **Java Swing**
   - Text area for messages with scroll support
   - Input field for typing messages
   - Send button and Add Sender button for interaction

5. **Object-Oriented Design**
   - Uses **Encapsulation**: `Sender` class handles sender information
   - **Polymorphism**: Message broadcasting via `ChatManager` to multiple windows
   - **Inheritance** can be extended for future sender types or admin/moderator roles

---

## 🗂 File Structure

ChatApplication/  
├── src/  
│   └── ChatApplication/  
│       ├── AddSenderForm.java  
│       ├── ChatManager.java  
│       ├── Main.java  
│       ├── Sender.java  
│       └── SenderWindow.java  

---

## 🛠 Setup & Run Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/ShameelShajaad/ChatApplication.git

2. **Open in NetBeans**
   -Open NetBeans IDE
   -Go to File → Open Project
   -Select the cloned folder and open it

3. **Run the Project**
   -Click the Run button in NetBeans
   -Or, compile and run via terminal:
   ```bash
   javac src/ChatApplication/*.java
   java src/ChatApplication/Main

4. **Using the Chat**
   -Click **Add Sender (+)** to create a new sender window
   -Type a message in the input field and click **Send**
   -Messages will appear in all sender windows, showing **“Me”** for your own messages and the **sender name** for others

---

## 💡 Concepts Demonstrated

| Concept                 | Description                                                       |
|-------------------------|-------------------------------------------------------------------|
| **OOP Principles**      | Encapsulation, modular classes (`Sender`, `SenderWindow`)        |
| **Polymorphism**        | `ChatManager` broadcasts messages to multiple windows            |
| **Swing GUI**           | Event-driven design with interactive chat interface              |
| **Dynamic Window Management** | Add multiple sender windows and broadcast messages            |
| **Message Formatting**  | Displays “Me” for own messages and sender name for others        |

---

## ⚙️ Technologies Used

- **Java (JDK 17+)**  
- **NetBeans IDE**  
- **Java Swing**  
- **ArrayList for window management**  
- **Custom OOP design with `Sender` class and `ChatManager`**  

---

## 📝 Summary

The **Chat Application - Public Chatroom Edition** demonstrates **dynamic message broadcasting** in a simulated chatroom environment.  
It allows multiple sender windows to communicate simultaneously, highlighting the **practical use of OOP, polymorphism, and event-driven GUIs** in Java.  

This project serves as a **mini chat system prototype** with real-time messaging and expandable architecture for more advanced chatroom features.
