package Kodlama.io.Devs.LanguageHomework.buisness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.LanguageHomework.buisness.abstracts.LanguageService;
import Kodlama.io.Devs.LanguageHomework.buisness.requests.CreateLanguageRequest;
import Kodlama.io.Devs.LanguageHomework.buisness.responses.GetAllLanguagesResponce;
import Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.LanguageHomework.entities.concretes.ProgrammingLanguage;

@Service // tekrar: buisness nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponce> getAll() {

		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllLanguagesResponce> languagesResponce = new ArrayList<GetAllLanguagesResponce>();

		for (ProgrammingLanguage programmingLanguage : languages) {
			GetAllLanguagesResponce responceItem = new GetAllLanguagesResponce();
			responceItem.setId(programmingLanguage.getId());
			responceItem.setName(programmingLanguage.getName());

			languagesResponce.add(responceItem);
		}

		// tekrar: iş kuralları buraya yazılır
		return languagesResponce;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createLanguageRequest.getName());
		
		this.languageRepository.save(programmingLanguage);
	}

}
