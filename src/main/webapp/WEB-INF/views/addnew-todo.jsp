<%@ include file="../common/header.jspf"  %>
<%@ include file="../common/navigation.jspf"  %>
<div class = "container">
<h3>Put Your new action item here </h3>

<form action="/add-todo.do" method ="post">
Insert new Task : <br>
<fieldset class="form-group">

<label>Desciption: </label><input type = "text" name = "newtask" class="form-control"/><br>
</fieldset>
<fieldset class="form-group">
<label>Category:</label>  <input type = "text" name = "category" class="form-control"/><br>
 </fieldset>
<input type="submit" value = "Add Todo" class="btn btn-success">
</form>
</div>
<%@ include file="../common/footer.jspf"  %>