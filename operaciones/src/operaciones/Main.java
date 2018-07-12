package operaciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		if(Operaciones.esPrimo(14)==true)
			System.out.println("primo");
		else 
			System.out.println("no primo");
		
		Operaciones.factorial(5);		
		Operaciones.fibonacci(5);
		Operaciones.mostrarDivisores(150);
		Operaciones.mostrarDivisoresPrimos(700);
		System.out.println("" + Operaciones.potencia(2,6));
		Operaciones.mostrarPrimos(5, 100);
		
		StringBuilder sb=new StringBuilder("hola");
		sb.append(" holaaa");
		System.out.println(sb.toString());
		int[] integers =new int[5];
		integers[0]=5;
		integers[1]=2;
		integers[2]=3;
		integers[3]=66;
		integers[4]=55;
		int[] numsAle=new int[20];
		
		for(int i =0 ;i<numsAle.length;i++)
			numsAle[i]=(int) (Math.random()*11);
		for(int num:numsAle)
		{
			System.out.println(num);
			
		}
	Object [] objs=new Object[5];
	objs[0]="hola mundo";
	objs[1]=1;
	objs[2]=new Operaciones();
	for(int i =0 ;i<objs.length;i++)
	{
		Object o=objs[i];
		if(o instanceof String)
		{
		String s=(String) o ;
		}
	}
	
		
	}

}
