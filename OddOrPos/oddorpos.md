# **OddOrPos**

**1. Explica el fallo (qué está mal en el código). Describe de manera precisa el
fallo y propón una modificación al código que lo arranque.**

El % en java no es el módulo sino el resto. El resto de un número impar negativo es -1. Se podría cambiar simplemente el 1 por el -1 ya que todo los impares positivos son positivos y se encuentran contenidos en la siguiente condición.

**2. Proporciona, si ello es posible, un caso de prueba que no ejecute el código que tiene el fallo. Si no es posible explica por qué. Para cada caso de prueba indica los datos usados en la prueba, el resultado esperado y el resultado obtenido.**

x = null ---> expected: NullPointerException

Retorna al hacer x.length con lo que no entra al for y, por tanto, no ejecuta el código con el fallo.

**3. Si es posible, proporciona un caso de prueba que ejecute el fallo que hay en el código, pero que no provoque un error en el estado. Si no se puede, explica por qué.**

x = [1,2,3,4,5,6,7,8,9] ---> expected:9

Todos los impares son positivos, con lo que no produce un error en el estado a pesar de ejecutar varias veces el if.

**4. Si es posible, proporciona un caso de prueba que provoque un error en el estado pero que no acabe provocando una disfunción en el comportamiento del programa. No olvides que el contador del programa forma parte, junto a las variables, del estado del programa. Si no es posible, explique por qué.**

No se puede proporcionar un test para esto.

**5. Para el caso de prueba del anterior apartado, describe el primero de los estados erróneos. Describe detalladamente todo el estado (todas las variables, incluyendo el contador de programa).**

No existe una prueba anterior.

**6. Ejecuta en programas Java el código corregido y pruébalo con los casos de prueba creados en apartados anteriores.**

Contenido en OddOrPros.java
