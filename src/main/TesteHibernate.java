package main;

import java.util.Calendar;
import java.util.Date;

import joined.Aluno_Joined;
import joined.Professor_Joined;
import joined.TecnicoAdm_Joined;

import comuns.Curso;
import comuns.SituacaoAluno;

import dao.Joined_Dao;

public class TesteHibernate {

    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setDescricao("Português");
        
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Aluno_Joined aluno = new Aluno_Joined();
        //Aluno_SingleTable aluno = new Aluno_SingleTable();
        //Aluno_Per_Class aluno = new Aluno_Per_Class();
        
        aluno.setNome("Alexandre Azevedo Rodrigues");
        aluno.setMatricula(20150001);
        aluno.setCurso(curso);
        aluno.setSituacao(SituacaoAluno.MATRICULADO);

        Professor_Joined professor = new Professor_Joined();
        //Professor_SingleTable professor = new Professor_SingleTable();
        //Professor_Per_Class  professor = new Professor_Per_Class();
        
        professor.setNome("Ivo Morais Gomes");
        professor.setMatricula(20151001);
        professor.setAreaDeAtuacao("Cordenação");
        professor.setDataAdmicao(data);

        TecnicoAdm_Joined tecAdm = new TecnicoAdm_Joined();
        //TecnicoAdm_SingleTable tecAdm = new TecnicoAdm_SingleTable();
        //TecnicoAdm_Per_Class tecAdm = new TecnicoAdm_Per_Class();
        
        tecAdm.setNome("Bruno Soares Jobs");
        tecAdm.setMatricula(20159001);
        tecAdm.setCargo("Secretário");
        tecAdm.setDataAdmicao(data);

        Joined_Dao dao1 = new Joined_Dao();
        //SingleTable_Dao dao1 = new SingleTable_Dao();
        //Per_Class_Dao dao1 = new Per_Class_Dao();      
        dao1.add(aluno);
        
        Joined_Dao dao2 = new Joined_Dao();
        //SingleTable_Dao dao2 = new SingleTable_Dao();
        //Per_Class_Dao dao2 = new Per_Class_Dao();  
        dao2.add(professor);
        
        Joined_Dao dao3 = new Joined_Dao();
        //SingleTable_Dao dao3 = new SingleTable_Dao();
        //Per_Class_Dao dao3 = new Per_Class_Dao();  
        dao3.add(tecAdm);


    }
}
