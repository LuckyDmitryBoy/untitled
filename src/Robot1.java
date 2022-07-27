public class Robot1 {
    int x = 0;
    int y = 0;
    Direction d = Direction.UP;

    public Direction getDirection() {
        return d;
        // ������� ����������� �������
    }

    public int getX() {
        return x;
        // ������� ���������� X
    }

    public int getY() {
        return y;
        // ������� ���������� Y
    }

    public void turnLeft() {System.out.println("������� ������ ������ ������� �������");
        if(d==Direction.LEFT){d=Direction.DOWN;return; }
        else if (d==Direction.RIGHT) {d=Direction.UP;return;}
        else if (d==Direction.UP) {d=Direction.LEFT;return;}
        else{d=Direction.RIGHT; return;}
        // ����������� �� 90 �������� ������ ������� �������
    }

    public void turnRight() {
        System.out.println("������� ������ �� ������� �������");
        if(d==Direction.LEFT){d=Direction.UP;return; }
        else if (d==Direction.RIGHT) {d=Direction.DOWN;return;}
        else if (d==Direction.UP) {d=Direction.RIGHT;return;}
        else{d=Direction.LEFT; return;}
        // ����������� �� 90 �������� �� ������� �������
    }

    public void stepForward() {
        System.out.println("��������");
        if(d==Direction.LEFT){x--;return;}
        if(d==Direction.UP){y++;return;}
        if(d==Direction.RIGHT){x++;return;}
        if(d==Direction.DOWN){y--;return;}
        // ��� � ����������� �������
        // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
    }
}
