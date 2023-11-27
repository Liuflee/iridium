package validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Anette Villalón, Smolenks Aravena
 */
public class Validacion {
    
    public static boolean camposVacios(String... campos) {
        for (String campo : campos) {
            if (campo.isBlank()) {
                return true;
            }
        }
        return false;
    }
    
    /**
     *  Valida rut en formato XXXXXXXX-X 
     */
    public static Boolean validarRut ( String rut ) {
            Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
            Matcher matcher = pattern.matcher(rut);
            if ( matcher.matches() == false ) return false;
            String[] stringRut = rut.split("-");
            return stringRut[1].toLowerCase().equals(validarDv(stringRut[0]));
    }

    /**
     * Valida el dígito verificador
     */
    public static String validarDv (String rut) {
            Integer M = 0, S = 1,T = Integer.parseInt(rut);
            for (; T != 0 ; T = (int) Math.floor(T /= 10))
                    S = (S + T % 10 * (9 - M++ % 6)) % 11;
            return (S > 0) ? String.valueOf(S - 1) : "k";		
    }


    public static boolean nombreSoloLetras(String nombre) {
        return nombre.matches("^[A-Za-z ]+$");
    }

    public static boolean validarNumeros(String... numeros) {
        for (String numero : numeros) {
            try {
                Integer.parseInt(numero);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    
    
    
    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.PLAIN_MESSAGE);
    }
}
