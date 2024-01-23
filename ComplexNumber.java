public class ComplexNumber {

    public static void main(String[] args) {
        Complex c = new Complex(4,5);   // taking input of one complex number
        Complex d = new Complex(3, 9);  // taking input of another complex number
        Complex e = Complex.mul(c,d);           // passing the value to the class method 
        e.printComplex();

    
    }
    
}

class Complex {

    int real;
    int img;

    Complex(int val, int val2){    // this is to take the input from user
        real = val;
        img = val2;
    }

    static Complex add(Complex a, Complex b){     // creating a add method which takes object as parameter
        return new Complex((a.real+b.real), (a.img+b.img));
    }

    static Complex diff(Complex a, Complex b){    // creating a diff method which takes object as parameter
        return new Complex((a.real-b.real),(a.img-b.img));
    }

    static Complex mul(Complex a, Complex b){      // creating a mull method which takes object as parameter
        return new Complex((a.real*b.real)-(a.img*b.img), (a.real*b.img)+(a.img*b.img));
    }

    void printComplex(){
        if(real == 0 && img !=0){
            System.out.println(img+"i");
        }
        else if(real != 0 && img == 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+img+"i");
        }
    }
 


}

