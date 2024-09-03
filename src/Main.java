public class Main {
    public static void main(String[] args) {
        int intialBalance = 100;
        int depositBonus = 100;
        int replenishment = 1100;
        int bonus;

        if (replenishment >= 1000){
            bonus =  replenishment / depositBonus;
        } else {
            bonus = 0;
        }

        int userBalance = intialBalance + replenishment + bonus;

        System.out.println("Ваш баланс: " + userBalance + " руб.");
    }
}
