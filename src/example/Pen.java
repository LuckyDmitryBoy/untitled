package example;

public class Pen extends WritingMaterials{
public int countColor;
public boolean auto;
public boolean draw=true;
public void writeMyName(){
    System.out.println("������");
}
    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }
    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    {
        countColor=2;
        auto=true;
    }
    public Pen(){
    super();
    setCountColor(2);
    setAuto(false);
    }
    public void display() {
        System.out.println("This is: " + "������" +
                ", ����: " + null +
                ", �����: " + 0 + "," +
                ", ����: " + 0.0 + "" +
                " ����� ��������: " + (draw ? "��" : "���") +
                " ���������� ������ ���� �����: "+countColor+
                " �������������� ��: "+ (auto ? "��" : "���")+".");
    }
}
