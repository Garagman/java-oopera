package show;

import entities.Actor;
import entities.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }
// Сеттеры и Геттеры начало!
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }
// Сеттеры и Геттеры конец!]

    public void printActors() {
        if(listOfActors.isEmpty()) {
            System.out.println("В спектакле нет актеров");
            return;
        }
        System.out.println("В спектакле \"" + title + "\" играют Актеры:");
        for (Actor actor : listOfActors) {
            System.out.println("*" + actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + " см)");
        }
    }

    public boolean addActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("После для ввода пустое, Введите имя Актера!");
            return false;
        }

        if (listOfActors.contains(newActor)){
            System.out.println("Такой актер, как " + newActor.getName() + " " + newActor.getSurname() + ", уже есть в списке!!!");
            return false;
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " успешно добавлен в список!");
        return true;
    }

    public boolean replaceActor(Actor newActor, String surnameToReplace) {
        if (newActor == null || surnameToReplace == null || surnameToReplace.isEmpty()) {
            System.out.println("Ой, что-то пошло не так. Проверьте правильность заполнения!!!");
            return false;
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер, как " + newActor.getName() + " " + newActor.getSurname() + ", уже есть в списке!!!");
            return false;
        }

        Actor actorToReplace = null;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)){
                actorToReplace = actor;
                break;
            }
        }
        if (actorToReplace == null) {
            System.out.println("Актер " + surnameToReplace + " не найден в спектакле!");
            return false;
        }
        listOfActors.remove(actorToReplace);
        listOfActors.add(newActor);
        System.out.println("Актер " + actorToReplace.getName() + " " + actorToReplace.getSurname() + " успешно заменен на " + newActor.getName() + " " + newActor.getSurname());
        return true;
    }
    @Override
    public String toString() {
        return "Спектакль: \"" + title + "\", продолжительностью: " + duration + " мин, режиссер: " + director.getName() + " " + director.getSurname();
    }
}
