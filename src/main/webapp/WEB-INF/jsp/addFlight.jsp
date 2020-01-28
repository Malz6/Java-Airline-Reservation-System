<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Flight</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New flight</h3>

	<div id="addFlight">
		<form:form action="/addFlight" method="post" modelAttribute="air">
			<p>
				<label>Enter Flight Id</label>
				<form:input path="Flight_id" />
			</p>
			<p>
				<label>Enter Flight Name</label>
				<form:input path="Flight_name" />
			</p>
			<p>
				<label>Enter Source</label>
				<form:input path="Src" />
			</p>
			<p>
				<label>Enter Destination</label>
				<form:input path="Dest" />
			</p>
			<p>
				<label>Enter Time</label>
				<form:input path="Time" />
			</p>
			<p>
				<label>Enter No of Seat</label>
				<form:input path="Seat" />
			</p>
			<input type="Submit" value="SUBMIT" />
		</form:form>
	</div>
</body>
</html>