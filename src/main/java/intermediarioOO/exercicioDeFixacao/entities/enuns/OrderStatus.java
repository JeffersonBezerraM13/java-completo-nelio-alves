package intermediarioOO.exercicioDeFixacao.entities.enuns;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSIN(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int valor;

    OrderStatus(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
