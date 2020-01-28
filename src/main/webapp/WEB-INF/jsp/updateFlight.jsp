<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Flight</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Update Flight Details</h3>

	<div id="updateFlight">
		<form:form action="/updateFlight" method="post" modelAttribute="flights">
			<p>
				<label>Enter Flight Id</label>
				<form:input path="Flight_id" />
			</p>
			<p>
				<label>Enter Source</label>
				<form:input path="Src" />
			</p>
			<p>
				<label>Enter Destination</label>
				<form:input path="Dest" />
			</p>
			<input type="submit" value="SUBMIT" />
		</form:form>
	</div>
</body>
</html>