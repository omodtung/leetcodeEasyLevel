public class Problem122 {
// 7, 1, 5, 3, 6, 4
// kho qua de do di
  public int maxProfit(int[] prices) {
    int profit = 0;
    int profit_second = 0;
    int j_flag = 0;
    int i_flag = 0;

    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length - 1; j++) {
        if (prices[j] > prices[i]) {
          profit = Math.max(profit, prices[j] - prices[i]);
          j_flag = j;
          i_flag = i;
        }
      }
    }
    System.out.println("profit: " + profit);
    System.out.println("i_flag: " + i_flag);
    System.out.println("j_flag: " + j_flag);
    int[] newPricessArray = new int[prices.length - 2];

    int newArrayIndex = 0; // Index cho mảng mới
    for (int i = 0; i < prices.length; i++) {
      // Nếu index hiện tại KHÔNG phải là buyIndex HOẶC sellIndex
      if (i != j_flag && i != i_flag) {
        newPricessArray[newArrayIndex] = prices[i];
        newArrayIndex++;
      }
    }

    System.out.println("newPricessArray: ");
    for (int i = 0; i < newPricessArray.length; i++) {
      System.out.print(newPricessArray[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < newPricessArray.length; i++) {
      for (int j = i + 1; j < newPricessArray.length - 1; j++) {
        if (newPricessArray[j] > newPricessArray[i]) {
          profit_second =
            Math.max(profit, newPricessArray[j] - newPricessArray[i]);
        }
      }
    }
    return profit+ profit_second;
  }

  public static void main(String[] args) {
    Problem122 solution = new Problem122();
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int profit = solution.maxProfit(prices);

    System.out.println("Maximum profit: " + profit);
  }
}
