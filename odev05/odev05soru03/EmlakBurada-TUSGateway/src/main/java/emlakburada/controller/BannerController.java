package emlakburada.controller;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.feignClient.BannerClientFeign;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BannerController {


	@Autowired
	private BannerClientFeign bannerFeign;

	@GetMapping(value = "/banners")
	public ResponseEntity<List<BannerResponse>> getAllBanners() {
		System.out.println("GW: Banner okundu.");
		System.out.println(bannerFeign.getAllBanners().getBody());
		return new ResponseEntity<>(bannerFeign.getAllBanners().getBody(),HttpStatus.OK);
	}

	@PostMapping(value = "/banners")
	public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request) {
		System.out.println("GW: Banner kayıt edildi.");
		bannerFeign.saveBanner(request);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
