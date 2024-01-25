//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] notas = new double[] {7.6, 4.2, 9.5, 7};
        String[] disciplinas = new String[] {"Matemática", "Português", "Artes", "Biologia"};

        Aluno ambrósio = new Aluno("Ambrósio", "123123123", 15, "Paraense", "Masculino",24324, 11011, disciplinas, notas);
        ambrósio.getEstaAprovado();



    }
}