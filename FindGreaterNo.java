public class FindGreaterNo {
// This function print the is greater no.
public void greterNo (final int a, final int b, final int c) {
    if (a > b && a > c) {
        System.out.println(a + ":greater");
    } else if (b > a && b > c) {
        System.out.println(b + ":b is greater");
    } else if (c > a && c > b) {
        System.out.println(c + ":is greater");
    } else {
        System.out.println(a + "=" + b + "=" + c);
    }
}

 // This function print the order of the given number in accending order.
public void greaterNoOrder(final int a, final int b, final int c)
{
    if(a>b && a>c)
    {
        if (b>c)
        {
            System.out.println(a+">"+b+">"+c);
        }
        else{
            System.out.println(a+">"+c+">"+b);
        }
    }
    else if(b>a && b>c)
    {
        if(c>a)
        {
            System.out.println(b+">"+c+">"+a);
        }
        else{
            System.out.println(b+">"+a+">"+c);
        }

    }
    else if(c>b && c>a)
    {
        if(a>b)
        {
            System.out.println(c+">"+a+">"+b);
        }
        else{
            System.out.println(c+">"+b+">"+a);
        }

    }
    else{
        System.out.println(a+"="+b+"="+c);
    }
}
// Main method
public static void main(String...args)
{
 // make class object and call function.
}


    
}
