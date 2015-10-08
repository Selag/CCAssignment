package BitManipulation;

public class Solution02 {
	public static String binaryRepresentation(double n) {
		if (n >= 1 || n <= 0) {
			return "ERROR";
		} else {
			StringBuilder binary = new StringBuilder();
			binary.append("0.");
			while (n > 0) {
				if (binary.length() >= 32) {
					return "ERROR";
				}
				double r = n * 2;
				if (r >= 1) {
					binary.append(1);
					n = r - 1;
				} else {
					binary.append(0);
					n = r;
				}
			}
			return binary.toString();
		}
	}

	public static void main(String args[]) {
		double n1 = 0.5;
		System.out.println(binaryRepresentation(n1));
		double n2 = 0.25;
		System.out.println(binaryRepresentation(n2));
		double n3 = 0.875;
		System.out.println(binaryRepresentation(n3));
		double n4 = 0.15;
		System.out.println(binaryRepresentation(n4));
	}
}
