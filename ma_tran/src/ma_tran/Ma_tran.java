/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma_tran;

/**
 *
 * @author dangngoccuong
 */
public class Ma_tran {

    /**
     * @param args the command line arguments
     */
    
        // Dinh thuc
    public void DinhThuc(int A[][], int n) {
        int temp = 1;
        while (temp < n) {
            for (int j = 0; j < temp; j++) {      //so phan tu duoc dua ve 0
                for (int k = n - 1; k >= 0; k--) {
                    A[temp][k] = A[temp][k] - ((A[temp][j] * A[j][k]) / A[j][j]); //đoạn xử lí 
                }
            }
            temp++;
        }
        int det = 1;
        for (int i = 0; i < n; i++) {
            det *= A[i][i];
        }

        System.out.println("Gia tri dinh thuc:" + det);
    }
    
}


