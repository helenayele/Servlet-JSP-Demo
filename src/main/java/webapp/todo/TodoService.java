package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
public static List<Todo> todos = new ArrayList<Todo>();
static {
	todos.add(new Todo("Web Application with Servlet and JSP","FrontEnd"));
	todos.add(new Todo("Learn Spring MVC", "Backend"));
	todos.add(new Todo("LEarn Spring Rest Service", "Backend"));
	todos.add(new Todo("Web Application", "FrontEnd"));
}

public List<Todo> retrieveTodoList(){
	
	return todos;
}

public void addTask(String task, String category) {
	todos.add(new Todo(task, category));
	
}
public void deleteTask(Todo task) {
	todos.remove (task);
}
}
