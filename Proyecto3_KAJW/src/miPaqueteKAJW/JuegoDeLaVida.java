package miPaqueteKAJW;

public class JuegoDeLaVida {

	int x=0; 
	int universo=0;
	int f, c;
	int size=20; 
	char[][]universe1=new char[size][size];
	char[][]universe2=new char[size][size];

	public void JuegoDeVida() 
	{
		marco1();		
		rellenarUniverso1();
	}

	public void jugar()
	{
		JuegoDeVida();
		x=8;

		while (x>universo)
		{
			universo++;
			generarUniverso();
			System.out.println("Universo nº "+(universo));
			imprimirUniverso();
			intercambiar();
			generarUniverso();
			intercambiar();
			universo++;
		}

	}

	private void rellenarUniverso1()
	{
		for (f=1, c=1; f<size-1; f++, c++)
		{
			universe1[f][c]='*';
		}

		for (f=1, c=size-2; f<size-1; f++, c--)
		{
			universe1[f][c]='*';
		}
	}

	private void marco1()
	{
		for (f=0; f<universe1.length; f++)
		{
			for (c=0; c<universe1[f].length; c++)
			{
				if (f==0 || f==size-1)
				{
					universe1[f][c]='-';
				}

				if (c==0 || c==size-1)
				{
					universe1[f][c]='|';
				}
			}
		}
	}


	private void marco2()
	{
		for (f=0; f<universe2.length; f++)
		{
			for (c=0; c<universe2[f].length; c++)
			{
				if (f==0 || f==size-1)
				{
					universe2[f][c]='-';
				}

				if (c==0 || c==size-1)
				{
					universe2[f][c]='|';
				}
			}
		}
	}


	private int evaluar(int a, int b)
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

				if(universe1[vf][vc]=='*')
				{
					celVecinas++;
				}
			}
		}
		return celVecinas;

	}


	private void generarUniverso()
	{
		marco2();
		int celVecinas=0;
		for (f=1; f<universe1.length-1; f++)
		{
			for (c=1; c<universe1[f].length-1; c++)
			{
				celVecinas=evaluar(f,c);
				if (universe1[f][c]=='*')
				{
					if(celVecinas==0 || celVecinas==1)
					{
						universe2[f][c]=' ';
					} 
					else
					{
						if(celVecinas==2 || celVecinas==3)
						{
							universe2[f][c]='*';
						} 
						else
						{
							if(celVecinas>3)
							{
								universe2[f][c]=' ';
							} 
						}
					}
				}
				else
				{
					if(celVecinas==3)
					{
						universe2[f][c]='*';
					} else
					{
						universe2[f][c]=' ';
					}
				}
			}
		}
	}

	private void intercambiar()
	{
		marco2();
		for (f=1; f<universe1.length-1; f++)
		{
			for (c=1; c<universe1[f].length-1; c++)
			{
				universe1[f][c]=universe2[f][c];
			}
		}
	}

	private void imprimirUniverso()
	{
		for (f=0; f<universe1.length; f++)
		{
			for (c=0; c<universe1[f].length; c++)
			{
				System.out.print(universe1[f][c]+"  ");
			}
			System.out.println("\n");
		}

		System.out.println("Universo "+(universo+1));
		for (f=0; f<universe1.length; f++)
		{
			for (c=0; c<universe2[f].length; c++)
			{
				System.out.print(universe2[f][c]+"  ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}
