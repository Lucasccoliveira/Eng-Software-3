package fatecrl.edu;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno( new MediaAritmetica());

        aluno.setP1(8);
        aluno.setP2(10);
        aluno.setNome("John Wick");

        aluno.setCalculoMedia(new MediaAritmetica());
        System.out.println(String.format("O aluno %s tem media aritimetica %f",aluno.getNome(),aluno.Media()));
        System.out.println(String.format("Portanto, o aluno foi %s", (aluno.Media()>5)? "aprovado!" : "reprovado"));


        aluno.setCalculoMedia(new MediaGeometrica());
        System.out.println(String.format("O aluno %s tem media geometrica %f",aluno.getNome(),aluno.Media()));
        System.out.println(String.format("Portanto, o aluno foi %s", (aluno.Media()>7)? "aprovado!" : "reprovado"));

    }
}