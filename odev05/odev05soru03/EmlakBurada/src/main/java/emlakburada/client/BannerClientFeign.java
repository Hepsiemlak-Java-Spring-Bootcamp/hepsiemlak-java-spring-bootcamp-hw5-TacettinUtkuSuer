package emlakburada.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import emlakburada.client.request.BannerRequest;
import emlakburada.client.response.BannerResponse;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BannerClientFeign {
	
	@Autowired
	private BannerFeign bannerFeign;


	/*
	@HystrixCommand(fallbackMethod = "defaultSaveBanner")
	public ResponseEntity<BannerResponse> saveBanner(BannerRequest request) {
		return bannerFeign.saveBanner(request);
	}
	
	private ResponseEntity<BannerResponse> defaultSaveBanner(BannerRequest request){
		// send to rabbitMQ if service does not response
		log.info("banner service time out, default method already called");
		return new ResponseEntity<>(HttpStatus.REQUEST_TIMEOUT);
	}
	*/

	public ResponseEntity<BannerResponse> saveBanner(BannerRequest request) {
		return bannerFeign.saveBanner(request);
	}

	@FeignClient(value = "EmlakBurada-Banner", url = "http://localhost:8092")
	interface BannerFeign {

		@PostMapping(value = "/banners")
		ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request);

	}

}
