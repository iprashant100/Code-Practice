package Concepts;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorsEvenAndOdd {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        IntStream.range(0, 101).forEach(
            p -> {
                CompletableFuture<Integer> comp1 = CompletableFuture.completedFuture(p).thenApplyAsync(e-> {
                    if(e%2==0)
                    System.out.println("ThreadName"+ Thread.currentThread().getName()+" : "+ p);
                    return p;
                }, service);
                comp1.join();

                CompletableFuture comp2 = CompletableFuture.completedFuture(p).thenApplyAsync(e-> {
                    if(e%2!=0)
                    System.out.println("ThreadName" + Thread.currentThread().getName()+ " : " + p);
                   return p; 
                }, service);
                comp2.join();
            }
        );
    }
}
