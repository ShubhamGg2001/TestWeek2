public class Q1{
    public static void main(String[] args) {
        Flute flute=new A();
        flute.setGsm(2);
        JoiningObject joiningObject=new Pastings();
        Box box=new Universal();
        box.setFlute(flute);
        box.setJoiningObject(joiningObject);
        box.setHeight(2);
        box.setWidth(2);
        box.setLength(2);
        System.out.println("Rs."+box.calculateCost());

    }
}
class Box{
    private double length; //private variables
    private double height;
    private double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return(length*width*height);
    }
    public Flute getFlute() {
        return flute;
    }
    public void setFlute(Flute flute) {
        this.flute = flute;
    }
    public JoiningObject getJoiningObject() {
        return joiningObject;
    }
    public void setJoiningObject(JoiningObject joiningObject) {
        this.joiningObject = joiningObject;
    }
    public boolean isDoublePart() {
        return doublePart;
    }
    public void setDoublePart(boolean doublePart) {
        this.doublePart = doublePart;
    }
    public double calculateCost(){
        System.out.println("Dummy Cost:0");
        return 0.0;
    }
    private boolean doublePart;
    private Flute flute; //has a relationship
    private JoiningObject joiningObject; //has a relationship
}
class Flute{
private double gsm;

private double extraGsm;

public double getGsm() {
    return gsm;
}

public void setGsm(double gsm) {
    this.gsm = gsm;
}

public double getExtraGsm() {
    return extraGsm;
}

public void setExtraGsm(double extraGsm) {
    this.extraGsm = extraGsm;
}
}

interface JoiningObject{ // joining Object is an interface.
        public void pastingNature();
}

class A extends Flute{
    private  double extraGsm=10;

    public  double getExtraGsm() {
        return extraGsm;
    }
}
class B extends Flute{
    private  double extraGsm=30;
    public  double getExtraGsm() {
        return extraGsm;
    }
}
class C extends Flute{
    private double extraGsm=20;
    public  double getExtraGsm() {
        return extraGsm;
    }
}
class E extends Flute{
    private double extraGsm=40;
    public  double getExtraGsm() {
        return extraGsm;
    }
}
class F extends Flute{
    private  double extraGsm=50;
    public  double getExtraGsm() {
        return extraGsm;
    }
}
class G extends Flute{
    private double extraGsm=20;
    public  double getExtraGsm() {
        return extraGsm;
    }
}
class Pins implements JoiningObject{

    @Override
    public void pastingNature() {
        System.out.println("Pasts using a PIN");
        
    }
    
}
class Pastings implements JoiningObject{

    @Override
    public void pastingNature() {
        System.out.println("Uses PAstings for pasting things.");
        
    }
}
class Universal extends Box{
public double calculateCost(){
    double totalGsm=(getFlute().getGsm())*100+getFlute().getExtraGsm();
    int cost;
    if(getJoiningObject() instanceof Pins)
        cost=10;
    else 
        cost=20;
    if(this.isDoublePart()) // Checking single part or double part.
        cost=cost*3;
    double boxCost=this.getArea()*totalGsm*(getFlute().getExtraGsm())*cost;
    return boxCost;
}
}
class AllFlapMeeting extends Box{
    public double calculateCost(){
        double totalGsm=(getFlute().getGsm())*100+getFlute().getExtraGsm();
        int cost;
        if(getJoiningObject() instanceof Pins)
            cost=10;
        else 
            cost=30;
        if(this.isDoublePart()) // Checking single part or double part.
            cost=cost*3;
        double boxCost=this.getArea()*totalGsm*(getFlute().getExtraGsm())*cost;
        return boxCost;
    }
}
class Honeycomb extends Box{
    public double calculateCost(){
        double totalGsm=(getFlute().getGsm())*100+getFlute().getExtraGsm();
        int cost;
        if(getJoiningObject() instanceof Pins)
            cost=10;
        else 
            cost=40;
        if(this.isDoublePart()) // Checking single part or double part.
            cost=cost*3;
        double boxCost=this.getArea()*totalGsm*(getFlute().getExtraGsm())*cost;
        return boxCost;
    }
}
class ReverseTuckIn extends Box{
    public double calculateCost(){
        double totalGsm=(getFlute().getGsm())*100+getFlute().getExtraGsm();
        int cost;
        if(getJoiningObject() instanceof Pins)
            cost=10;
        else 
            cost=40;
        if(this.isDoublePart()) // Checking single part or double part.
            cost=cost*3;
        double boxCost=this.getArea()*totalGsm*(getFlute().getExtraGsm())*cost;
        return boxCost;
    }
}
class TopOpeningSnapLock extends Box{
    public double calculateCost(){
        double totalGsm=(getFlute().getGsm())*100+getFlute().getExtraGsm();
        int cost;
        if(getJoiningObject() instanceof Pins)
            cost=10;
        else 
            cost=50;
        if(this.isDoublePart()) // Checking single part or double part.
            cost=cost*3;
        double boxCost=this.getArea()*totalGsm*(getFlute().getExtraGsm())*cost;
        return boxCost;
    }
}