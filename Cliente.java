package exercicio03;

public class Cliente {
    //Atributos
    private String nome, telefone, sexo, estado_civil;
    private int idade;
    
    //Construtor
    public Cliente(String nome, int idade, String telefone, String sexo, String estado_civil){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
    }
    
    //Métodos
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Estado Civil: " + this.estado_civil + "\n");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
