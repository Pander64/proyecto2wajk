package miPaqueteGrupo1;
import java.util.Random;

public class JuegoDeLaVida 
{
	static int x, universo=0, f, c, ld=16; 
	static char[][] vid=new char[ld][ld], vida=new char[ld][ld];
	
	public static void JuegodVida() 
	{
		borde1();
		signo();
	}

	public static void jugar()
	{
		JuegodVida();
		x=6;
		
		while (x>universo)
		{
			universo++;
			generar();
			System.out.println("Universo "+(universo));
			imprimir();
			intercambiar();
			generar();
			intercambiar();
			universo++;
		}
		
	}

	private static void signo()
	{
		for (f=1, c=1; f<ld-1; f++, c++)
		{
			vid[f][c]='*';
		}

		for (f=1, c=ld-2; f<ld-1; f++, c--)
		{
			vid[f][c]='*';
		}
	}

	private static void borde1()
	{
		for (f=0; f<vid.length; f++)
		{
			for (c=0; c<vid[f].length; c++)
			{
				if (f==0 || f==ld-1)
				{
					vid[f][c]='-';
				}

				if (c==0 || c==ld-1)
				{
					vid[f][c]='|';
				}
			}
		}
	}
	
	
	private static void borde2()
	{
		for (f=0; f<vida.length; f++)
		{
			for (c=0; c<vida[f].length; c++)
			{
				if (f==0 || f==ld-1)
				{
					vida[f][c]='-';
				}

				if (c==0 || c==ld-1)
				{
					vida[f][c]='|';
				}
			}
		}
	}
	
	
	private static int evaluar(int a, int b)
	{
		int celVecinas=0;
		for (int vf=a-1; vf<=a+1; vf++)
		{
			for (int vc=b-1; vc<=b+1; vc++)
			{
				if (vf==a && vc==b)
				{
					vc++;
				}

				if(vid[vf][vc]=='*')
				{
					celVecinas++;
				}
			}
		}
		return celVecinas;
		
	}
	
	
	private static void generar()
	{
		borde2();
		int celVecinas=0;
		for (f=1; f<vid.length-1; f++)
		{
			for (c=1; c<vid[f].length-1; c++)
			{
				celVecinas=evaluar(f,c);
				if (vid[f][c]=='*')
				{
					if(celVecinas==0 || celVecinas==1)
					{
						vida[f][c]=' ';
					} 
					else
					{
						if(celVecinas==2 || celVecinas==3)
						{
							vida[f][c]='*';
						} 
						else
						{
							if(celVecinas>3)
							{
								vida[f][c]=' ';
							} 
						}
					}
				}
				else
				{
					if(celVecinas==3)
					{
						vida[f][c]='*';
					} else
					{
						vida[f][c]=' ';
					}
				}
			}
		}
	}
	
	private static void intercambiar()
	{
		borde2();
		for (f=1; f<vid.length-1; f++)
		{
			for (c=1; c<vid[f].length-1; c++)
			{
				vid[f][c]=vida[f][c];
			}
		}
	}
	
	private static void imprimir()
	{
		for (f=0; f<vid.length; f++)
		{
			for (c=0; c<vid[f].length; c++)
			{
				System.out.print(vid[f][c]+"  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Universo "+(universo+1));
		for (f=0; f<vid.length; f++)
		{
			for (c=0; c<vida[f].length; c++)
			{
				System.out.print(vida[f][c]+"  ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}

