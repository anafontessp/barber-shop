import { Component } from '@angular/core';
import { AgendamentoService } from '../../services/agendamento.service';
import { Agendamento } from '../../models/agendamento.model';

@Component({
  selector: 'app-agendamento-form',
  templateUrl: './agendamento-form.component.html'
})
export class AgendamentoFormComponent {
  agendamento: Agendamento = {
    cliente: '',
    servico: '',
    dataHora: ''
  };

  constructor(private agendamentoService: AgendamentoService) {}

  salvar() {
    this.agendamentoService.salvar(this.agendamento).subscribe(() => {
      alert('Agendamento realizado com sucesso!');
    });
  }
}
