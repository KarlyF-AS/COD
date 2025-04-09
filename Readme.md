## Refactorización del código de puntuación de tenis
___
## ✨ ¿Qué cambié?

Refactoricé el código original para hacerlo más **legible**, **modular** y **fácil de mantener**. Estos son los cambios principales que hice:

1. **Mejoré la estructura del código**: Dividí el método grande `getScore` en tres métodos más pequeños y manejables (`getTieScore`, `getAdvantageOrWinScore`, `getRegularScore`).
2. **Simplifiqué el manejo de los puntajes**: Usé un arreglo de puntajes para evitar múltiples `switch` en el código.
3. **Eliminé duplicación**: Reduje la repetición de código al centralizar la lógica de la puntuación en métodos específicos.
4. **Mejoré la legibilidad**: Hice el código más legible y organizado para que sea más fácil de mantener y entender.
- 