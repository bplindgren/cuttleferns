package bradley.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bradley.entity.User;
import bradley.service.UserServiceImpl;

@RestController
@RequestMapping("users")
public class CuttlefernsController {
	
	private UserServiceImpl userService;
	
	public CuttlefernsController(UserServiceImpl userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("index")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	@PostMapping
	public void createUser(@RequestBody User newUser) {
		userService.createUser(newUser);
	}
	
	@GetMapping("{id}")
	public User getUser(@PathVariable long id) {
		return userService.getById(id);
	}
	
	@GetMapping("name/{firstName}")
	public User getByName(@PathVariable String firstName) {
		return userService.getByName(firstName);
	}

}
