<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>customer Registeration</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer" method="post">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />
		</form:form>
		
</body>
</html>