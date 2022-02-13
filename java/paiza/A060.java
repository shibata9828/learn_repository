package paiza;

import java.util.Scanner;

public class A060 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int row = Integer.parseInt(line.split(" ")[0]);
    int height = Integer.parseInt(line.split(" ")[1]);
    int[] rowHeight = new int[2];
    String[][][] placeFlag = new String[rowHeight[0]][rowHeight[1]][1];
    for(int  j = 0; j < height; j++){
      for (int i = 0; i < row; i++) {
        line = sc.nextLine();
        String[] tmp = line.split(" ");
        for (int k = 0; k < height; k++) {
          placeFlag[i][k][0] = tmp[i];
        }
      }
  }

  

    System.out.println(placeFlag[0][0][0]);
  }
}
