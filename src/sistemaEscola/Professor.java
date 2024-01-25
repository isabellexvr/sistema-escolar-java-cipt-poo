package sistemaEscola;

public class Professor extends Funcionario{
    protected String[] disciplinasMinistradas = new String[4];

    Professor(String nome, String CPF, int idade, String naturalidade, String genero, String departamento, int salario, int horasDeTrabDiarias, String[] disciplinasMinistradas){
        super(nome, CPF, idade, naturalidade, genero, departamento, salario, horasDeTrabDiarias);
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public void ensinarMateria(String materia){
        for (int i = 0; i < disciplinasMinistradas.length; i++) {
            if(!disciplinasMinistradas[i].equals(materia)) {
                System.out.println("O professor " + this.nome + " não ministra essa disciplina/matéria.");
                return;
            }

        }
        System.out.println("O professor " + this.nome + " está ensinando a disciplina " + materia);
    }


}
