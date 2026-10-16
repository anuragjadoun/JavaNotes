public class WrapperClassesConcept {
    
    public static void main(String[] args) {
        //1
        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);

        //2
        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y); //due to integer caching concept 

        //3 In this mcq the output will be false because new keyword doesnot support Integer caching concept 
        // Integer c = 100;
        // Integer d = new Integer(100);
        // System.out.println( c == d);

        //4
        Integer e = 100;
        Integer f =100;
        System.out.println(e.equals(f));

        //5 Autoboxing concept= Automatic conversion of primitive datatype to corresponding wrapper class 
        int p = 10;
        Integer q = p;
        System.out.println(q);

        //6 Unboxing = Automatic conversion of wrapper class to corresponding primitive datatype
        Integer g = 20;
        int h = g;
        System.out.println(h);

        //7 Gives error becuse primitive datatype does not store null values 
        // Integer i = null;
        // int j = i; 
        // System.out.println(j);


        //8 yaha address ka koi scene h address print nahi hoga addition hoga 50 and 20 ka

        Integer k = 50;
        Integer l = 20;
        System.out.println(k + l);

        //9
        Integer m = 10;
        System.out.println(m.toString()); // prints 10
        System.out.println(m); 

        //10
        Integer n = 10;
        System.out.println(n instanceof Integer); //true

        //11
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a1 == b1); // true

        //12
        Integer a2 = 128;
        Integer b2 = 128;
        System.out.println(a2.equals(b2));//true

        //13
        Integer a3= 10;
        Long b3= 10L;
        System.out.println(a3.equals(b3)); //false

        //14
        Double a4= 10.0;
        Double b4= 10.0;
        System.out.println( a4 == b4);//false

        //15
        Character a5 = 65;
        System.out.println(a5);//It prints the value of 65 which is A

        //16
        Boolean a6= true;
        Boolean b6= true;
        System.out.println( a6 == b6);//true

        //17
        Integer c1= Integer.valueOf("100");
        System.out.println(c1); //valueOf returns the integer object

        //18
        int c2 = Integer.parseInt("500");
        System.out.println(c2); //c2 = 500 but it is primitive

        //19
        String s = Integer.toString(100);
        System.out.println( s + 50);//10050 

        //20
        Integer c3 = Integer.MIN_VALUE;
        Integer c4 = Integer.MAX_VALUE;
        System.out.println(c3);
        System.out.println(c4);

        //21
        Integer c5= 10;
        Integer c6 = 20;
        System.out.println(c5 + c6);
        System.out.println(c5.toString() + c6);

        //22
        Integer c7 = null;
        System.out.println(String.valueOf(c7));//null

        //23
        Integer c8 = 10;
        System.out.println(c8.hashCode());

        //24
        Integer c9 = 100;
        Integer c10 = 100;
        System.out.println(System.identityHashCode(c9));
        System.out.println(System.identityHashCode(c10));

        //25
        Integer c11 = 10;
        c11++;
        System.out.println(c11);

        Character o = 'A';
        System.out.println(o);
    }
}


