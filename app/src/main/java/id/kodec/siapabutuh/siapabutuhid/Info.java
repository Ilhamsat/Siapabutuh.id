package id.kodec.siapabutuh.siapabutuhid;

public class Info {

    private int id;
    private String title;
    private String date;
    private String selengkapnya;
    private int image;

    public Info(int id, String title, String date, String selengkapnya, int image){
        this.id = id;
        this.title = title;
        this.date = date;
        this.selengkapnya = selengkapnya;
        this.image = image;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String getSelengkapnya() {
        return selengkapnya;
    }
    public int getImage() {
        return image;
    }
}
