// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  
  public Rectangle()
  {
    origin = new Point();
    width = 0;
    height = 0;
  }
  public Rectangle(Point bl, Point tr)
  {
    origin = bl;
    height = tr.getY()-origin.getY();
    width = tr.getX()-origin.getX();
  }
  public Rectangle(Point botLef, int wid, int hei)
  {
    origin = botLef;
    width = wid;
    height = hei;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point topRight = new Point();
    topRight.setX(origin.getX() + width);
    topRight.setY(origin.getY() + height);
    return topRight;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return origin.distance(this.getTopRight());
  }
  public int perimeter()
  {
    return 2*height  + 2*width;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public String toString()
  {
    String s = "[("+origin.getX()+","+origin.getY()+"),("+this.getTopRight().getX()+","+this.getTopRight().getY()+")]";
    return s;
  }
  public void translate(int dx, int dy)
  {
    this.getTopRight().translate(dx, dy);
  }
  public void scale(int dx, int dy)
  {
    width += dx;
    height += dy;
  }
}
