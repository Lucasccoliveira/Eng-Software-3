package fatecrl.edu;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno( new MediaAritmetica());

        aluno.setP1(10);
        aluno.setP2(0);
        aluno.setNome("John Wick");


        System.out.println(String.format("O aluno %s tem media %f",aluno.getNome(),aluno.Media()));

        aluno.setCalculoMedia(new MediaPonderada());
        System.out.println(String.format("O aluno %s tem media %f",aluno.getNome(),aluno.Media()));

        aluno.setCalculoMedia(new MediaGeometrica());
        System.out.println(String.format("O aluno %s tem media %f",aluno.getNome(),aluno.Media()));

    }
}
