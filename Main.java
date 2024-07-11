import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int q=in.nextInt();
        in.nextLine();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
             arr[i]=in.nextInt();
        }
        in.nextLine();
        int[] res=new int[q];
        char[][] arr_char=new char[q][3];
        for (int i = 0; i < q; i++) {
           for (int j = 0; j < 3; j++) {
            String input = in.next();
            // 将输入的字符串转换为字符并存放到数组中
            arr_char[i][j]=input.charAt(0);
           }
           in.nextLine();
           int begin=  Character.getNumericValue(arr_char[i][0])-1;
           char mode=arr_char[i][1];
           int num=  Character.getNumericValue(arr_char[i][2]);
           if (mode=='R') {
            int index=begin+num<5?(begin+num):begin+(begin+num)%5;
            res[i]=arr[index];
           }else{
            int index=begin-num>0?(begin-num):n+(begin-num);
            res[i]=arr[index];
           }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(res[i]);
            
        }


    }
    
}
