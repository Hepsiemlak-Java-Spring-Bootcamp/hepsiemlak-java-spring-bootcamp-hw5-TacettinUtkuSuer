package emlakburada.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.service.BannerService;

@RestController
@Slf4j
public class BannerController {

	@Autowired
	private BannerService service;

	@GetMapping(value = "/banners")
	public ResponseEntity<List<BannerResponse>> getAllBanners() {
		System.out.println("Banner okundu.");
		return new ResponseEntity<>(service.getAllBanners(), HttpStatus.OK);
	}

	@PostMapping(value = "/banners")
	public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request) {
		System.out.println("Banner kayıt edildi.");
		return new ResponseEntity<>(service.saveBanner(request), HttpStatus.OK);
	}

}
