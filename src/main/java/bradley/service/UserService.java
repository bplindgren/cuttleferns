package bradley.service;

import java.util.List;

import bradley.entity.User;

public interface UserService {

	public User getById(long id);
	
	public List<User> getAll();
	
	public User getByName(String firstName);
	
	public void createUser(User newUser);
	
}