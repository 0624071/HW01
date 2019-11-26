abstract class CShap {
  protected String color;

  public void setColor(String str) {
    color = str;
  }

  public abstract void show();
}

class CRectangle extends CShap {
  protected int width, height;

  public CRectangle(int w, int h) {
    width = w;
    height = h;
  }

  public void show() {
    System.out.print("color=" + color + ", ");
    System.out.println("area=" + width * height);
  }
}

class CTriangle extends CShap {
  protected double a, b, c;

  public CTriangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void show() {
    System.out.println("color=" + color);
    System.out.println("area=" + a * b * 0.5);
  }

}
class Main{
  public static void main(String arg[]){
      CTriangle Ctr1 = new CTriangle(3,4,5);
      Ctr1.setColor("Red");
      Ctr1.show();
  }
}
