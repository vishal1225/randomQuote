<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Quote of the day</h1>
	<c:choose>
		<c:when test="${not isSeventhTime}">
		<p style="display: block;">Author: ${quote.author}</p>
		<p style="display: block;">Topic: ${quote.topic}</p>
		<p style="display: block;">Quote: ${quote.quote}</p>
</body>
</c:when>
<c:otherwise>
       Congratulations! You have just won $1,000,000. Please <a href="http://www.performancecentre.com/"> click here</a> to redeem your prize.
          </c:otherwise>
</c:choose>

<form action="/randomQuote-0.0.1-SNAPSHOT/randomQuote">
	<input type="submit"></input>
</form>
</html>