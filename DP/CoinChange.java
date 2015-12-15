/*

 * Given a list of N coins, their values (V1, V2, … , VN), and the total sum S.

 * Find the minimum number of coins the sum of which is S (we can use as many coins of one type as we want), 

 * or report that it’s not possible to select coins in such a way that they sum up to S.

 */

package practice;


public class CoinChange {


public static int coinChange_R(int[] arr, int S) {

if (S <= 0) {

return 0;

}	

int minValue = Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {

minValue = Math.min(minValue, coinChange_R(arr, S - arr[i])) + 1;

}

return minValue;

}

public static int coinChange_I(int[] arr, int S) {

int[] minValues = new int[S+1];

minValues[0] = 0;

for (int i = 1; i <= S; i++) {

int minValue = Integer.MAX_VALUE;

for (int j = 0; j < arr.length; j++) {

int subStructure = i - arr[j];

if (subStructure <= 0) {

minValue = 1;

break;

} else {

minValue = Math.min(minValue, minValues[subStructure] + 1);

}

}

minValues[i] = minValue;

}

return minValues[S];

}

public static void main(String[] args) {

int[] denom = {1,2,3};

int coins = coinChange_R(denom, 10);

System.out.println(coins);

coins = coinChange_I(denom, 10);

System.out.println(coins);

}

}
