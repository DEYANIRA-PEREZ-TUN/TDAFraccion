public class Fraccion{

    //Atributos
    int numerador = 0;
    int denominador = 1;
    
    //Métodos
    
    //Constructor
    public Fraccion(int n, int d){
        this.numerador = n;
        this.denominador = d;
    }

    Fraccion dividir(int num, int denom){
       int nuevoNumerador = this.numerador * denom;
       int nuevoDenominador = this.denominador * num;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado;
    } //dividir

    Fraccion multiplicar(int num, int denom){
       int nuevoNumerador = this.numerador * num;
       int nuevoDenominador = this.denominador * denom;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado;
    } //multiplicar
    
    Fraccion sumar(int num, int denom){
        int nuevoNumerador = this.numerador * denom + this.denominador * num;
        int nuevoDenominador = this.denominador * denom;
        
        Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        
        return fraccionResultado;
    } //sumar fracciones con diferentes denominadores
    
    Fraccion restar(int num, int denom){
        int nuevoNumerador = this.numerador - num;
        int nuevoDenominador = this.denominador;
        
        Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        
        return fraccionResultado;
    } //restar fracciones con denominadores iguales
    
    Fraccion potencia(int exponente){
        return new Fraccion((int) Math.pow(this.numerador, exponente), (int) Math.pow(this.denominador, exponente));
    } //potencia de fracciones
    
    /*Fraccion decimal(){
        float nuevoDecimal = this.numerador / this.denominador;
        
        return nuevoDecimal;
    } //converADecimal*/
    
    

//Definir las operaciones definidas en el TDA
 
  
/* 
    potencia()


    raizCuadrada()


    porcentaje()


    residuo()


    convertirADecimal()
*/


} //Fraccion


/*
Fraccion UnCuarto = new Fraccion(1,4);
UnCuarto.dividir(1,3);
*/
