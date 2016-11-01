package bradley.repository;

import java.util.List;

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

	@Override
	public List<User> getAll() {
		return entityManager.createQuery("from User", User.class).getResultList();
	}

	@Override
	public User getByName(String firstName) {
		return entityManager
				.createQuery("from User where firstName = :firstNameValue", User.class)
				.setParameter("firstNameValue", firstName)
				.getResultList()
				.get(0);
	}

	@Override
	public void createUser(User newUser) {
		entityManager.persist(newUser);
	}

}
