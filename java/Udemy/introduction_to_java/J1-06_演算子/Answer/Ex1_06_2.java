class Ex1_06_2 {
  public static void main(String[] args) {
    boolean answer1 = 5 == 3 + 2;
    System.out.println(answer1);

    boolean answer2 = 5 >= 3 + 2;
    System.out.println(answer2);

    boolean answer3 = 5 >= 3 + 2 && 10 % 3 != 1;
    System.out.println(answer3);

    boolean answer4 = (5 >= 3 + 2 || 2 + 8 != 9) && (6 == 2 + 4);
    System.out.println(answer4);
  }
}