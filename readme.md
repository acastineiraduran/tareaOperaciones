# Creación de librería
![enunciado](imagenesReadme/enunciadoLibreria.png)

-----
## Solución planteada
### Importo libreria Entrad/Salida
Cloné el repositorio [teoriaLibreria](https://github.com/acastineiraduran/teoriaLibreria.git)
y la importé al proyecto _operaciones_ 
para utilizar sus metodos. Los pasos a seguir
fueron:
1. Creo el _.jar_
    ```mermaid
    flowchart LR
        F(File) --> PS(Proyect Structure) --> Artifacts --> +
    ```
    ![pasosJar](imagenesReadme/pasosJar.png)

    A continuación escogo el proyecto para hacer el _.jar_

2. Contruyo el artifact

    _Build-->Build Artifacts..._

3. Importo la librería

    Vuelvo a _Proyect Structure_ pero esta vez selecciono la opción de _Libreries_
    y añado el _.jar_ creado.

### Clase metodos
Hice un método que hiciera las operaciones pedidas en el ejercicio y devuelve 
`resultado` en caso de que no haya errores y `null` en caso de que sí los haya.

En la _Main_ recogo `resultado` o `null` en la variable `retultado`:
* Si el `resultado` es distinto de `null` entonces se imprimirá `resultado`.
* Si no, se informará al usuario de que hay un error en la operacion.
```java
Float resultado = obx.operacion(num1, num2, opcion);
if (resultado != null) { 
    if (Float.isNaN(resultado)) { 
        System.out.println("**ERROR: IMPOSIBLE DE CALULAR**");
    } else {
        System.out.println("resultado = " + resultado);
    }
} else {
    System.out.println("**ERROR EN OPERACION**");
}
```
También añadí un `if/else` anidado que imprima otro mensaje error en caso de que la
operación escogida devuelva un resultado imposible de calcular (NaN), como ocurre
en el caso de 0/0.

### Main
En la _Main_ reutilicé metodos de la librería importada. Debido a que no me quedó claro
cuántos y cuáles son los métodos que tenía que utilizar, intenté introducir todos
los que pude y en concreto aquellos que creé yo en clase con el fin hacer más práctica
la tarea. Doy está explicación, sobretodo, para explicar el _popurrí_ de `if/else`
anidados que creé y que pueden resultar no demasiado legibles.

Cómo sólo se podía hacer **un método**, para poder abarcar casi todas las alternativas
posibles, introduje bastante código en la _Main_...

### Documentacion de los metodos
1. Creo un directorio en el proyecto llamado _docs_.
2. Hago una descripcion de la clase, los metodos y los atributos.
3. Creo el _javadoc_ y lo meto en la carpeta creada.
  
    ![javadocProcess](imagenesReadme/javadocProcess.png)

### Fichero git ignore
1. Creé un fichero al mismo nivel que la _src_ que se llama _.gitignore_.
2. Añadí en el fichero todos aquellos archivos que no me interesan que se suban 
a GH.

### GH y release
Actualizo todos los cambios realizados, subo el _.jar_ de la libreria utilizada
(en la release) y añado el _javadoc_.
