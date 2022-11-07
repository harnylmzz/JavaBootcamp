package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.rentACar.buisness.abstracts.BrandService;
import kodlama.io.rentACar.buisness.requests.CreateBrandRequest;
import kodlama.io.rentACar.buisness.responses.GetAllBrandsResponse;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
	private final BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		return this.brandService.getAll();
	}

	
	@PostMapping("/add")
	public void add (@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	
}
