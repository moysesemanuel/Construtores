public class Pessoa {
   private String nome;
   private String cpf;
   private  String endereco;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void seteNdereco(String endereco) {
        this.endereco = endereco;
    }
}