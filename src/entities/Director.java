package entities;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
       super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    //Сеттеры и Геттеры Начало!
    public int getNumberOfShows(){
        return numberOfShows;
    }
    public void setNumberOfShows(int numberOfShows){
        this.numberOfShows = numberOfShows;
    }
    //Сеттеры и Геттеры Конец !

    @Override
    public String toString(){
        return super.toString() + " (режиссер, постановок: " + numberOfShows + ")";
    }
}
