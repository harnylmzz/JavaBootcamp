package Kodlama.io.Devs.LanguageHomework.buisness.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.LanguageHomework.buisness.abstracts.LanguageService;
import Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.LanguageHomework.entities.concretes.ProgrammingLanguage;

@Service  //tekrar: buisness nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		// tekrar: iş kuralları buraya yazılır
		return languageRepository.getAll();
	}

}
