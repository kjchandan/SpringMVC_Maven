<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>
	
	<form action="dataInsert">
	<table>
		<tr>
			<td>Employee Id</td>
			<td><input type="number" name="empid"/></td>
		</tr>
		<tr>
			<td>Employee name</td>
			<td><input type="text" name="ename"/></td>
		</tr>
		<tr>
			<td>Job role</td>
			<td><input type="text" name="jobrole"/></td>
		</tr>
		<tr>
			<td>Department</td>
			<td><input type="text" name="dept"/></td>
		</tr>
		<tr>
			<td>Department Id</td>
			<td><input type="number" name="deptid"/></td>
		</tr>
		<tr>
			
			<td><input type="submit" name="Insert data"/></td>
		</tr>

	</table>
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form action="delete">
		<table>
		<tr>
			<td>Employee Id</td>
			<td><input type="number" name="empid"/></td>
			<td><input type="submit" value="Delete"/></td>
		</tr>
		</table>
	</form>

</body>
</html>