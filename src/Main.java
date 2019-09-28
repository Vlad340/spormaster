public class Main {
    public static void main(String[] args) {

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
        long minAmountSpecialOffer=1_000_00L;
        long amountPayBonuses = 200_00L;
        long nominalBonusesBlueCard = 50_00L;
        long nominalBonusesSilverCard = 70_00L;
        long nominalBonusesGoldCard = 100_00L;
        long minAmountAllPurchasesSilverCard=15_001_00L;
        long minAmountAllPurchasesGoldCard=150_000_00L;
        long bonusPurchaseRate=1_000_00L;
        int numberOfUnitsInOneBonus=100;

        amountAllPurchases += amountCurrentPurchases;
        long amountAccuredBonuses = amountCurrentPurchases - amountDiscountGoods - nominalGiftCardPurchases - nominalGiftCardPay - amountSpecialOffer - amountPayBonuses - amountGoodsSpecialOffer;

        long nominalBonuses=nominalBonusesBlueCard;

        if (amountAllPurchases > minAmountAllPurchasesSilverCard) {
            nominalBonuses = nominalBonusesSilverCard;
        }

        if (amountAllPurchases > minAmountAllPurchasesGoldCard) {
            nominalBonuses = nominalBonusesGoldCard;
        }

        long bonuses = (amountAccuredBonuses / bonusPurchaseRate)*nominalBonuses;
        bonuses += (numberGoodsSpecialOffer * nominalBonusesNumberGoodSpecialOffer) ;

        if (amountSpecialOffer > minAmountSpecialOffer) {
            bonuses += nominalBonusesAmountSpecialOffer;
        }

        if (nominalBonuses == nominalBonusesBlueCard) {
            System.out.println("Синяя карта");
        } else if (nominalBonuses == nominalBonusesSilverCard) {
            System.out.println("Серебряная карта");
        } else {
            System.out.println("Золотая карта");
        }

        System.out.println("Начислено:"+bonuses/numberOfUnitsInOneBonus+" бонусов");
    }
}
