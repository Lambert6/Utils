package suanfa;

import java.util.Date;

public class SelectionSort {
	public static void main(String[] args) { 
		//ѡ���������ŵ�һ�������ͺ�����������Ƚϣ���������Сֵ�����һ��ֵ���л�������ð�ݿ�5��
        int area = 75000;
		int[] arr = new int[area];
		for(int i = 0 ; i < area ; i++) {
			arr[i] = ((int)(Math.random()*area));
		}
        //ѡ��������Ż�
		System.out.println("��ʼ��"+new Date());
        for(int i = 0; i < arr.length - 1; i++) {// ����i������
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// ѡ������С�ļ�¼
                if(arr[j] > arr[k]){ 
                    k = j; //����Ŀǰ�ҵ���������Сֵ���ڵ�λ��
                }
            }
            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���     
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;  
        }
        System.out.println("����"+new Date());
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
    }
}
