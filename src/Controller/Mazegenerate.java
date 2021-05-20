/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

public class Mazegenerate {
     private static Mazegenerate instance;
     private char[][] maze;
     
     private Mazegenerate()
     {
     }

     
     public static Mazegenerate getinstance()
     {
         if (instance == null)
         {
             instance = new Mazegenerate();
         }
         return instance;
     }
     
     public void randomize()
     {
        RecursiveDivision rec=new RecursiveDivision(18,18);
        rec.makeMaze();
        //setMaze(rec.getMaze());
         this.maze=rec.getMaze();
     }
     
    /**
     * @return the maze
     */
    public char[][] getMaze() {
        return maze;
    }

    /**
     * @param maze the maze to set
     */
    public void setMaze(char[][] maze) {
        this.maze = maze;
    }
     
     
    
}
