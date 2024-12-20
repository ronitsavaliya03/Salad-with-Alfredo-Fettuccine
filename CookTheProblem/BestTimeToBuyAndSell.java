public class BestTimeToBuyAndSell {
    // an array prices where prices[i] is the price of a given stock on the ith day
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                maxProfit=Math.max(maxProfit, price-minPrice);
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSell stock=new BestTimeToBuyAndSell();

        int[] trader1={9,8,7};
        System.out.println("Profit of trader1: "+stock.maxProfit(trader1));

        
        int[] trader2={1,5,8,5,7,6};
        System.out.println("Profit of trader2: "+stock.maxProfit(trader2));
    }
}
