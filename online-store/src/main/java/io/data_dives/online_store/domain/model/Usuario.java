package io.data_dives.online_store.domain.model;

import java.time.ZonedDateTime;

import io.data_dives.online_store.domain.types.Funcao;
import io.data_dives.online_store.domain.types.Genero;

public class Usuario{
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String telefone;
	private String usuario;
	private String senha;
	private String endereco;
	private Genero genero;
	private Funcao funcao;
	private ZonedDateTime nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Funcao getFuncao(){
		return funcao;
	}

	public void setFuncao(Funcao funcao){
		this.funcao = funcao;
	}

	public ZonedDateTime getNascimento() {
		return nascimento;
	}

	public void setNascimento(ZonedDateTime nascimento) {
		this.nascimento = nascimento;
	}

	
	public static Builder builder(){
		return new Builder();
	}

	public static class Builder{
		private String nome;
		private String sobrenome;
		private String cpf;
		private String email;
		private String telefone;
		private String usuario;
		private String senha;
		private String endereco;
		private Genero genero;
		private ZonedDateTime nascimento;

		public Builder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}

		public Builder setCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setTelefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public Builder setUsuario(String usuario) {
			this.usuario = usuario;
			return this;
		}

		public Builder setSenha(String senha) {
			this.senha = senha;
			return this;
		}

		public Builder setEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder setGenero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public Builder setNascimento(ZonedDateTime nascimento) {
			this.nascimento = nascimento;
			return this;
		}

		public Usuario build(){
			Usuario usuario = new Usuario();
			usuario.setNome(this.nome);
			usuario.setSobrenome(this.sobrenome);
			usuario.setCpf(this.cpf);
			usuario.setEmail(this.email);
			usuario.setTelefone(this.telefone);
			usuario.setUsuario(this.usuario);
			usuario.setSenha(this.senha);
			usuario.setGenero(this.genero);
			usuario.setEndereco(this.endereco);
			usuario.setNascimento(this.nascimento);

			return usuario;
		}


	}


}
