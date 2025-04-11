import java.util.*;

public class Mazo {
    private List<Ficha> fichas;

    public Mazo() {
        this.fichas = new ArrayList<>();
    }

    public void crearMazo(int maxNumero) {
        fichas.clear();
        for (int i = 0; i <= maxNumero; i++) {
            for (int j = i; j <= maxNumero; j++) {
                fichas.add(new Ficha(i, j));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(fichas);
    }

    public Ficha robar() {
        if (!fichas.isEmpty()) {
            return fichas.remove(0);
        }
        return null; // o lanzar excepción mejor
    }

    public boolean estaVacio() {
        return fichas.isEmpty();
    }

    public List<Ficha> repartir(int cantidad) {
        List<Ficha> mano = new ArrayList<>();
        for (int i = 0; i < cantidad && !fichas.isEmpty(); i++) {
            mano.add(fichas.remove(0));
        }
        return mano;
    }

    public int cantidad() {
        return fichas.size();
    }
}