import java.util.*;

public class Juego {
    private TipoDomino tipoDomino;
    private List<Jugador> jugadores;
    private Mazo mazo;
    private Mesa mesa;
    private int turnoActual;

    public Juego(TipoDomino tipoDomino, List<Jugador> jugadores) {
        this.tipoDomino = tipoDomino;
        this.jugadores = jugadores;
        this.mazo = new Mazo();
        this.mesa = new Mesa();
        this.turnoActual = 0;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void iniciar() {
        int maxFicha = tipoDomino.getCantidadFichas() == 28 ? 6 : 9;
        mazo.crearMazo(maxFicha);
        mazo.barajar();

        int fichasPorJugador = tipoDomino.getCantidadFichas() / tipoDomino.getCantidadJugadores();

        for (Jugador j : jugadores) {
            j.recibirFichas(mazo.repartir(fichasPorJugador));
        }
    }

    public void siguienteTurno() {
        turnoActual = (turnoActual + 1) % jugadores.size();
    }

    public Jugador getJugadorActual() {
        return jugadores.get(turnoActual);
    }

    public boolean hayGanador() {
        for (Jugador j : jugadores) {
            if (j.sinFichas()) return true;
        }
        return false;
    }

    public void mostrarEstado() {
        System.out.println("Fichas en la mesa: " + mesa.getFichasJugadas());
        for (Jugador j : jugadores) {
            System.out.println(j.getNombre() + ": " + j.getMano());
        }
    }
}
