package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
/*cursos*/
        Curso android = new Curso("Mobile Android - muito massa");
        Curso fullStack = new Curso("Web fullstack - muito massa também");
/*Alunos*/
        Aluno vini = new Aluno(123,"Vinicius","Oliveira", android);
        Aluno vinicius = new Aluno(123,"Vinicius","Oliveira", android);
        Aluno jessica = new Aluno(124, "Jésssica", "Milena", fullStack);
        Aluno gabriel = new Aluno(125, "Gabriel", "Teixeira", fullStack);
        Aluno ariane = new Aluno(126, "Ariane", "Stefanini", android);

        /*Lista de alunos*/
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        alunos.add(vinicius);
        alunos.add(jessica);
        alunos.add(gabriel);
        alunos.add(ariane);

        System.out.println(
                //vini.equals(vinicius));

                alunos.contains(vinicius));
        // Explicacao: Contains ira averiguar os atributos instanciados após new do objeto em questão, caso sejam iguais ira citar existe o objeto
        //vinicius;

        //System.out.println(vinicius.equals(android));

        System.out.println(alunos);


    }


}
