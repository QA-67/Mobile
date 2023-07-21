public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int payment = 1001;
        int bonus = 0;

        if (payment > 1000){
            bonus = payment / 100;
        }
        bill = bill + payment + bonus;
        System.out.println("Итоговый счёт: " + bill);
        System.out.println("Бонусные рубли: " + bonus);
    }
}