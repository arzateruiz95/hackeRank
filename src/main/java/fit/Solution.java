package fit;

public class Solution {

        public static void main(String[] args){
        int[][] island = {
                {9, 4, 8, 2, 7},
                {1, 5, 9, 5, 4},
                {2, 7, 3, 8, 6},
                {4, 5, 4, 6, 1},
                {1, 2, 7, 9, 8}
        };
        System.out.println(willWaterFlowToTheOcean(island, 2, 1));
    }
    // Given an x,y where water is, will it flow to ocean
// - Rain can flow adjacent and can only flow to lower spot needs to hit a boundary
    public static boolean willWaterFlowToTheOcean(int[][] island, int x, int y)
    {
        int inTheEdge = 0;
        int rows = island.length;
        int columns = island[0].length;
        //Right
        if(x+1 < columns && island[y][x] > island[y][x+1]){
            inTheEdge =  willWaterFlowToTheOcean(island,x+1,y)? inTheEdge + 1 : inTheEdge;
        }
        //Left
        if(x-1 >= 0 && island[y][x] > island[y][x-1]){
            inTheEdge =  willWaterFlowToTheOcean(island,x-1,y)? inTheEdge + 1 : inTheEdge;
        }
        //Up
        if(y-1 >= 0  && island[y][x] > island[y-1][x]){
            inTheEdge =  willWaterFlowToTheOcean(island,x,y-1)? inTheEdge + 1 : inTheEdge;
        }
        //Down
        if(y+1 < rows  && island[y][x] > island[y+1][x]){
            inTheEdge =  willWaterFlowToTheOcean(island,x,y+1)? inTheEdge + 1 : inTheEdge;
        }
        //Tile on which it is operating
        inTheEdge = isInEdge(rows,columns,x,y) ? inTheEdge + 1 : inTheEdge;
        System.out.println(island[y][x] + " - " + inTheEdge);

            return inTheEdge > 0;
    }


    public static boolean willWaterFlowToTheOceanC(int[][] island, int x, int y)
    {
        int inTheEdge = 0;
        int rows = island.length;
        int columns = island[0].length;

        //Tile on which it is operating
        inTheEdge = isInEdge(rows,columns,x,y) ? inTheEdge + 1 : inTheEdge;

        //Right
        if(inTheEdge == 0 && x+1 < columns && island[y][x] > island[y][x+1]){
            inTheEdge =  willWaterFlowToTheOcean(island,x+1,y)? inTheEdge + 1 : inTheEdge;
        }
        //Left
        if(inTheEdge == 0 && x-1 >= 0 && island[y][x] > island[y][x-1]){
            inTheEdge =  willWaterFlowToTheOcean(island,x-1,y)? inTheEdge + 1 : inTheEdge;
        }
        //Up
        if(inTheEdge == 0 && y-1 >= 0  && island[y][x] > island[y-1][x]){
            inTheEdge =  willWaterFlowToTheOcean(island,x,y-1)? inTheEdge + 1 : inTheEdge;
        }
        //Down
        if( inTheEdge == 0 && y+1 < rows  && island[y][x] > island[y+1][x]){
            inTheEdge =  willWaterFlowToTheOcean(island,x,y+1)? inTheEdge + 1 : inTheEdge;
        }

        System.out.println(island[y][x] + " - " + inTheEdge);

        return inTheEdge > 0;
    }

    public static boolean isInEdge(int rowLength,int columnLength, int x, int y){
            return (x == 0 || x == rowLength-1) || ( y == 0 || y == columnLength-1);
    }
}