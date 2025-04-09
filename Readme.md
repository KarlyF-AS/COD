## Refactorización del código de puntuación de tenis
___
## ✨ ¿Qué cambié?

Refactoricé el código original para hacerlo más **legible**, **modular** y **fácil de mantener**. Estos son los cambios principales que hice:

- Separé la lógica en **métodos privados** (`getTieScore`, `getAdvantageOrWinScore`, `getRegularScore`).
- Usé un **array para los nombres de puntuación** ("Love", "Fifteen", etc.) para simplificar.
- Eliminé el `for` algo confuso que usaba el código original y lo reemplacé por lógica más directa.
- Mantengo el mismo comportamiento y todos los tests siguen pasando ✅.