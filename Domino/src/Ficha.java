public class Ficha {
    private int ladoIzquierdo;
    private int ladoDerecho;

    public Ficha(int izquierdo, int derecho) {
        this.ladoIzquierdo = izquierdo;
        this.ladoDerecho = derecho;
    }

    public void voltear() {
        int temp = ladoIzquierdo;
        ladoIzquierdo = ladoDerecho;
        ladoDerecho = temp;
    }

    public int getIzquierdo() {
        return ladoIzquierdo;
    }

    public int getDerecho() {
        return ladoDerecho;
    }

    public boolean esDoble() {
        return ladoIzquierdo == ladoDerecho;
    }

    @Override
    public String toString() {
        return "[" + ladoIzquierdo + "|" + ladoDerecho + "]";
    }
}
