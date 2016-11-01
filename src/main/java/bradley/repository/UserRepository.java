package bradley.repository;

import java.util.List;

import bradley.entity.User;

public interface UserRepository {
	
	User get(long id);
	
	List<User> getAll();
	
	User getByName(String firstName);
	
	public void createUser(User newUser);
	
}
