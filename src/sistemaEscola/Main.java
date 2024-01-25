package sistemaEscola;
public class Main {
    public static void main(String[] args) {
        //exemplo de aluno
        double[] notas = new double[] {7.6, 4.2, 9.5, 7};
        String[] disciplinas = new String[] {"Matemática", "Português", "Artes", "Biologia"};
        Aluno ambrosio = new Aluno("Ambrósio", "123123123", 15, "Paraense", "Masculino",24324, 11011, disciplinas, notas);
        ambrosio.getEstaAprovado();
        ambrosio.getNotas();
        ambrosio.getMedia();

        //exemplo de professor
        String[] disciplinasMinistradas = new String[] {"Matemática", "Física Quântica", "Química", "Lógica de Programação"};
        Professor stewart = new Professor("Stewart", "4342523423", 43, "Cearense", "Masculino", "Departamento do Ensino de Exatas", 3000, 8, disciplinasMinistradas);
        stewart.ensinarMateria("Matemática");
        stewart.ensinarMateria("Português");


        //exemplo de faxineiro
        Faxineiro lucinho = new Faxineiro("Lucinho", "346464525", 32, "Alagoano", "Masculine", "Limpeza", 1500, 8, 8);
        lucinho.limpar();
        lucinho.getHorasSemanais();

        //exemplo de tia do lanche
        String[] especialidades = new String[] {"Coxinha","Brigadeiro","Bolo"};
        String[] funcoes = new String[] {"Cozinhar","Atender o caixa","Embalar os lanches"};
        TiaDoLanche judite = new TiaDoLanche("Judite", "9442345", 39, "Baiana", "Feminino", "Cantina", 1500, 8, especialidades, funcoes);
        judite.checkEspecialidade("Coxinha");
        judite.checkEspecialidade("Pastel");
        judite.getEspecialidades();
        judite.getFuncoes();

        //exemplo de diretor

        String[] atividadesDiretor = new String[] {"Reunião com funcionários", "Planejar melhoras para a escola", "Reestocar papel A4 na secretaria"};
        Diretor renata = new Diretor("Renata", "32434134", 44, "Argentina", "Feminino", "Direção", 5000, 8, atividadesDiretor);

    }
}