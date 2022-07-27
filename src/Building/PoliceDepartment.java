package Building;

public class PoliceDepartment extends Building implements SocialHouse{
    public boolean GoodPrison;
    public int HowManyPrisoner;
    public PoliceDepartment(){

    }
    public PoliceDepartment(boolean GoodPrison,int HowManyPrisoner){
        super();
        this.HowManyPrisoner=HowManyPrisoner;
        this.GoodPrison=GoodPrison;
    }
    public void setGoodPrison(boolean GoodPrison){
        this.GoodPrison=GoodPrison;
    }
    public boolean isGoodPrison(){
        return GoodPrison;
    }
    public void setHowManyPrisoner(int HowManyPrisoner){
        this.HowManyPrisoner=HowManyPrisoner;
    }
    public int getHowManyPrisoner(){
        return HowManyPrisoner;
    }
    public void police(){
        System.out.println("А вот сюда лучше не попадать!!!");
    }
    public int prison(int HowManyPrisoner){
        return HowManyPrisoner/8;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+getHowManyPrisoner()+","+isGoodPrison();
    }

    @Override
    public void important() {
        System.out.println("Овечает за безопасность населения");
    }

    @Override
    public void personaiyty() {
System.out.println("Персонал сильно разнится");
    }
}
