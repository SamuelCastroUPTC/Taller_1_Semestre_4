package co.edu.uptc.view.main.mainPanels.PanelsMainBody;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelImageBody extends JPanel {

    private Image image;

    public PanelImageBody() {
        loadImage();
    }

    private void loadImage() {
        String imagePath = ConfigGlobalView.IMAGE_PATH;
        ImageIcon imageIcon = new ImageIcon(imagePath);
        image = imageIcon.getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int[] dimensions = calculateImageDimensions();
            drawCenteredImage(g, dimensions[0], dimensions[1]);
        }
    }

    private int[] calculateImageDimensions() {
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        double imageAspect = (double) image.getWidth(this) / image.getHeight(this);
        double panelAspect = (double) panelWidth / panelHeight;
        int newWidth, newHeight;
        if (panelAspect > imageAspect) {
            newHeight = panelHeight;
            newWidth = (int) (panelHeight * imageAspect * 1.1);
        } else {
            newWidth = panelWidth;
            newHeight = (int) (panelWidth / imageAspect * 1.1);
        }
        return new int[]{newWidth, newHeight};
    }

    private void drawCenteredImage(Graphics g, int newWidth, int newHeight) {
        int x = (getWidth() - newWidth) / 2;
        int y = (getHeight() - newHeight) / 2;
        g.drawImage(image, x, y, newWidth, newHeight, this);
    }
    
}
