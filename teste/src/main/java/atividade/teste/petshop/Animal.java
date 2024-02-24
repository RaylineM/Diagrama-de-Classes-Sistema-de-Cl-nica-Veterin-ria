package atividade.teste.petshop;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    public static final int MACHO = 0;
    public static final int FEMEA = 1;
    private String nomeAnimal;
    private Especie especie;
    private int idadeAnimal;
    private int sexoAnimal;
    private List<Tratamento> tratamentos;

    public Animal(String nomeAnimal, Especie especie, int idadeAnimal, int sexoAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.idadeAnimal = idadeAnimal;
        this.sexoAnimal = sexoAnimal;
        tratamentos = new ArrayList<>();
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public int getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(int sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public void registrarTratamento(Tratamento tratamento) {
        tratamentos.add(tratamento);
    }

    public List<Tratamento> listarTratamentos() {
        return tratamentos;
    }

    public String consultarAnimal() {
        return "Nome: " + nomeAnimal + ", Idade: " + idadeAnimal + ", Sexo: " + sexoAnimal;
    }

    @Override
    public String toString() {
        return "Animal [nomeAnimal=" + nomeAnimal + ", idadeAnimal=" + idadeAnimal + ", sexoAnimal=" + sexoAnimal + "]";
    }
}
