package Book;
//书的实体类
public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean state;

    public Book() {
    }

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "book[" +
                "name='" + name + '\'' +
                "\t author='" + author + '\'' +
                "\t price=" + price +
                "\t type='" + type + '\'' +
                "\t"+(state?"已借阅":"未借阅")+
                ']';
    }
}
