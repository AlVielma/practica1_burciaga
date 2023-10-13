public class ExpresionRegular {
    private String cadena;

    public ExpresionRegular(String cadena) {
        this.cadena = cadena;
    }

    // metodo principal que verifica si la cadena cumple alguna de las condiciones.
    public boolean cumpleCondiciones() {
        return cumpleCondiciones1() || cumpleCondiciones2() || contieneSecuenciaDigitos1() || contieneSecuenciaDigitos();
    }

     // vemos si la cadena tiene @# vocal mayúscula
    public boolean cumpleCondiciones1() {
        char[] chars = cadena.toCharArray();
        int length = cadena.length();
    
        if (length != 3) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (i == 0 && c != '@') {
                return false;
            } else if (i == 1 && c != '#') {
                return false;
            } else if (i == 2 && !("AEIOU".contains(String.valueOf(c)))) {
                return false; 
            }
        }
    
        return true;
    }

    // verificamos si tiene $ vocal minúscula
    public boolean cumpleCondiciones2() {
        char[] chars = cadena.toCharArray();
        int length = cadena.length();

        if (length != 2) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (i == 0 && c != '$') {
                return false;
            } else if (i == 1 && !"aeiou".contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

     // verificamos si la cadena tiene el formato '$ dígitos impar vocal mayúscula vocal minúscula'.
    public boolean contieneSecuenciaDigitos() {
        char[] chars = cadena.toCharArray();
        int length = cadena.length();

        if (length < 6) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = chars[i];

            if (i == 0 && c != '$') {
                return false;
            } else if (i == 1 && !Character.isDigit(c)) {
                return false;
            } else if (i == 2 && !Character.isDigit(c)) {
                return false;
            } else if (i == 3 && (c != '1' && c != '3' && c != '5' && c != '7' && c != '9')) {
                return false;
            } else if (i == 4 && !"AEIOU".contains(String.valueOf(c))) {
                return false;
            } else if (i == 5 && !"aeiou".contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    // verificamos si la cadena tiene el formato @# dígitos impar y las 2 vocales mayusculas
    public boolean contieneSecuenciaDigitos1() {
        char[] chars = cadena.toCharArray();
        int length = cadena.length();

        if (length < 7) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = chars[i];

            if (i == 0 && c != '@') {
                return false;
            } else if (i == 1 && c != '#') {
                return false;
            } else if (i == 2 && !Character.isDigit(c)) {
                return false;
            } else if (i == 3 && !Character.isDigit(c)) {
                return false;
            } else if (i == 4 && (c != '1' && c != '3' && c != '5' && c != '7' && c != '9')) {
                return false;
            } else if (i == 5 && !"AEIOU".contains(String.valueOf(c))) {
                return false;
            } else if (i == 6 && !"AEIOU".contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }
}
