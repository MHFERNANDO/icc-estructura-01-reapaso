package Controllers;

import Models.Persona;

public class PersonaController {
    public void ordenarPorEdadInserccion(Persona[] personas) {
        int n=personas.length;
        Persona temp;
        for (int i =1;i<n;i++){
            temp=personas[i];
            int j=i-1;
            while (j>=0 && personas[j].getEdad()>temp.getEdad()){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=temp;
        }
    }
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo=0;
        int alto=personas.length-1;
        while (bajo<=alto)
        {
            int medio=(bajo+alto)/2;
            if (personas[medio].getEdad()==edad){
                return personas[medio];
            }
            else if (personas[medio].getEdad()<edad){
                bajo=medio+1;
            }
            else {
                alto=medio-1;
            }
        }return null; 
    }
}
