import java.util.*;
 public class Circle
{
double radius;
double area();
{
return 3.142*r*r;
}
}
public class ClassDemo
{
public static void main(String args[])
{
Circle c1=new Circle();
c1.radius=10;
double area=c1.area();
System.out.println("the area of circle is",+area);
}
}