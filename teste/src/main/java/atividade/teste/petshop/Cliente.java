package atividade.teste.petshop;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nomeCliente;
    private String enderecoCliente;
    private long cepCliente;
    private String telefoneCliente;
    private String emailCliente;
    private List<Animal> animais;

    public Cliente(String nomeCliente, String enderecoCliente, long cepCliente, String telefoneCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.cepCliente = cepCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
        this.animais = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public List<Animal> listarAnimais() {
        return animais;
    }

    public String consultarCliente() {
        return "Nome: " + nomeCliente + ", Endereço: " + enderecoCliente + ", Telefone: " + telefoneCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public long getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(long cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
