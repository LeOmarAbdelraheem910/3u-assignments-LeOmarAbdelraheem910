package Assignment_8;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import javax.swing.Timer;

/**
 *
 * @author abdeo8431
 */
public class MakingAnAnimatedFace extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1350;
    static final int HEIGHT = 750;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    

    // YOUR GAME VARIABLES WOULD GO HERE
    BasicStroke thickerLine = new BasicStroke(10);
    BasicStroke slightlyThickerLine = new BasicStroke(5);
    BasicStroke evenSlighterThickerLine = new BasicStroke(2);
    Color blackCat = new Color(30, 30, 30);
    Color softGreen = new Color(76, 234, 58);
    Color aPurple = new Color(134, 100, 186);
    Color fishyOrange = new Color(209, 112, 8);
    Color skyBlueBackground = new Color(77, 139, 193);
    Color inspiringYellow = new Color(255, 248, 53);
    
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MakingAnAnimatedFace() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        AffineTransform old = g2d.getTransform();
        
        g.setColor(skyBlueBackground);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.setColor(softGreen);
        g.fillArc(860, 420, 440, 205, 250, 180);
        g.setColor(skyBlueBackground);
        g.fillArc(958, 460, 300, 125, 250, 184);
        g.setColor(softGreen);
        g.fillArc(200, 350, 950, 100, 0, 360);
        g.fillArc(200, 295, 951, 250, 180, 180);
        g.fillArc(200, 120, 950, 575, 180, 180);
        g.fillArc(425, 585, 500, 145, 180, 180);
        
        g.setColor(aPurple);
        g.fillArc(250, 375, 850, 75, 0, 360);
        g.fillArc(211, 196, 927, 500, 180, 180);

        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawArc(250, 375, 850, 75, 0, 360);
        g.drawArc(200, 350, 950, 100, 0, 180);
       
        g.setColor(blackCat);
        g.fillOval(425, 150, 500, 350);
        
        g2d.rotate(50, 645, 350);
        int[] triangleX = {445, 520, 574, 695};
        int[] triangleY = {350, 47, 32, 250};
        g.fillPolygon(triangleX, triangleY, 4);
        
        g.fillArc(518, 10, 60, 100, 0, 180);
        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawArc(518, 10, 60, 61, 6, 180);
        g.drawLine(480, 200, 517, 44);
        g.drawLine(632, 150, 577, 32);
        g2d.setTransform(old);

        g.setColor(blackCat);
        g2d.rotate(6.5, 680, 250);
        int[] triangleX1 = {680, 801, 864, 930};
        int[] triangleY1 = {250, 32, 47, 350};  
        g.fillPolygon(triangleX1, triangleY1, 4);
        
        g.fillArc(804, 10, 60, 100, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(804, 10, 60, 61, -6, 180);
        g.drawLine(747, 140, 804, 32);
        g.drawLine(895, 200, 865, 43);
        g2d.setTransform(old);

        g.setColor(Color.BLACK);
        g.drawOval(425, 150, 500, 350);

        g.setColor(Color.CYAN);
        g.fillOval(540, 250, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(760, 250, 50, 50);
        
        g.setColor(Color.BLACK);
        int[] triangleX2 = {645, 640, 664, 687, 710, 706};
        int[] triangleY2 = {291, 314, 334, 334, 314, 291};  
        g.fillPolygon(triangleX2, triangleY2, 6);
        
        g.fillArc(633, 290, 25, 25, 90, 180);
        g.fillArc(693, 290, 25, 25, 270, 180);
        g.fillArc(662, 314, 27, 25, 180, 180);

        g.drawArc(675, 308, 80, 50, 180, 180);
        g.drawArc(595, 308, 80, 50, 180, 180);
        
        g.setColor(softGreen);
        g.fillArc(218, 354, 915, 185, 180, 180);
        
        g.setColor(Color.BLACK);
        g.drawArc(250, 375, 850, 75, 0, -234);
        g.drawArc(200, 122, 950, 575, 180, 180);
        g.drawArc(425, 585, 500, 145, 180, 180);
        g.drawArc(860, 420, 440, 205, 250, 180);
        g.drawArc(958, 460, 300, 125, 250, 184);
        g.drawArc(200, 295, 951, 250, 180, 180);
        
        g.setColor(blackCat);
        g.fillOval(425, 400, 200, 100);
        g.fillOval(725, 400, 200, 100);
        
        g.setColor(Color.BLACK);
        g.drawOval(425, 400, 200, 100);
        g.drawOval(725, 400, 200, 100);
        
        g2d.rotate(-0.1, 700, 600);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(800, 620, 835, 607);
        g.drawLine(800, 620, 835, 633);
        g.drawLine(845, 610, 845, 630);
        g.drawArc(835, 605, 10, 10, 0, 95);
        g.drawArc(835, 625, 10, 10, 180, 270);
        g.drawOval(700, 600, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(700, 600, 120, 40);
        int[] pentX = {800, 835, 845, 845, 835};
        int[] pentY = {620, 607, 610, 630, 633};
        g.fillPolygon(pentX, pentY, 5);
        g.fillArc(835, 605, 10, 10, 0, 180);
        g.fillArc(835, 625, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(720, 615, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(735, 600, 10, 40, 270, 180);
        g2d.setTransform(old);
        
        g2d.rotate(-0.3, 995, 550);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(995, 570, 1030, 557);
        g.drawLine(995, 570, 1030, 583);
        g.drawLine(1040, 560, 1040, 580);
        g.drawArc(1030, 555, 10, 10, 0, 95);
        g.drawArc(1030, 575, 10, 10, 180, 270);
        g.drawOval(895, 550, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(895, 550, 120, 40);
        int[] pentX2 = {995, 1030, 1040, 1040, 1030};
        int[] pentY2 = {570, 557, 560, 580, 583};
        g.fillPolygon(pentX2, pentY2, 5);
        g.fillArc(1030, 555, 10, 10, 0, 180);
        g.fillArc(1030, 575, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(915, 565, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(930, 550, 10, 40, 270, 180);
        g2d.setTransform(old);

        g2d.rotate(0.1, 650, 600);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(550, 620, 515, 607);
        g.drawLine(550, 620, 515, 633);
        g.drawLine(505, 610, 505, 630);
        g.drawArc(505, 605, 10, 10, 0, 145);
        g.drawArc(505, 625, 10, 10, 180, 270);
        g.drawOval(530, 600, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(530, 600, 120, 40);
        int[] pentX3 = {550, 515, 505, 505, 515};
        int[] pentY3 = {620, 607, 610, 630, 633};
        g.fillPolygon(pentX3, pentY3, 5);
        g.fillArc(505, 605, 10, 10, 0, 180);
        g.fillArc(505, 625, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(630, 615, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(610, 600, 10, 40, 90, 180);
        g2d.setTransform(old);

        g2d.rotate(0.3, 455, 580);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(355, 600, 320, 587);
        g.drawLine(355, 600, 320, 613);
        g.drawLine(310, 590, 310, 610);
        g.drawArc(310, 585, 10, 10, 0, 145);
        g.drawArc(310, 605, 10, 10, 180, 270);
        g.drawOval(335, 580, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(335, 580, 120, 40);
        int[] pentX4 = {355, 320, 310, 310, 320};
        int[] pentY4 = {600, 587, 590, 610, 613};
        g.fillPolygon(pentX4, pentY4, 5);
        g.fillArc(310, 585, 10, 10, 0, 180);
        g.fillArc(310, 605, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(435, 595, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(415, 580, 10, 40, 90, 180);
        g2d.setTransform(old);
        
        g.setColor(inspiringYellow);
        int[] starX = {100, 89, 50, 82, 69, 100, 131, 117, 150, 111};
        int[] starY = {25, 65, 65, 86, 120, 99, 120, 86, 65, 65};
        g.fillPolygon(starX, starY, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(100, 25, 89, 65);
        g.drawLine(89, 65, 50, 65);
        g.drawLine(50, 65, 82, 86);
        g.drawLine(82, 86, 69, 120);
        g.drawLine(69, 120, 100, 99);
        g.drawLine(100, 99, 131, 120);
        g.drawLine(131, 120, 117, 86);
        g.drawLine(117, 86, 150, 65);
        g.drawLine(150, 65, 111, 65);
        g.drawLine(111, 65, 100, 25);
        
        g.setColor(inspiringYellow);
        int[] starXX = {300, 289, 250, 282, 269, 300, 331, 317, 350, 311};
        int[] starYY = {25, 65, 65, 86, 120, 99, 120, 86, 65, 65};
        g.fillPolygon(starXX, starYY, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(300, 25, 289, 65);
        g.drawLine(289, 65, 250, 65);
        g.drawLine(250, 65, 282, 86);
        g.drawLine(282, 86, 269, 120);
        g.drawLine(269, 120, 300, 99);
        g.drawLine(300, 99, 331, 120);
        g.drawLine(331, 120, 317, 86);
        g.drawLine(317, 86, 350, 65);
        g.drawLine(350, 65, 311, 65);
        g.drawLine(311, 65, 300, 25);
        
        g.setColor(inspiringYellow);
        int[] starX2 = {100, 89, 50, 82, 69, 100, 131, 117, 150, 111};
        int[] starY2 = {225, 265, 265, 286, 320, 299, 320, 286, 265, 265};
        g.fillPolygon(starX2, starY2, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(100, 225, 89, 265);
        g.drawLine(89, 265, 50, 265);
        g.drawLine(50, 265, 82, 286);
        g.drawLine(82, 286, 69, 320);
        g.drawLine(69, 320, 100, 299);
        g.drawLine(100, 299, 131, 320);
        g.drawLine(131, 320, 117, 286);
        g.drawLine(117, 286, 150, 265);
        g.drawLine(150, 265, 111, 265);
        g.drawLine(111, 265, 100, 225);
        
        g.setColor(inspiringYellow);
        int[] starX22 = {300, 289, 250, 282, 269, 300, 331, 317, 350, 311};
        int[] starY22 = {225, 265, 265, 286, 320, 299, 320, 286, 265, 265};
        g.fillPolygon(starX22, starY22, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(300, 225, 289, 265);
        g.drawLine(289, 265, 250, 265);
        g.drawLine(250, 265, 282, 286);
        g.drawLine(282, 286, 269, 320);
        g.drawLine(269, 320, 300, 299);
        g.drawLine(300, 299, 331, 320);
        g.drawLine(331, 320, 317, 286);
        g.drawLine(317, 286, 350, 265);
        g.drawLine(350, 265, 311, 265);
        g.drawLine(311, 265, 300, 225);

        g.setColor(inspiringYellow);
        int[] starX3 = {100, 89, 50, 82, 69, 100, 131, 117, 150, 111};
        int[] starY3 = {425, 465, 465, 486, 520, 499, 520, 486, 465, 465};
        g.fillPolygon(starX3, starY3, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(100, 425, 89, 465);
        g.drawLine(89, 465, 50, 465);
        g.drawLine(50, 465, 82, 486);
        g.drawLine(82, 486, 69, 520);
        g.drawLine(69, 520, 100, 499);
        g.drawLine(100, 499, 131, 520);
        g.drawLine(131, 520, 117, 486);
        g.drawLine(117, 486, 150, 465);
        g.drawLine(150, 465, 111, 465);
        g.drawLine(111, 465, 100, 425);
        
        g.setColor(inspiringYellow);
        int[] starX4 = {100, 89, 50, 82, 69, 100, 131, 117, 150, 111};
        int[] starY4 = {625, 665, 665, 686, 720, 699, 720, 686, 665, 665};
        g.fillPolygon(starX4, starY4, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(100, 625, 89, 665);
        g.drawLine(89, 665, 50, 665);
        g.drawLine(50, 665, 82, 686);
        g.drawLine(82, 686, 69, 720);
        g.drawLine(69, 720, 100, 699);
        g.drawLine(100, 699, 131, 720);
        g.drawLine(131, 720, 117, 686);
        g.drawLine(117, 686, 150, 665);
        g.drawLine(150, 665, 111, 665);
        g.drawLine(111, 665, 100, 625);
        
        g.setColor(inspiringYellow);
        int[] starX44 = {300, 289, 250, 282, 269, 300, 331, 317, 350, 311};
        int[] starY44 = {625, 665, 665, 686, 720, 699, 720, 686, 665, 665};
        g.fillPolygon(starX44, starY44, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(300, 625, 289, 665);
        g.drawLine(289, 665, 250, 665);
        g.drawLine(250, 665, 282, 686);
        g.drawLine(282, 686, 269, 720);
        g.drawLine(269, 720, 300, 699);
        g.drawLine(300, 699, 331, 720);
        g.drawLine(331, 720, 317, 686);
        g.drawLine(317, 686, 350, 665);
        g.drawLine(350, 665, 311, 665);
        g.drawLine(311, 665, 300, 625);
        
        g.setColor(inspiringYellow);
        int[] starX5 = {675, 664, 625, 657, 644, 675, 706, 692, 725, 686};
        int[] starY5 = {25, 65, 65, 86, 120, 99, 120, 86, 65, 65};
        g.fillPolygon(starX5, starY5, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(675, 25, 664, 65);
        g.drawLine(664, 65, 625, 65);
        g.drawLine(625, 65, 657, 86);
        g.drawLine(657, 86, 644, 120);
        g.drawLine(644, 120, 675, 99);
        g.drawLine(675, 99, 706, 120);
        g.drawLine(706, 120, 692, 86);
        g.drawLine(692, 86, 725, 65);
        g.drawLine(725, 65, 686, 65);
        g.drawLine(686, 65, 675, 25);

        g.setColor(inspiringYellow);
        int[] starX6 = {1250, 1239, 1200, 1232, 1219, 1250, 1281, 1267, 1300, 1261};
        int[] starY6 = {25, 65, 65, 86, 120, 99, 120, 86, 65, 65};
        g.fillPolygon(starX6, starY6, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1250, 25, 1239, 65);
        g.drawLine(1239, 65, 1200, 65);
        g.drawLine(1200, 65, 1232, 86);
        g.drawLine(1232, 86, 1219, 120);
        g.drawLine(1219, 120, 1250, 99);
        g.drawLine(1250, 99, 1281, 120);
        g.drawLine(1281, 120, 1267, 86);
        g.drawLine(1267, 86, 1300, 65);
        g.drawLine(1300, 65, 1261, 65);
        g.drawLine(1261, 65, 1250, 25);
        
        g.setColor(inspiringYellow);
        int[] starX66 = {1050, 1039, 1000, 1032, 1019, 1050, 1081, 1067, 1100, 1061};
        int[] starY66 = {25, 65, 65, 86, 120, 99, 120, 86, 65, 65};
        g.fillPolygon(starX66, starY66, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1050, 25, 1039, 65);
        g.drawLine(1039, 65, 1000, 65);
        g.drawLine(1000, 65, 1032, 86);
        g.drawLine(1032, 86, 1019, 120);
        g.drawLine(1019, 120, 1050, 99);
        g.drawLine(1050, 99, 1081, 120);
        g.drawLine(1081, 120, 1067, 86);
        g.drawLine(1067, 86, 1100, 65);
        g.drawLine(1100, 65, 1061, 65);
        g.drawLine(1061, 65, 1050, 25);
        
        g.setColor(inspiringYellow);
        int[] starX7 = {1250, 1239, 1200, 1232, 1219, 1250, 1281, 1267, 1300, 1261};
        int[] starY7 = {225, 265, 265, 286, 320, 299, 320, 286, 265, 265};
        g.fillPolygon(starX7, starY7, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1250, 225, 1239, 265);
        g.drawLine(1239, 265, 1200, 265);
        g.drawLine(1200, 265, 1232, 286);
        g.drawLine(1232, 286, 1219, 320);
        g.drawLine(1219, 320, 1250, 299);
        g.drawLine(1250, 299, 1281, 320);
        g.drawLine(1281, 320, 1267, 286);
        g.drawLine(1267, 286, 1300, 265);
        g.drawLine(1300, 265, 1261, 265);
        g.drawLine(1261, 265, 1250, 225);
        
        g.setColor(inspiringYellow);
        int[] starX77 = {1050, 1039, 1000, 1032, 1019, 1050, 1081, 1067, 1100, 1061};
        int[] starY77 = {225, 265, 265, 286, 320, 299, 320, 286, 265, 265};
        g.fillPolygon(starX77, starY77, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1050, 225, 1039, 265);
        g.drawLine(1039, 265, 1000, 265);
        g.drawLine(1000, 265, 1032, 286);
        g.drawLine(1032, 286, 1019, 320);
        g.drawLine(1019, 320, 1050, 299);
        g.drawLine(1050, 299, 1081, 320);
        g.drawLine(1081, 320, 1067, 286);
        g.drawLine(1067, 286, 1100, 265);
        g.drawLine(1100, 265, 1061, 265);
        g.drawLine(1061, 265, 1050, 225);
        
        g.setColor(inspiringYellow);
        int[] starX8 = {1250, 1239, 1200, 1232, 1219, 1250, 1281, 1267, 1300, 1261};
        int[] starY8 = {625, 665, 665, 686, 720, 699, 720, 686, 665, 665};
        g.fillPolygon(starX8, starY8, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1250, 625, 1239, 665);
        g.drawLine(1239, 665, 1200, 665);
        g.drawLine(1200, 665, 1232, 686);
        g.drawLine(1232, 686, 1219, 720);
        g.drawLine(1219, 720, 1250, 699);
        g.drawLine(1250, 699, 1281, 720);
        g.drawLine(1281, 720, 1267, 686);
        g.drawLine(1267, 686, 1300, 665);
        g.drawLine(1300, 665, 1261, 665);
        g.drawLine(1261, 665, 1250, 625);
        
        g.setColor(inspiringYellow);
        int[] starX9 = {1050, 1039, 1000, 1032, 1019, 1050, 1081, 1067, 1100, 1061};
        int[] starY9 = {625, 665, 665, 686, 720, 699, 720, 686, 665, 665};
        g.fillPolygon(starX9, starY9, 10);
        
        g.setColor(Color.BLACK);
        g.drawLine(1050, 625, 1039, 665);
        g.drawLine(1039, 665, 1000, 665);
        g.drawLine(1000, 665, 1032, 686);
        g.drawLine(1032, 686, 1019, 720);
        g.drawLine(1019, 720, 1050, 699);
        g.drawLine(1050, 699, 1081, 720);
        g.drawLine(1081, 720, 1067, 686);
        g.drawLine(1067, 686, 1100, 665);
        g.drawLine(1100, 665, 1061, 665);
        g.drawLine(1061, 665, 1050, 625);
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }
    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        MakingAnAnimatedFace game = new MakingAnAnimatedFace();
    }
}
