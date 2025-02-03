public class Excepciones {

    public Excepciones(String mensaje) {
        }
    
        public static class DatosInvalidosExecepciones extends Exception{
        public DatosInvalidosExecepciones(String mensaje){
            super(mensaje);
        }
    }
    public static class PersonaNoEncontradaException extends Exception{
        public PersonaNoEncontradaException(String mensaje){
            super(mensaje);
        }
    }
}
