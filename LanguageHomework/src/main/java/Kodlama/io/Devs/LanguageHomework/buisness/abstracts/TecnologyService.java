package Kodlama.io.Devs.LanguageHomework.buisness.abstracts;

import java.util.List;

import Kodlama.io.Devs.LanguageHomework.buisness.requests.CreateTeconologyRequest;
import Kodlama.io.Devs.LanguageHomework.buisness.responses.GetAllTecnologyResponce;

public interface TecnologyService {
	
	List<GetAllTecnologyResponce> getAll();
	void add (CreateTeconologyRequest createTeconologyRequest);

}
