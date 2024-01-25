package sistemaEscola;

public class Diretor extends Funcionario{

    String[] atividades = new String[3];
    Diretor(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias, String[] atividades){
        super(nome, CPF, idade, naturalidade, genero, departamento, salario, horasDeTrabDiarias);

        this.atividades = atividades;
    }

    public void getAtividadesDiarias(){
        System.out.println("O diretor " + this.nome + " tem as seguintes atividades diárias:");
        for (int i = 0; i < atividades.length; i++) {
            System.out.println(atividades[i]);
        }
    }

}
