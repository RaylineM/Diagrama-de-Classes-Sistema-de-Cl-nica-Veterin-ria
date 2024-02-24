package atividade.teste.petshop;
import java.util.Date;

public class PetShop {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lusca", "Rua dos bobos, 0", 123456789, "11 9999-8888", "lusca@email.com");

        Especie cachorro = new Especie("Cachorro");
        Especie gato = new Especie("Gato");

        Animal rex = new Animal("Rex", cachorro, 5, Animal.MACHO);
        Animal miau = new Animal("Miau", gato, 3, Animal.FEMEA);

        cliente.registrarAnimal(rex);
        cliente.registrarAnimal(miau);

        Veterinario maria = new Veterinario("Maria Oliveira", "Rua Sem Nome, 456", 987654321, "12 7777-6666", "maria@veterinaria.com");

        Consulta consultaRex = new Consulta(new Date(), new Exame("Exame de Sangue"), "Tosse seca");
        Consulta consultaMiau = new Consulta(new Date(), new Exame("Exame de Pele"), "Coceira intensa");

        Tratamento tratamentoRex = new Tratamento(new Date(), maria);
        Tratamento tratamentoMiau = new Tratamento(new Date(), maria);

        tratamentoRex.registrarConsulta(consultaRex);
        tratamentoMiau.registrarConsulta(consultaMiau);

        rex.registrarTratamento(tratamentoRex);
        miau.registrarTratamento(tratamentoMiau);

        System.out.println("Cliente: " + cliente.consultarCliente());

        System.out.println("\nAnimais do Cliente:");
        for (Animal animal : cliente.listarAnimais()) {
            System.out.println(animal.consultarAnimal());
        }

        System.out.println("\nTratamento do Rex:");
        System.out.println(rex.listarTratamentos());

        Consulta ultimaConsultaMiau = tratamentoMiau.listarConsultas().get(tratamentoMiau.listarConsultas().size() - 1);
        System.out.println("\nÚltima consulta do Miau:");
        System.out.println("Data: " + ultimaConsultaMiau.getDataConsulta());
        System.out.println("Exame: " + ultimaConsultaMiau.getExame().getDescricaoExame());
        System.out.println("Relato: " + ultimaConsultaMiau.getRelatoConsulta());
    }
}
