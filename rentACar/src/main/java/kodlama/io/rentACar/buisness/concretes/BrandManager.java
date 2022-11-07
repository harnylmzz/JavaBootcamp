package kodlama.io.rentACar.buisness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.buisness.abstracts.BrandService;
import kodlama.io.rentACar.buisness.requests.CreateBrandRequest;
import kodlama.io.rentACar.buisness.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.Abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service  // bu sınıf bir buisness nesnesidir
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
									
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}	
		
	@Override
	public List<GetAllBrandsResponse> getAll() {
			
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
			
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem);
			
		}
		// iş kuralları
		return brandsResponse;
	}	
	
	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	}

}
