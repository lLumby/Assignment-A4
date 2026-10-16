
public class Matrix {

  int rows;
  int columns;

  int[][] matrix;

  // initializes Matrix with n rows and m columns
  public Matrix(int rows, int columns) {

    this.rows = rows;
    this.columns = columns;

    this.matrix = new int[rows][columns];

    for (int i = 0; i < rows; i++) {

      for (int j = 0; j < columns; j++) {

        matrix[i][j] = 0;
      }
    }
  }

  public Matrix(int[][] matrix) {
    this.matrix = matrix;
  }

  public boolean isSquare() {
    return this.rows == this.columns;
  }

  public Matrix multiply(Matrix m) {
    Matrix result = new Matrix(this.columns, m.rows);

    return result;
  }

  public void edit(int row, int column, int newValue) {

    if (row > this.rows || column > this.columns) {
      return;
    }

    this.matrix[row][column] = newValue;
  }

  @Override
  public String toString() {

    String string = "";

    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.columns; j++) {
        if (j == 0) {
          string += "[";
        }
        string += this.matrix[i][j] + " ";
        if (j == this.columns - 1) {
          string += "]\n";
        }
      }
    }

    return string;
  }

  public static void main(String[] args) {
    Matrix matrix1 = new Matrix(3, 3);

    System.out.println(matrix1);
  }
}
