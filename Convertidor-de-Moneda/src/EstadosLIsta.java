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
            "M�xico",
            "Michoac�n",
            "Morelos",
            "Nayarit",
            "Nuevo Le�n",
            "Oaxaca",
            "Puebla",
            "Quer�taro",
            "Quintana Roo",
            "San Luis Potos�",
            "Sinaloa",
            "Sonora",
            "Tabasco",
            "Tamaulipas",
            "Tlaxcala",
            "Veracruz",
            "Yucat�n",
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
