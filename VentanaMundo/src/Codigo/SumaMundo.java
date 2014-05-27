package Codigo;

public class SumaMundo {
	
	private int num1=0;
	private int num2=0;
	public SumaMundo (int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public SumaMundo(){
		this.num1=0;
		this.num2=0;
}
	public void setSumando1 (int num1){
		this.num1=num1;
	}
	public void setSumando2 (int num2){
		this.num2=num2;
	}
	
	
	
	public int suma()
	{
		return this.num1+this.num2;
	}
	public int resta()
	{
		return this.num1-this.num2;
	}
	public int multiplicacion()
	{
		return this.num1*this.num2;
	}
}