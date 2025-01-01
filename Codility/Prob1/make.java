package Codility.Prob1;

public class make {

  public static int solution(int N) {
    String binary = Integer.toBinaryString(N);
    int maxGap = 0;
    int currentGap = 0;

    for (char bit : binary.toCharArray()) {
      if (bit == '1') {
        maxGap = Math.max(maxGap, currentGap);
        currentGap = 0;
      } else {
        currentGap++;
      }
    }

    return maxGap;
  }

  public static void main(String[] args) {
    int result = solution(2019); // Call the solution method
    System.out.println("Binary gap for 2019: " + result); // Print the result
  }
}
