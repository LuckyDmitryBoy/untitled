package example;

public class Divider extends WritingMaterials{
    public String dividerType ;
    public boolean metal;
    boolean draw=true;
    public final void draw_circle(){
        System.out.println("��������� ����");
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
        setDividerType("� ����������");
        setMetal(true);
    }
    public void display() {
        System.out.println("This is: " + "�������" +
                ", ����: " + null +
                ", �����: " + 0 + "," +
                ", ����: " + 0.0 + "" +
                " ����� ��������: " + (draw ? "��" : "���") +
                " ��� �������: "+dividerType+
                " ������ �� ���� ������� �� �������: "+(metal ? "��" : "���")+
                ".");
    }
}
