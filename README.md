Tema escolhido:
Cadastro de Clínica Veterinária banho e tosa

Maior dificuldade e por quê:
Organizar as classes e atributos com relação às suas associações, organizar os pacotes do código. Porque tive dificuldade principalmente nisso. 

Como executar o programa:
fé


Diagrama d Classes Link
https://drive.google.com/file/d/1hJr20k7jvaY3iFPmPhKu4vt9AqF6WgqJ/view?usp=sharing




ERRO's

        // System.out.println("Press 9 - Alterar alguma informação.");


            // case 9: //ERRO
            // System.out.println("•·•Opções para alteração•·•");
            // System.out.println("1 - Nome");
            // System.out.println("2 - Idade");
            // System.out.println("3 - Raça");
            // System.out.println("4 - Nível de Cuidado");

            // int op = LER.nextInt();
            // cadastroDePet.alterar(pet, op);
            // System.out.println("Alteração realizado com sucesso!");
            //     break;

//Método p alterar alguma informação - ERRO
    public void alterar(Pet lisPet, int x){

        if (x >= 0 && x < listPets.size()) {
            Pet pet = listPets.get(x);
            
            int escoliose = LER.nextInt();
            
            switch (escoliose) {
                case 1:  // Alterar nome
                    System.out.print("Novo nome: ");
                    String novoNome = LER.next();
                    pet.setNome(novoNome);
                    System.out.println("Nome alterado com sucesso!");
                    break;

                case 2:  // Alterar idade
                    System.out.print("Nova idade: ");
                    int newIdade = LER.nextInt();
                    pet.setIdade(newIdade);
                    System.out.println("Idade alterada com sucesso!");
                    break;

                    case 3:  // Alterar raça
                    System.out.print("Nova raça: ");
                    String newRaca = LER.next();
                    pet.setRaca(newRaca);
                    System.out.println("Raça alterada com sucesso!");
                    break;

                case 4:  // Alterar nível de cuidado
                    System.out.println("Novo nível de cuidado (baixo, médio, alto): ");
                    String newNC = LER.next();
                    pet.setNivelCuidado(newNC);
                    System.out.println("Nível de cuidado alterado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
