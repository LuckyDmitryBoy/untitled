package AnimalsJava;

public class Animal1 {
        private String type;
        private String name;
        private int age;
        private double weight;
        private boolean isSwim;
        private boolean isWalk;
        private boolean isFly;
    {
name="Undefined";
type="Undefined";
    }
        public Animal1(String type, String name,int age,double weight,boolean isFly,boolean isSwim,boolean isWalk){
            this.type=type;
            this.name=name;
            this.age=age;
            this.weight=weight;
            this.isFly=isFly;
            this.isSwim=isSwim;
            this.isWalk=isWalk;
        }

    public void setType(String usertype){
            type=usertype;
        }
        public void setName(String username){
            name=username;
        }
        public void setAge(int userage){
            age=userage;
        }
        public void setWeight(double userweight){
            weight=userweight;
        }
        public void setSwim(boolean userisswim){
            isSwim=userisswim;
        }
        public void setWalk(boolean useriswalk){
            isWalk=useriswalk;
        }
        public void setFly(boolean userisfly){
            isFly=userisfly;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public double getWeight(){
            return weight;
        }
        public boolean isSwim(){
            return isSwim;
        }
        public boolean isWalk(){
            return isWalk;
        }
        public boolean isFly(){
            return isFly;
        }
        public String getType(){
            return type;
        }
        public void display(){
            System.out.println("���: "+type+" ���: "+name+" �������: "+age+" ���: "+weight+" ����� ������: "+(isFly ? "��" : "���")+" ����� ������: "+(isWalk ? "��" : "���")+" ����� �������: "+(isSwim ? "��" : "���"));
        }
        final String rename(String newNAme) {
            name=newNAme;
            return newNAme;
        }
        void holiday() {
            weight+=0.1;
        }
        void holiday(double m) {
            weight+=m;
        }
        void holiday(double m,int n) {
            weight+=(n*m);
        }
    private static int numberofanimal=1;
        public Animal1 (){
            numberofanimal++;
        }

    @Override
    public String toString() {
        return type+","+name+","+age+","+weight+","+isFly+","+isSwim+","+isWalk+","+numberofanimal;
    }
}

