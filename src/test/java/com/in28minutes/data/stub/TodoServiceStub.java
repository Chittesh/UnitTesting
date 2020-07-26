package com.in28minutes.data.stub;

import java.util.Arrays;
import java.util.List;

import com.in28minutes.data.api.TodoService;

public class TodoServiceStub implements TodoService {
	
	//Issues with Stubs are
	//Dynamic conditions (Different kind of conditions makes it more complex)
	//if more methods are present in interface we need to 
	//Implement in subs as well
	//
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	public void deleteTodo(String todo) {

	}
}