import entities.Actor;
import entities.Director;
import entities.Gender;
import show.Ballet;
import show.Opera;
import show.Show;

public class Main {
    public static void main (String[] args) {
        System.out.println("Процесс Создания Акторов и Режиссеров");

        Actor actor1 = new Actor("Сергей", "Ситников", Gender.MALE, 185);
        Actor actor2 = new Actor("Анастасия", "Лузан", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Cтанислав", "Иванов", Gender.MALE, 160);

        System.out.println("Созданные актеры:");
        System.out.println("1. " + actor1);
        System.out.println("2. " + actor2);
        System.out.println("3. " + actor3);

        Director director1 = new Director("Томик", "Томилов", Gender.MALE, 10);
        Director director2 = new Director("Владислава", "Горлова", Gender.FEMALE, 12);

        System.out.println("Созданные Режиссеры:");
        System.out.println("1. " + director1);
        System.out.println("2. " + director2);

        String musicAuthor = "П.И. Чайковский";
        String choreographer = "А.В. Ситникова";

        System.out.println("Автор музыки: " + musicAuthor);
        System.out.println("Хореограф: " + choreographer);

        System.out.println("Процесс создания Спектаклей");

        String operaLibretto = "Акт 1. бла бла бла; Акт 2. бла бла бла";
        String balletLibretto = "Начало. Танцепляски. Конец.";

        Show usual = new Show("Преступление и наказание", 200, director1);
        System.out.println("1. Создал обычный спектакль: " + usual.getTitle());

        Opera opera = new Opera("Дон Кихот", 170, director2, musicAuthor, operaLibretto, "37");
        System.out.println("2. Создал оперу: " + opera.getTitle() + ", и хор: " + opera.getChoirSize());

        Ballet ballet = new Ballet("Щелкунчик", 160, director1, musicAuthor, balletLibretto, choreographer);
        System.out.println("3. Создал балет: " + ballet.getTitle() + ", хореограф: " + ballet.getChoreographer());

        System.out.println("Процесс Распределения Актеров");

        System.out.println("Добавляем актеров в обычный спектакль:");
        usual.addActor(actor1);
        usual.addActor(actor2);

        System.out.println("Добавляем актеров в оперу:");
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println("Добавляем актеров в балет:");
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Пробуем повторно добавить актера в балет:");
        ballet.addActor(actor3);

        System.out.println("Процесс вывода списка актеров для каждого спектакля");
        System.out.println("Обычный спектакль \"" + usual.getTitle() + "\":");
        usual.printActors();

        System.out.println("Опера \"" + opera.getTitle() + "\":");
        opera.printActors();

        System.out.println("Балет \"" + ballet.getTitle() + "\":");
        ballet.printActors();

        System.out.println("Процесс замены актера в одном из спектаклей");

        Actor newActor = new Actor("Руслан", "Амерханов", Gender.MALE, 175);
        System.out.println("Создан новый актер для процесса замены - " + newActor);

        System.out.println("Заменяем актера в обычной постановке Ситникова на Амерханова -> ");
        usual.replaceActor(newActor, "Ситников");

        System.out.println("Обновленный список после замены:");
        usual.printActors();

        System.out.println("Процесс попытки замены несуществующего актера ->");

        Actor anotherActor = new Actor("Екатерина", "Пушкарева", Gender.FEMALE, 165);
        System.out.println("Пытаемся заменить несуществующую актера в опере:");
        opera.replaceActor(anotherActor, "Сигида");

        System.out.println("Процесс вывода Текстов Либретто ->");

        System.out.println("Текст либретто для оперы \"" + opera.getTitle() + "\":");
        opera.printLibretto();

        System.out.println("Текст либретто для балеты \"" + ballet.getTitle() + "\":");
        ballet.printLibretto();

    }
}
