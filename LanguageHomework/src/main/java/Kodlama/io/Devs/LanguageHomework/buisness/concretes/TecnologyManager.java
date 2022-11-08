package Kodlama.io.Devs.LanguageHomework.buisness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.LanguageHomework.buisness.abstracts.TecnologyService;
import Kodlama.io.Devs.LanguageHomework.buisness.requests.CreateTeconologyRequest;
import Kodlama.io.Devs.LanguageHomework.buisness.responses.GetAllTecnologyResponce;
import Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts.TecnologyRepository;
import Kodlama.io.Devs.LanguageHomework.entities.concretes.Tecnology;

@Service
public class TecnologyManager implements TecnologyService {

	private TecnologyRepository tecnologyRepository;

	@Autowired
	public TecnologyManager(TecnologyRepository tecnologyRepository) {
		this.tecnologyRepository = tecnologyRepository;
	}

	@Override
	public List<GetAllTecnologyResponce> getAll() {
		List<Tecnology> tecnologies = tecnologyRepository.findAll();
		List<GetAllTecnologyResponce> tecnologiesResponces = new ArrayList<GetAllTecnologyResponce>();
		
		for (Tecnology tecnology : tecnologies) {
			GetAllTecnologyResponce responceItem = new GetAllTecnologyResponce();
			responceItem.setId(tecnology.getId());
			responceItem.setName(tecnology.getName());
			
			tecnologies.add(tecnology);
			
		}
		
		return tecnologiesResponces;
	}

	@Override
	public void add(CreateTeconologyRequest createTeconologyRequest) {
		
		Tecnology tecnology = new Tecnology();
		tecnology.setName(createTeconologyRequest.getName());
		
		this.tecnologyRepository.save(tecnology);
		
		
	}
}
