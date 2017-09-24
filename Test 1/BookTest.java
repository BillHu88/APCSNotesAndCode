public class BookTest{
  public static void main(String[] args){
    Book myBook = new Book(3);
    myBook.nextPage();
    int theCurrentPage = myBook.getCurrentPage();
    System.out.println(theCurrentPage);
    myBook.nextPage();
    theCurrentPage = myBook.getCurrentPage();
    System.out.println(theCurrentPage);
    myBook.nextPage();
    theCurrentPage = myBook.getCurrentPage();
    System.out.println(theCurrentPage);
  }
}
