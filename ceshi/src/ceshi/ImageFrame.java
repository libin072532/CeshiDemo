package ceshi;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH  = 300;
	private static final int DEFAULT_HEIGHT = 400;
	
	public ImageFrame() {
	setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	
	label = new JLabel();
	add(label);
	
	chooser = new JFileChooser();
	chooser.setCurrentDirectory(new File("."));
	
	JMenuBar menuBar = new  JMenuBar();
	setJMenuBar(menuBar);
		
	JMenu menu = new JMenu("File");
	menuBar.add(menu);
	
	JMenuItem openItem = new JMenuItem("Open");
	menu.add(openItem);
	openItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int result = chooser.showOpenDialog(null);
			if(result == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		}
	});
	
	JMenuItem  exItem = new JMenuItem("ÍË³ö");
	menu.add(exItem);
	exItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	
	
	}
	
}
