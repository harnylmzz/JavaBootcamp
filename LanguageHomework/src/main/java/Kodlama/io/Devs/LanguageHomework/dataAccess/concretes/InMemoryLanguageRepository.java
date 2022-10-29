package Kodlama.io.Devs.LanguageHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.LanguageHomework.entities.concretes.ProgrammingLanguage;

public class InMemoryLanguageRepository implements LanguageRepository {
	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Phyton"));
		programmingLanguages.add(new ProgrammingLanguage(4, "Flutter"));
		programmingLanguages.add(new ProgrammingLanguage(5, "C++"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguages;
	}

}
