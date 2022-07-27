package WriteMaterials;

public class WritingMaterials {
        public static void main(String[]args){
            WritingMaterials1 pen = new WritingMaterials1();
            pen.setName("ручка");
            pen.setColor("Красный");
            pen.setLength(11.6);
            pen.setPrice(167);
            pen.setDraw(true);
            pen.draw();
            pen.draw("Синий");
            pen.draw("Зелёный", 15);
            pen.draw(4);

            WritingMaterials1 ruler = new WritingMaterials1("линека", 34);
            ruler.setDraw(false);
            pen.draw();
            pen.draw("Синий");
            pen.draw("Зелёный", 15);
            pen.draw(4);
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
        public WritingMaterials1(){
        }
        public void display(){
            System.out.println("Название: "+name+" Цвет: "+color+" Длина: "+length+" Цена: "+price+" Умеет рисовать: "+(draw ? "Да":"Нет"));
        }
        public String replace_rod(String newColor){
            color=newColor;
            return newColor;
        }
        public int priceUp(int newPrice){
            price+=newPrice;
            return price;
        }
        public int priceDown(int newPrice1){
            price-=newPrice1;
            return price;
        }
         public void draw(){
             System.out.println(draw ? name + " провёл линий: 1. Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }
         public void draw(int n){
             System.out.println(draw ? name + " провёл линий: "+n+" . Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }
        public void draw(String color){
            System.out.println(draw ? name + " провёл линий: 1. Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }
         public void draw(String color,int n){
             System.out.println(draw ? name + " провёл линий: "+n+" . Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }
    }
