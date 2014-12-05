import java.lang.Math;

public class Point
{
  private int x;
  private int y;
  
  public  int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    double dis=Math.sqrt((x*x)+(y*y));
    return dis;
  }
  public double distance(Point m)
  {
    double dis=Math.sqrt(Math.pow(x-m.getX(),2)+Math.pow(y-m.getY(),2));
    return dis;
  }
  public String toString()
  {
    String s="("+x+","+y+")";
    return s;
  }
  public void setX(int k)
  {
    x=k;
  }
  public void setY(int m)
  {
    y=m;
  }
  public void translate(int dx, int dy)
  {
    x+=dx;
    y+=dy;
  }
  public Point()
  {
    x=0;
    y=0;
  }
  public Point(int newX, int newY)
  {
    x=newX;
    y=newY;
  }
}

  
  
