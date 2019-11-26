# **CountPositive**

**1. Explica el fallo (qué está mal en el código). Describe de manera precisa el
fallo y propón una modificación al código que lo arranque.**

El código tiene el fallo cuando hace el if ya que el 0 no es un número positivo por tanto debería ser solo mayor estricto.

El error del estado se produce cuando suma al count habiendo sido un 0.

**2. Proporciona, si ello es posible, un caso de prueba que no ejecute el código que tiene el fallo. Si no es posible explica por qué. Para cada caso de prueba indica los datos usados en la prueba, el resultado esperado y el resultado obtenido.**

x = null; ---> expected: NullPointerException

Cuando el contador de programa se encuentra en la declaración del for, al hacer x.length de un array null, salta la excepción y retornando.

**3. Si es posible, proporciona un caso de prueba que ejecute el fallo que hay en el código, pero que no provoque un error en el estado. Si no se puede, explica por qué.**

x = [1,2,3,4,5,6,7,8,9] ---> expected:9

Puesto que no hay ningún 0 en el array, no habrá un fallo en el estado del count, pero si ejecutará la parte del código (la comparación del if) que está mal.

**4. Si es posible, proporciona un caso de prueba que provoque un error en el estado pero que no acabe provocando una disfunción en el comportamiento del programa. No olvides que el contador del programa forma parte, junto a las variables, del estado del programa. Si no es posible, explique por qué.**

No se puede provocar en este caso un error en el estado sin producirse una disfunción.

**5. Para el caso de prueba del anterior apartado, describe el primero de los estados erróneos. Describe detalladamente todo el estado (todas las variables, incluyendo el contador de programa).**

No existe caso de prueba anterior.

**6. Ejecuta en programas Java el código corregido y pruébalo con los casos de prueba creados en apartados anteriores.**

Contenido en CountPositive.java
