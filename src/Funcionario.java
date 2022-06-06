public class Funcionario {
    String Nome;
    int Idade;
    String Cargo;
    String Situacao;

    Funcionario(){}
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }

    public void demitirFuncionario() {
        this.Situacao = "inativo";
        System.out.println("O funcionário " + getNome() + " está " + this.Situacao);
    }

    public void promoverFuncionario(String promocao) {
        this.Cargo = promocao;
        System.out.println("O funcionário " + getNome() + " foi promovido para " + this.Cargo);
    }

    public void aniversario() {
        this.Idade++;
        System.out.println("Feliz aniversário, " + getNome() + " pelos seus " + getIdade() + " anos!"); 
    }

    public void pagamento() {
        System.out.println("O salário do funcionário " + getNome() + " já foi pago!");
    }



}