package paiza;

import java.util.Scanner;

public class B103 {
  public static void main(String[] args) {

    // 自分の得意な言語で
    // Let's チャレンジ！！
    int count = 0;
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int i = Integer.parseInt(line);
    String[] strPlace = sc.nextLine().split(" ");
    int red = Integer.parseInt(strPlace[0]);
    int green = Integer.parseInt(strPlace[1]);
    int blue = Integer.parseInt(strPlace[2]);
    for (int j = 0; j < i; j++) {
      String[] light = sc.nextLine().split(" ");
      switch (light[1]) {
        case "R":
          red = red + move(light[0]);
          break;
        case "G":
          green = green + move((light[0]));
          break;

        case "B":
          blue = blue + move((light[0]));
          break;

        case "Y":
          red = red + move(light[0]);
          green = green + move((light[0]));
          break;

        case "M":
          red = red + move(light[0]);
          blue = blue + move((light[0]));
          break;

        case "C":
          blue = blue + move((light[0]));
          green = green + move((light[0]));
          break;

        case "W":
          red = red + move(light[0]);
          blue = blue + move((light[0]));
          green = green + move((light[0]));
          break;
      }
      count++;
      if (red == blue && blue == green) {
        System.out.println(red);
        System.exit(0);
      }
    }
    System.out.println("no");
  }

  public static int move(String d) {
    if (d.equals("R")) {
      return 1;
    } else {
      return -1;
    }
  }
}