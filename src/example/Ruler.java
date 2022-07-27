package example;

public final class Ruler extends  WritingMaterials{
    public double length;
    public boolean wood;
    public boolean draw=false;
    public void measure(){
        System.out.println("Сейчас померяем длину");
    }
    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
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
    {
        length=2.2;
        wood=true;
    }
    public Ruler(){
        super();
    setLength(25);
    setWood(true);
    }
    @Override
    public void display() {
        System.out.println("This is: " + "Линейка" +
                ", Цвет: " + null +
                ", Длина: " + 0 + "," +
                ", Цена: " + 0.0 + "" +
                " Умеет рисовать: " + (draw ? "Да" : "Нет") +
                " Длина линейки: "+length+
                " Из дерева ли эта линейка: "+(wood ? "Да" : "Нет")+".");
    }
}
