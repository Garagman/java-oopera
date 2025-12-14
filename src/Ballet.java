public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    //Сеттеры и Геттеры начало!
    public String getChoreographer() {
        return choreographer;
    }
    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
    //Сетеры и Геттеры конец!

    @Override
    public String toString() {
        return super.toString() + ", балет, хореограф: " + choreographer;
    }
}
