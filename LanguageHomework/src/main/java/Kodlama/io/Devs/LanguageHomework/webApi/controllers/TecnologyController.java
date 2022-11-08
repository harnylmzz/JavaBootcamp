package Kodlama.io.Devs.LanguageHomework.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.LanguageHomework.buisness.abstracts.TecnologyService;
import Kodlama.io.Devs.LanguageHomework.buisness.requests.CreateTeconologyRequest;
import Kodlama.io.Devs.LanguageHomework.buisness.responses.GetAllTecnologyResponce;

@RestController
@RequestMapping("*/api/tecnology")
public class TecnologyController {

	private TecnologyService tecnologyService;

	@Autowired
	public TecnologyController(TecnologyService tecnologyService) {
		this.tecnologyService = tecnologyService;
	}
	@GetMapping("/getAll")
	public List<GetAllTecnologyResponce> getAll() {
		return tecnologyService.getAll();
		
	}
	
	public void add (@RequestBody CreateTeconologyRequest createTeconologyRequest) {
		
		this.tecnologyService.add(createTeconologyRequest);
	}
}
