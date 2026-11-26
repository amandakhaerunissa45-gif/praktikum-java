import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class DrawShapes extends Applet {
    Font font;
    Color darkGray;
    Color lightGray;
    Color backgroundColor;

    public void init() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGray = Color.DARK_GRAY;
        lightGray = Color.LIGHT_GRAY;
        backgroundColor = Color.WHITE;
        setBackground(backgroundColor);
    }

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.setColor(Color.BLACK);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(darkGray);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(lightGray);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.GRAY);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }
}
