package co.edu.uptc.view.mainPanels.PanelsMainBody;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import co.edu.uptc.globals.ConfigGlobalView;

public class PanelImageBody extends JPanel {

    private Image image;

    public PanelImageBody() {
        initPanel();
        loadImage();
    }

    private void initPanel() {
        // Configuración inicial del panel si es necesario
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
            int x = (panelWidth - newWidth) / 2;
            int y = (panelHeight - newHeight) / 2;
            g.drawImage(image, x, y, newWidth, newHeight, this);
        }
    }
}
