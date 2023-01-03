public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price){

    }

    public Book(String name, Author author, double price, int qtyInStock){

    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
    public String getAuthorName(){
        return getAuthorName();
    }
    public String getAuthorEmail(){
        return getAuthorEmail();
    }
    public char getAuthorGender(){
        return getAuthorGender();
    }

}
