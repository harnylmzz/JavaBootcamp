package kodlama.io.rentACar.buisness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.buisness.abstracts.BrandService;
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
	public List<Brand> getAll() {
		// iş kuralları
		return brandRepository.getAll();
	}

}
