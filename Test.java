import java.awt.Graphics;
import java.awt.Color;

public class Test extends EzJPanel{
    private Color color = new Color(30, 130, 20);

    public static void main(String ags[]){
        Test t = new Test();
    }

    @Override
    protected void setup(){
        stopLooping();
        rename("Test");
    }

    public Test(int width, int height, String title){
        super(width, height, title);
    }
    public Test(){
        super();
    }

    @Override
    protected void draw(Graphics g){

        g.setColor(color);
        g.fillRect(25, 25, 100, 100);
    }

}
