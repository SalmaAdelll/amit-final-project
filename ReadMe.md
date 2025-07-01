# 🧪 Demoblaze Web Automation Framework

This project is a test automation framework built using **Java**, **Selenium WebDriver**, **Cucumber (BDD)**, and **TestNG** to automate end-to-end user flows on the [Demoblaze](https://www.demoblaze.com/) e-commerce demo website.

---

## 🚀 Features

- Login functionality with valid and invalid credentials
- Product selection from categories (e.g., Laptops)
- Add multiple products to cart
- Cart validation with product names and total
- Alert handling after adding products
- Clear cart before each run
- Automated test execution with reporting

---

## 🛠️ Technology Stack

| Tool/Library       | Description                                |
|--------------------|--------------------------------------------|
| Java 17+           | Programming language                       |
| Selenium WebDriver | UI automation                              |
| Cucumber           | Behavior-driven development (BDD)          |
| TestNG             | Test execution framework                   |
| Maven              | Dependency and build management            |
| Extent Reports     | HTML reporting for test execution          |
| IntelliJ IDEA      | Development environment                    |

---

## 🧾 Project Structure
DemoblazeAutomation/
├── src/
│ └── test/
│ ├── java/
│ │ ├── Pages/ # Page Object Model classes
│ │ ├── Steps/ # Step Definitions + Hooks
│ │ └── TestRunner/ # Cucumber TestNG Runner
│ └── resources/
│ └── features/ # Gherkin .feature files
├── pom.xml # Maven config with dependencies
└── testng.xml # Optional TestNG suite file


---

## 🧪 Sample Test Scenario

```gherkin
@smoke
Scenario: Login and add products to cart
  Given User navigates to Demoblaze website to login
  When User clicks on the Login button
  And User enters username "testuser"
  And User enters password "testpass"
  And User submits the login form
  And User opens the laptops category
  And User selects the first product
  And User adds the first product to the cart
  And User navigates back
  And User clicks on the Home button
  And User selects the second product
  And User adds the second product to the cart
  And User opens the cart page
  Then The first product name should be "Sony vaio i5"
  And The second product name should be "Nexus 6"
  And The total amount should be "1180"

▶️ How to Run the Project

📦 Prerequisites
Java 17+

Maven

IntelliJ IDEA (or any Java IDE)

Chrome Browser

📥 Clone and Install
git clone https://github.com/your-username/demoblaze-automation.git
cd demoblaze-automation
mvn clean install

🚀 Execute Tests
From Terminal:
mvn test

From IntelliJ:

Right-click Runner.java and select Run.

📈 Reporting
After execution, an interactive Extent Report is generated automatically.

📄 Location:
/test-output/ExtentReport.html

Features:

Detailed test status (pass/fail)

Screenshots on failure (optional)

Step-wise logs and timestamps

⚙️ Configuration
You can adjust application URL or timeouts (future scope) using a config.properties file:
baseUrl=https://demoblaze.com/

Accessed via utility method (if added):
ConfigReader.get("baseUrl");

🧑‍💻 Maintainer
👤 Salma Adel

💬 Open for collaboration and feedback!

📄 License
This project is licensed under the MIT License. See LICENSE for more details.















