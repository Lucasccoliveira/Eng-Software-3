package fatecrl.edu;

public class Aluno {
    private ICalculoMedia calculoMedia;

    private String Nome;
    private float P1;
    private float P2;


    public void setCalculoMedia(ICalculoMedia calculoMedia) {
        this.calculoMedia = calculoMedia;
    }

    public Aluno(ICalculoMedia calculoMedia) {
        this.calculoMedia = calculoMedia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getP1() {
        return P1;
    }

    public void setP1(float p1) {
        P1 = p1;
    }

    public float getP2() {
        return P2;
    }

    public void setP2(float p2) {
        P2 = p2;
    }

    public  float Media(){
        return calculoMedia.Media(this.P1, this.P2);
    }


}
