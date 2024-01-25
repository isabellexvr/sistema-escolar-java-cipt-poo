public class Aluno extends Pessoa{

    int matricula, codigoTurma;
    String[] disciplinas = new String[4];
    double[] notas = new double[4];
    Aluno(String nome, String CPF, int idade, String naturalidade, String genero, int matricula, int codigoTurma, String[] disciplinas, double[] notas){
        super(nome, CPF, idade, naturalidade, genero);

        this.matricula = matricula;
        this.codigoTurma = codigoTurma;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public void getNotas(){
        for(int i = 0; i > notas.length ; i++){
            System.out.println("Para a disciplina " + this.disciplinas[i] + ", ele possui a nota " + this.notas[i]);
        }
    }

    public void getMedia(){
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("Esse aluno é de média " + Math.round(media));
    }

    public void getEstaAprovado(){
        boolean resultado = true;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < 7) resultado = false;
        }
        if(resultado){
            System.out.println("O aluno " + nome + " está aprovado.");
        }else{
            System.out.println("O aluno " + nome + " está reprovado nas seguintes disciplinas:");
            for (int i = 0; i < notas.length; i++) {
                if(notas[i] < 7){
                    System.out.println(" - " + disciplinas[i]);
                }
            }
        }
    }


}

