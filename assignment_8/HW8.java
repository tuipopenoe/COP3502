class Ship{
    protected int column;
    protected boolean horizontal;
    protected int positions;
    protected char row;

    public Ship(){
        column = 0;
        horizontal = true;
        positions = 5;
        row = 'A';
    }

    public Ship(int col, boolean rot, int pos, char row){
        this.column = column;
        this.horizontal = horizontal;
        this.positions = positions;
        this.row = row;
    }

    public int getColumn(){
        return column;
    }

    public boolean getHorizontal(){
        return horizontal;
    }

    public int getPositions(){
        return positions;
    }

    public char getRow(){
        return row;
    }

    public void setColumn(int col){
        this.column = col;
    }

    public void setHorizontal(boolean rot){
        this.horizontal = rot;
    }

    public void setPositions(int pos){
        this.positions = pos;
    }

    public void setRow(char row){
        this.row = row;
    }


    public void printInfo(){
        System.out.println(this.toString());
    }

    public String toString(){
        return  "Column: " + column + "\n" +
                "Horizontal: " + horizontal + "\n" +
                "Positions: " + positions + "\n" +
                "Row: " + row + "\n";
    }
}

class AircraftCarrier extends Ship{
    public AircraftCarrier(){
        super(3, true, 5, 'F');
    }

    public AircraftCarrier(int col, boolean rot, int pos, char row){
        super(col, rot, pos, row);
    }

    public String toString(){
        return "Aircraft Carrier \n" + super.toString();
    }

    public void printInfo(){
        System.out.println(toString());
    }
}

class Battleship extends Ship{
    public Battleship(){
        super(6, true, 4, 'A');
    }

    public Battleship(int col, boolean rot, int pos, char row){
        super(col, rot, pos, row);
    }

    public String toString(){
        return "Battleship \n" + super.toString();
    }

    public void printInfo(){
        System.out.println(toString());
    }
}

class Destroyer extends Ship{
    public Destroyer(){
        super(2, false, 3, 'E');
    }

    public Destroyer(int col, boolean rot, int pos, char row){
        super(col, rot, pos, row);
    }

    public String toString(){
        return "Destroyer \n" + super.toString();
    }

    public void printInfo(){
        System.out.println(toString());
    }
}

class Submarine extends Ship{
    public Submarine(){
        super(1, true, 3, 'J');
    }

    public Submarine(int col, boolean rot, int pos, char row){
        super(col, rot, pos, row);
    }

    public String toString(){
        return "Submarine \n" + super.toString();
    }

    public void printInfo(){
        System.out.println(toString());
    }
}

class PatrolBoat extends Ship{
    public PatrolBoat(){
        super(2, false, 3, 'E');
    }

    public PatrolBoat(int col, boolean rot, int pos, char row){
        super(col, rot, pos, row);
    }

    public String toString(){
        return "Patrol Boat \n" + super.toString();
    }

    public void printInfo(){
        System.out.println(toString());
    }
}