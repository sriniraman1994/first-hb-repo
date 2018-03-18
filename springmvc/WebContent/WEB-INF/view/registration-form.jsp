<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>student Registeration</title>
<style>
 .error{
 color:red;
 }
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student" method="post">
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName" class="error"/>
		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
		male : <form:radiobutton value="male" path="sex" />
		 female:<form:radiobutton value="male" path="sex" />


		<br>
		<br>
		Country:<form:select path="country">
			<form:options items="${student.comboMap}" />
		</form:select>
		<br>
		<br>
         Java  <form:checkbox value="java" path="check" />
         spring <form:checkbox value="spring" path="check" /> 
         Hibernate<form:checkbox value="Hibernate" path="check" />
		<br>
		<br>
		password: <form:input path="password" />
		<form:errors path="password" class="error"/>
		<br>
		<br>
		passes: <form:input path="passes" />
		<form:errors path="passes" class="error"/>
		<br>
		<br>
		postcode: <form:input path="postalCode" />
		<form:errors path="postalCode" class="error"/>
		<br>
		<br>
		coursecode: <form:input path="courseCode" />
		<form:errors path="courseCode" class="error"/>
		<br>
		<br>
		
		<input type="submit" value="Submit" />
   
	</form:form>
</body>
</html>