package CutPicture;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ScreeSave {	
	public ScreeSave() {
		
		
	}
	static void save(String path) throws Exception {
	Robot robot = new Robot();
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect = new Rectangle(0, 0, d.width, d.height);
	BufferedImage image = robot.createScreenCapture(rect);
	ImageIO.write(image, "jpg", new File(path));

	}
	public static void main(String[] args) {
		try{
			ScreeSave.save("C:\\screecapture.jpg");
			}catch(Exception e){
			e.printStackTrace();
			}

	}

}
