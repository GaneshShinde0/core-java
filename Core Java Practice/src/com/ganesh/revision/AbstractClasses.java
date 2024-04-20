import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
    
}

//Write MyBook class here
class MyBook extends Book{

  // AbstractShape shape = new AbstractShape(4); // This will result in a compilation error
  // If we extend abstract class then only we can use constructor and only using super keyword.
  // Rectangle rectangle = new Rectangle(5, 3);

    public void setTitle(String s){
        super.title=s;
    }
    
}
public class AbstractClasses{
    
    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
          sc.close();
        
    }
}
