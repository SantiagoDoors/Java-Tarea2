import javax.swing.JOptionPane;

public class Letras_A_2v {
    public static void main(String[] args) {
        int CuentasA = 0, valor = 0, suma = valor;
        String cadena = JOptionPane.showInputDialog("ingrese una Frase");
        while (valor <= cadena.length()-1){
            suma = valor + 1;
            if (cadena.substring(valor, suma).equals("a"))
                CuentasA++;
            valor++;
        }
        System.out.println("Contamos "+CuentasA+" letras A");
    }
}