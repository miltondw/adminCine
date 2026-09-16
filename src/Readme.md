# Sistema de Administración de un Cine

 **PRIMER PARCIAL – ESTRUCTURAS DE DATOS A**. 
---
## 1. Información del Almacenamiento

| Información | Estructura Seleccionada | Justificación |
**Funciones:** ArrayList => ya que no se conoce un limite fijo de funciones desde el inicio, la mejor opcion es usar un Array dinamico, para ese caso deci usar ArrayList, ya que es una maz flexible y me permite mayor dinamismo.
**Puestos:** Array de 20 posiciones El numero de puestos es fijo (20). Asi que para optimizar memoria la mejor opcion es el [array] que ocupa un numero fijo de espacio en memoria.
---

**2. ¿Si se necesita buscar una funcion por su código, cómo recorrería la estructura seleccionada?**
Pues como tendria una lista de funciones con un for recorro la lista y obtengo el codigo y lo voy comparando con el que parametro del codigo que me pasaron, y asi hasta llegar con el que coincida o  retornar que no existe.

**3. ¿Qué dificultades tendría el sistema si se utiliza una lista simplemente enlazada para almacenar las funciones y se necesitara recorrerlos en sentido contrario, o buscar qué funcion se vendio antes del actual?**

Como los nodos en una lista simplemente enlazada solo apuntan al nodo siguiente,no se puede retroceder de forma directa, para encontrar el elemento anterior al actual, 
tendria que recorrerlo de nuevo, buscando que apuntador apunte al registro actual, lo cual lo hace muy engorroso e ineficiente

**4. ¿Si se elimina una funcion de la estructura, qué debe tener en cuenta el programa para evitar errores al recorrer las funciones o consultar sus puestos?**
Pues dado que tengo un ArrayList el automaticamnte se redimenciona, pero igualmente tendria condicionales que me puedan verificar si algun elemento no exite, indicar al usuario que esa funcion fue elimnada.
