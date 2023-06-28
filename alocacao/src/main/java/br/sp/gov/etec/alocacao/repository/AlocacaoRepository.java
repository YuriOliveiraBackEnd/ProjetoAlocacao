package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.etec.alocacao.model.Alocacao;

public interface AlocacaoRepository extends JpaRepository<Alocacao, Long>{

}
