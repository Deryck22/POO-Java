package DesafioDio.DesafioDioDominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluido.add(conteudo.get());
			this.conteudosIncritos.remove(conteudo.get());
		}else {
			System.err.println("Você não esta matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluido
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncritos() {
		return conteudosIncritos;
	}

	public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}

	public Set<Conteudo> getConteudosConcluido() {
		return conteudosConcluido;
	}

	public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluido = conteudosConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluido, conteudosIncritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluido, other.conteudosConcluido)
				&& Objects.equals(conteudosIncritos, other.conteudosIncritos) && Objects.equals(nome, other.nome);
	}
	
	
}
