public enum TipoDomino {
    ESPANOL("Dominó español", 28, 4, 100,
            "4 jugadores por equipos. Se juega con 28 fichas (doble-6). "
                    + "Comienza quien tenga el doble 6. Si nadie puede jugar, se tranca la mano; "
                    + "gana el equipo con menos puntos en total. No se roba, se pasa."),

    MEXICANO("Dominó mexicano", 55, 8, 0,
            "Hasta 8 jugadores. Se juega con 55 fichas (doble-9). "
                    + "Cada jugador tiene su tren personal y hay un tren común. "
                    + "El doble debe colocarse primero para abrir un tren. Puntaje según fichas restantes."),

    LATINO("Dominó latino", 28, 4, 0,
            "Muy similar al dominó español. Comienza quien tenga el doble mayor. "
                    + "Se permite cierto grado de comunicación entre compañeros. Puntuación acumulativa por rondas."),

    COLOMBIANO("Dominó colombiano", 28, 4, 0,
            "4 jugadores por parejas. Se reparten 7 fichas por jugador. "
                    + "Comienza con el doble 6 o el siguiente más alto si no aparece. "
                    + "En caso de cierre, gana la pareja con menos puntos acumulados."),

    CHILENO("Dominó chileno", 28, 4, 200,
            "Similar al español, pero con énfasis en la estrategia de bloqueo. "
                    + "Si nadie tiene el doble más alto, se pasa al siguiente doble disponible. "
                    + "Juego hasta 200 puntos."),

    VENEZOLANO("Dominó venezolano", 28, 4, 100,
            "Solo se juega por parejas. Comienza siempre con el doble más alto disponible. "
                    + "En caso de tranca, gana la pareja con menos puntos. Se juega hasta 100 puntos."),

    PONCE("Dominó Ponce (Puerto Rico)", 55, 4, 200,
            "4 jugadores por equipos. Juego muy estratégico, con estilo agresivo y bloqueos frecuentes. "
                    + "Se puede jugar con doble-9 (55 fichas). Gana quien llega a 200 puntos.");

    // Campos
    private final String nombre;
    private final int cantidadFichas;
    private final int cantidadJugadores;
    private final int puntosVictoria;
    private final String descripcion;

    // Constructor
    TipoDomino(String nombre, int cantidadFichas, int cantidadJugadores, int puntosVictoria, String descripcion) {
        this.nombre = nombre;
        this.cantidadFichas = cantidadFichas;
        this.cantidadJugadores = cantidadJugadores;
        this.puntosVictoria = puntosVictoria;
        this.descripcion = descripcion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadFichas() {
        return cantidadFichas;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public int getPuntosVictoria() {
        return puntosVictoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + " (" + cantidadJugadores + " jugadores, " +
                cantidadFichas + " fichas, " +
                (puntosVictoria > 0 ? "a " + puntosVictoria + " puntos" : "sin puntaje objetivo") +
                "): " + descripcion;
    }
}
