package complex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + "+" + imag + "i";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addMew(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real + right.real);
        myComplex.setImag(this.imag + right.imag);
        return myComplex;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real - right.real);
        myComplex.setImag(this.imag - right.imag);
        return myComplex;
    }

    public MyComplex multiply(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real * right.real - this.imag * right.imag);
        myComplex.setImag(this.real * right.imag + this.imag * right.real);
        return myComplex;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.setValue(right.real, -right.imag );
        myComplex.setReal(multiply(myComplex).real / (right.real * right.real + right.imag + right.imag));
        myComplex.setImag(multiply(myComplex).imag / (right.real * right.real + right.imag + right.imag));
        return myComplex;
    }

    public MyComplex conjugate() {
        this.imag = -imag;
        return this;
    }

}
