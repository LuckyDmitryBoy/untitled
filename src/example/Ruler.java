package example;

public final class Ruler extends  WritingMaterials{
    public double length;
    public boolean wood;
    public boolean draw=false;
    public void measure(){
        System.out.println("������ �������� �����");
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
        System.out.println("This is: " + "�������" +
                ", ����: " + null +
                ", �����: " + 0 + "," +
                ", ����: " + 0.0 + "" +
                " ����� ��������: " + (draw ? "��" : "���") +
                " ����� �������: "+length+
                " �� ������ �� ��� �������: "+(wood ? "��" : "���")+".");
    }
}
