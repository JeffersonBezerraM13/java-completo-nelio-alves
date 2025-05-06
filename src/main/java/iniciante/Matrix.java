package iniciante;

import java.util.Scanner;

public class Matrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //3
        int n = sc.nextInt(); //4
        int [][] mat = new int[m][n];
        for(int i=0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int number = sc.nextInt();
        for(int i=0;i<mat.length;i++){ //3
            for(int j = 0;j<mat[i].length;j++){ //4
                if(mat[i][j] == number){ // i = 0 e j = 1
                    System.out.printf("Position %d,%d:%n",i,j);
                    if(j > 0){
                        System.out.printf("Left: %d%n",mat[i][j-1]);
                    }
                    if(j < mat[i].length-1){
                        System.out.printf("Right: %d%n",mat[i][j+1]);
                    }
                    if(i > 0){
                        System.out.printf("Up: %d%n",mat[i-1][j]);
                    }
                    if(i < mat.length-1){
                        System.out.printf("Down: %d%n",mat[i+1][j]);
                    }
                }
            }
        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][] mat = new int[n][n];
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat[i].length;j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//        sc.close();
    }

}
