import javax.swing.JOptionPane;

public class QuadradoDeQuatro {
	public static void main(String[] args){
		String p;

        p=JOptionPane.showInputDialog("Digite 4 valores separados por vírgulas");

        String[] vlrs = p.split(",");

        double[] res = {
            Double.parseDouble(vlrs[0])*Double.parseDouble(vlrs[0]),
            Double.parseDouble(vlrs[1])*Double.parseDouble(vlrs[1]),
            Double.parseDouble(vlrs[2])*Double.parseDouble(vlrs[2]),
            Double.parseDouble(vlrs[3])*Double.parseDouble(vlrs[3])
        };
        
        JOptionPane.showMessageDialog(null, "os valores são: "+res[0]+", "+res[1]+", "+res[2]+" e "+res[3]);
	}	
}