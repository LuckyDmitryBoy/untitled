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
        System.out.println("��������� � ���������� ������������!!!");
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
        System.out.println("������������ ��� �������� � ����� ����� �� �������� �����");
    }

    @Override
    public void personaiyty() {
System.out.println("� ���������� ������������� ����� ������ �� 100 ����� �������");
    }
}
