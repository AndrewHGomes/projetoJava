public class Main {
    public static void main(String[] args) {
        System.out.println("Faz o trabalho!");

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        Funcionario func4 = new Funcionario();

        func1.setNome("Andrew");
        func1.setIdade(33);
        func1.setCargo("Programador Jr");
        func1.setSituacao("Ativo");

        func2.setNome("Irvin");
        func2.setIdade(32);
        func2.setCargo("Programador Pleno");
        func2.setSituacao("Ativo");

        func3.setNome("Renan");
        func3.setIdade(28);
        func3.setCargo("Tester");
        func3.setSituacao("Ativo");

        func4.setNome("Janico");
        func4.setIdade(68);
        func4.setCargo("CEO");
        func4.setSituacao("Ativo");

        func1.demitirFuncionario();

        func2.promoverFuncionario("Programador Senior");

        func3.aniversario();

        func4.pagamento();
    }
}