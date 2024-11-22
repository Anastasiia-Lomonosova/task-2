public class Main {
    public static void main(String[] args) {

        int start = 300;
        int replenishment = 1200;
        int total = start + replenishment;
        int bonusRub;
        if (replenishment > 999) {
            bonusRub = replenishment / 100;
        } else { bonusRub = 0;
        }

        System.out.println(bonusRub);
        System.out.println (total);
    }
}