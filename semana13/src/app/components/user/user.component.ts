import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
  calificacion: boolean = true;
  lstEstudiantes = [
    {id: 1, name: 'Omar'},
    {id: 2, name: 'Alonzo'},
    {id: 3, name: 'Adrian'},
    {id: 4, name: 'Cristopher'},
    {id: 5, name: 'Diego'},
    {id: 6, name: 'Favio'},
    {id: 7, name: 'Marlon'},
    {id: 8, name: 'Dayanne'}
  ]
}
