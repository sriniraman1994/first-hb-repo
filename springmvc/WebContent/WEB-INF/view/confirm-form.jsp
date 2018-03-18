<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld of spring</title>
</head>
<body>
   <h1>the message from server: student confirmed:</h1>
   <h2>${student.firstName} ${student.lastName}</h2> 
   <h2>${student.country}</h2>
   <c:forEach var="check" items="${student.check}" >
   	<li>${check}</li>
   </c:forEach>
   <h2>${student.sex}</h2> 
</body>
</html>