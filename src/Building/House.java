package Building;

public class House extends Building implements LivingHouse{
    public String typeOfDesign;
    public int squereaMetras;
    public House(){

    }
    public House(String typeOfDesign,int squereaMetras){
        super();
        this.squereaMetras=squereaMetras;
        this.typeOfDesign=typeOfDesign;
    }
    public void setTypeOfDesign(String typeOfDesign){
        this.typeOfDesign=typeOfDesign;
    }
    public String getTypeOfDesign(){
        return typeOfDesign;
    }
    public void setSquereaMetras(int squereaMetras){
        this.squereaMetras=squereaMetras;
    }
    public int getSquereaMetras(){
        return squereaMetras;
    }
    public void Lives(){
        System.out.println("Здесь вы можете жить!!!");
    }
    public int room(int squereaMetras){
        return squereaMetras+2;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+typeOfDesign+","+squereaMetras;
    }
    public void comfortoflive(){
        System.out.println("Тут жить комфортно наверное!");
    }

    @Override
    public void coutofperson() {
       System.out.println("В доме живут до 5 человек.");
    }
    ;
}
