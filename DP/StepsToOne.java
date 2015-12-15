/*

 * On a positive integer, you can perform any one of the following 3 steps. 1.) Subtract 1 from it. (N = n - 1), 2.) 

 * If its divisible by 2, divide by 2. (if n% 2 == 0, then n = n / 2), 3.) If its divisible by 3, divide by 3 . 

 * (if n% 3 == 0, then n = n / 3). Now the question is, given a positive integer n, find the minimum number of steps that takes n to 1

 * eg: 1.) For n = 1, output: 0 2.) For n = 4, output: 2 (4/2 = 2/2 = 1) 3.) For n = 7, output: 3 (7  -1 =  6/3 =   2/2 = 1)

 * F (n) = 1 + min {F (n-1), F (n / 2), F (n / 3)} if (n> 1), else 0 (ie, F (1) = 0) 

 */

package practice;


public class StepsToOne {


public static int minSteps_R(int n) {

if (n <= 1) {

return 0;

}

int i = minSteps_R(n-1);

int j = Integer.MAX_VALUE;

if (0 == n%2) {

j = minSteps_R(n/2);

}

int k = Integer.MAX_VALUE;

if (0 == n%3) {

k = minSteps_R(n/3);

}

return 1 + Math.min(Math.min(i, j), k);

}

public static int minSteps_I(int n) {

int[] minSteps = new int[n+1];

minSteps[0] = 0;

minSteps[1] = 0;

for (int i = 2; i <= n; i++) {

minSteps[i] = 1 + minSteps[i-1];

if (0 == i%2) {

minSteps[i] = Math.min(1 + minSteps[i/2], minSteps[i]);

}

if (0 == i%3) {

minSteps[i] = Math.min(1 + minSteps[i/3], minSteps[i]);

}

}

return minSteps[n];

}

public static void main(String[] args) {

int steps = minSteps_R(11);

System.out.println(steps);

steps = minSteps_I(11);

System.out.println(steps);


}

}