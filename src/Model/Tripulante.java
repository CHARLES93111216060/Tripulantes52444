package Model;

/**una clase es una plantilla de código predeterminada en java */
/**recordar que la computadora lee el código java de arriva hacia abajo y de derecha a izquierda */
/**siempre se inicia el programa mencionando la clase */
Sytem.out.println("/**aqui dentro se escribe lo que queramos imprimir en pantalla */"); /**para imprimir  */

public static void main(String args[]){
/**esta linea de codigo se pone para poder que el programa pueda correr de otro modo el programo no es leido y por tanto no correrá */
/**siempre se pone esta linea luego de nombrar la clase */
/**las instrucciones del codigo se ponen en este lugar, en medio de estos corchetes */
}

public class Tripulante {

    /**
     * Atributos
     */
    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;

    /** getters */
    public String getNota1() {
        return nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public String getNota3() {
        return nota3;
    }

    /** setters */
    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public void setid(Int id) {
        this.id = id;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota1) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota1) {
        this.nota3 = nota3;
    }

    public double getAverage() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double getHigthNote() {
        if (nota1 >= nota2 && nota1 >= nota3) {
            return nota1;
        } else if (nota2 >= nota3) {
            return nota2;
        }else{
            return nota3;
        }

    public double getLowNote() {
        if (nota1 <= nota2 && nota1 <= nota3) {
            return nota1;
        } else if (nota2 <= nota3) {
            return nota2;
        } else {
            return nota3;
        }
    }

    public boolean checkIfPass() {
        if (getAverage() <= 3) {
            return true;
        }
        return false;
    }

}

}
