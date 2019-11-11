import java.util.Stack;

/**
 * @ClassName Test1110
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/11  20:53
 * @Veresion 1.0
 */
public class Test1110 {
    //在神奇口袋选东西
    //利用回溯算法
   /* static int count=0;
    private static void select(int[] array,int sum,int n) {
        if(sum==0){
            count++;
            return;
        }
        if((sum<0)||((sum>0)&&(n<1))){
            return ;
        }
        select(array,sum-array[n],n-1);
        select(array,sum,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int i;
            int[] array = new int[n+1];
            for( i=1;i<=n;i++){
               array[i]=sc.nextInt();
            }
            select(array,40,n);
            System.out.println(count);
        }

    }*/
    //用两个栈实现一个队列完成队列的push和pop
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);

    }
    public int pop() {
        while(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {

    }
}
