import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class test {
	@Test
	public void test() {
    testPositive();
	testNegative();
	 testMixed();
	}


	public test() {    }


	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 3;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 1;
		Sortedarr[1] = 3;
		Sortedarr[2] = 6;
		Sortedarr[3] = 7;
		Sortedarr[4] = 10;
		SelectionSort.sort(arr);
		assertArrayEquals(Sortedarr, arr);

		}

	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -1;
		arr[1] = -6;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -3;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -7;
		Sortedarr[2] = -6;
		Sortedarr[3] = -3;
		Sortedarr[4] = -1;
		SelectionSort.sort(arr);
		assertArrayEquals(Sortedarr,arr);
		}

	public void testMixed(){
		int[] arr = new int[5];
		arr[0] =  6;       
		arr[1] =  6;
		arr[2] =  0;
		arr[3] = -5;
		arr[4] =  -10;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -5;
		Sortedarr[2] =  0;
		Sortedarr[3] =  6;
		Sortedarr[4] =  6;
		SelectionSort.sort(arr);
		assertArrayEquals(Sortedarr,arr);
		}

	}
