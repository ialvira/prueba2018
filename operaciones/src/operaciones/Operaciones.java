package operaciones;

public class Operaciones {
	
	public static Boolean esPrimo(int numero)
	{
		int a=0;
		for(int i=1;i<=numero;i++)
		{
		    if(numero%i==0) 
		    a++;
		}
		if(a==2)
			return true;
		else
			return false;
	}
	public static long factorial (int numero)
	{
		long resultado =1;
		for(int a=1;a<=numero;a++)
		{
			resultado=a*resultado;
			if(a<numero)
			System.out.print(a +" x ");
			else
				System.out.print(a +"");
			 if(a==numero)
			System.out.println("=" +resultado);
		}
		return resultado;
		
	}
	public static void fibonacci(int numeroFac)
	{
		int primero=0,segundo=1,aux=0;
		
		System.out.println("prim"+primero +" seg "+segundo );
		for(int i=2;i<=numeroFac;i++)
		{
			aux=primero+segundo;
			primero=segundo;
			segundo=aux;
			System.out.println(aux);
		}		
		//if(i==numeroFac)
	}
	public static void mostrarDivisores(int numero)
	{ 
		System.out.print("los divisores de "+numero+ " son");
		for (int i=1;i<numero;i++)		
			if(numero%i==0)
				System.out.print(i + " ");
		
	}
	
	public static double potencia(int base, int numVeces)
	{
		double aux=1;
		for(int i=0;i<numVeces;i++)
			aux=aux*base;
		
		return aux;
		
	}
	public static void mostrarDivisoresPrimos(int num)
	{
		int h=1;
		int a=0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
			{				
				if(esPrimo(i))
					System.out.println(i + "es primo de " + num);		
				
			}
				
		}
	}
	public static void mostrarPrimos(int num1,int num2)
	{
		if(num1<num2) {
			System.out.println("loos numeros primos entre "+ num1 + "y" + num2+ " SON;");
			for(int i=num1;i<=num2;i++)
			{
				if(esPrimo(i))
				{
					System.out.print(i+ ", ");
				}
			
			}
		}
		else
		{
			System.out.println("loos numeros primos entre "+ num2 + "y" + num1+ " SON;");
			for(int i=num1;i>num2;i--)
			{
				if(esPrimo(i))
					System.out.print(i+ ", ");
			}
		}
	}
}
