package emlakburada.controller;

import emlakburada.dto.request.AdvertRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.feignClient.AdvertClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvertController {

	@Autowired
	private AdvertClientFeign advertService;

	public AdvertController(AdvertClientFeign advertService) {
		this.advertService = advertService;
	}

	@GetMapping(value = "/adverts")
	public ResponseEntity<List<AdvertResponse>> getAllAdvert() {
		return new ResponseEntity<>(advertService.getAllAdvert().getBody(), HttpStatus.OK);
	}

	@PostMapping(value = "/adverts", consumes = "application/json")
	public ResponseEntity<AdvertResponse> createAdvert(@RequestBody AdvertRequest request) throws Exception {
		return new ResponseEntity<>(advertService.createAdvert(request).getBody(), HttpStatus.CREATED);
	}

	@GetMapping(value = "/adverts/{advertNo}")
	public ResponseEntity<AdvertResponse> getAdvertByAdvertId(@PathVariable(required = false) int advertNo) {
		return new ResponseEntity<>(advertService.getAdvertByAdvertId(advertNo).getBody(), HttpStatus.OK);
	}

}
