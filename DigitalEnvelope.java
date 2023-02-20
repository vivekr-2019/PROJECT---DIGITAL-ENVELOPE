import java.util.Scanner;
	/**
	 *
	 * @author vivek
	 */
public class DigitalEnvelope {
    	static int modInverse(int A, int M)
	    {
	 
		for (int X = 1; X < M; X++)
		    if (((A % M) * (X % M)) % M == 1)
		        return X;
		return 1;
	    }
	
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		int M,K, CT1, a, b, P=7, M1, E, D, N, Q, CT2, AD, SD;
		
		//Symmetric XOR
		System.out.print("Enter Message ");
		M = sc.nextInt();
		System.out.print("Enter Key ");
		K = sc.nextInt();
		
		CT1=M^K;
		System.out.println("Cipher Text is "+CT1);
		
		
		//Asymmetric - Linear RSA
		System.out.print("a ");
		a = sc.nextInt();
		System.out.print("b ");
		b = sc.nextInt();
		
		M1 = a*b-P;
		System.out.println(M1);
		
		E = M1+a;
		System.out.println("E :"+E);
		
		D = M1+b;
		System.out.println("D :"+D);
		
		N = ((E*D)-P)/(M1);
		System.out.println("N :"+N);
		
		System.out.println("Q :" +modInverse(7, 29));
	    
		
		//Key Generation 
		//Asymmetric Encryption
		CT2 = (K*E) % N;
		System.out.println("CT2 :" +CT2);
		
		//Asymmetric Decryption
		AD = (CT2*D*modInverse(7, 29))%N;
		System.out.println("Asymmetric Decryption " +AD);
		
		//Symmetric Decryption
		SD = CT1^AD;
		System.out.println("Symmetric Decryption " +SD);
		
                
		if (SD == M) {
                    System.out.println("Success - Decrypted value and actual message are same!");
                } else {
                    System.out.println("Decrypted value and actual message not matches!!");
                }
	}

}
