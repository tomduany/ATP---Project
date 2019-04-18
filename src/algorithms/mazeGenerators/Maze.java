package algorithms.mazeGenerators;

public class Maze {
    /**
     * Maze Class actualize
     *
     * @param string[][] - myMaze : A maze is represented by a two-dimensional array
     * @param Position   - startPosition : A start position of the maze
     * @param Position   - goalPosition : A last position of the maze (the end)
     *
     */
    private int[][] myMaze;
    private Position startPosition;
    private Position goalPosition;


    public Maze(int row, int column) {
        if (row < 2)
            row = 10;
        if (column < 2)
            column = 10;
        myMaze = new int[row][column];
        startPosition = new Position(0,0); //default start = (0,0)
    }



    public Position getStartPosition()
    {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        if (startPosition.getRowIndex() < this.numOfRows() && startPosition.getColumnIndex() < this.numOfColumns())
            if (startPosition.getColumnIndex() >= 0 && startPosition.getRowIndex() >= 0)
                this.startPosition = startPosition;
    }

    public Position getGoalPosition() {
        return goalPosition;
    }

    public void setGoalPosition(Position goalPosition) {
        if (goalPosition.getRowIndex() < this.numOfRows() && goalPosition.getColumnIndex() < this.numOfColumns())
            if (goalPosition.getColumnIndex() >= 0 && goalPosition.getRowIndex() >= 0)
                this.goalPosition = goalPosition;
    }


    public int numOfRows() {

        return myMaze.length;
    }

    public int numOfColumns() {

        return myMaze[0].length;
    }

    public void changeCellValue(int row, int column, int value) {
        if (value == 0 || value == 1)
            if (row < numOfRows() && column < numOfColumns() && row >= 0 && column >= 0)
                myMaze[row][column] = value;
    }


    public int getCellValue(int row, int column) {

        return myMaze[row][column];
    }


    public void print() {
        for (int i = 0; i < myMaze.length; i++) {
            System.out.println(" "); //go down at end of line of array
            for (int j = 0; j < myMaze[0].length; j++)
                if (i == startPosition.getRowIndex() && j == startPosition.getColumnIndex())
                    System.out.print(" S"); //start position
                else if (i == goalPosition.getRowIndex() && j == goalPosition.getColumnIndex())
                    System.out.print(" E"); //end position
                else
                    System.out.print(" " + myMaze[i][j]); //print if 0 or 1 and add space
        }
        System.out.println(" ");
    }





    //public List<Integer> OneZeroList(){
    // List<Integer> tmp=new ArrayList<>();
    // int counter=0;
    // boolean one=true;
    // boolean zero=true;
    // for(int i=0;i<numOfRows();i++)
    // {
    //     for(int j=0;j<numOfRows();j++){

    //         if(myMaze[i][j]=="0" && one==true && i != startPosition.getRowIndex() && j != startPosition.getColumnIndex()){
    //             tmp.add(counter);
    //             counter=0;
    //             one=false;
    //             zero=true;

    //         }
    //         if(myMaze[i][j]=="0" && zero==true &&i != startPosition.getRowIndex() && j != startPosition.getColumnIndex()){
    //             counter++;
    //         }

    //         if(myMaze[i][j]=="1" && zero==true &&i != startPosition.getRowIndex() && j != startPosition.getColumnIndex()){
    //             tmp.add(counter);
    //             counter=0;
    //             one=true;
    //             zero=false;
    //         }
    //         if(myMaze[i][j]=="1" && one==true && i!= startPosition.getRowIndex()  j!= startPosition.getColumnIndex()){
    //             counter++;
    //         }

    //     }
    // }
    // return tmp;
    // }

    /*
     * to string function
     */
    public String toString() {
        String x;
        x = startPosition.getColumnIndex() + " " + startPosition.getRowIndex() + " " + goalPosition.getRowIndex() + " " + goalPosition.getColumnIndex() + " " + myMaze.length + " " + myMaze[0].length;
        return x;
    }


}
