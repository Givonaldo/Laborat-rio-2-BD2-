package joined_entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "JOINED_PROFESSORES")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Professor_Joined extends Pessoa_Joined {

    @Column(name = "DATA_PROFESSOR")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAdmicao;
    
    @Column(name = "AREA_ATUACAO_PROFESSOR")
    private String areaDeAtuacao;

    public Professor_Joined() {
    }

    public Date getDataAdmicao() {
        return dataAdmicao;
    }

    public void setDataAdmicao(Date dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

}
