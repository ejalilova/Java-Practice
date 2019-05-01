package Day20Loops;

public class MultiplicationTableInnerLoops {
public static void main(String[] args) {
for (int outer = 1; outer <= 10; outer++) {
for (int inner = 1; inner <= 10; inner++) {
	int result = outer*inner;
System.out.println(outer+"x"+inner+"="+result);
}
	}
}
}
