package ex3;

/*
Write code which initialize and declare variables of following types: int, long, double.

Assign them following values:

int -> i = 100000000000000000000000
long -> l = -900000000000000000000000
double -> d = 100
Check that code is build properly. What went wrong?
 */
public class Variables {
    public static void main(String[] args) {
        int i = 100_000;
        long l = -900_000;
        double d = 100;
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
    }
}
