<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Alien Management</title>
</head>
<body>
    <h1>Welcome ${name}!</h1>
    
    <h2>Add New Alien</h2>
    <form action="addAlien" method="post">
        <label>Alien ID:</label>
        <input type="number" name="aid" required><br><br>
        
        <label>Alien Name:</label>
        <input type="text" name="aname" required><br><br>
        
        <button type="submit">Add Alien</button>
    </form>
    
    <hr>
    <a href="getAliens">View All Aliens</a>
</body>
</html>