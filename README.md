# Laboratorio-1

 # Análisis del Programa Original

- 1.¿Qué partes del código pueden convertirse en métodos?
se repite la estructura de las listas de los ciclos for para acceder a los datos de las calificaciones y estudiantes

- 2.¿Qué bloques de código se repiten?
  los bloques de codigo que se repiden son los relacionados con la validacion de las listas vacias, ademas todo se encuentra dentro de un metodo main lo que hace que en uno mismo se quede la 

- 3. ¿Qué responsabilidades pueden separarse?
las responsabilidades que pueden separarse son la presentación del menu, el almacenamiento de las listas, los datos , el caculo de el promedio y la de la calificación mas alta 


-4. Ejemplos de posibles tareas:
Explicar por qué dividir estas tareas mejora el programa.

al dividir esas tareas hace que el programa tenga un mejor orden dividiéndolo por métodos mejora la legibilidad simplifica la depuración y reduce la duplicación de código 

# variables locales vs variables globales 

-1. ¿Qué variables deberían declararse como globales (atributos static de la clase)?
las variables que se declaran como globales son: 

-2. ¿Cuáles deberían ser locales dentro de un método?

-3.¿Por qué?

# ¿Qué ventajas tiene dividir el código en métodos?
las ventajas que nos puede dar hacer el programa didivido en metodos es la organizacion que cada una da sin tener todo junto en uno mismo
la reutilizacion es una herramienta porque asi los metodos pueden ejecutarse varias veces desde el menu sin necesidad de duplicar el codigo 
el mantenimiento es mas sencillo ya que se puede mejorar un metodo sin necesidad de afectar todo el programa 
la claridad del programa ya que los metodos hace que este ordenado por secciones con nombre correspondiente lo que facilita entender el programa 

#¿Por qué no es recomendable usar muchas variables globales?
no es recomendado usar muchas variables globales porque cualquier metodo puede modfificarlas y pueden empezar a mostrar fallas
las variables globales son dificiles de depurar ya que pueden ser modificadas en distintas partes del programa 
el uso de variables globales puede crear una dependencia entre metodos ya que pueden depender del mismo dato 

# ¿Cómo mejora la modularización la legibilidad del código?
esto mejora por que lleva un mejor orden y limpieza, permite entender mejor el programa, facilita encontrar partes especificas del programa 
