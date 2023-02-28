
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wallLayer;
    private Square wallLayer2;
    private Square wall2;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Triangle roof2;
    private Circle moon;
    private Circle moon2;
    private Square sky;
    private Square grass;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    private Circle cloud5;
    private Circle cloud6;
    private Square door;
    private Square door2;
    private Square door3;
    private Square door4;
    private Square pot;
    private Circle flower;
    private Circle tree;
    private Triangle trunk;
    private Square carBody;
    private Circle wheel;
    private Triangle carSide;


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-100);
        sky.moveVertical(-200);
        sky.changeSize(400);
        sky.makeVisible();
        
        sky = new Square();
        sky.changeColor("green");
        sky.moveHorizontal(-100);
        sky.moveVertical(150);
        sky.changeSize(600);
        sky.makeVisible();
                
        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(180);
        moon.moveVertical(-30);
        moon.changeSize(60);
        moon.makeVisible();
        
        moon2 = new Circle();
        moon2.changeColor("blue");
        moon2.moveHorizontal(170);
        moon2.moveVertical(-30);
        moon2.changeSize(60);
        moon2.makeVisible();
        
        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveHorizontal(-10);
        cloud1.moveVertical(-20);
        cloud1.changeSize(30);
        cloud1.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(10);
        cloud2.moveVertical(-10);
        cloud2.changeSize(35);
        cloud2.makeVisible();
        
        cloud5 = new Circle();
        cloud5.changeColor("white");
        cloud5.moveHorizontal(35);
        cloud5.moveVertical(-30);
        cloud5.changeSize(20);
        cloud5.makeVisible();
        
        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(10);
        cloud3.moveVertical(-30);
        cloud3.changeSize(35);
        cloud3.makeVisible();
        
        cloud6 = new Circle();
        cloud6.changeColor("white");
        //cloud6.moveHorizontal(40);
        //cloud6.moveVertical();
        cloud6.changeSize(20);
        cloud6.makeVisible();
        
        cloud4 = new Circle();
        cloud4.changeColor("white");
        cloud4.moveHorizontal(40);
        cloud4.moveVertical(-20);
        cloud4.changeSize(30);
        cloud4.makeVisible();
        
        wallLayer = new Square();
        wallLayer.changeColor("black");
        wallLayer.moveVertical(105);
        wallLayer.moveHorizontal(-45);
        wallLayer.changeSize(70);
        wallLayer.makeVisible();
        
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(110);
        wall.moveHorizontal(-40);
        wall.changeSize(60);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(40, 90);
        //roof.moveHorizontal(20);
        roof.moveVertical(100);
        roof.makeVisible();
        
        wallLayer2 = new Square();
        wallLayer2.changeColor("black");
        wallLayer2.moveVertical(55);
        wallLayer2.moveHorizontal(25);
        wallLayer2.changeSize(120);
        wallLayer2.makeVisible();
        
        wall2 = new Square();
        wall2.changeColor("white");
        wall2.moveVertical(60);
        wall2.moveHorizontal(30);
        wall2.changeSize(110);
        wall2.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("black");
        roof2.changeSize(60, 160);
        roof2.moveHorizontal(95);
        roof2.moveVertical(35);
        roof2.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(75);
        door.moveVertical(150);
        door.changeSize(20);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(75);
        door2.moveVertical(130);
        door2.changeSize(20);
        door2.makeVisible();
        
        door3 = new Square();
        door3.changeColor("yellow");
        door3.moveHorizontal(78);
        door3.moveVertical(133);
        door3.changeSize(14);
        door3.makeVisible();
        
        door4 = new Square();
        door4.changeColor("yellow");
        door4.moveHorizontal(78);
        door4.moveVertical(153);
        door4.changeSize(14);
        door4.makeVisible();
        //--------------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(45);
        window.moveVertical(73);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(48); //+3
        window2.moveVertical(76); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(56); //+8
        window2.moveVertical(76);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(48);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(56);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
         //----------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(45);
        window.moveVertical(103);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(48); //+3
        window2.moveVertical(106); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(56); //+8
        window2.moveVertical(106);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(48);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(56);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
        //---------------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(75);
        window.moveVertical(73);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(78); //+3
        window2.moveVertical(76); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(86); //+8
        window2.moveVertical(76);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(78);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(86);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
        //----------------------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(75);
        window.moveVertical(103);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(78); //+3
        window2.moveVertical(106); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(86); //+8
        window2.moveVertical(106);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(78);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(86);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
        //-----------------------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(105);
        window.moveVertical(73);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(108); //+3
        window2.moveVertical(76); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(116); //+8
        window2.moveVertical(76);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(108);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(116);
        window2.moveVertical(84);
        window2.changeSize(5);
        window2.makeVisible();
        //---------------------------
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(105);
        window.moveVertical(103);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(108); //+3
        window2.moveVertical(106); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(116); //+8
        window2.moveVertical(106);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(108);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(116);
        window2.moveVertical(114);
        window2.changeSize(5);
        window2.makeVisible();
        //------------------------------
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-20);
        window.moveVertical(120);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(-17); //+3
        window2.moveVertical(123); // +3
        window2.changeSize(5); // -15
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(-9); //+8
        window2.moveVertical(123);
        window2.changeSize(5);
        window2.makeVisible();
                
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(-17);
        window2.moveVertical(131);
        window2.changeSize(5);
        window2.makeVisible();
             
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(-9);
        window2.moveVertical(131);
        window2.changeSize(5);
        window2.makeVisible();
        
        //-------------------------------
        flower = new Circle();
        flower.changeSize(15);
        flower.changeColor("magenta");
        flower.moveHorizontal(90);
        flower.moveVertical(140);
        flower.makeVisible();
        
        flower = new Circle();
        flower.changeSize(15);
        flower.changeColor("magenta");
        flower.moveHorizontal(80);
        flower.moveVertical(140);
        flower.makeVisible();
        
        pot =  new Square();
        pot.changeColor("black");
        pot.moveHorizontal(38);
        pot.moveVertical(160);
        pot.changeSize(15);
        pot.makeVisible();
        
        pot =  new Square();
        pot.changeColor("black");
        pot.moveHorizontal(52);
        pot.moveVertical(160);
        pot.changeSize(15);
        pot.makeVisible();
        //
        flower = new Circle();
        flower.changeSize(15);
        flower.changeColor("magenta");
        flower.moveHorizontal(154);
        flower.moveVertical(140);
        flower.makeVisible();
        
        flower = new Circle();
        flower.changeSize(15);
        flower.changeColor("magenta");
        flower.moveHorizontal(144);
        flower.moveVertical(140);
        flower.makeVisible();
        
        pot =  new Square();
        pot.changeColor("black");
        pot.moveHorizontal(102);
        pot.moveVertical(160);
        pot.changeSize(15);
        pot.makeVisible();
        
        pot =  new Square();
        pot.changeColor("black");
        pot.moveHorizontal(116);
        pot.moveVertical(160);
        pot.changeSize(15);
        pot.makeVisible();
        //----------------
        tree = new Circle();
        tree.changeSize(30);
        tree.changeColor("magenta");
        tree.moveHorizontal(220);
        tree.moveVertical(90);
        tree.makeVisible();
        
        tree = new Circle();
        tree.changeSize(30);
        tree.changeColor("magenta");
        tree.moveHorizontal(200);
        tree.moveVertical(90);
        tree.makeVisible();
        
        tree = new Circle();
        tree.changeSize(30);
        tree.changeColor("magenta");
        tree.moveHorizontal(240);
        tree.moveVertical(90);
        tree.makeVisible();
        
        tree = new Circle();
        tree.changeSize(30);
        tree.changeColor("magenta");
        tree.moveHorizontal(220);
        tree.moveVertical(70);
        tree.makeVisible();
        
        trunk = new Triangle();
        trunk.changeColor("black");
        trunk.changeSize(60, 10);
        trunk.moveHorizontal(205);
        trunk.moveVertical(140);
        trunk.makeVisible();
        //----------------------------
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(90);
        carBody.moveVertical(210);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(110);
        carBody.moveVertical(210);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(130);
        carBody.moveVertical(210);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(150);
        carBody.moveVertical(210);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        carSide = new Triangle();
        carSide.changeColor("black");
        carSide.changeSize(15, 40);
        carSide.moveHorizontal(118);
        carSide.moveVertical(230);
        carSide.makeVisible();
        
        carSide = new Triangle();
        carSide.changeColor("black");
        carSide.changeSize(15, 40);
        carSide.moveHorizontal(160);
        carSide.moveVertical(230);
        carSide.makeVisible();
        
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(110);
        carBody.moveVertical(195);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        carBody = new Square();
        carBody.changeColor("black");
        carBody.makeVisible();
        carBody.moveHorizontal(130);
        carBody.moveVertical(195);
        carBody.changeSize(20);
        carBody.makeVisible();
        
        wheel = new Circle();
        wheel.changeSize(20);
        wheel.changeColor("yellow");
        wheel.moveHorizontal(140);
        wheel.moveVertical(210);
        wheel.makeVisible();
        
        wheel = new Circle();
        wheel.changeSize(20);
        wheel.changeColor("yellow");
        wheel.moveHorizontal(180);
        wheel.moveVertical(210);
        wheel.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}
