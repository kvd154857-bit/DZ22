public class Main {
    public static void main(String[] args) {

        int initaialBalance = 100;
        int addPay = 1100;
        int bonus = 0;
        if (addPay > 1000) {
            bonus = addPay / 100; // 1 рубль за каждые 100 рублей
        }

// Итоговый счет
        int finalBalance = initaialBalance + addPay + bonus;

//Результаты
        System.out.println("Сумма на счету: " + finalBalance + " рублей");
        System.out.println("Бонусов начисленно " + bonus + " рублей");

    }
}