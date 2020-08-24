import javax.swing.JOptionPane;

public class OlaMundo {
	public static void main(String[] args){
		double p, s, r;

        p=Double.parseDouble(JOptionPane.showInputDialog("1º"));
        s=Double.parseDouble(JOptionPane.showInputDialog("2º"));

        r = p+s;

        JOptionPane.showMessageDialog(null, "A soma é: "+r);
	}	
}