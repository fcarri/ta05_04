package project5;

import javax.swing.JOptionPane;

public class ta05_4 {
	public static void main(String args[]){
		final double Pi = 3.14;
		double area;
		
		String radi = JOptionPane.showInputDialog("Introdueix radi del cercle: ");
		
		Double dRadi = Double.parseDouble(radi);  
		
		//Area del cercle
		
		area = Pi * Math.pow(dRadi, 2);
		JOptionPane.showMessageDialog(null, "Area del cerce = "+area);
		
	
	}
	
}
