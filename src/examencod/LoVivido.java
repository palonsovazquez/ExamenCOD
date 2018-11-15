/*
 * Examen Refactorizacion
 * 
 */
package examencod;  // cambio el package para que no de error al del proyecto del examen.

import javax.swing.JOptionPane;

public class LoVivido { // cambio el nombre del fichero para que corresponda con el nombre de la clase.

    public static void main(String[] args) {
        String strNombre;
        String strEdad;

        int intMeses;
        int intDias;
        int intHoras;
        int intEdad;

        strNombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        strEdad = JOptionPane.showInputDialog("Escriba su edad: ");

        intEdad = Integer.parseInt(strEdad);

        intMeses = (intEdad * 12);
        intDias = (intEdad * 365);
        intHoras = (intDias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + intMeses, "Numero de meses vividos de " + strNombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + intDias, "Numero de días vividos de " + strNombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + intHoras, "Numero de horas vividos de " + strNombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
