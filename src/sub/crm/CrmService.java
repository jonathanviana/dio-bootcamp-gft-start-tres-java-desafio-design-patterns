package sub.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("\nDADOS DO CLIENTE: ");
        System.out.printf("Nome: %s\nCEP: %s\nCidade: %s\nEstado: %s", name, cep, city, state);
        System.out.println("\n\nCliente salvo com sucesso!");
    }
}
