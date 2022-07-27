package example;

public class Divider extends WritingMaterials{
    public String dividerType ;
    public boolean metal;
    boolean draw=true;
    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }
    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }
    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    {
        dividerType="divider";
        metal=true;
    }
    public Divider(){
        super();
        setDividerType("С карандашом");
        setMetal(true);
    }
    public void display() {
        System.out.println("This is: " + "Циркуль" +
                ", Цвет: " + null +
                ", Длина: " + 0 + "," +
                ", Цена: " + 0.0 + "" +
                " Умеет рисовать: " + (draw ? "Да" : "Нет") +
                " Тип циркуля: "+dividerType+
                " Сделан ли этот циркуль из металла: "+(metal ? "Да" : "Нет")+
                ".");
    }
}
