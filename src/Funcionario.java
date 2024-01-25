public class Funcionario extends Pessoa {

    String departamento;

    int salario, horasDeTrabDiarias;
    Funcionario(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias){
        super(nome, CPF, idade, naturalidade, genero);

        this.departamento = departamento;
        this.salario = salario;
        this.horasDeTrabDiarias = horasDeTrabDiarias;
    }

    public void getDepartamento(){
        System.out.println("O funcionário " + this.nome + " trabalha no departamento " + this.departamento);
    }

    public void getRendaAnual(){
        System.out.println("O funcionário " + this.nome + " ganha " + this.salario*12 + " por ano.");
    }
}
