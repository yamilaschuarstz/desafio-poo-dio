package br.com.dio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Ambrósio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("----------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Jurema");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ":" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());





    }
}
