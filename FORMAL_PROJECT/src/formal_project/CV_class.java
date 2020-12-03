

package formal_project;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CV_class {
    
    public void changeText(String element,JLabel lbl){
        
        switch(element){
            case "empLine1":
                
            
        }
        
    }

    public Color color(String val) {
        
        if("red".equals(val)){
            return Color.RED;
        }else if("blue".equals(val)){
            return Color.BLUE;
        }
        else if("black".equals(val)){
            return Color.BLACK;
        }
        else if("orange".equals(val)){
            return Color.ORANGE;
        }
        else if("white".equals(val)){
            return Color.WHITE;
        }else if("yellow".equals(val)){
            return Color.YELLOW;
        }
        
        return null;
        
    }

    void changeColorPanel(JPanel panel, Color col) {
        panel.setBackground(col);
        
    }

    void changeColor(JPanel emp_panel, Color c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeColorText(JLabel label, Color c) {
        label.setForeground(c);
    }

    void changeText(JLabel label, String val) {
        label.setText(val);
    }

    void changeImage(JLabel label, String src) {
        try {
            BufferedImage img = ImageIO.read(new File(src));
            Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(dimg);
            label.setIcon(imgIcon);
        } catch (IOException ex) {
            System.out.println("error is " + ex);
        }
    }
}
