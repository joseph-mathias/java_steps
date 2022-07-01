import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageHandling {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;

        BufferedImage image = null;
        image = readFromFile(width, height, image);
        writeToFile(image);
    }
    
    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
        try {
            File sampleImage = new File("");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(sampleImage);
            System.out.println("Reading Complete " + image);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image){
        try {
            File output = new File("");
            ImageIO.write(image, "jgp", output);
            System.out.println("Write Completed!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
