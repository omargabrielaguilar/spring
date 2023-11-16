import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { UserComponent } from './components/user/user.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, UserComponent],
  //template:`<h2>Hola!!</h2>`,
  templateUrl: './app.component.html',
  styles: `h1{color: blue;}`
  //styleUrl: './app.component.css'
})


export class AppComponent {
  Curso = 'Curso de Angular';
  userOcupacion : string = "Docente"
}
