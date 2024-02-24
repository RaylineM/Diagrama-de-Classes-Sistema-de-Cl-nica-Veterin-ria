package atividade.teste.petshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tratamento {
    private Date dataInicialTratamento;
    private Date dataFinalTratamento;
    private Veterinario veterinario;
    private List<Consulta> consultas;

    public Tratamento(Date dataInicialTratamento, Veterinario veterinario) {
        this.dataInicialTratamento = dataInicialTratamento;
        this.veterinario = veterinario;
        this.consultas = new ArrayList<>();
    }

    public Date getDataInicialTratamento() {
        return dataInicialTratamento;
    }

    public void setDataInicialTratamento(Date dataInicialTratamento) {
        this.dataInicialTratamento = dataInicialTratamento;
    }

    public Date getDataFinalTratamento() {
        return dataFinalTratamento;
    }

    public void setDataFinalTratamento(Date dataFinalTratamento) {
        this.dataFinalTratamento = dataFinalTratamento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }
}
