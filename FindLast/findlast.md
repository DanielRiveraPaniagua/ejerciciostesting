# **FindLast**

**1. Explica el fallo (qué está mal en el código). Describe de manera precisa el
fallo y propón una modificación al código que lo arranque.**

El fallo se produce en el for cuando ya que la última iteración debería ser 0 asi que el último estado de i debería poder llegar a ser 0.

**2. Proporciona, si ello es posible, un caso de prueba que no ejecute el código que tiene el fallo. Si no es posible explica por qué. Para cada caso de prueba indica los datos usados en la prueba, el resultado esperado y el resultado obtenido.**

No es posible porque siempre va a pasar por el for.

**3. Si es posible, proporciona un caso de prueba que ejecute el fallo que hay en el código, pero que no provoque un error en el estado. Si no se puede, explica por qué.**

x = [1,2,3,4,5,6,7,8,9]  y = 9 ---> expected:8

**4. Si es posible, proporciona un caso de prueba que provoque un error en el estado pero que no acabe provocando una disfunción en el comportamiento del programa. No olvides que el contador del programa forma parte, junto a las variables, del estado del programa. Si no es posible, explique por qué.**

x = [1,2,3,4,5,6,7,8,9] y = 0 ---> expected: -1

**5. Para el caso de prueba del anterior apartado, describe el primero de los estados erróneos. Describe detalladamente todo el estado (todas las variables, incluyendo el contador de programa).**

Cuando el contador del programa vuelva una vez más al for teniendo que la variable i = 0, debería pasar a la siguiente linea dentro del for. En éste caso no lo hace asi que produce un error en el estado del contador del programa, sin embargo, al no poderse encontrar el 0 en el array x, el valor del return (-1) es el correcto.

**6. Ejecuta en programas Java el código corregido y pruébalo con los casos de prueba creados en apartados anteriores.**

Contenido en FindLast.java
