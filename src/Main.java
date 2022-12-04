import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Henrique: " + devHenrique.getConteudosInscritos());

        devHenrique.progredir();
        devHenrique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Henrique: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Henrique: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devHenrique.calcularTotalXP());

        System.out.println("---");

        Dev devIsabelly = new Dev();
        devIsabelly.setNome("Isabelly");
        devIsabelly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isabelly: " + devIsabelly.getConteudosInscritos());

        devIsabelly.progredir();
        devIsabelly.progredir();
        devIsabelly.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isabelly: " + devIsabelly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Isabelly: " + devIsabelly.getConteudosConcluidos());
        System.out.println("XP: " + devIsabelly.calcularTotalXP());





    }
}