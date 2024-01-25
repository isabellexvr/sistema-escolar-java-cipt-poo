package sistemaEscola;

public class TiaDoLanche extends Funcionario{
    protected String[] especialidades, funcoes = new String[3];

    TiaDoLanche(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias, String[] especialidades, String[] funcoes){
        super(nome, CPF, idade, naturalidade, genero, departamento, salario, horasDeTrabDiarias);

        this.especialidades = especialidades;
        this.funcoes = funcoes;
    }

    public void getEspecialidades(){
        System.out.println("A tia do lanche " + this.nome + " tem as seguintes especialidades culinárias:");
        for (int i = 0; i < especialidades.length; i++) {
            System.out.println(especialidades[i]);
        }
    }

    public void getFuncoes(){
        System.out.println("A tia do lanche " + this.nome + " tem as seguintes funções na cantina:");
        for (int i = 0; i < funcoes.length; i++) {
            System.out.println(funcoes[i]);
        }
    }

    public void checkEspecialidade(String lanche){
        boolean possuiEspecialidade = false;

        for (int i = 0; i < especialidades.length; i++) {
            if(especialidades[i].equals(lanche)){
                possuiEspecialidade = true;
            }
        }

        if(possuiEspecialidade){
            System.out.println(this.nome + " possui essa especialidade culinária!");
        }else{
            System.out.println(this.nome + " não possui essa especialidade culinária.");
        }
    }



}
