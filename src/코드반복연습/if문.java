package 코드반복연습;

public class if문 { // class s
    public static void main(String[] args) { // main s
    /*int i = 2;

    while (i<=9){
        int j = 1;
        while (j<=9){
            System.out.println(i+"X"+j+":"+(i*j));
            j++;
        }
        i++;
    }*/

    /*for (int i = 2 ; i <= 9 ; i++){
        for (int j = 2 ; j <= 9 ; j++){
            System.out.println(i+"X"+j+":"+(i*j));
        }
    }*/
    int a = 10;
    int b = 5;
    int c = 3;
    int t = 0;
    if (a > b){t = a ; a = b ; b = t ;}
    if (a > c){t = a ; a = c ; c = t ;}
    if (b > c){t = b ; b = c ; c = t ;}
        System.out.printf("오름차순 : %d %d %d",a,b,c);
    } // main e
} // class e
