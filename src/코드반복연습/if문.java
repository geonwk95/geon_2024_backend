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
   /* int a = 10;
    int b = 5;
    int c = 3;
    int t = 0;
    if (a > b){t = a ; a = b ; b = t ;}
    if (a > c){t = a ; a = c ; c = t ;}
    if (b > c){t = b ; b = c ; c = t ;}
        System.out.printf("오름차순 : %d %d %d",a,b,c);*/
        int[] a = { 5,7,6,2,1,9,0,7};

        System.out.println(a.length);
        for(int i = 0; i<a.length; i++) {
            for(int j = i+1; j<a.length; j++) { //0도 가능. 근데 부등호 반대, 연산을 좀 더 많이 할뿐. //i+1인 이유는 0은 이미 결정, 그다음자리인 1부터 비교하기 위해서
                if(a[i]>a[j]) { //a[0] 일때 a[0~7] 까지 비교해서 a[0]자리 결정->이걸 a[6]만큼 7번 돈다. 그래서 정렬. > 오름차순 <내림차순
                    int tmp = 0;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        } //sort end

        for(int i =0; i<a.length; i++) {
            System.out.print(a[i]);
        }//print end

    } // main e
} // class e
