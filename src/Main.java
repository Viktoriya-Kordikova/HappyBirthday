import java.util.ArrayList;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";


    public static void main(String[] args) {
        System.out.println("Саша, поздравляем тебя с Днём Рождения и желаем");
        ArrayList<Wish> пожелания = пожелатьПожелания();
        показатьПожелания(пожелания);
        System.out.println("Отдел тестирования 2023");

        BirthdayCakeAnimation.launch(BirthdayCakeAnimation.class);
    }

    public static ArrayList<Wish> пожелатьПожелания() {
        ArrayList bestWishes = new ArrayList<Wish>();
        bestWishes.add(new Wish(YELLOW + "Гибкого ума" + RESET, "Гриша"));
        bestWishes.add(new Wish(PURPLE + "Финансового благополучия" + RESET, "Слава"));
        bestWishes.add(new Wish(BLUE + "Интересных задач" + RESET, "Женя"));
        bestWishes.add(new Wish(GREEN + "Беспечных компиляций и нежных коммитов" + RESET, "Паша"));
        bestWishes.add(new Wish(CYAN + "Верных друзей" + RESET, "Вика"));
        bestWishes.add(new Wish(RED + "Умопомрачительных успехов" + RESET, "Костя"));
        bestWishes.add(new Wish(GREEN + "Безошибочного кода" + RESET, "Влад"));
        bestWishes.add(new Wish(YELLOW + "Неиссякаемой энергии и любопытства" + RESET, "Динара"));
        bestWishes.add(new Wish(CYAN + "Наикрепчайшего здоровья" + RESET, "Денис"));
        bestWishes.add(new Wish(PURPLE + "Код - как самая лучшая песня!" + RESET, "Юра"));
        return bestWishes;
    }

    public static void показатьПожелания(ArrayList<Wish> bestWishes) {
        for (Wish wish : bestWishes) {
            System.out.println(wish.wish + " (" + wish.from + ")");
        }
    }

    public static class Wish {
        public final String wish;
        public final String from;

        public Wish(String wish, String from) {
            this.wish = wish;
            this.from = from;
        }
    }
}