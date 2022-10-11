class  Luxe{
String movieName ;
int Time;
boolean hit ;
//from here to start constructor
    public Luxe(String mN, int T, boolean h){
//we have assign the value to take output
    movieName=mN;//here we declaring
    Time=T;
    hit=h; 
    System.out.println("Movie name is "+movieName+"\n"+"Time="+Time+"\n"+hit);
    }
//here end 
 public static void main (String [] arg){
 Luxe S1=new Luxe("PS1",10,true);
 }
}
//default or instalize construtor 
// when we giving the value for instalize value is called constructor
