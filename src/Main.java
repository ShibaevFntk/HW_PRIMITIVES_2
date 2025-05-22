//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int amount = 100;//состояние счета
        int updateAmount = 1000;//сумма пополнения
        int barrierBonus = 1000;//Порог начисления бонусов
        int costBonus = 100;//сумма за которую начисляем 1 балл
        int bonus; // количество бонусов


        System.out.println("Счет пополнен на " + updateAmount + " руб.");

        if (updateAmount > barrierBonus) {//Условным оператором проверяю, превысила ли сумма пополнения порог
            bonus = updateAmount / costBonus; // для этих двух разных сценариев рассчитываю сумму бонуса
            System.out.println("Начислено " + bonus + " бонусов, и вы выиграли автомобиль!!!");
        } else {
            bonus = 0;
            System.out.println("Сумма пополнения меньше " + barrierBonus + " руб. Бонусы не начисляются.");
        }

        amount = amount + updateAmount + bonus;
        System.out.println("Текущее состояние счета " + amount + " руб.");//Вывожу на экран

    }
}