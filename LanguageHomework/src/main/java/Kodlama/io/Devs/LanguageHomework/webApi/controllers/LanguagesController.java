package Kodlama.io.Devs.LanguageHomework.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.LanguageHomework.buisness.abstracts.LanguageService;
import Kodlama.io.Devs.LanguageHomework.entities.concretes.ProgrammingLanguage;

@RestController // annotation (bilgilendirme ifadesi)
@RequestMapping("*/api/programminglanguages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();

	}

}
