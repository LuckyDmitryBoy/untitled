package AnimalsJava;

import AnimalsJava.Animal1;

public final class Fish extends Animal1 {
    private String squama;
    private boolean upStreamSwim;
    public void bul_bul (){
System.out.println("Bul-bul");
    }
    public void setSquama(String fishSquama){
        squama=fishSquama;
    }
    public void setUpStreamSwim(boolean fishUpStreamSwim){
        upStreamSwim=fishUpStreamSwim;
    }
    public String getSquama(){
        return squama;
    }
    public boolean isUpStreamSwim(){
        return upStreamSwim;
    }
    {
      squama="Underfind";
      upStreamSwim=true;
    }
    public  Fish(){
        super();
        setSquama("�������");
        setUpStreamSwim(true);
    }
    public void display(){
        System.out.println("I am ����"+
                " ���: "+"�����"+
                " �������: "+0+
                " ���: "+0.0+
                " ����� ������: "+ "���"+
                " ����� ������: "+"���"+
                " ����� �������: "+"��"+
                " ��� ����� "+squama+
                " ����� �� ������� ������ ������� "+(upStreamSwim ? "��" : "���"));
    }
}
