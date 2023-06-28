package br.sp.gov.etec.alocacao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Grupo;
import br.sp.gov.etec.alocacao.repository.GrupoRepository;

@RestController
public class GrupoController {

	@Autowired
	GrupoRepository repository;
	
	@GetMapping("/grupo")
	public List<Grupo> ListarGrupo(){
		return repository.findAll();
	}
	
	
	
	@PostMapping("adicionargrupo")
	public Grupo insertCliente(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@PutMapping("atualizargrupo")
	public Grupo atualizaGrupo(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@DeleteMapping("deletargrupo/{id}")
	public ResponseEntity<Grupo> excluirGrupo(@PathVariable long id) {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	}
}
