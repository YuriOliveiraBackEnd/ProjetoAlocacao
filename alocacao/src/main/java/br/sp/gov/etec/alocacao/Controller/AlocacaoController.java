package br.sp.gov.etec.alocacao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Alocacao;
import br.sp.gov.etec.alocacao.repository.AlocacaoRepository;

@RestController
public class AlocacaoController {
	@Autowired
	AlocacaoRepository repository;
	
	@GetMapping("/alocacao")
	public List<Alocacao> ListarCliente(){
		return repository.findAll();
	}

	@PostMapping("adicionaralocacao")
	@Transactional
	public Alocacao insertAlocacao(@RequestBody Alocacao alocacao) {
		return repository.save(alocacao);
	}
	
	@PutMapping("atualizaralocacao")
	public Alocacao atualizaAlocacao(@RequestBody Alocacao alocacao) {
		return repository.save(alocacao);
	}
	
	@DeleteMapping("deletaralocacao/{id}")
	public ResponseEntity excluirAlocacao(@PathVariable long id) {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	}
	
}
