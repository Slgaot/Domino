import java.util.*;

public class Mesa {
    private LinkedList<Ficha> fichasEnMesa;

    public Mesa() {
        this.fichasEnMesa = new LinkedList<>();
    }

    public void colocarFichaIzquierda(Ficha ficha) {
        fichasEnMesa.addFirst(ficha);
    }

    public void colocarFichaDerecha(Ficha ficha) {
        fichasEnMesa.addLast(ficha);
    }

    public int getExtremoIzquierdo() {
        return fichasEnMesa.isEmpty() ? -1 : fichasEnMesa.getFirst().getIzquierdo();
    }

    public int getExtremoDerecho() {
        return fichasEnMesa.isEmpty() ? -1 : fichasEnMesa.getLast().getDerecho();
    }

    public List<Ficha> getFichasJugadas() {
        return fichasEnMesa;
    }

    public boolean estaVacia() {
        return fichasEnMesa.isEmpty();
    }
}
