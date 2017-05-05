import java.util.Scanner;
class LagrangeInterpolation {
  int size;
  double[] x, y;
  double val_x;
  public LagrangeInterpolation() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter size: ");
    size = scan.nextInt();
    x = new double[size];
    y = new double[size];
    for (int i = 0; i < size; i++) {
      System.out.print("x" + i + ": ");
      x[i] = scan.nextDouble();
      System.out.print("y" + i + ": ");
      y[i] = scan.nextDouble();
    }
    System.out.print("Enter value of x: ");
    val_x = scan.nextDouble();
  }
  public void processLagrange() {
    double sum = 0, tempu, templ;
    for (int i = 0; i < size; i++) {
      tempu = templ = 1;
      for (int j = 0; j < size; j++) {
        if (j != i) {
          tempu = tempu * (val_x - x[j]);
          templ = templ * (x[i] - x[j]);
        }
      }
      sum = sum + ((tempu / templ) * y[i]);
    }
    System.out.print("Value of y for given x: " + sum);
  }
}
class Lagrange {
  public static void main(String[] args) {
    LagrangeInterpolation li = new LagrangeInterpolation();
    li.processLagrange();
  }
}
