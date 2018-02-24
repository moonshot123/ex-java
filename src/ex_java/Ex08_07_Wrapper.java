package ex_java;

public class Ex08_07_Wrapper {

	public static void main(String[] args) {
		int sum=0;
		int [] num = {10,20,30,40,50};
		int i;
		
		for(i=0;i<num.length;i++){
			sum+=num[i];
		}
		
		System.out.println(sum);
		
		
		
		String sum2="";
		String [] num2 = {"10","20","30","40","50"};
		for(i=0;i<num.length;i++){
			sum2+=num2[i];
		}
		System.out.println(sum2);
		
		
		
		int[] num3=new int[5];
		for(i=0;i<num.length;i++){
			num3[i]=Integer.parseInt(num2[i]);
		}
		
		int sum3=0;
		for(i=0;i<num.length;i++){
			sum3+=num3[i];
		}
		System.out.println(sum3);
		
		
		
		String[] str = {
						"민아:90","크리스탈:40","아이유:70"
		};
		
		sum=0;
		int[] str2=new int[5];
		for(i=0;i<str.length;i++){
			int x = str[i].indexOf(":");
			str[i]=str[i].substring(x+1);
			str2[i]=Integer.parseInt(str[i]);
			sum+=str2[i];
		}
		System.out.println(sum);
		
		
		//System.out.println("이런게 수준차이?");
		sum=0;
		for(i=0;i<str.length;i++){
			sum+=Integer.parseInt(str[i].substring(str[i].indexOf(":")+1));
		}
		System.out.println(sum);
		
		
		
		
	}

}
