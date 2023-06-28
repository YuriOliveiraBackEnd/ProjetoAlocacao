package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.sp.gov.etec.alocacao.Controller.ClienteController;
import br.sp.gov.etec.alocacao.model.Cliente;
import br.sp.gov.etec.alocacao.repository.ClienteRepository;
@ExtendWith(SpringExtension.class)
public class ClienteControllerTest {

	@Mock
	ClienteRepository repository;
	
	@InjectMocks
	ClienteController clienteController;
    Cliente cliente;
    List<Cliente> clienteLista;
 
    @BeforeEach
	 public void setup()
	 {
		cliente = new Cliente();
		cliente.setCpf("123");
		cliente.setEmail("yuri@gmail.ccom");
		cliente.setId(1L);
		cliente.setNome("yuri");
		cliente.setTelefone("1231321313");

		clienteLista = List.of(cliente);
		
	 }
    @Test
    public void testeClientes()
    {
    	Mockito.when(repository.findAll()).thenReturn(clienteLista);
    	  List<Cliente> retorno =  clienteController.ListarCliente();
    	 assertEquals("4", retorno.get(0).getCpf());
    }
    
    @Test
    public void testeAdicionarCliente()
    {
    	Mockito.when(repository.save(any(Cliente.class))).thenReturn(cliente);
    	Cliente c =  clienteController.insertCliente(new Cliente());
    	 assertEquals(1L, c.getId());
    }
    @Test
    public void testeAtualizarCliente()
    {
    	Mockito.when(repository.save(any(Cliente.class))).thenReturn(cliente);
    	Cliente c =  clienteController.atualizaCliente(new Cliente());
    	 assertEquals(1L, c.getId());
    }
//    public void testeExcluirCliente()
//    {
//    	ResponseEntity  response  =  clienteController.excluirCliente();
//    	 assertEquals(1L, c.getId());
//    }
}
