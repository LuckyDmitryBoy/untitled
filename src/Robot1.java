public class Robot1 {
    int x = 0;
    int y = 0;
    Direction d = Direction.UP;

    public Direction getDirection() {
        return d;
        // текущее направление взгляда
    }

    public int getX() {
        return x;
        // текущая координата X
    }

    public int getY() {
        return y;
        // текущая координата Y
    }

    public void turnLeft() {System.out.println("Поворот головы против часовой стрелки");
        if(d==Direction.LEFT){d=Direction.DOWN;return; }
        else if (d==Direction.RIGHT) {d=Direction.UP;return;}
        else if (d==Direction.UP) {d=Direction.LEFT;return;}
        else{d=Direction.RIGHT; return;}
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        System.out.println("Поворот головы по часовой стрелки");
        if(d==Direction.LEFT){d=Direction.UP;return; }
        else if (d==Direction.RIGHT) {d=Direction.DOWN;return;}
        else if (d==Direction.UP) {d=Direction.RIGHT;return;}
        else{d=Direction.LEFT; return;}
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        System.out.println("движение");
        if(d==Direction.LEFT){x--;return;}
        if(d==Direction.UP){y++;return;}
        if(d==Direction.RIGHT){x++;return;}
        if(d==Direction.DOWN){y--;return;}
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
