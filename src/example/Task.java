package example;

public class Task {
        public static void main(String[] args) {
            WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
            wm.display();
            wm.MetodOfDescription();
            System.out.println(wm.toString());

            Pen p = new Pen();
            p.setName("Паркер");
            p.display();
            p.setCountColor(2);
            p.setAuto(false);
            System.out.println(p.getCountColor());
            System.out.println(p.isAuto());
            p.writeMyName();
            System.out.println(p.toString());

            Ruler r = new Ruler();
            r.setName("Линейка");
            r.display();
            r.setLength(25);
            r.setWood(true);
            System.out.println(r.getLength());
            System.out.println(r.isWood());
            r.measure();
            System.out.println(r.toString());

            Divider d = new Divider();
            d.setName("Циркуль");
            d.display();
            d.setDividerType("С карандашом");
            d.setMetal(true);
            System.out.println(d.getDividerType());
            System.out.println(d.isMetal());
            d.draw_circle();
            System.out.println(d.toString());
    }}

    class WritingMaterials {
        private String name, color;
        private int price;
        private double length;
        private boolean draw;
        {
            name="name";
            color="color";
        }
        public WritingMaterials(String name,String color,int price,double length,boolean draw) {
        this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;
        }
        public WritingMaterials(String name, double length) {
            this.name = name;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public boolean isDraw() {
            return draw;
        }

        public void setDraw(boolean draw) {
            this.draw = draw;
        }

        public void display() {
            System.out.println("Название: " + name +
                    ", Цвет: " + color +
                    ", Длина: " + length + "," +
                    ", Цена: " + price + "" +
                    " Умеет рисовать: " + (draw ? "Да" : "Нет") + ".");
        }

        public void replace_rod(String newColor) {
            color = newColor;
        }

        public void priceUp(int n) {
            price += n;
        }

        public void priceDown(int n) {
            price -= n;
        }

        public void draw() {
            System.out.println(draw ? name + " провёл линий: 1. Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }

        public void draw(int n) {
            System.out.println(draw ? name + " провёл линий: " + n + ". Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }

        public void draw(String color) {
            System.out.println(draw ? name + " провёл линий: 1. Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }

        public void draw(String color, int n) {
            System.out.println(draw ? name + " провёл линий: " + n + ". Их цвет - " + color + "." : name + " не может ничего нарисовать.");
        }
        public static final String description="описание класса письменных принадлежностей";
        public static void MetodOfDescription(){
            System.out.println(description);
        }
        public  static int NumberOfWriteMaterials=1;
        public WritingMaterials(){
           NumberOfWriteMaterials++;
        }
        public String toString(){
            return name+","+color+","+price+","+length+","+draw+","+NumberOfWriteMaterials;
        }
    }

