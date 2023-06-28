package br.sp.gov.etec.alocacao.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Alocacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_alocacao")
	private Long id_alocacao;
	@ManyToOne
	@JoinColumn(name = "cliente_id") // Nome da coluna de chave estrangeira na tabela "Alocacao"
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "carro_id") // Nome da coluna de chave estrangeira na tabela "Alocacao"
	private Carro carro;
	private Double valorAlocacao;
	private LocalDateTime dataInicioAlocacao;
	private LocalDateTime dataFimAlocacao;
	public Long getId_alocacao() {
		return id_alocacao;
	}
	public void setId_alocacao(Long id_alocacao) {
		this.id_alocacao = id_alocacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		 this.carro = carro;
	}
	public Double getValorAlocacao() {
		return valorAlocacao;
	}
	public void setValorAlocacao(Double valorAlocacao) {
		this.valorAlocacao = valorAlocacao;
	}
	public LocalDateTime getDataInicioAlocacao() {
		return dataInicioAlocacao;
	}
	public void setDataInicioAlocacao(LocalDateTime dataInicioAlocacao) {
		this.dataInicioAlocacao = dataInicioAlocacao;
	}
	public LocalDateTime getDataFimAlocacao() {
		return dataFimAlocacao;
	}
	public void setDataFimAlocacao(LocalDateTime dataFimAlocacao) {
		this.dataFimAlocacao = dataFimAlocacao;
	}


}
