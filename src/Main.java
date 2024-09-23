public class Main {
    public static void main(String[] args) {
        double ticketPrice = 15968.75; // Объявляем переменную и указываем стоимость билета
        int rub_for_mile = 20; // Объявляем переменную и указазываем количество рублей для одной бонусной мили
        int miles = (int) (ticketPrice / rub_for_mile); // Объявляем переменную и расчитываем бонусные мили
        System.out.println(miles); // Выводим результат
    }
}