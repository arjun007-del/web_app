package com.arjun.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "arjun","Learn AWS",LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "arjun","Learn DEVOps",LocalDate.now().plusYears(2), true));
		todos.add(new Todo(1, "arjun","Learn Java",LocalDate.now().plusYears(3), false));
		todos.add(new Todo(1, "arjun","Learn spring",LocalDate.now().plusYears(4), false));
	}
	
	public List<Todo> findByUserName(String username){
		return todos;
	}

}
