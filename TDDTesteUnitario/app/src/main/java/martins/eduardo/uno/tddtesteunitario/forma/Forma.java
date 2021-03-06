package martins.eduardo.uno.tddtesteunitario.forma;

public abstract class Forma {

    private double[] numeroDeMedidas;
    private int TAMANHO_MAXIMO = 3;

    public Forma(int numMedidas){
        numeroDeMedidas = new double[numMedidas];
    }

    public double getMedidas(int posicao){

        if(posicao >= 0 && posicao < TAMANHO_MAXIMO){
            return numeroDeMedidas[posicao];
        } else
            throw new RuntimeException("Numero invalido p/ calcular a area");

    }

    public void setMedidas(int posicao, double medida){
        numeroDeMedidas[posicao] = medida;
    }

    public abstract double area();
}
