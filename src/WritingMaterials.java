public class WritingMaterials {
    public static void main(String[]args){
        WritingMaterials1 pen = new WritingMaterials1();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
    }
}
class WritingMaterials1{
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    public void setName(String writeName){
        name=writeName;
    }
    public void setColor(String writeColor){
        color=writeColor;
    }
    public void setPrice(int writePrice){
        price=writePrice;
    }
    public void setLength(double writeLenght){
        length=writeLenght;
    }
    public void setDraw(boolean writeDraw){
        draw=writeDraw;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    public double getLength(){
        return length;
    }
    public boolean isDraw(){
        return draw;
    }
    public WritingMaterials1(String name,String color){
        this.name=name;
        this.color=color;
    }
    public WritingMaterials1(String name,int price){
        this.price=price;
        this.name=name;
        this.color="No Color";
    }
    public WritingMaterials1(int price,double length,boolean draw){
        this.price=price;
        this.length=length;
        this.draw=draw;
        this.name="No Name";
        this.color="No Color";
    }
    public WritingMaterials1(String name,String color,int price,double length,boolean draw){
        this.price=price;
        this.length=length;
        this.draw=draw;
        this.name=name;
        this.color=color;
    }
    public WritingMaterials1(){}
    void display(){
        System.out.println("Название: "+name+" Цвет: "+color+" Длина: "+length+" Цена: "+price+" Умеет рисовать: "+(draw ? "Да":"Нет"));
    }
    String replace_rod(String newColor){
     color=newColor;
        return newColor;
    }
    int priceUp(int newPrice){
       price+=newPrice;
       return price;
    }
    int priceDown(int newPrice1){
        price-=newPrice1;
        return price;
    }
    void draw(){
        if(draw==true){System.out.println( name+" провёл линию. Её цвет - "+color);}
        else{System.out.println(name+" не может ничего нарисовать.");}
    }
}