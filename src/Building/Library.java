package Building;

public class Library extends Building implements SocialHouse{
    public String typeOfBooks;
    public int CountOfBooks;
    public Library(){

    }
    public Library(String typeOfBooks,int CountOfBooks){
        super();
        this.CountOfBooks=CountOfBooks;
        this.typeOfBooks=typeOfBooks;
    }
    public void setTypeOfBooks(String typeOfBooks){
        this.typeOfBooks=typeOfBooks;
    }
    public String getTypeOfBooks(){
        return typeOfBooks;
    }
    public void setCountOfBooks(int countOfBooks){
        this.CountOfBooks=countOfBooks;
    }
    public int getCountOfBooks(){
        return CountOfBooks;
    }
    public void Java(){
        System.out.println("Здесь вы можете изучать Java!!!");
    }
    public int Books(int CountOfBooks){
        return CountOfBooks/2;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+typeOfBooks+","+CountOfBooks;
    }

    @Override
    public void important() {
        System.out.println("Отвечает за культурное развитие населения");
    }

    @Override
    public void personaiyty() {
System.out.println("Нужно вести себя тихо");
    }
}
