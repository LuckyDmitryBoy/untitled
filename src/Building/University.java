package Building;

public class University extends Building implements SocialHouse{
    public int YearsOfFounder;
    public int HowManyStudents;
    public University(){

    }
    public University(int YearsOfFounder,int HowManyStudents){
        super();
        this.HowManyStudents=HowManyStudents;
        this.YearsOfFounder=YearsOfFounder;
    }
    public void setYearsOfFounder(int YearsOfFounder){
        this.YearsOfFounder=YearsOfFounder;
    }
    public int getYearsOfFounder(){
        return YearsOfFounder;
    }
    public void setHowManyStudents(int HowManyStudents){
        this.HowManyStudents=HowManyStudents;
    }
    public int getHowManyStudents(){
        return HowManyStudents;
    }
    public void univer(){
        System.out.println("Посупайте в правильные университеты!!!");
    }
    public int teachers(int HowManyPrisoner){
        return HowManyStudents/25;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+getHowManyStudents()+","+getYearOfBuilding();
    }

    @Override
    public void important() {
        System.out.println("Предназначен для обучения и ввода людей во взрослую жизнь");
    }

    @Override
    public void personaiyty() {
System.out.println("В крупнейших университетах может учится до 100 тысяч человек");
    }
}
