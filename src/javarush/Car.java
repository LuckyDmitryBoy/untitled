package javarush;

public class Car {
        Engine engine=new Engine();
         public class Engine{
            public boolean isRunning;
            public void start(){
                isRunning=true;
            }
            public void stop(){
                isRunning=false;
            }
    }
}
