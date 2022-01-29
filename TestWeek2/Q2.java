import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.setName("Shubham");
        employee.setAge(20);
        Item item=new Item();
        item.setName("Onion");
        item.setPrice(80);
        item.setDiscount(20);
        VegetableBill bill=new DiscountBill(employee,false);
        bill.add(item);
        System.out.println(bill.getTotal());
    }
}
class Employee{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;
}

class Item{
    private String name;
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    private double price;
    private double discount;
}

class VegetableBill{
    private double totalBill;
    List<Item> itemsList=new ArrayList<>(); // has a relationship with itema.
    public VegetableBill(Employee clerk)
    {

    }
    public void add(Item item){
        totalBill=totalBill+item.getPrice();
        itemsList.add(item);
    }
    public double getTotal(){
        return totalBill;
    }
    public void printRecipt(){
        for(Item item:itemsList)
            System.out.println(item.getName()+" : "+"Rs."+item.getPrice());
        System.out.println("Total: "+"Rs."+totalBill);
    }
}

class DiscountBill extends VegetableBill{ // Extention of VegetableBill class for discounts
    boolean preferred;
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred=preferred;
    }
    public double getDiscountAmount(){
        if(preferred==false)
            return 0.0;
        double discountAmount=0.0;
       for(Item item:itemsList)
       {
            if(!(item.getDiscount()==0.0))
            {
                discountAmount=discountAmount+item.getDiscount();
                
            }
      }
       return discountAmount;
    }
    public double getTotal(){
        if(preferred==false)
            return super.getTotal();
        double amountAfterDiscount=super.getTotal();
        for(Item item:itemsList)
        {
             if(!(item.getDiscount()==0.0))
             {
                 amountAfterDiscount=amountAfterDiscount-item.getDiscount();
                 
             }
       }
       return amountAfterDiscount;
    }
    public int getDiscountCount()
    {
        if(preferred==false)
            return 0;
        int discountCount=0;
        for(Item item:itemsList)
       {
            if(!(item.getDiscount()==0.0))
            {
                discountCount++;
                
            }
      }
      return discountCount;
    }
    public double getDiscountPercent(){
        return ((getDiscountAmount()/getTotal())*100);
    }
}
