package fatecrl.edu;

public class MediaPonderada implements  ICalculoMedia,IDescricao{
    @Override
    public float Media(float P1, float P2) {
        return (P1 + 2 * P2)/3;
    }
    @Override
    public String Descricao() {
        return "Media Ponderada ";
    }
}
