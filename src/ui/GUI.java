package ui;

import java.awt.Toolkit;

import javax.swing.JFrame;

import io.KeyHandler;
import io.MouseHandler;
import io.MouseMotionHandler;

public class GUI {
	public JFrame jf;
	public Draw draw;

// ======================================== CONSTRUCTOR ========================================
	public GUI() {
		setupJFrame();
		
	}
// ======================================== METHODS ============================================
	
	private void setupJFrame() {
		jf = new JFrame();
		draw = new Draw();
		draw.setDoubleBuffered(true);
		jf.setSize(600, 700);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addMouseListener(new MouseHandler());
		jf.addMouseMotionListener(new MouseMotionHandler());
		jf.addKeyListener(new KeyHandler());
		jf.add(draw);
		jf.setVisible(true);
	}
// ======================================== GET/SET METHODS ====================================
	
	
}
