package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.alocacao.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	
}
