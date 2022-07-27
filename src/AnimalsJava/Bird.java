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
        setArea("На югах");
        setWinterFly(false);
    }
    public void display(){
        System.out.println("I am Птица"+
                " Имя: "+"Bob"+
                " Возраст: "+0+
                " Вес: "+0.0+
                " Умеет летать: "+ "Да"+
                " Умеет ходить: "+ "Нет"+
                " Умеет плавать: "+ "Нет"+
                " Зона обитания: "+area+
                " Улетает ли она зимовать: "+(winterFly ? "Да" : "Нет"));
    }
}
