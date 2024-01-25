package sistemaEscola;

public class Faxineiro extends Funcionario{

    protected int horasTrabalhadas;

    Faxineiro(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias, int horasTrabalhadas){
        super(nome, CPF, idade, naturalidade, genero, departamento, salario, horasDeTrabDiarias);

        this.horasTrabalhadas = horasTrabalhadas;

    }

    public void limpar(){
        System.out.println("O faxineiro " + this.nome + " está limpando...");
    }

    public void getHorasSemanais(){
        System.out.println("O faxineiro " + this.nome + " trabalha por " + this.horasTrabalhadas * 5 + " horas por semana.");
    }


}
