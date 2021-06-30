<%@ include file="../common/header.jspf"  %>
<%@ include file="../common/navigation.jspf"  %>
<div class = "container">
<h1>Welcome ${name}</h1>
<p>Your Todos are: </p>
<table class ="table table-striped">
<thead>
<th>Name</th>
<th>Category</th>
<th>Actions</th>
<tbody><c:forEach items="${todoList}" var ="todo">
<tr>
<th>${todo.name}</th>
<th> ${todo.category}</th>
<th><a class="btn btn-danger" href="/delete-todo.do?todo=${todo.name }&category=${todo.category}">Delete</a></th>
</tr>
</c:forEach>
</tbody>
</table>
<a class ="btn btn-success" href="/add-todo.do">Add New Todo</a>
</div>
<%@ include file="../common/footer.jspf"  %>