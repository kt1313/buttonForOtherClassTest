<!DOCTYPE html>
<html lang="en">
<head>
    <title>test button</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%--    <script>--%>

<%--        $(document).on("click", "#somebutton", function() { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...--%>
<%--            $.get("${pageContext.request.contextPath}/testButton", function(responseTxt) {   // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...--%>
<%--                $("#somediv").text(responseTxt);           // Locate HTML DOM element with ID "somediv" and set its text content with the response text.--%>
<%--            });--%>
<%--        });--%>
<%--    </script>--%>
</head>
<body>
<form action="" method="get">
<button id="somebutton">press here</button>
<div id="somediv"></div>
</form>
</body>
</html>