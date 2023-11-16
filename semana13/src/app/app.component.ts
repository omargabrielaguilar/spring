import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  template:`<h2>Hola!!</h2>`,
  //templateUrl: './app.component.html',
  styles: `h2{color: blue;}`
  //styleUrl: './app.component.css'
})


export class AppComponent {
  Curso = 'Curso de Angular';
}
