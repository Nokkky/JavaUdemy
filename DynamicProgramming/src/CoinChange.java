public class CoinChange {
    /**
     * @param coins: a list of integer
     * @param amount: a total amount of money amount
     * @return: the fewest number of coins that you need to make up
     */
    public  int  coinChange(int[] coins, int amount) {
        // write your code here
        int[] coinsNumber = new int[amount + 1];

        coinsNumber[0] = 0;

        for (int i = 1; i <= amount; i++){
            coinsNumber[i] = Integer.MAX_VALUE ;
        }

        // start from bottom
        for (int currentAmount = 0; currentAmount <= amount; currentAmount++){

            // find possible combination with coins
            for (int j = 0; j < coins.length; j ++){
                // currentAmount is possible
                if (coinsNumber[currentAmount] < Integer.MAX_VALUE){
                    // find minimum coins' number for next amount
                    int nextAmount = currentAmount + coins[j];
                    // if out of boundary
                    if ( nextAmount > amount){
                        break;
                    }
                    // if we find smaller number of coins, update number of coins for next current amount.
                    if (coinsNumber[currentAmount] + 1 < coinsNumber[nextAmount]){
                        coinsNumber[nextAmount] = coinsNumber[currentAmount] + 1;
                    }

                }

            }
        }

        if (coinsNumber[amount] == Integer.MAX_VALUE){
            return -1;
        }

        return coinsNumber[amount];

    }

}