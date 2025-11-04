package DesafioDio;

import java.time.LocalDate;

import DesafioDio.DesafioDioDominio.Bootcamp;
import DesafioDio.DesafioDioDominio.Curso;
import DesafioDio.DesafioDioDominio.Dev;
import DesafioDio.DesafioDioDominio.Mentoria;

public class Main {
	public static void main(String args[]) {
		
		Curso curso = new Curso();
		Mentoria mente = new Mentoria();
		Curso curso1 = new Curso();	
				
		curso.setTitulo("Curso java");
		curso.setDescricao("Bootcamp Dio");
		curso.setCargaHoraria(66);	
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Bootcamp ");
		curso1.setCargaHoraria(86);		
		
		mente.setTitulo("Desvendando Java");
		mente.setDescricao("Java 4.0 ");
		mente.setData(LocalDate.now());
					
		/*System.out.println(curso);	
		System.out.println(curso1);
		System.out.println(mente);
		*/

		Bootcamp boot = new Bootcamp();
		boot.setNome("Bootcamp java Devlop");
		boot.setDescricao("Descrição: Desvendando java");
		boot.getConteudos().add(curso);
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(mente);
		
		Dev devDeryck = new Dev();
		devDeryck.setNome("Deryck");
		devDeryck.inscreverBootcamp(boot);
		System.out.println("Conteudos inscritos" + devDeryck.getConteudosIncritos() + "\n");
		
		devDeryck.progredir();
		devDeryck.progredir();
		System.out.println("Conteudos inscritos" + devDeryck.getConteudosIncritos());
		System.out.println("Conteudos Concluidos" + devDeryck.getConteudosConcluido() + "\n");
		System.out.println("XP" + devDeryck.calcularTotalXp());
		
		System.out.println("\n --------- Dev ---------- \n");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(boot);
		System.out.println("Conteudos inscritos" + devJoao.getConteudosIncritos() + "\n");
		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteudos inscritos" + devJoao.getConteudosIncritos());
		System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluido());
		System.out.println("XP" + devJoao.calcularTotalXp());
	}
}
