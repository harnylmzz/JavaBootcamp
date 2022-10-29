package Kodlama.io.Devs.LanguageHomework.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.LanguageHomework.entities.concretes.ProgrammingLanguage;

@Repository   // tekrar: dataAccess nesnesi
public interface LanguageRepository {

	List<ProgrammingLanguage> getAll();

}
