/*
*Pratham Gandhi
*9/8/17
*Version 1
*/

public class Book{

  //create private int fields, numPages and currentPage
  private int numPages, currentPage;

  public Book(int x){

    numPages = x; //set numPages to parameter
    currentPage = 1; //set currentPage to one

  }

  //accessor method for numPages
  public int getNumPage(){
    return numPages;
  }

  //accessor method for currentPage
  public int getCurrentPage(){
    return currentPage;
  }

  public void nextPage(){

  //method nextPage that increments currentPage by 1, but only if currentPage is less than numPages
    if (currentPage < numPages)
     currentPage++;

  }

}
