CREATE TABLE employee(
   emp_id SERIAL PRIMARY KEY,
   fname VARCHAR(100) NOT NULL,
   lname VARCHAR(50) NOT NULL,
   email VARCHAR(100) NOT NULL UNIQUE,
   dept VARCHAR(50),
   salary DECIMAL(10,2) DEFAULT 30000.00,
   hire_date DATE NOT NULL DEFAULT CURRENT_DATE

);
SELECT * FROM employee;
INSERT INTO employee(emp_id, fname, lname, email, dept, salary,hire_date)
VALUES
(1,'Shailesh','Singh','Shailesh9005@gmail.com','TECH', 51000,'07/07/2026'),
(2,'Mukesh','Singh','Mukesh@gmail.com','Accountent',25000,'01/06/2026');

SELECT SUM(salary) FROM employee;
SELECT AVG(salary) FROM employee;
SELECT dept FROM employee GROUP BY dept;
SELECT dept, COUNT(emp_id) FROM employee GROUP BY dept;



SELECT CONCAT(fname, lname) FROM employee;
SELECT CONCAT_WS(' ',fname,lname) FROM employee;

SELECT SUBSTRING('hello world', 7,11);
SELECT REPLACE('hey sir','hey','hello');
SELECT CONCAT_WS(':',emp_id, CONCAT_WS(' ',fname,lname),dept) FROM employee WHERE emp_id=1;
SELECT CONCAT_WS(':',emp_id,CONCAT_WS(' ',fname,lname),dept) FROM employee WHERE emp_id=3;
ALTER TABLE EMPLOYEE ADD COLUMN age INT;
