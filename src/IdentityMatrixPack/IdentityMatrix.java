package IdentityMatrixPack;
import MatrixPack.*;
public class IdentityMatrix extends Matrix{
    public IdentityMatrix(int R) {
        super(R, R);
    }

    @Override
    public boolean SetNumbers(int[] array) {
        if (array.length != Rows * Columns)
            return false;
        int index = 0;

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                A[i][j] = array[index];
                index++;
            }
        }
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                if (A[i][i] != 1)
                    return false;
            }
        }
        return true;
    }

    @Override
    public void Transpose() {
        super.Transpose();
    }

    @Override
    public void Print() {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

}
