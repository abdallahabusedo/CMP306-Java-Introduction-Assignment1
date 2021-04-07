package PACK2;

import PACK1.Matrix;
import PACK3.IdentityMatrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Matrix");
        Matrix M = new Matrix(2, 3);
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean good = M.SetNumbers(arr);
        M.Print();
        System.out.println("Transposed Matrix");
        M.Transpose();
        M.Print();
        System.out.println("Added Matrix");
        Matrix X = new Matrix(3, 2);
        int[] data = { 1, 2, 3, 4, 5, 6 };
        boolean goodData = X.SetNumbers(data);
        if (goodData) {
            M.Add(X.A);
            M.Print();
        }
        System.out.println("Identity Matrix");
        IdentityMatrix NW = new IdentityMatrix(3);
        int[] NWData = { 1, 0, 0, 0, 1, 0, 0, 0, 1 };
        boolean NWGood = NW.SetNumbers(NWData);
        System.out.println(NWGood);
        if (NWGood) {
            NW.Print();
        }
        System.out.println("Identity Matrix transpose");
        NW.Transpose();
        NW.Print();

    }

}