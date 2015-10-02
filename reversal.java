public class Reversal
{
    void main(int num){
        String jk = num + "";
        int l = jk.length();
        int t = 0;
        int result = 0;
        int e = 0;
        int z = 10;
        int a = 0;
        while(l>0){
            t = num%10;
            e = 1;
            a = l-1;
            while(a>0){
                e = e * z;
                a--;
            }
            result += t*e;
            num = (num - t)/10;
            l--;
        }
        System.out.println("Your reversed number is "+result);
    }
}
