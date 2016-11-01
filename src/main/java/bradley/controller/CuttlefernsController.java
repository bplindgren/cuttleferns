package bradley.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("{id}")
	public User getUser(@PathVariable long id) {
		return userService.getById(id);
	}

}
