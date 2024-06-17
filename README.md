# bookStoreManagement
Maven Spring Boot REST API Spring MVC ThymeLeaf

Requirements:
1. Maven Project using Spring Initializer: Start by setting up a Maven project via the 
Spring Initializer. This will ensure that all required dependencies and plugins are set up 
properly.
2. Spring Boot REST API: Develop a RESTful API using Spring Boot that will handle all 
CRUD operations related to books, such as adding a new book, fetching details of a book, 
updating book details, and deleting a book.
3. Connection to a Database: Connect your application to a database (e.g., MySQL or 
PostgreSQL) where all the book details will be stored. Implement CRUD operations to 
manage the book inventory.
4. Spring MVC for the Backend: Implement the backend logic using Spring MVC. This 
should manage request mappings, handle responses, and integrate with the database.
5. ThymeLeaf, CSS, and Bootstrap for the Frontend:
o Design a frontend that allows staff to manage the inventory and customers to 
browse the books.
o Use ThymeLeaf as the template engine to display the book data fetched from the 
backend.
o Incorporate CSS for styling and Bootstrap to ensure the website is responsive and 
has a modern design.
6. Spring Security:
o Implement a login form for the bookstore staff and customers.
o Include a logout button to ensure users can log out securely.
o Set up role-based controls: Staff should have permissions to add, update, or delete 
books, while customers should only be able to browse and make purchase requests.
o Use JDBC authentication to verify user credentials against the database.
o Implement password security using the bcrypt algorithm.
o Create a custom access denied page for users trying to access unauthorized sections.
7. DevTools and Actuator Dependencies: Integrate Spring Boot DevTools to ensure faster 
development cycles by automatically restarting the application upon changes. Use the 
Actuator dependency to gain insights into the application’s health, metrics, and other 
details.
