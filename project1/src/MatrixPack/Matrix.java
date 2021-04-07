package PACK1;
import PACK4.*;
public class Matrix implements Addable{
    public int Rows;
    public int Columns;
    public int[][] A;

    public Matrix(int R, int C) {
        A = new int[R][C];
        Rows = R;
        Columns = C;
    }

    public void Print() {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

    public boolean SetNumbers(int[] array) {
        if (array.length != Rows*Columns)
            return false;
        int index = 0;
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                A[i][j] = array[index];
                index++;
            }
        }
        return true;
    }



    public void Transpose() {
        int[][] transpose = new int[Columns][Rows];
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        int temp = 0;
        temp = Rows;
        Rows = Columns;
        Columns = temp;
        A = transpose;
    }



    @Override
    public void Add(int[][] B) {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                A[i][j] += B[i][j];
            }
        }

    }

}
