public class DrawFigures1Better
 {
    public static void main(String[] args)
    {
        topper();
        bottom();
        System.out.println();
        bottom();
        topper();
        topper();
        drawBox();
        System.out.println("|United|");
        System.out.println("|States|");
        drawBox();
        topper();
    }
       
    public static void topper()
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }   
    
    public static void bottom()
    {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    } 
    
    public static void drawBox()
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }   
 }

