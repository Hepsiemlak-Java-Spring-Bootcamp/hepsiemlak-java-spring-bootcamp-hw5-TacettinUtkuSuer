package emlakburada.controller;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.feignClient.UserClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserClientFeign userService;

	public UserController(UserClientFeign userService) {
		this.userService = userService;
	}

	@PostMapping(path = "/users", produces = "application/json; charset=UTF-8")
	public ResponseEntity<?> saveUser(@RequestBody UserRequest request) {
		userService.saveUser(request);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping(path = "/users", produces = "application/json; charset=UTF-8")
	public ResponseEntity<String> getAllUser() {
		return new ResponseEntity<>(userService.getAllUser().toString(), HttpStatus.OK);
	}

}
