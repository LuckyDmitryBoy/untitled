package Building;

public class ShoppingCenter extends Building implements  SocialHouse{
    public String TheNameOfShoppingCenter;
    public int CountShop;
    public ShoppingCenter(){

    }
    public ShoppingCenter(String TheNameOfShoppingCenter,int CountShop){
        super();
        this.TheNameOfShoppingCenter=TheNameOfShoppingCenter;
        this.CountShop=CountShop;
    }
    public void setCountShop(int CountShop){
        this.CountShop=CountShop;
    }
    public int getCountShop(){
        return CountShop;
    }
    public void setTheNameOfShoppingCenter(String TheNameOfShoppingCenter){
        this.TheNameOfShoppingCenter=TheNameOfShoppingCenter;
    }
    public String getTheNameOfShoppingCenter(){
        return TheNameOfShoppingCenter;
    }
    public void shop(){
        System.out.println("Покупайте вещи в сертифицированных магазинах!!!");
    }
    public int shops(int CountShop){
        return CountShop/5;
    }
    public String toString(){
        return getName()+","+getAdres()+","
                +getNameOfArhitektor()+","+getYearOfBuilding()+","
                +isCultureBuilding()+","+getCountShop()+","+TheNameOfShoppingCenter;
    }

    @Override
    public void important() {
        System.out.println("Предназначен для покупаки жизненно-необходимых вещей и для развлечения");
    }

    @Override
    public void personaiyty() {
System.out.println("Может быть различная вместимость");
    }
}
