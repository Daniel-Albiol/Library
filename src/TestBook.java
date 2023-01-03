public class TestBook {
    Author anauthor = new Author("J.R.R. Tolkien","tolkien@tolkien.com", 'm');
    Book aBook = new Book("Java for dummy",anauthor,19.95,1000);
    Book anotherBook = new Book("more Java for dummy",new Author("J.K. Rowling","rowling@rowling.com",'f'),29.95,888);
    System.out.println(aBook.getAuthor().getName());
    System.out.println(aBook.getAutor().getEmail());
    //System.out.println(anotherBook);
    Book [] bookArray = new Book[5];
    Author LODR ("Aragorn","aragorn@aragorn.com","m");
    bookArray[0] = new Book("The Hobit", "LODR",19.95,99)
    bookArray[1] = new Book("The Lord of thw Rings I", "LODR",19.95,105)
    bookArray[2] = new Book("The Lord of thw Rings II", "LODR",19.95,200)
    bookArray[3] = new Book("The Lord of thw Rings III", "LODR",19.95,200)
    bookArray[4] = new Book("Silmarilion", "LODR",19.95,200)
        for(int i = 0; i <= bookArray.length; i++0){

            System.out.println(bookArray[i].toString());
    }

}
