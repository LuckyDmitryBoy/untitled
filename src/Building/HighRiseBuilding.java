package Building;

public class HighRiseBuilding extends Building implements LivingHouse {
    public String WhenIsBuilding;
    public int HighMetres;
    public HighRiseBuilding(){

    }
    public HighRiseBuilding(String WhenIsBuilding,int HighMetres){
        super();
        this.WhenIsBuilding=WhenIsBuilding;
        this.HighMetres=HighMetres;
    }
    public void setHighMetres(int HighMetres){
        this.HighMetres=HighMetres;
    }
    public int getHighMetres(){
        return HighMetres;
    }
    public void setWhenIsBuilding(String WhenIsBuilding){
        this.WhenIsBuilding=WhenIsBuilding;
    }
    public String getWhenIsBuilding(){
        return WhenIsBuilding;
    }
    public void older(int HighMetres){
        if(HighMetres<20){System.out.println("����� ���������!!!");}
        else{System.out.println("������!!!");}
    }
    public int metr(int HighMetres){
        return HighMetres;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+HighMetres+","+WhenIsBuilding;
    }
    public void comfortoflive(){
        System.out.println("��� ���� ��������� � ��� �������!");
    };
    @Override
    public void coutofperson() {
        System.out.println("� ���������� ����� �� 1000 �������.");
    }
    ;
}
