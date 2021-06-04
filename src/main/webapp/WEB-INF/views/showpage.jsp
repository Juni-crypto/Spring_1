
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to House Boat Reservation </center></h1>
<center><form:form method="post" action ="billDesk" modelAttribute="houseBoat">
	<table>
		<tr>
			<td><label>Choose HouseBoatType</label></td>
			<td><form:select path="houseBoatType" id="houseBoatType" items="${houseBoatList }"/></td>
		</tr>
		<tr>
			<td>
				<label>Enter Number of Days</label>
			</td>
			<td>
				<form:input path="noOfDays" id="noOfDays"/>
				<form:errors path="noOfDays" id="noOfDays"></form:errors>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="TotalCost"/></td>
			<td><input type="reset" value="Cancel"/></td>
		</tr>
	</table>
              
	
</form:form>
</center>

</body>
</html>	 	  	    	    	     	      	 	
 	  	    	    	     	      	 	
