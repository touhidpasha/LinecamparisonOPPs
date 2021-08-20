class Line{
    public int l1p1x,l1p1y,l1p2x,l1p2y;
    Line(int l1p1x,int l1p1y, int l1p2x,int l1p2y){

        this.l1p1x=l1p1x;
        this.l1p1y=l1p1y;
        this.l1p2x=l1p2x;
        this.l1p2y=l1p2y;
    }

    public double LineLenght()
    {
        return(Math.sqrt((l1p2x-l1p1x)^2+(l1p2y-l1p2y)^2));
    }
}
public class Linecompare{
    public static void main(String[] args) {
        System.out.println("welcome to line problem");
       Line l1=new Line(2, 3,7, 9);
       Line l2=new Line(3, 4, 8, 10);
    
        System.out.println(" line 1 length is "+l1.LineLenght()+" line 2 length is "+l2.LineLenght());
    
        if(l1.LineLenght()==l2.LineLenght())
         System.out.println("both lines are equal");
        else
            System.out.println("lines are not equal");
            
        
        
        if(l1.LineLenght()>l2.LineLenght())
        System.out.println("l1 is greaterthan l2");
        else if(l1.LineLenght()<l2.LineLenght())
        System.out.println("l2 is greaterthan l1");
        else 
        System.out.println("both are aqual");
        
    }
    
    }