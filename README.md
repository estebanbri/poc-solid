SOLID PRINCIPLES

Cuando hablo de interfaces es en el sentido amplio de la palabra (pudiendo aplicar tanto para interfaces java, como tambien aplica para clases abstractas)

Beneficios de SOLID:
- Bajo acoplamiento (Loose - coupling) y Alta cohesion
- Mantenibilidad (Code maintainability)
- Manejo de dependencias (Dependency managment)

https://www.youtube.com/watch?v=gumM1H4qLUM

Resumen de como detectarlos en casos reales:
- Single Responsability: clase A cuyos metodos no se relacionan. (Solucion: llevar cada metodo a una clase particular)
- Open Close: metodo con parametro y dependiendo del parametro hacer accion determinada (Solucion: Polimorfismo llevando cada accion a clase propia y abstrayendo con una interfaz la accion)
- Liskov Substitution: Clase Avestruz no debe implementar el metodo volar porque no vuela por ende no es reemplazable por tipo Padre Ave (Solucion crear interfaz con ese metodo mas especifico de un tipo de ave)
- Interface Segregation: No obligar al cliente a darle implementacion a metodos que no necesita. (Las pocas Interfaces grandes a pequeñas y varias)
- Dependecy Inversion: No atar las clases a dependencias de clases concretas sino inyectar las dependencias mediante el uso de su interfaz.