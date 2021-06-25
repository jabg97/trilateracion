# Trilateracion
Prueba SpringBoot 

# Requisitos

```
Java 8 o Superior
Netbeans o Eclipse
Spring Boot
Maven
Git
```

# Instalación

*Clonar el proyecto 
Utiliza la consola paa clonar el proyecto
```
git clone https://github.com/jabg97/trilateracion.git
```

Para el backend se utilizo Spring boot 
Para iniciar el servidor solo debes abrir el proyecto con el IDE Netbeans o eclipse e instalar las dependencias con Maven
una vez cargadas las dependencia con Maven  compilas el proyecto y asegurate que este funcionando sobre el puerto 8080

# Manual de uso

Para calcular la posicion haga una peticion POST (con CURL o PostMan).

url: antenas/calcular, (Devuelve el resultado).
```
http://localhost:8080/antenas/calcular
```
param: (Ejemplo de un json para enviar en el cuerpo de la petición).
```
{
  "posiciones": [
    [
      30,
      10
    ],
    [
      10,
      50
    ],
    [
      120,
      80
    ]
  ],
  "distancias": [
    15,
    25,
    60
  ],
  "mensajes": [
    [
      "",
      "este",
      "es",
      "",
      "",
      "de",
      "prueba."
    ],
    [
      "hola",
      "",
      "es",
      "",
      "",
      "",
      ""
    ],
    [
      "",
      "",
      "",
      "un",
      "mensaje",
      "",
      "prueba."
    ]
  ]
}
```

Para ver el dibujo del ejemplo haga una peticion GET

> url: antenas/dibujar, (Devuelve un dibujo del mapa).

```
http://localhost:8080/antenas/dibujar
```
