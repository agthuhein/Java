package Day5;

public class MagicPotionCalculator {
    public static void main(String[] args) {
        int magicEssence = 5;
        int dragonScale = 3;
        int unicornHair = 2;
        int potionPower = magicEssence * dragonScale + unicornHair;
        System.out.println("The power of the potion is " + potionPower);
    }
}
