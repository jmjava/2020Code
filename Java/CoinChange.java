import java.io.*;
import java.util.*;
import java.text.*;
import java.match.*;
import java.util.regex.*;

public class CoinChange {


    public static long makeChange(int[] coins, int money){

        return makeChange(coins, money, 0, new HashMap<String,Long>());
    }


    public static long makeChange(int[] coins, int money, int index, HashMap<String,Long> memo){

        if (money == 0){
            return 1;
        }
        if (index >= coins.length){
            return 0;
        }

        //for memoization

        String key = money + "-" + index;
        if (memo.containsKey(key)){
            return memo.get(key);
        }


        //call recursive
        int amountWithCoin = 0;
        long ways = 0;
        while (amountWithCoin <= money){
            int remaining = money - amountWithCoin;
            System.out.println("remaining: " + remaining);
            System.out.println(" index: " + index);
            ways += makeChange(coins, remaining, index + 1, memo);
            amountWithCoin += coins[index];
        }
        memo.put(key, ways);
        System.out.println(memo);
        return ways;

    }
    public static void main(String[] args) { 
        
       // this is effectively DFS as it descends fully into index 3 first then comes back to fill in index 2
       // NOTE: amountWithCoin gets it own copy each time the recursive function is called 

       long result = makeChange( new int[]{25, 10, 5, 1}, 7); 
       System.out.println(result);    

        
    }
}