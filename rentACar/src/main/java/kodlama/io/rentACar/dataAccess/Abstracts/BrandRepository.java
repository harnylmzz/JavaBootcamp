package kodlama.io.rentACar.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository <Brand, Integer> {
	
}
