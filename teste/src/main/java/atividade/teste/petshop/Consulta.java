package atividade.teste.petshop;

import java.util.Date;

public class Consulta {
    private Date dataConsulta;
    private Exame exame;
    private String relatoConsulta;

    public Consulta(Date dataConsulta, Exame exame, String relatoConsulta) {
        this.dataConsulta = dataConsulta;
        this.exame = exame;
        this.relatoConsulta = relatoConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String getRelatoConsulta() {
        return relatoConsulta;
    }

    public void setRelatoConsulta(String relatoConsulta) {
        this.relatoConsulta = relatoConsulta;
    }
}
