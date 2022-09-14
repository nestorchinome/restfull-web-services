package com.project1.rest.webservices.restfullwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	
	private static List<User> users = new ArrayList<User>();
	private static Integer usersCount = 3;

	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Joseph", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Peter", LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(Integer id) {
		User user = users.stream().filter(a -> a.getId().equals(id)).findFirst().get();
		
		return user;
	}
	
	
}
