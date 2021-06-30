<%@ include file="../common/header.jspf"  %>
<form action="/login.do" method = "Post">
<p> <font color = "Red">${error}</font></p>
Enter your name: <input name = "name" type = "text"/><br>
Enter your Password: <input name = "password" type = "password"/>
<input type = "submit" value="Login" />
</form>
<%@ include file="../common/footer.jspf"  %>