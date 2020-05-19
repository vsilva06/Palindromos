public class Palindromo {

        public String entrada;

        public Palindromo(String entrada) {
            this.entrada = entrada;
        }

        public String getEntrada() {
            return entrada;
        }

        public void setEntrada(String entrada) {
            this.entrada = entrada;
        }

        public boolean ResPalinScrip() {  // codigo javaScript

            char[] aux0 = this.entrada.toCharArray(); // pasar de string a un arreglo de char
            char[] aux1 = aux0.clone();
            for (int i = 0; i < aux0.length; i++) {  //invierte el arreglo
                aux1[i] = aux0[aux0.length - i - 1];
            }

            String respuesta = String.valueOf(aux1);  //vuelve a un String

            if (this.entrada == respuesta) {  //comprueba si es o no palindromo
                return true;
            } else {
                return false;
            }
        }

        public boolean ResPalin() {  // codigo simplificado
            this.entrada = this.entrada.replaceAll(" ", "");
            char[] aux = this.entrada.toCharArray();

            for (int i = 0; i < aux.length / 2; i++) {
                if (aux[i] == aux[aux.length - i - 1]) {

                } else {
                    return false;
                }
            }
            return true;

        }
    }




