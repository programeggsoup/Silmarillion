public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    public int width = 0;
    public int height = 0;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return this.width * this.height;   
    }
}
