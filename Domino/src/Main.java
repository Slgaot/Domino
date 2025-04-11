import java.util.*;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");
        Jugador jugador3 = new Jugador("Carol");
        Jugador jugador4 = new Jugador("Dave");

        List<Jugador> jugadores = Arrays.asList(jugador1, jugador2, jugador3, jugador4);

        TipoDomino tipo = TipoDomino.ESPANOL; // o cualquier otro

        Juego juego = new Juego(tipo, jugadores);
        juego.iniciar();

        int turnosMaximos = 100;
        int turno = 0;

        while (!juego.hayGanador() && turno < turnosMaximos) {
            Jugador actual = juego.getJugadorActual();
            System.out.println("\nTurno de: " + actual.getNombre());

            if (juego.hayGanador()) break;

            juego.siguienteTurno();
            turno++;
        }

        System.out.println("\nEstado final:");
        juego.mostrarEstado();

        for (Jugador j : jugadores) {
            if (j.sinFichas()) {
                System.out.println("🎉 ¡" + j.getNombre() + " ha ganado!");
                break;
            }
        }
    }
}
