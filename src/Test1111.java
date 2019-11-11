import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName Test1111
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/11  20:56
 * @Veresion 1.0
 */
public class Test1111 {
    //输入四个数字分别代表A-B，B-C,A+B，B+C求出A，B,C
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int A=(a+c)/2;
        int B=(b+d)/2;
        int C=B-b;
        if((a==A-B)&&(B-C==b)&&(A+B==c)&&(B+C==d)){
        System.out.println(A+" "+B+" "+C);
        }
        else{
            System.out.println("No");
        }
    }*/
    //输入N个整数，输出出现次数大于等于数组一半的数
    private static void halfTime(int[] array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int m= map.getOrDefault(array[i],0);
            map.put(array[i],m+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>=array.length/2){
                System.out.println(key);
                return ;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] c=x.split(" ");
        int[] s=new int[c.length];
        for(int j=0;j<c.length;j++){
            s[j]=c[j].charAt(0)-'0';
        }
        halfTime(s);
    }
}
