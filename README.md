# PalindromosTarea 4: Palíndromos      Vicente Silva 

•	Paso 1:   

function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

¿Qué hace el método?

El método anterior tiene como parámetro de entrada una cadena de tipo String, se crea otra cadena vacía la cual será igual a la cadena original, pero invertida. Si esta cadena es igual a la original retorna un booleano.

¿Cómo lo hace?

Lo mencionado anteriormente lo hace con los métodos Split(), reverse() y join().
Split(): Este método convierte un String en un array, dividiendo el String en donde se encuentre el carácter incluido en Split().
Reverse(): Invierte el array. Dejando la primera en “n” la segunda en “n-1” y así sucesivamente.
Join(): Convierte el array en un String nuevamente para poder comparar con la original.

•	Paso 2: 

El método de javascript es una solución bastante básica para poder identificar una palabra palíndroma, pero tiene defectos como, por ejemplo: Si en vez de ingresar un String es un número, este no será admitido por el método, también si se ingresa una palabra que es palíndroma, pero tiene espaciados, mayúsculas u otros caracteres. No será reconocido como palíndromo.

•	Paso 3: 
Casos de prueba:
1.- ¿No bajará Sara jabón?  
2.- Ana
3.- Alí tomó tila.
4.- oso
5.- rallar

Los casos 1, 2 y 3 siendo palíndromos el método, al usar toda la cadena sin cambiar ningún carácter u omitir los espaciados aquellos casos no serán reconocidos como palíndromos para este método. Los otros casos restantes si cumplen con los requerimientos del método.
Los casos de prueba “aca”, “h” y “acas” son testeados sin problema arrojando true, true y false respectivamente.

•	Paso 4:

Prueba 1:
Input: int 200
Output: Esta prueba se considera como una excepción ya que el método solo admite parámetros de tipo String.



Prueba 2: 
input: String “” (cadena vacia)
output: true

prueba 3
input: String aaabccbaaa
output: true

prueba 4:
input: ahabccbaaa
output: false

prueba 5:
input: La tele letal
output: false

Las pruebas que se hicieron para este método dejan a entender que solo se puede usar palabras simples (sin caracteres especiales, espaciados, mayúsculas, etc.) para hacer un buen uso de este.
¿Qué consideraciones se tomó en cuenta?
En primer lugar, serian las palabras con mayúsculas, caracteres especiales, entre otros que podrían dificultar la comparación de la palabra. También se tomaría en cuenta los números.
¿Qué se mejoró?
Se mejoro la efectividad al comprobar si una palabra es palíndroma, por el hecho de comprobar una a una la letra o número que se cambió con la original, por ejemplo: si la primera letra no coincide con la última, ya no sería palíndroma enviando la respuesta correspondiente y detendría el programa. también se creó un método en el cual se eliminan los caracteres especiales, espaciados y el intercambio de letras con acento, minúsculas con su letra correspondiente.
¿Qué rol juega las pruebas en mejorar su código?
Las pruebas dan a entender si el método funciona correctamente con los casos más sencillos y también con otros mas complejos. El uso de los test nos alerta de que algo no esta funcionando o se usa de forma errónea el método. 


Repositorio: https://github.com/vsilva06/Palindromos.git

 



