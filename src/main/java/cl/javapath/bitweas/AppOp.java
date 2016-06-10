package cl.javapath.bitweas;

/**
 * @author daniel
 */
public class AppOp {


    public static void main(String[] args) {
        //andBinario(5,-5);
        //andBinario(15,-15);
        potenciasDeDos();
        System.out.println();
        testInitialCapacity();

    }

    public static void potenciasDeDos() {
        printNumber((int)Math.round(Math.pow(2,1)));
        printNumber((int)Math.round(Math.pow(2,2)));
        printNumber((int)Math.round(Math.pow(2,3)));
        printNumber((int)Math.round(Math.pow(2,4)));
        printNumber((int)Math.round(Math.pow(2,5)));
        printNumber((int)Math.round(Math.pow(2,6)));
        printNumber((int)Math.round(Math.pow(2,7)));
        printNumber((int)Math.round(Math.pow(2,8)));
    }

    public static void testInitialCapacity(){
        int initialCapacity = 8;
        printNumber(initialCapacity);
        initialCapacity = initialCapacity | (initialCapacity >>>  1);
        printNumber(initialCapacity);
        initialCapacity = initialCapacity | (initialCapacity >>> 2);
        printNumber(initialCapacity);
        initialCapacity = initialCapacity | (initialCapacity >>> 4);
        printNumber(initialCapacity);
        initialCapacity = initialCapacity | (initialCapacity >>> 8);
        printNumber(initialCapacity);
        initialCapacity = initialCapacity | (initialCapacity >>> 16);
        printNumber(initialCapacity);
        initialCapacity++;
        printNumber(initialCapacity);
    }

    public static void andBinario(int a, int b){
        printNumber(a);
        printNumber(b);
        printNumber(a & b);
        System.out.println();
    }

    public static void printNumber(int num) {
        System.out.println(String.format("%8d",num) + " is " + String.format("%32s",Integer.toBinaryString(num)));
    }


}
