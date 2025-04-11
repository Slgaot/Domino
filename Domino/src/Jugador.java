import java.util.*;

public class Jugador {
    private String nombre;
    private List<Ficha> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirFichas(List<Ficha> fichas) {
        mano.addAll(fichas);
    }

    public boolean puedeJugar(int extremoIzq, int extremoDer) {
        for (Ficha ficha : mano) {
            if (ficha.getIzquierdo() == extremoIzq || ficha.getDerecho() == extremoIzq ||
                    ficha.getIzquierdo() == extremoDer || ficha.getDerecho() == extremoDer) {
                return true;
            }
        }
        return false;
    }

    public List<Ficha> getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean sinFichas() {
        return mano.isEmpty();
    }

    public int contarPuntos() {
        int suma = 0;
        for (Ficha f : mano) {
            suma += f.getIzquierdo() + f.getDerecho();
        }
        return suma;
    }
}
