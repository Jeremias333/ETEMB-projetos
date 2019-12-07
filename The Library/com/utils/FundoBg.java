package com.utils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FundoBg extends JPanel {  
	
	private static final long serialVersionUID = 1L;
	private BufferedImage img = null;    
    private int x = 0;  
    private int y = 0;  
    
    public FundoBg(String urlImg){
    	
        try {
			this.img =  ImageIO.read(new File(urlImg));
		} catch (IOException e) {
			e.printStackTrace();
		}  
        
    }  
    
    @Override  
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);        
        Graphics gr = (Graphics)g.create();  
        gr.drawImage(img, x, y,this.getWidth(),this.getHeight(),this);  
        gr.dispose();     
    }  
}
