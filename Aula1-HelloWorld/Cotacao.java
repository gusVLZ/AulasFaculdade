import javax.swing.JOptionPane;

public class Cotacao {
	public static void main(String[] args){
		double p, s, r;

        p=Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação USD/BRL: "));
        s=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia em dolares: "));

        r = p*s;

        JOptionPane.showMessageDialog(null, "O valor em real é : "+r);
	}	
}