package AnimalsJava;

import AnimalsJava.Animal1;

public class Insect extends Animal1 {
    private int wingCount;
    private boolean likeJesus;
    public void ggggg (){
        System.out.println("Ggggg");}
    public void setWingCount(int insertWingCount){
        wingCount=insertWingCount;
    }
    public void setLikeJesus(boolean InsertLikeJesus){
        likeJesus=InsertLikeJesus;
    }
    public int getWingCount(){
        return wingCount;
    }
    public boolean isLikeJesus(){
        return likeJesus;
    }
    {
        wingCount=4;
        likeJesus=true;
    }
    public Insect(){
        super();
        setWingCount(4);
        setLikeJesus(true);
    }
    public void display(){
        System.out.println("I am Насекомое"+
                " Имя: "+"Жук Жукыч"+
                " Возраст: "+0+
                " Вес: "+0.0+
                " Умеет летать: "+ "Нет"+
                " Умеет ходить: "+"Да"+
                " Умеет плавать: "+"Нет"+
                " Количество крыльев "+wingCount+
                " Умеет ли ходить по воде "+(likeJesus ? "Да" : "Нет"));
    }
}
