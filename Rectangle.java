/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classexercise6;

/**
 *
 * @author rodri
 */
public class Rectangle {
     
    private int length;
    private int width;
     
     public Rectangle (int length, int width){
            this.length = length;
            this.width = width;
     }
     
     public void setWidth(int width){
         if(width > 0) {
         this.width = width;
         }
     }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
     
     
     
     public void draw(){
         for (int i = 0; i < width; i++){
             for (int j = 0; j < length; j++){
                 System.out.print("*");
         }
                System.out.println();
         }
         
     }


}
