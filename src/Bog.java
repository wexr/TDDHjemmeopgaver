public class Bog {

    private String title = "";
    private String author ="";
    private int price = 0;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void nyBog(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public String toString(){
        return "Navn på bog: " + this.title + "\n Forfatter: " + this.author + "\n Pris: " + this.price + ",-";
    }
}
