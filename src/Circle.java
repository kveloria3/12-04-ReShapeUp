import java.lang.Math;

public class Circle
{
  private Point center = new Point();
  private double radius;

  public Circle()
  {
    center.setX(0);
    center.setY(0);
    radius = 0.0;
  }
  public Circle(Point start, Point end)
  {
    center = start;
    radius = start.distance(end);
  }
  public Circle(Point p, double r)
  {
    center = p;
    radius = r;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    double area = Math.PI*(Math.pow(radius, 2));
    return area;
  }
  public double circumference()
  {
    return 2*radius*Math.PI;
  }
  public double diameter()
  {
    return 2*radius;
  }
  public String toString()
  {
    String s = "("+center.getX()+","+center.getY()+"),"+radius;
    return s;
  }
  public void changeRadius(double inc)
  {
    radius+=inc;
  }
  public void translate(int a, int b)
  {
    center.setX(center.getX() + a);
    center.setY(center.getX() + b);
  }
}
      
      
                          
  
  
