
public class Matrix { // Class name is a noun and starts with a uppercase letter

  int n; // 3.1.3 Class and Interface Declarations, The order is correct for declaring the classs
  int m;

  int[][] matrix;

  // initializes Matrix with n rows and m columns
  public Matrix(int n, int m) {

    this.n = n;
    this.m = m;

    this.matrix = new int[n][m];

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < m; j++) {

        matrix[i][j] = 0;
      }
    }
  }

  public Matrix(int[][] matrix) {

    this.matrix = matrix;
  }

  public boolean isSquare() { // no space is used in between the method name and the parenthesis (code
                              // convention from oracle 6.4), Also the curly bracket appears at the end of the same line as the declaration
    return this.n == this.m;
  } // 6.4 (oracle) closing curly bracket is line by itself and indented to the same level, matches corresponding opening statement

  public Matrix mult(Matrix m) {
    Matrix result = new Matrix(this.m, m.n);

    return result;
  }

  public void edit(int row, int column, int newValue) {

    if (row > this.n || column > this.m)
      return;

    this.matrix[row][column] = newValue;
    return;
  }

  @Override
  public String toString() {
    String string = ""; // the local is declared and initialized at the beginning of the method, but unclear if its google or Oracle coding convention
                        // it is both at the beginning of the method (Oracle) but also at the first usage (Google)

    for (int i = 0; i < this.n; i++) {
      for (int j = 0; j < this.m; j++) {
        if (j == 0)
          string += "[";
        string += this.matrix[i][j] + " ";
        if (j == this.m - 1)
          string += "]\n";
      }
    }

    return string;
  }

  public static void main(String[] args) {
    Matrix matrix1 = new Matrix(3, 3);

    System.out.println(matrix1);
  }
}
