package exer1dia9;
import java.util.Scanner;
public class exer1dia9 {

	public static void main(String[] args) 
	{		
     Scanner ler = new Scanner(System.in);
     int Soma=0;
     int Q[]= {0,1,2,3,4,5};
   //Criando variáveis para alterar o valor dos numeros fakes
     int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
     //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
     //Recebendo valor
     a=ler.nextInt(); 
   //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
   //Recebendo valor
     b=ler.nextInt(); 
   //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
   //Recebendo valor
     c=ler.nextInt(); 
   //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
   //Recebendo valor
     d=ler.nextInt();
   //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
   //Recebendo valor
     e=ler.nextInt(); 
   //Pedindo para digitar o valor para alterar o valor do array
     System.out.printf("Digite um número para acrescentar no array:\n");
   //Recebendo valor
     f=ler.nextInt();
     //Alterando valor fake para o valor informado 
     Q[0]=a;
   //Alterando valor fake para o valor informado
     Q[1]=b;
   //Alterando valor fake para o valor informado
     Q[2]=c;
   //Alterando valor fake para o valor informado
     Q[3]=d;
   //Alterando valor fake para o valor informado
     Q[4]=e;
   //Alterando valor fake para o valor informado
     Q[5]=f;
     int n=Q.length;
     for (int C=0; C<n;C++) {
    	 Soma=Soma+Q[C];
     }
     int media;
     media=Soma/n;
     System.out.printf("A media e: %d\n", media);
     if (Q[0]>media) 
    	 System.out.printf("A sala 0 tem mais alunos que a media\n");
     if (Q[1]>media) 
    	 System.out.printf("A sala 1 tem mais alunos que a media\n");
     if (Q[2]>media) 
    	 System.out.printf("A sala 2 tem mais alunos que a media\n");
     if (Q[3]>media) 
    	 System.out.printf("A sala 3 tem mais alunos que a media\n");
     if (Q[4]>media) 
    	 System.out.printf("A sala 4 tem mais alunos que a media\n");
     if (Q[5]>media) 
    	 System.out.printf("A sala 5 tem mais alunos que a media\n");     
	}
}
