class LibraryItem {
    private String title;
    private String author;
    private int id;


    LibraryItem(String title,String author, int id){
        this.title=title;
        this.author=author;
        this.id=id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getId(){
        return id;
    }

    public void getInfo(){
        System.out.println("Title:"+getTitle());
        System.out.println("Author:"+getAuthor());
        System.out.println("Id:"+getId());
    }


}
class Book extends LibraryItem {
    private String publication;

    Book(String title,String author,int id,String publication){
        super(title,author,id);
        this.publication=publication;
    }
    
    public String getPublication(){
        return publication;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Publication:"+getPublication());
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    Magazine(String title, String author,int id,int issueNumber){
        super(title,author,id);
        this.issueNumber=issueNumber;
        
    }

    public int getIssueNum(){
        return issueNumber;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("IssueNumber:"+getIssueNum());

    }


}

class NewsPaper extends LibraryItem {
    private String publication;     //I'm using publication here as well because i dont find what to add in newspaper

    NewsPaper(String title,String author,int id,String publication){
        super(title,author,id);
        this.publication=publication;
    }

    public String getPublication(){
        return publication;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Pulication:"+getPublication());
    }

}
public class LibrarySystem {
    public static void main(String[] args){
        LibraryItem li=new LibraryItem("Attitude is Everything", "jeff keyler", 1407);
        li.getInfo();
        System.out.println("------------");

        Book book= new Book("The Magic Man", "Leo messi", 130, "Asmitas Publication");
        book.getInfo();
        System.out.println("------------");

        Magazine mg=new Magazine("Interprocal", "Henry Jeoz", 34, 1032);
        mg.getInfo();
        System.out.println("-------------");

        NewsPaper np=new NewsPaper("The sinking valley", "David Bachkam", 39, "Kantipur Publication");
        np.getInfo();
    }
}