
class Book {
    public static void main(String[]args){
        book b=new book("dssdfs","dcdsds");
        book b1=new book("fvvfv","dcdsds");
        System.out.println(b.toString());
        System.out.println(b1.toString());
    }
}
class book implements Cloneable{

    private String name;
    private Author author;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

    public void setAuthor(String n){ author.setName(n);}
    public String getAuthor(){ return author.getName();}

    book(String name, String author){

        this.name = name;
        this.author = new Author(author);
    }

    public String toString(){

        return "Книга '" + name + "' (автор " +  author + ")";
    }

    public book clone() throws CloneNotSupportedException{

        return (book) super.clone();
    }
}

class Author{

    private String name;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

    public Author(String name){

        this.name=name;
    }
}
