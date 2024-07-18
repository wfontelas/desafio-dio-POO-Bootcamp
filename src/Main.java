import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("curso JavaScript");
        curso1.setDescricao("descrição Javascript");
        curso1.setCargaHoraria(40);


//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos William: " + devWilliam.getConteudosInscritos());
        devWilliam.progredir();
        devWilliam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos William: " + devWilliam.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos William: " + devWilliam.getConteudosConcluidos());
        System.out.println("XP: " + devWilliam.calcularTotalXP());


        System.out.println("------------------------------------------------------------------");

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alice: " + devAlice.getConteudosInscritos());
        devAlice.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP: " + devAlice.calcularTotalXP());

    }
}