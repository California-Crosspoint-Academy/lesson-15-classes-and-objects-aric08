// aric mar

public class Lesson15 {
    public static void main(String[] args) {
        //1
        double length = 44.0;
        int width = 13;
        Rectangle myRect = new Rectangle(length, width);
        System.out.println(myRect.length + " " + myRect.width);
        //// where is the answer?

        //2
        // public Rectangle(double length, int width)

        //3
        Lunch yummy5 = new Lunch(true, 900);
        System.out.println(yummy5.diet_yes_no + " " + yummy5.calories);

        //4
        BankAccount account39 = new BankAccount(500.43);
        System.out.println(account39.balance);
        //// missing answer

        //5
        // A class is like a cookie cutter, an object is like a cookie.

        //6
        // public School(int d, String m)
        //// void should be omitted and school should have a capital S. 

        //7
        // one class, many objects

        //8
        // the class

        //9
        // illegal (wrong parameter type)
        //// should be boolean

        //10
        Band ourBnd = new Band(5, 4, "Mr. Perkins", 2000.0);
        System.out.println(ourBnd.numMembers);
        //// missing answer

        //11
        // public BibleStory(String x, int y, double z)

        //12
        // var1:int, var2:double, sss:String

        //13
        // public void Samson(double zorro);
        // public String getDelilah();

        //14
        BibleStory philistine = new BibleStory("Ralph", 19, 24.18);

        //15
        BibleStory gravy = new BibleStory("Any", 1, 1.0);
        gravy.var2 = 106.9;

        //16
        BibleStory bart = new BibleStory("Sam", 3, 2.0);
        System.out.println(bart.sss);

        //17
        String jj = bart.sss;

        //18
        Trail t = new Trail("trailtest");
        System.out.println(t.met());

        //19
        Peach zippo = new Peach();
        double result = zippo.peachyDandy(42);
        System.out.println(result);

        //20
        // double hamburger = zippo.peachyDandy(127.31); // wrong argument type
    }
}

class Rectangle {
    double length;
    int width;
    public Rectangle(double length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Lunch {
    boolean diet_yes_no;
    int calories;
    public Lunch(boolean diet, int cal) {
        diet_yes_no = diet;
        calories = cal;
    }
}

class BankAccount {
    double balance;
    public BankAccount(double amt) {
        balance = amt;
    }
}

class Band {
    int numMembers;
    int numInstruments;
    String director;
    double amount;
    public Band(int numMembers, int numInstruments, String director, double amount) {
        this.numMembers = numMembers;
        this.numInstruments = numInstruments;
        this.director = director;
        this.amount = amount;
    }
}

class BibleStory {
    public int var1;
    public double var2;
    public String sss;

    public void Samson(double zorro) {}
    public String getDelilah() { return "Delilah"; }

    public BibleStory(String x, int y, double z) {
        this.var1 = y;
        this.var2 = z;
        this.sss = x;
    }
}

class Trail {
    int x, y;
    String s;
    public Trail(String s) {
        this.s = s;
        this.x = 10;
        this.y = 10;
    }
    public String met() {
        int prod = x * y;
        return Integer.toHexString(prod);
    }
}

class Peach {
    public double peachyDandy(int z) {
        return z * 2.0;
    }
}
