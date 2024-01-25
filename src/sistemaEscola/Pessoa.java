package sistemaEscola;
public class Pessoa {
    protected String nome, CPF, naturalidade, genero;
    protected int idade;

    Pessoa(String nome, String CPF, int idade, String naturalidade, String genero){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.genero = genero;
    }
}
