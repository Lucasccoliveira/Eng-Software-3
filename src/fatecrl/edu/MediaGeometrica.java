package fatecrl.edu;

public class MediaGeometrica implements ICalculoMedia, IDescricao{
    @Override
    public float Media(float P1, float P2) {
        return (float) Math.sqrt(P1 * P2);
    }

    @Override
    public String Descricao() {
        return "Media Geométrica ";
    }
}
