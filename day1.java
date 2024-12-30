import java.util.*;
class light{
    int led;
    int power;
    int fiber;
    int battery;
    boolean status;
    

/*light(int l,int p,int f,int b)
this.led;
this.power;
this.fiber;
this.battery;
this.status;
}*/
public void switchon(){
   System.out.println("light on");
}
public void switchoff(){
    System.out.println("light off");
}
public void chargelight(){
    System.out.println("charging");
}
public void setter(int l,int p,int f,int b)
{
    led=l;
    power=p;
    fiber=f;
    battery=b;
    status=false;
    }
    public  void getter(){
        System.out.println("repeat(10)"+"details of  light"+"-".repeat(10));
        System.out.println("led"+led);
        System.out.println("power"+power);
        System.out.println("fiber"+fiber);
        System.out.println("battery"+battery);
        System.out.println("status"+status);
    }
}
    public class Main{
        public static void main (String[] args) {
            Scanner inp=new Scanner(System.in);
            light l1=new light();
            l1.setter(2,5,1,38);
            l1.getter();
            
            l1.switchon();
            l1.switchoff();
            l1.chargelight();
             
            light l2=new light();
            l2.setter(3,5,2,38);
            l2.getter();
            
            light l3=new light();
            l3.setter(4,5,3,38);
            l3.getter();
            inp.close();
            
            

        }
        
    }
    
        
