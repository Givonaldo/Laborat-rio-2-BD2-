package br.edu.ifpb.ads.lab2.main;


import br.edu.ifpb.ads.lab2.modelo.dao.JoinedDao;
import br.edu.ifpb.ads.lab2.modelo.dao.PerClassDao;
import br.edu.ifpb.ads.lab2.modelo.entidades.joined.TecnicoAdm_Joined;
import br.edu.ifpb.ads.lab2.modelo.entidades.per_class.TecnicoAdm_Per_Class;

public class TesteHibernate {

    public static void main(String[] args) throws Exception {

//        Curso curso = new Curso();
//        curso.setDescricao("Português");
//        
//        Calendar c = Calendar.getInstance();
//        Date data = c.getTime();
//
//        //Aluno_Joined aluno = new Aluno_Joined();       
//        //Aluno_SingleTable aluno = new Aluno_SingleTable();
//        Aluno_Per_Class aluno = new Aluno_Per_Class();
//        
//        aluno.setNome("Alexandre Azevedo Rodrigues");
//        aluno.setMatricula(20150001);
//        aluno.setCurso(curso);
//        aluno.setSituacao(SituacaoAluno.MATRICULADO);
//
// //      Professor_Joined professor = new Professor_Joined();
////        Professor_SingleTable professor = new Professor_SingleTable();
//        Professor_Per_Class  professor = new Professor_Per_Class();
//        
//        professor.setNome("Ivo Morais Gomes");
//        professor.setMatricula(20151001);
//        professor.setAreaDeAtuacao("Cordenação");
//        professor.setDataAdmissao(data);
//
//        //TecnicoAdm_Joined tecAdm = new TecnicoAdm_Joined();
//        //TecnicoAdm_SingleTable tecAdm = new TecnicoAdm_SingleTable();
//        TecnicoAdm_Per_Class tecAdm = new TecnicoAdm_Per_Class();
//        
//        tecAdm.setNome("Bruno Soares Jobs");
//        tecAdm.setMatricula(20159001);
//        tecAdm.setCargo("Secretário");
//        tecAdm.setDataAdmissao(data);
//
//        //JoinedDao dao1 = new JoinedDao();
//    	//SingleDao dao1 = new SingleDao(); 
//        PerClassDao dao1 = new PerClassDao();  
//        dao1.add(aluno);
//    	
////        JoinedDao dao2 = new JoinedDao(); 
////        SingleDao dao2 = new SingleDao();
//        PerClassDao dao2 = new PerClassDao();  
//        dao2.add(professor);
//       
////    	  JoinedDao dao3 = new JoinedDao();
////    	  SingleDao dao3 = new SingleDao(); 
//        PerClassDao dao3 = new PerClassDao();          
//        dao3.add(tecAdm);
    	
    	
    	    	
        TecnicoAdm_Per_Class pessoa = new TecnicoAdm_Per_Class();
        pessoa.setId(1);
//        pessoa.setNome("Fulanos de Talls");
//        pessoa.setMatricula(20150005); 
        
        PerClassDao dao = new PerClassDao();
        //dao.upDate(pessoa);
        
        System.out.println(dao.read(pessoa.getId()));

    }
}
