public class SistemaCadastro {
    public static void main(String[] args) {
        //criando uma pessoa no sistema
        Pessoa marcos = new Pessoa("000.000.000-00", "Moyses Emanuel");

        //definindo o endereço de marcos
        marcos.setEndereco("Rua das Marias");

        System.out.println("Nome: " + marcos.getNome() + " - " + " CPF: " + marcos.getCpf());
    }
}
