package emlakburada.feignClient;


import emlakburada.config.FooClientConfig;
import emlakburada.dto.request.AdvertRequest;
import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.dto.response.UserResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Headers("Content-Type: application/json")
@FeignClient(value = "emlakburada", url = "http://localhost:8091", configuration = FooClientConfig.class)
public interface AdvertClientFeign {


	@PostMapping("/users")
	ResponseEntity<?> saveUser(@RequestBody UserRequest request) ;

	@GetMapping("/users")
	ResponseEntity<List<UserResponse>> getAllUser() ;

	@GetMapping(value = "/adverts")
	ResponseEntity<List<AdvertResponse>> getAllAdvert() ;

	@PostMapping(value = "/adverts")
	ResponseEntity<AdvertResponse> createAdvert(@RequestBody AdvertRequest request) throws Exception ;

	@GetMapping(value = "/adverts/{advertNo}")
	ResponseEntity<AdvertResponse> getAdvertByAdvertId(@PathVariable(required = false) int advertNo) ;

	}


