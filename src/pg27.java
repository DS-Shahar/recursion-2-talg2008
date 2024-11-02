public class pg27 {


    public static int q14(int[]a, int i)
    {
        if (i==0)
        {
            return a[i];
        }
        return a[i]+q14(a ,i-1);
    }

    public static int q15(int[]a, int i)
    {
        if(i==0)
        {
            if(a[i]>=0)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a[i]>=0)
        {
            return q15(a,i-1)+1;
        }
        return q15(a,i-1);
    }

    public static int q16(int[]a, int num, int i)
    {
        if (a[i]==num)
        {
            return i;
        }
        if(a[i]!=num && i==a.length-1)
        {
            return -1;
        }

        return q16(a,num,i+1);
    }

    public static boolean q17(int []a, int i)
    {
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i+1]<a[i])
        {
            return false;
        }
        return q17(a,i+1);
    }

    public static boolean q8(int n, int d) {

        if (n < 2) {
            return false;
        }
        if (n % d == 0) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        return q8(n, d + 1);
    }

    public static boolean q18(int []a, int i)
    {
        if (i==a.length)
        {
            return true;
        }

        if(q8(a[i],2)==true)
        {
            return false;
        }
        return q18(a,i+1);
    }

    public static int q19(int[][]a, int num, int i, int j)
    {
        if(i<0)
        {
            return 0;
        }
        if(j<a[i].length) {
            if (a[i][j] == num) {
                return q19(a, num, i - 1, 0)+1;
            }
            return q19(a,num,i,j+1);
        }
        return q19(a,num,i-1,0);


    }

    public static int random_q20(int[] a) {
        return (int)(Math.random() * a.length);
    }

    public static boolean q20(int[] a) {
        int i1 = random_q20(a);
        int i2 = random_q20(a);
        int start;
        int end;

        while(i1==i2)
        {
            i2=random_q20(a);
        }

        if (i1>i2)
        {
            end=i1;
            start=i2;
        }
        else
        {
            end=i2;
            start=i1;

        }
        return q_20helper(a,start,end);
    }

    public static boolean q_20helper(int[] a, int i, int end) {
        if (i>end)
        {
            return true;
        }
        if (q_20pali(a[i])==false)
        {
            return false;
        }
        return q_20helper(a,i+1,end);
    }

    public static boolean q_20pali(int num) {
        int realnum=num;
        int reverse=0;
        while (num>0)
        {
            int d =num%10;
            reverse =reverse * 10+d;
            num=num/10;
        }
        if (realnum==reverse)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int []a={232,787,525,787,828,456,333};
        System.out.println(q20(a));
    }
}





