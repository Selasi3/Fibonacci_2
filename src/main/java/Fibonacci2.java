import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {
    int result;
    List<Integer> fibValues = new ArrayList<>();







    public int fibonacci(int n){
        if(n<=0){
            throw new IllegalArgumentException("Number less than or equal to 0");
        }
        else if(n==1){
            result=0;
        }
        else if(n==2){
            result = 1;
        }
        else{
            for( int a=3;a<=n;a++){
                result = fibonacci(a-1)+fibonacci(a-2);
            }

        }
        return result;
    }

    public List<Integer> fibonacciList(int number){
        fibValues.clear();
        if(number<=0){
            throw new IllegalArgumentException("Number less than or equal to 0");
        }
        else if(number==1){
            fibValues.add(fibonacci(1));

        }
        else if(number==2){
            fibValues.add(fibonacci(1));
            fibValues.add(fibonacci(2));

        }
        else{
            fibValues.add(fibonacci(1));
            fibValues.add(fibonacci(2));

            for(int i=3;i<=number;i++){
                result = fibonacci(i-1)+fibonacci(i-2);
                fibValues.add(result);
            }
        }
        return fibValues;
    }
}
