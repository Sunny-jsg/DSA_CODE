package in.bit;

public class SetIthBit {
	public static int setithBit(int n, int i) {
		int bitMask = 1 << i;
		return n ^ bitMask;
	}

	public static void main(String[] args) {
		System.out.println(setithBit(19, 0));//18
		System.out.println(setithBit(19, 1));//17
		System.out.println(setithBit(19, 2));//23
		System.out.println(setithBit(19, 3));//27
		System.out.println(setithBit(19, 4));//3
	}

}
