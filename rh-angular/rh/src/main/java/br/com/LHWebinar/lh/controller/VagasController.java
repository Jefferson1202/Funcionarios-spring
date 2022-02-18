package br.com.LHWebinar.lh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.LHWebinar.lh.model.VagasModel;
import br.com.LHWebinar.lh.repository.VagasRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class VagasController {

	@Autowired
	private VagasRepository vagaRepository;
	
	@RequestMapping(value = "/vagas", method = RequestMethod.GET)
	public List<VagasModel> listar(){
		return vagaRepository.findAll();
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public VagasModel gravarVaga(@RequestBody VagasModel vagasModel) {
		return vagaRepository.save(vagasModel);
	}
	
	@RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
	public VagasModel editarVaga(@RequestBody VagasModel vagasModel) {
		return vagaRepository.save(vagasModel);
	}
	
	@RequestMapping(value = "/vagas/{id}", method = RequestMethod.DELETE)
	public void excluirVaga(@PathVariable long id) {
		vagaRepository.deleteById(id);
	}
}
