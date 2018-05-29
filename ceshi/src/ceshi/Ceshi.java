package ceshi;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ceshi {
	 
	public static void main(String[] args) {
			 
//		ceshi  ceshi = new ceshi();
//		ceshi.pick().pick().pit();
			System.out.println("sd");
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new ImageFrame();				
					frame.setTitle("ImageViewer");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}
	
	int i=0;
	Ceshi pick() {
		i++;
		return this;
		 
	}
	
	void pit() {
		System.out.println("i = "+i);
	}
}
