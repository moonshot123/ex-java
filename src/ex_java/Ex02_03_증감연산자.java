package ex_java;

public class Ex02_03_���������� {

	public static void main(String[] args) {
		
		int a =5,b=5,c,d;
		
		a=a+1;
		a+=1;
		a++; //���߿�����
		++a; //��������
		a--; //���߿�����
		--a; //��������
		
		System.out.println("a:"+a);
		
		a=5;
		c = a++;
		d=++b;
		
		System.out.println("a:"+a + ", c:"+ c);
		System.out.println("b:"+b + ", d:"+ d);
		
		
		
		a = 5;
		c = a--;
		b = 5;
		d = --b;
		
		System.out.println("a:"+a + ", c:"+ c);
		System.out.println("b:"+b + ", d:"+ d);
		
		
		a=5;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		a=10;
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		
		
		
		
	}

}
