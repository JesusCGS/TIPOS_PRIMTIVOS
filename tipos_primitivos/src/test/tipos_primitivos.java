
package test;

/**
 *
 * @author Alumno Mañana
 */
public class tipos_primitivos {
    /*
    *ENTEROS:
     -BYTES:8 BITS(-128 a 127) | BYTE.MIN_VALUE -BYTE.MAX_VALUE
     -short: 16bits(-32768 a 32767) | short.min_value short-byte.maxvalue
     -int:
     -long:
    
    *DECIMALES:
     -float:
     -doubel:
    
    *caracter:
     -char:
    
    
    */
    public static void main(String[] args) {
       Byte enteroByte = 1;
        System.out.println("enterobyte = "+enteroByte);
        System.out.println("valor minimo del tipo byte: "+ Byte.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Byte.MAX_VALUE);
        
        
        Short enteroByte1 = 2;
        System.out.println("numero = "+enteroByte1);
        System.out.println("valor minimo del tipo byte: "+ Short.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Short.MAX_VALUE);
        
        int num=3;
        System.out.println("numero = "+num);
        System.out.println("valor minimo del tipo byte: "+ Integer.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Integer.MAX_VALUE);
        
        long enterolong =4;
        System.out.println("numero = "+enterolong);
        System.out.println("valor minimo del tipo byte: "+ Long.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Long.MAX_VALUE);
        
        //Decimales
        float enterofloat =5;
        System.out.println("numero = "+enterofloat);
        System.out.println("valor minimo del tipo byte: "+ Float.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Float.MAX_VALUE);
        
        double enterodouble =6;
        System.out.println("numero = "+enterodouble);
        System.out.println("valor minimo del tipo byte: "+ Double.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Double.MAX_VALUE);
        
        //CARACTER 
        char enterochar=7;
        
        System.out.println("numero = "+enterochar);
        System.out.println("valor minimo del tipo byte: "+ Character.MIN_VALUE);
        System.out.println("valor maximo del tipo byte: "+ Character.MAX_VALUE);
        
        
    }
    
}
