package practice;

public class GreekAlphab2 {
    public static void main(String args[]){
        System.out.println("unicode字符集中前100个字符为：");
        for(int i=1;i<=100;i++){
            char c='\0';
            c=(char)i;//i做char类型转换，并将结果赋值给c
            System.out.print(" "+c);
            if(i%10==0){
                System.out.println("");
            }
        }
    }
}
