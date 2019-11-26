# **LastZero**

**1. Explica el fallo (qué está mal en el código). Describe de manera precisa el
fallo y propón una modificación al código que lo arranque.**

El código solo encontrará el primer 0 y saldrá, devolviendo la posición del primer cero (donde sucede el error en el estado).

Inicializando el for en i = x.length-1 mientras i >= 0 con progresión i-- deberíamos ser capaces de encontrar y retornar el primer 0.

Otra opción es acumulando en una variable la posición del último 0 encontrado en vez de el return del if. La variable debe estar inicializada en -1. AL finalizar el bucle, retorna esa variable.

**2. Proporciona, si ello es posible, un caso de prueba que no ejecute el código que tiene el fallo. Si no es posible explica por qué. Para cada caso de prueba indica los datos usados en la prueba, el resultado esperado y el resultado obtenido.**

Suponiendo consideramos un error el como está declarado el for, no podemos proporcionar un caso de prueba que ni ejecute el código que tiene el fallo.

**3. Si es posible, proporciona un caso de prueba que ejecute el fallo que hay en el código, pero que no provoque un error en el estado. Si no se puede, explica por qué.**

Considerando el for como incorrecto no es posible porque el error en el estado se produce en cuanto entras en el for ya que i es difernete de x.length

**4. Si es posible, proporciona un caso de prueba que provoque un error en el estado pero que no acabe provocando una disfunción en el comportamiento del programa. No olvides que el contador del programa forma parte, junto a las variables, del estado del programa. Si no es posible, explique por qué.**

Considerando el for incorrecto, x = [1,2,3,4,5,6,7,8,9] Expected: -1

**5. Para el caso de prueba del anterior apartado, describe el primero de los estados erróneos. Describe detalladamente todo el estado (todas las variables, incluyendo el contador de programa).**

El estado erroneo ocurre cuando el contador del programa llega al for por primera vez e intenta asignar i = 0 ya que lo correcto sería i = x.length contenga lo que contenga x.

**6. Ejecuta en programas Java el código corregido y pruébalo con los casos de prueba creados en apartados anteriores.**

Contenido en LastZeroTest.java
