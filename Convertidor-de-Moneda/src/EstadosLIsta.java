import javax.swing.*;

public class EstadosLIsta {
    public static void main(String[] args) {
        String[] estados = {
            "Aguascalientes",
            "Baja California",
            "Baja California Sur",
            "Campeche",
            "Chiapas",
            "Chihuahua",
            "Coahuila",
            "Colima",
            "Durango",
            "Guanajuato",
            "Guerrero",
            "Hidalgo",
            "Jalisco",
            "México",
            "Michoacán",
            "Morelos",
            "Nayarit",
            "Nuevo León",
            "Oaxaca",
            "Puebla",
            "Querétaro",
            "Quintana Roo",
            "San Luis Potosí",
            "Sinaloa",
            "Sonora",
            "Tabasco",
            "Tamaulipas",
            "Tlaxcala",
            "Veracruz",
            "Yucatán",
            "Zacatecas"
        };
        
        String estadoSeleccionado = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona un estado:",
            "Lista de Estados",
            JOptionPane.PLAIN_MESSAGE,
            null,
            estados,
            estados[0]
        );
        
        if (estadoSeleccionado != null) {
            JOptionPane.showMessageDialog(null, "Has seleccionado: " + estadoSeleccionado, "Estado seleccionado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
