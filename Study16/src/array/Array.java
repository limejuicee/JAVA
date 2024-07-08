package array;

public class Array {
	public static void main(String[] args) {
		//다차원 배열
		//배열 내부으 ㅣ한 요소가 배열로 이루어져 있는 경우
		
		int[] arr1= {1,2,3}; //length가 3이고 0~2번까지의 index를 가진 배열
		//System.out.println(arr1[ ]);
		//0
		//1
		//2
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		System.out.println("");
		int[][] arr2 = {{1,2,3},{1,2,3}};
		for(int i=0; i<3; i++) {
			System.out.println("__"+arr2[0][i]);
		}
		
		for(int a=0; a<2; a++) {
			for(int i=0; i<3; i++) {
				System.out.print(arr2[a][i]+"\t");
			}
		}
		
		int[][][] arr3= {{{1,2,3} , {1,2,3}}  ,  {{1,2,3} , {1,2,3}}  ,  {{1,2,3} , {1,2,3}}};
	}
}
