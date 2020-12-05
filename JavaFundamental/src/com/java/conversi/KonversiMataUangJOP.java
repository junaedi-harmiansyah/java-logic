/**
 * 
 */
package com.java.conversi;

import javax.swing.JOptionPane;

/**
 * @author Noviana Dewi
 *
 */
public class KonversiMataUangJOP {
	public static void main (String [] args){
		double rupiah;
		
		String r = javax.swing.JOptionPane.showInputDialog("Masukkan Nilai Dollar : ");
		double r1 = Double.parseDouble(r);
		
		rupiah = r1 * 12000;
		
		JOptionPane.showMessageDialog(null, "Hasil konversi mata uang : \n $ " +r+ " = " +rupiah+ "rupiah" );
	}
}
