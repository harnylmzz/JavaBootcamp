package Kodlama.io.Devs.LanguageHomework.buisness.abstracts;

import java.util.List;

import Kodlama.io.Devs.LanguageHomework.buisness.requests.CreateLanguageRequest;
import Kodlama.io.Devs.LanguageHomework.buisness.responses.GetAllLanguagesResponce;

public interface LanguageService {
	
	List<GetAllLanguagesResponce> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
	

}
