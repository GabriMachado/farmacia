package com.generation.farmacia.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id; 
	
    @NotBlank(message = "O atributo Nome é OBRIGATÓRIO!")
    @Size(max = 100, message = "O atributo título deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String nome;
	
    
    @NotBlank(message = "O atributo Descrição é OBRIGATÓRIO!")
    @Size(max = 1000, message = "O atributo texto deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String descricao; 
    
    @NotBlank(message = "O atributo Fabricante é OBRIGATÓRIO!")
    @Size(max = 100, message = "O atributo texto deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String fabricante;
    
    @PositiveOrZero
    private int quatidade; 
    
    @UpdateTimestamp
	private LocalDateTime data;
    
   /* @NotNull
	@Digits(integer = 5, fraction = 2)
	private BigDecimal preco;*/
    
    
    @ManyToOne
  	@JsonIgnoreProperties("produto")
  	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	/*public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}*/

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	} 
    
    
}
    
    
