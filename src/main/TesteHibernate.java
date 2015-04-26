package main;

import java.util.Calendar;
import java.util.Date;
import comuns.Curso;
import comuns.SituacaoAluno;
import dao.Per_Class_Dao;
import per_class.Aluno_Per_Class;
import per_class.Professor_Per_Class;
import per_class.TecnicoAdm_Per_Class;

public class TesteHibernate {

    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setDescricao("Portugu�s");
        
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        //Aluno_Joined aluno = new Aluno_Joined();
        //Aluno_SingleTable aluno = new Aluno_SingleTable();
        Aluno_Per_Class aluno = new Aluno_Per_Class();
        
        aluno.setNome("Alexandre Azevedo Rodrigues");
        aluno.setMatricula(20150001);
        aluno.setCurso(curso);
        aluno.setSituacao(SituacaoAluno.MATRICULADO);

        //Professor_Joined professor = new Professor_Joined();
        //Professor_SingleTable professor = new Professor_SingleTable();
        Professor_Per_Class  professor = new Professor_Per_Class();
        
        professor.setNome("Ivo Morais Gomes");
        professor.setMatricula(20151001);
        professor.setAreaDeAtuacao("Cordena��o");
        professor.setDataAdmicao(data);

        //TecnicoAdm_Joined tecAdm = new TecnicoAdm_Joined();
        //TecnicoAdm_SingleTable tecAdm = new TecnicoAdm_SingleTable();
        TecnicoAdm_Per_Class tecAdm = new TecnicoAdm_Per_Class();
        
        tecAdm.setNome("Bruno Soares Jobs");
        tecAdm.setMatricula(20159001);
        tecAdm.setCargo("Secret�rio");
        tecAdm.setDataAdmicao(data);

        //Joined_Dao dao = new Joined_Dao();
        //SingleTable_Dao dao = new SingleTable_Dao();
        Per_Class_Dao dao = new Per_Class_Dao();      
        
        dao.add(aluno);
        dao.add(professor);
        dao.add(tecAdm);


    }
}
