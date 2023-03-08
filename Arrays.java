import javax.swing.JOptionPane;

public class Arrays{
    public static void main(String[] args) {
        int []Array = new int [10];
        Array[0] = 53;
        Array[1] = 45;
        int ingreso = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor Entero"));
        for (int f = 0; f < Array.length; f++){
            Array[f]= ingreso * (f+1);
            System.out.println("Array ["+f+"] = "+Array[f]);
        }
    }
}