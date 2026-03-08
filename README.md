  Minha classe **GuardaChuva** representa esse item de forma funcional, focando em:
  
      Estado: Saber se ele está aberto ou fechado.
      Vida Útil: O desgaste natural do objeto (durabilidade) a cada vez que ele é utilizado.

  A classe **GuardaChuva** foi estruturada para que o objeto tenha consciência de sua integridade.
    Atributos:
      
      cor: Define a estética do objeto.
      material: Indica do que ele é feito (ex: Poliéster, Fibra).
      durabilidade: Um valor numérico que define quantos usos o objeto ainda suporta.
      aberto: Um valor booleano (verdadeiro/falso) que controla o estado atual.

  Métodos:
  
  
  
 	 abrir():
      Regra de Negócio: Antes de abrir, o sistema verifica se a durabilidade é maior que zero.
      Consequência: Se estiver em bom estado, o guarda-chuva abre e sua durabilidade diminui em 1 unidade. 

    fechar():
      Altera o estado do objeto para fechado, quando não for mais necessário o uso dele.
