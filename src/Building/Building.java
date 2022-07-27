package Building;

public abstract class Building {
    private String name;
    private String adres;
    private int yearOfBuilding;
    private String nameOfArhitektor;
    private boolean cultureBuilding;
    public Building (){

    }
    public Building (String name,String adres,int yearOfBuilding,String nameOfArhitektor, boolean cultureBuilding){
this.name=name;
this.adres=adres;
this.yearOfBuilding=yearOfBuilding;
this.nameOfArhitektor=nameOfArhitektor;
this.cultureBuilding=cultureBuilding;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAdres(){
        return adres;
    }
    public void setAdres(String adres){
        this.adres=adres;
    }
    public String getNameOfArhitektor(){
        return nameOfArhitektor;
    }
    public void setNameOfArhitektor(String nameOfArhitektor){
        this.nameOfArhitektor=nameOfArhitektor;
    }
    public int getYearOfBuilding(){
        return yearOfBuilding;
    }
    public void setYearOfBuilding(int yearOfBuilding){
        this.yearOfBuilding=yearOfBuilding;
    }
    public boolean isCultureBuilding(){
        return cultureBuilding;
    }
    public void setCultureBuilding(boolean cultureBuilding){
        this.cultureBuilding=cultureBuilding;
    }
}
