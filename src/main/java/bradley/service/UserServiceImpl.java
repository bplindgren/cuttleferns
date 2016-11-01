package bradley.service;

import org.springframework.stereotype.Service;

import bradley.entity.User;
import bradley.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public User getById(long id) {
		return userRepo.get(id);
	}
}
