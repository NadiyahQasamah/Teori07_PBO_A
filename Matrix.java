public class Matrix {
    private Fraction[][] data;

    public Matrix(int rows, int cols) {
        data = new Fraction[rows][cols];
    }

    public void setElement(int row, int col, Fraction value) {
        data[row][col] = value;
    }

    public Fraction getElement(int row, int col) {
        return data[row][col];
    }

    public void printMatrix() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j].getNumerator() + "/" + data[i][j].getDenominator() + " ");
            }
            System.out.println();
        }
    }
}
