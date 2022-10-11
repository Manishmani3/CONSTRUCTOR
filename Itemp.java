class Itemp{
String Name;
int Id;
boolean time;
int salary;
    public Itemp(String n, int id, boolean t,int sal){
    Name=n;
    Id=id;
    time=t;
    salary= sal;
    System.out.println("Name = "+Name+"\n"+"employe Id= "+Id+"\n"+"Entry Time "+time+"\n"+"salary is "+salary);    
    }

    public Itemp(String n, int id, int sal, boolean t){
    System.out.println("Name = "+n+"\n"+"employe Id= "+id+"\n"+"salary is "+sal+"\n"+"Entry Time "+t);
    }
        public static void main (String [] args){
        Itemp nami= new Itemp("manikandanS",325505,true,25000); 
        Itemp numi= new Itemp("naveenkumar",325506,15000,false);       
        }
}
