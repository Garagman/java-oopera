public class Opera extends MusicalShow{
    private String choirSize;

    public Opera (String title, int duration, Director director, String musicAuthor, String librettoText, String choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    //Сеттеры и Геттеры начало!
    public String getChoirSize(){
        return choirSize;
    }

    public void setChoirSize(String choirSize){
        this.choirSize = choirSize;
    }
    //Сеттеры и Геттеры конец!

    @Override
    public String toString() {
        return super.toString() + ", опера, хор: " + choirSize;
    }
}
