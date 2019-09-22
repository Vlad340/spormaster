public class Main {
    public static void main(String[] args) {
/**
 * Calculation of bonuses on the purchase amount and the total amount of all previous purchases
 */
        long amountAllPurchases = 145_000_00L;
        long amountCurrentPurchases = 15_000_00L;
        long amountDiscountGoods = 1_500_00L;
        long nominalGiftCardPay = 500_00L;
        long nominalGiftCardPurchases = 300_00L;
        long nominalBonusesNumberGoodSpecialOffer = 500_00L;
        long amountGoodsSpecialOffer = 5_000_00L;
        int numberGoodsSpecialOffer = 2;
        long amountSpecialOffer = 400_00L;
        long nominalBonusesAmountSpecialOffer = 200_00L;
        long amountPayBonuses = 200_00L;

        amountAllPurchases += amountCurrentPurchases;
        long amountAccuredBonuses = amountCurrentPurchases - amountDiscountGoods - nominalGiftCardPurchases - nominalGiftCardPay - amountSpecialOffer - amountPayBonuses - amountGoodsSpecialOffer;
        long nominalBonuses = 50_00L;
        if (amountAllPurchases > 15_001_00) {
            nominalBonuses = 70_00L;
            }
        if (amountAllPurchases > 150_000_00) {
            nominalBonuses = 100_00L;
        }
        long bonuses = (amountAccuredBonuses / 1_000_00)*nominalBonuses;
        bonuses += (numberGoodsSpecialOffer * nominalBonusesNumberGoodSpecialOffer) ;
        if (amountSpecialOffer > 1_000_00) {
            bonuses += nominalBonusesAmountSpecialOffer;
        }
        if (nominalBonuses == 50_00) {
            System.out.println("Синяя карта");
        } else if (nominalBonuses == 70_00) {
            System.out.println("Серебряная карта");
        } else {
            System.out.println("Золотая карта");
        }
        System.out.println("Начислено:"+bonuses/100+" бонусов");
    }
}
