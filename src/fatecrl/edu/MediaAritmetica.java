package fatecrl.edu;

public class MediaAritmetica implements ICalculoMedia, IDescricao {
    @Override
    public float Media(float P1, float P2) {
        return (P1 + P2)/2;
    }

    @Override
    public String Descricao() {
        return "Media Aritmética ";
    }
}
