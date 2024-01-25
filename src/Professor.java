public class Professor extends Funcionario{
    String[] disciplinasMinistradas = new String[4];

    Professor(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias, String[] disciplinasMinistradas){
        super(nome, CPF, idade, naturalidade, genero, departamento, salario, horasDeTrabDiarias);
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public void ensinarMateria(String materia){
        System.out.println("O professor " + this.nome + " está ensinando a disciplina " + materia);
    }


}
