package bradley.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bradley.entity.User;
import bradley.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User getById(long id) {
		return userRepo.get(id);
	}

	@Override
	public List<User> getAll() {
		return userRepo.getAll();
	}

	@Override
	public User getByName(String firstName) {
		return userRepo.getByName(firstName);
	}

	@Override
	public void createUser(User newUser) {
		userRepo.createUser(newUser);
	}

}
