package AnimalsJava;

import AnimalsJava.Animal1;

public class Bird extends Animal1 {
    private String area;
    private boolean winterFly;


    public void chirick_chirick (){
        System.out.println("Chirik-Chirik");}
    public void setArea(String birdarea){
        area=birdarea;
    }
    public void setWinterFly(boolean birdwinterfly){
        winterFly=birdwinterfly;
    }
    public String getArea(){
        return area;
    }
    public boolean isWinterFly(){
        return winterFly;
    }
    {
        area="Undefined";
        winterFly=false;
    }
    public Bird(){
       super();
        setArea("�� ����");
        setWinterFly(false);
    }
    public void display(){
        System.out.println("I am �����"+
                " ���: "+"Bob"+
                " �������: "+0+
                " ���: "+0.0+
                " ����� ������: "+ "��"+
                " ����� ������: "+ "���"+
                " ����� �������: "+ "���"+
                " ���� ��������: "+area+
                " ������� �� ��� ��������: "+(winterFly ? "��" : "���"));
    }
}
