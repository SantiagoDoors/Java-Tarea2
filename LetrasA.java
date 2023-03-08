import javax.swing.JOptionPane;

public class LetrasA {
    public static void main(String[] args) {
        int CuentasA = 0, valor = 0;
        String cadena = JOptionPane.showInputDialog("ingrese una Frase");
        while (valor <= cadena.length()-1){
            if (cadena.charAt(valor)=='a')
                CuentasA++;
            valor++;
        }
        System.out.println("Contamos "+CuentasA+" letras A");
    }
}