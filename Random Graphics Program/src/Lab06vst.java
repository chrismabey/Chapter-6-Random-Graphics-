/* Chirs Mabey
 * Mr. Kiedes
 * Chapter 6 Lab
 * 8 October 2015
 */
import java.awt.*;
import java.applet.*;
import java.util.*; 
																
public class Lab06vst extends Applet
{
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
			
		// Draw Random Lines
		for(int k = 1; k <= 500; k++){
			int x1 = (int)(Math.random()*390+10);
			int x2 = (int)(Math.random()*390+10);
			int y1 = (int)(Math.random()*290+10);
			int y2 = (int)(Math.random()*290+10);
			int red =(int)(Math.random()*256);
			int green =(int)(Math.random()*256);
			int blue =(int)(Math.random()*256);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x1, y1, x2, y2);	
		
		}
		// Draw Random Squares
		for(int k = 1; k <= 100; k++){
			int x1 = (int)(Math.random()*390 + 410);
			int y1 = (int)(Math.random()*290 + 10);
			int red =(int)(Math.random()*256);
			int green =(int)(Math.random()*256);
			int blue =(int)(Math.random()*256);
			if((x1 + 50 <= 800) && (x1+50) >= 400 && (y1 + 50) <= 300 && (y1+50) >= 0){
			g.setColor(new Color(red,green,blue));
			g.fillRect(x1, y1, 50, 50);	
			}
		}
		// Draw Random Circles
		
		for(int k = 1; k <= 200; k++){
			int x1 = (int)(Math.random()*400 + 10);
			int x2 = (int)(Math.random()*200);
			int y1 = (int)(Math.random()*300+300);
			int red =(int)(Math.random()*256);
			int green =(int)(Math.random()*256);
			int blue =(int)(Math.random()*256);
			if((x1+x2) <= 400 && (y1+x2) <= 590){
			g.setColor(new Color(red,green,blue));
			g.drawOval(x1, y1, x2, x2);	
			}
		}
		
		
		// Draw 3-D Box
		g.setColor(Color.red);
		g.fillRect(580,430,100,100);
		
		// green portion of cube
		g.setColor(Color.green);
		Polygon green = new Polygon();
		green.addPoint(540,380);
		green.addPoint(580,430);
		green.addPoint(580,530);
		green.addPoint(540,480);
		g.fillPolygon(green);
		
		//yellow portion of cube
		g.setColor(Color.yellow);
		Polygon yellow = new Polygon();
		yellow.addPoint(540,380);
		yellow.addPoint(640,380);
		yellow.addPoint(680,430);
		yellow.addPoint(580,430);
		g.fillPolygon(yellow);
		
		//blue portion of cube
		g.setColor(Color.blue);
		Polygon blue = new Polygon();
		 blue.addPoint(640,380);
		 blue.addPoint(680,430);
		 blue.addPoint(640,430);
		 blue.addPoint(640,380);
		g.fillPolygon( blue);


	}
}
