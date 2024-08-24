import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ExampleComponent } from './example/example.component';

@Component({ // Decorador @Component
  selector: 'app-root', // Nombre del Componente para llamarlo en html
  standalone: true, // Indicador Standalone
  imports: [RouterOutlet, ExampleComponent], // Imports de Componentes Anidados
  templateUrl: './app.component.html', // Vista html
  styleUrl: './app.component.css' // Estilos css
})

// Declaracion de la Clase, se incluye el Comportamiento del Componente
export class AppComponent {
  title = 'frontend';
}
