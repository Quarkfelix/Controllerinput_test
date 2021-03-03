package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable{
	private Thread t;
	private boolean running = true;
	
// ======================================== CONSTRUCTOR ========================================
	public Draw() {
		t = new Thread(this);
		t.start();
	}
// ======================================== RUN-METHOD =========================================	
	@Override
	public void run() {
		while (running) {
			super.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
// ======================================== METHODS ============================================
	private void setRenderingHints(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
	}
	
// ======================================== GET/SET METHODS ====================================
	
// ======================================== PAINT-METHODS ======================================
	@Override
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		setRenderingHints(g);
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, 1000, 1000);
		

		
		
	}
	
}














