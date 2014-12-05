// A Line object represents a line defined by a pair of Points.
import java.lang.Math;

public class Line
{
  private Point start;
  private Point end;
  
  public Line()
  {
    start = new Point();
    end = new Point();
  }
  public Line(Point x, Point y)
  {
    start = x;
    end = y;
  }
  public double length()
  {
    double dis=Math.sqrt(Math.pow(start.getX()-end.getX(),2)+Math.pow(start.getY()-end.getY(),2));
    return dis;
  }
  public double slope()
  {
    double slope=(start.getY()-end.getY())/(start.getX()-end.getX());
    return slope;
  }
  public String toString()
  {
    String s="("+start.getX()+","+start.getY()+"),("+end.getX()+","+end.getY()+")";
    return s;
  }
  public void translate(int a, int b)
  {
    start.translate(a, b);
    end.translate(a, b);
  }
}
  
