package in.bit;

public class GetIthBit {
	public static int getIthBit(int n, int i) {
		int bitMask = 1<<i;
		if((n &bitMask)==0)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) {
		System.out.println(getIthBit(19, 0));//1
		System.out.println(getIthBit(19, 1));//1
		System.out.println(getIthBit(19, 2));//0
		System.out.println(getIthBit(19, 3));//0
		System.out.println(getIthBit(19, 4));//1
	}

}
