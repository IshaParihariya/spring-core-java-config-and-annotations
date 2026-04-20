# Spring Core: XML + Java Config + Annotations

This project demonstrates core Spring Framework concepts using both XML-based configuration and annotation-based configuration.

---

## 🚀 What I Learned

- Bean creation and management in Spring
- Constructor Injection (`constructor-arg`, `c:` namespace)
- Setter Injection (`p:` namespace)
- Dependency Injection using `@Autowired`
- Component Scanning with `@ComponentScan`
- Java-based configuration using `@Configuration`
- Difference between XML config and Annotation config

---

## 📁 Project Structure

---

src/
├── main/
│ ├── java/
│ │ ├── main/
│ │ │ ├── LaunchApp.java
│ │ │ ├── LaunchApp1.java (XML-based)
│ │ │ ├── LaunchApp2.java (Annotation-based)
│ │ │ ├── AppConfig.java
│ │ │
│ │ ├── service/ (XML approach)
│ │ │ ├── Employee.java
│ │ │ ├── Student.java
│ │ │ ├── Department.java
│ │ │ ├── Boss.java
│ │ │
│ │ ├── service1/ (Annotation approach)
│ │ ├── Student.java
│ │ ├── Department.java
│
│ ├── resources/
│ ├── applicationconfig.xml
│ ├── applicationconfig1.xml



---

## 🔧 Technologies Used

- Java 17
- Spring Core (5.x)
- Maven
- IntelliJ IDEA

---

## 🔹 XML Configuration

- `<bean>` definitions
- Constructor injection (`constructor-arg`, `c:`)
- Setter injection (`p:`)
- Manual dependency wiring

---

## 🔹 Annotation-Based Configuration

- `@Component` → Bean creation
- `@Autowired` → Dependency injection
- `@Configuration` → Java config class
- `@ComponentScan` → Automatic scanning

---

## ▶️ How to Run

### XML Version
Run: 
LaunchApp1.java


### Annotation Version
Run:
LaunchApp2.java


---

## 📌 Key Takeaways

- Constructor injection is preferred
- Annotation-based config is used in real projects
- Spring Boot builds on these concepts

---

## 🔜 Next Steps

- Spring Boot
- REST APIs
- Database integration

---

## 👩‍💻 Author

Isha Parihariya
