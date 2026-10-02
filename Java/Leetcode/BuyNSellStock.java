package Leetcode;

public class BuyNSellStock 
{
    public static void main(String[] args) 
    {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int MP = 0;
        int BestBuy = prices[0];

        for(int i=1 ; i<prices.length ; i++)
        {
            if(prices[i] > BestBuy)
            {
                MP = Math.max(MP, prices[i] - BestBuy);
            }

            BestBuy = Math.min(BestBuy, prices[i]);
        }

        System.out.println(MP);
    }
}