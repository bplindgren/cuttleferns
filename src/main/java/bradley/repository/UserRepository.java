package bradley.repository;

import bradley.entity.User;

public interface UserRepository {
	
	User get(long id);
	
}
