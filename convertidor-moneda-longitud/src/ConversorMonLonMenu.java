import javax.swing.*;

public class ConversorMonLonMenu {
    
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }
    
    public static void mostrarMenuPrincipal() {
        String[] opciones = {"Convertir Moneda", "Convertir Longitud", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "Elige la opción que requieres:", "Convertidor Digital", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        
        switch (opcion) {
            case 0:
                convertirMoneda();
                break;
            case 1:
                convertirLongitud();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción válida.");
                mostrarMenuPrincipal();
                break;
        }
    }

	public static void convertirMoneda() {
        String[] opciones = {"Pesos a Dólares", "Pesos a Euros", "Pesos a Libras", "Pesos a Yuanes", "Pesos a Wones", "Dólares a Pesos", "Euros a Pesos", "Libras a Pesos", "Yuanes a Pesos", "Wones a Pesos"};
       
        
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Convertidor de Moneda", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        
        if (opcion == JOptionPane.CLOSED_OPTION) {
            mostrarMenuPrincipal();
            return;
        }
        
        double cantidad;
        double resultado;
        
        try {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida.");
            convertirMoneda();
            return;
        }
        
        switch (opcion) {
            case 0:
                resultado = convertirPesosADolares(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pesos equivalen a " + resultado + " dólares.");
                break;
            case 1:
                resultado = convertirPesosAEuros(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pesos equivalen a " + resultado + " euros.");
                break;
            case 2:
                resultado = convertirPesosALibras(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pesos equivalen a " + resultado + " libras.");
                break;
            case 3:
                resultado = convertirPesosAYuanes(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pesos equivalen a " + resultado + " yuanes.");
                break;
            case 4:
                resultado = convertirPesosAWones(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pesos equivalen a " + resultado + " wones.");
                break;
            case 5:
                resultado = convertirDolaresAPesos(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " dólares equivalen a " + resultado + " pesos.");
                break;
            case 6:
                resultado = convertirEurosAPesos(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " euros equivalen a " + resultado + " pesos.");
                break;
            case 7:
                resultado = convertirLibrasAPesos(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " libras equivalen a " + resultado + " pesos.");
                break;
            case 8:
                resultado = convertirYuanesAPesos(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " yuanes equivalen a " + resultado + " pesos.");
                break;
            case 9:
                resultado = convertirWonesAPesos(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " wones equivalen a " + resultado + " pesos.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción válida.");
                convertirMoneda();
                break;
        }
        
        mostrarMenuPrincipal();
    }
    
    public static void convertirLongitud() {
        String[] opciones = {"Centímetros a Pies", "Centímetros a Yardas", "Centímetros a Millas", "Pies a Centímetros", "Yardas a Centímetros", "Millas a Centímetros"};
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Convertidor de Longitud", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        
        if (opcion == JOptionPane.CLOSED_OPTION) {
            mostrarMenuPrincipal();
            return;
        }
        
        double cantidad;
        double resultado;
        
        try {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida.");
            convertirLongitud();
            return;
        }
        
        switch (opcion) {
            case 0:
                resultado = convertirCentimetrosAPies(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " centímetros equivalen a " + resultado + " pies.");
                break;
            case 1:
                resultado = convertirCentimetrosAYardas(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " centímetros equivalen a " + resultado + " yardas.");
                break;
            case 2:
                resultado = convertirCentimetrosAMillas(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " centímetros equivalen a " + resultado + " millas.");
                break;
            case 3:
                resultado = convertirPiesACentimetros(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " pies equivalen a " + resultado + " centímetros.");
                break;
            case 4:
                resultado = convertirYardasACentimetros(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " yardas equivalen a " + resultado + " centímetros.");
                break;
            case 5:
                resultado = convertirMillasACentimetros(cantidad);
                JOptionPane.showMessageDialog(null, cantidad + " millas equivalen a " + resultado + " centímetros.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elige una opción del menú.");
                convertirLongitud();
                break;
        }
        
        mostrarMenuPrincipal();
    }
    
    // Métodos de conversión de moneda
    
    public static double convertirPesosADolares(double pesos) {
        double tasaCambio = 17.07; 
        return pesos / tasaCambio;
    }

    public static double convertirPesosAEuros(double pesos) {
        double tasaCambio = 18.62; 
        return pesos / tasaCambio;
    }

    public static double convertirPesosALibras(double pesos) {
        double tasaCambio = 21.65;
        return pesos / tasaCambio;
    }

    public static double convertirPesosAYuanes(double pesos) {
        double tasaCambio = 2.36;
        return pesos / tasaCambio;
    }

    public static double convertirPesosAWones(double pesos) {
        double tasaCambio = 0.013;
        return pesos / tasaCambio;
    }

    public static double convertirDolaresAPesos(double dolares) {
        double tasaCambio = 17.07; // Tasa de cambio actual
        return dolares * tasaCambio;
    }

    public static double convertirEurosAPesos(double euros) {
        double tasaCambio = 18.62; // Tasa de cambio actual
        return euros * tasaCambio;
    }

    public static double convertirLibrasAPesos(double libras) {
        double tasaCambio = 21.65;
        return libras * tasaCambio;
    }

    public static double convertirYuanesAPesos(double yuanes) {
        double tasaCambio = 2.36;
        return yuanes * tasaCambio;
    }

    public static double convertirWonesAPesos(double wones) {
        double tasaCambio = 0.013;
        return wones * tasaCambio;
    }
    
    // Métodos de conversión de longitud
    
    public static double convertirCentimetrosAPies(double centimetros) {
        double factorConversion = 0.0328084;
        return centimetros * factorConversion;
    }
    
    public static double convertirCentimetrosAYardas(double centimetros) {
        double factorConversion = 0.0109361;
        return centimetros * factorConversion;
    }
    
    public static double convertirCentimetrosAMillas(double centimetros) {
        double factorConversion = 0.0000062137;
        return centimetros * factorConversion;
    }
    
    public static double convertirPiesACentimetros(double pies) {
        double factorConversion = 30.48;
        return pies * factorConversion;
    }
    
    public static double convertirYardasACentimetros(double yardas) {
        double factorConversion = 91.44;
        return yardas * factorConversion;
    }
    
    public static double convertirMillasACentimetros(double millas) {
        double factorConversion = 160934.4;
        return millas * factorConversion;
    }
}
