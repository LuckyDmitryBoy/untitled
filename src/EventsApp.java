public class EventsApp {
    public static void main(String[] args) {

        ButtonClickHandler button = new ButtonClickHandler();
        button.execute();
        button.execute();
        button.execute();
    }
}

class ButtonClickHandler implements EventHandler{

    public void execute(){

        System.out.println("Кнопка нажата!");
    }
}

interface EventHandler{

    void execute();
}

class Button{

    EventHandler handler;
    Button(EventHandler action){

        this.handler=action;
    }
    public void click(){

        handler.execute();
    }
}
