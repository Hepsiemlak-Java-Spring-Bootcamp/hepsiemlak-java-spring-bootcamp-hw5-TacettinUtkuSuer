package emlakburada.feignClient;



import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Headers("Content-Type: application/json")
@FeignClient(value = "emlakburada-banner", url = "http://localhost:8092", configuration = BannerResponse.class)
public interface BannerClientFeign {


		@PostMapping(value = "/banners")
		public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request);

		@GetMapping(value = "/banners")
		public ResponseEntity<List<BannerResponse>> getAllBanners();

	}


