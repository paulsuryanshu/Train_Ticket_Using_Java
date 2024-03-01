import java.io.*;
class RailwayTicket{
    String name;
    String coach;
    long mobile_no;
    int amount;
    int total_amount;
    public void getdata()throws Exception
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter the name of the passenger :: ");
        name = br.readLine();
        System.out.println("The extra price of the First_AC is 700,Second_AC is 500,Third_AC is 250,sleeper is none");
        System.out.print("Enter the coach type such as First_AC,Second_AC,Third_AC,sleeper with proper abbreviation which is mentioned here :: ");
        coach = br.readLine();
        System.out.print("Enter the mobile number of the passenger :: ");
        mobile_no = Long.parseLong(br.readLine());
        System.out.println();
        System.out.println();
        System.out.println();
    }
    void journey_cost()
    {
        amount = 300;
        if (coach.equals("First_AC")) 
        {
            total_amount = amount + 700;
        } 
        else if (coach.equals("Second_AC")) 
        {
            total_amount = amount + 500;
        } 
        else if (coach.equals("Third_AC")) 
        {
            total_amount = amount + 250;
        } 
        else if (coach.equals("sleeper")) 
        {
            total_amount = amount;
        }
    }
    void display()
    {
        System.out.println("The name of the passenger is :: "+name);
        System.out.println("Coach type is :: "+coach);
        System.out.println("Mmobile number of the passenger is :: "+mobile_no);
        System.out.println("The base ammount is :: "+amount);
        System.out.println("The total payable amount is :: "+total_amount);
        System.out.println("Because The extra price of the First_AC is 700,Second_AC is 500,Third_AC is 250,sleeper is none");
    }
}
class main{
    public static void main(String args[])throws Exception
    {
        RailwayTicket ob = new RailwayTicket();
        ob.getdata();
        ob.journey_cost();
        ob.display();
    }
}
