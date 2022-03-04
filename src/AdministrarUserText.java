import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdministrarUserText {
private ArrayList<EquiposFutbol> Champions = new ArrayList();
        private File text = null;
        
        public AdministrarUserText(String path) {
        text = new File(path);
        }
        public File getText() {
        return text;
    }
     
        public void setText(File text) {
        this.text = text;
    }
         
        
        public ArrayList<EquiposFutbol> getChampions() {
        return Champions;
    }

    public void setChampions(ArrayList<EquiposFutbol> Champions) {
        this.Champions = Champions;
    }

    @Override
    public String toString() {
        return  "Champions=" + Champions ;
    }
      
    
     public void setEquiposFutbol(EquiposFutbol team) {
        this.Champions.add(team);
    }
     
     
     
     public void escribirText() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(text, true);
            bw = new BufferedWriter(fw);
            for (EquiposFutbol equipo : Champions) {
                bw.write(equipo.getNombre() + " , ");
                bw.write(equipo.getPartidosJugados()+ " , ");
                bw.write(equipo.getPartidosGanados()+ " , ");
                bw.write((equipo.getPartidosEmpatados() + " , "));
                  bw.write(equipo.getPartidosPerdidos()+ " , ");
                    bw.write(equipo.getGolesFavor() + " , ");
                     bw.write(equipo.getGolesContra() + " , ");
                      bw.write(equipo.getGolesDiferencia() + " , ");
                       bw.write(equipo.getPuntos());
                        bw.newLine();
                       
            }
            bw.flush();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar al archivo");
        }
        bw.close();
        fw.close();
    }

    public void cargarText() {
        Scanner leer = null;
        Champions = new ArrayList();
        if (text.exists()) {
            try {
                leer = new Scanner(text);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    Champions.add(new EquiposFutbol(leer.next(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt(),
                                    leer.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo");
            }
            leer.close();
        }//FIN IF
    }
    
     
     

    
}
