package show;

import entities.Director;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Cеттеры и Геттеры начало!
    public String getMusicAuthor(){
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor){
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
    // Сеттеры и Геттеры конец!

    public void printLibretto() {
        if (librettoText == null || librettoText.isEmpty()) {
            System.out.println("Текст либретто отсутствует!!!");
        } else {
            System.out.println("/// Текст либретто для \"" + getTitle() + "/ \\\"");
            System.out.println(librettoText);
            System.out.println("_______________________________");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", музыкальный спектакль, композитор: " + musicAuthor;
    }
}

