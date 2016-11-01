package bradley.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import bradley.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	EntityManager entityManager;
	
	public UserRepositoryImpl(EntityManager em) {
		entityManager = em;
	}

	@Override
	public User get(long id) {
		return entityManager.find(User.class, id);
	}

}
