package kodlama.io.rentACar.buisness.abstracts;

import java.util.List;

import kodlama.io.rentACar.buisness.requests.CreateBrandRequest;
import kodlama.io.rentACar.buisness.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	
	void add(CreateBrandRequest createBrandRequest);

}
