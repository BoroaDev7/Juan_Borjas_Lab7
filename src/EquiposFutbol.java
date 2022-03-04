
public class EquiposFutbol {
    private String nombre;
    private int partidosJugados,partidosGanados,partidosEmpatados,partidosPerdidos;
    private int golesFavor,golesContra,golesDiferencia;
    private int puntos;

    public EquiposFutbol() {
    }

    public EquiposFutbol(String nombre,int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesFavor, int golesContra, int golesDiferencia, int puntos) {
        this.nombre = nombre;
        this.partidosJugados=partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.golesDiferencia = golesDiferencia;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }


    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesDiferencia() {
        return golesDiferencia;
    }

    public void setGolesDiferencia(int golesDiferencia) {
        this.golesDiferencia = golesDiferencia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", PG=" + partidosGanados + ", PE=" + partidosEmpatados + ", PP=" + partidosPerdidos + ", GF=" + golesFavor + ", GC=" + golesContra + ", GD=" + golesDiferencia + ", Puntos=" + puntos ;
    }
    
    
}
