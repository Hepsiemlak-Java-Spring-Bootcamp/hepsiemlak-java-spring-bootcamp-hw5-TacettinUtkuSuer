package emlakburada.feignClient;




import emlakburada.config.FooClientConfig;
import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "emlakburada", url = "http://localhost:8091", configuration = FooClientConfig.class)
public interface UserClientFeign {


	@PostMapping(path = "/users", produces = "application/json; charset=UTF-8")
	ResponseEntity<?> saveUser(@RequestBody UserRequest request) ;

	@GetMapping(path = "/users", produces = "application/json; charset=UTF-8")
	ResponseEntity<List<UserResponse>> getAllUser() ;

	}


