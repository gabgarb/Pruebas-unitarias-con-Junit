package Codigo;


public class VentanaMundo {
public static void main (String[]args){
	SumaMundo s=new SumaMundo(10,11);
	SumaMundo s2=new SumaMundo(15,16);
	SumaMundo s3=new SumaMundo(12,26);
	SumaMundo s4=new SumaMundo(12,26);
	
	System.out.println(s.suma());
	System.out.println(s2.suma());
	System.out.println(s2.resta());
}
}
