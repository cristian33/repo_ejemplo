package ejemplos;
import javax.swing.JOptionPane;
public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float real;
String nombre;
int num;
real=Float.parseFloat(JOptionPane.showInputDialog("numero decimal"));
nombre=JOptionPane.showInputDialog("ingrese el nombre");
num=Integer.parseInt(JOptionPane.showInputDialog("num entero"));

JOptionPane.showMessageDialog(null, nombre, "su nombre es", 0);//es la cruz el cero
JOptionPane.showMessageDialog(null, num, "su num entero es", 1);//es informacio el 1
JOptionPane.showMessageDialog(null, real, "su nombre es", 2);//es la cruz el cero
	}

}
