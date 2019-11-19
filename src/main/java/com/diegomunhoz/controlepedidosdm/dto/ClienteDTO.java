package com.diegomunhoz.controlepedidosdm.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.diegomunhoz.controlepedidosdm.domain.Cliente;
import com.diegomunhoz.controlepedidosdm.services.validation.ClienteUpdate;

/**
 * Classe responsável por armazenar os atributos DTO do Cliente
 * @author Diego Vinicius de Mello Munhoz
 * @since 07/2018
 */

@ClienteUpdate
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	@NotEmpty(message="Preenchimento do nome obrigatório")
	@Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento do email obrigatório")
	@Email(message="Email inválido")
	private String email;
	
	public ClienteDTO() {
	}

	public ClienteDTO(Cliente obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}