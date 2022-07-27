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
        setSquama("Крупная");
        setUpStreamSwim(true);
    }
    public void display(){
        System.out.println("I am Рыба"+
                " Имя: "+"Сельд"+
                " Возраст: "+0+
                " Вес: "+0.0+
                " Умеет летать: "+ "Нет"+
                " Умеет ходить: "+"Нет"+
                " Умеет плавать: "+"Да"+
                " Тип чешуи "+squama+
                " Умеет ли плавать против течения "+(upStreamSwim ? "Да" : "Нет"));
    }
}
