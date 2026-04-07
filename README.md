# C06-POO

Nome: Ana Clara Oliveira Alvim
Curso: Engenharia De Software
Matrícula: 587

Os arquivos do código estão na pasta: out/production/PcMania/br/inatel/cdg

Fiz o código com os conhecimentos adquiridos nas aulas de POO, contudo, em alguns momentos de dúvida e incerteza por quais caminhos seguir, utilizei IA para me auxiliar, fornecer outras ideias alternativas e até mesmo para revisão de erros que passaram batido por mim. Segue registrado os momentos que foi usada, quais prompts e os resultados:

# Variáveis não existem
Criei as variáveis mas não as guardei, um erro simples que acbei deixando batido. Enviei meu código como estava no momento para o chatGPT e ele logo descobriu o erro, sinalizando isso para mim com a seguinte mensagem: 

"COMO ARRUMAR (PASSO A PASSO SIMPLES)
🔹 1. Cria o array e um contador
Computador[] computadores = new Computador[10];
int i = 0;
🔹 2. REMOVE isso daqui ❌
computadores[0] = computador1;
computadores[1] = computador2;
computadores[2] = computador3;

👉 isso não deve existir mais

🔹 3. DENTRO do switch, guarda no array

Exemplo do case 1:

case 1:
    System.out.println("Promoção 1!");
    Computador computador1 = new Computador();
    computador1.setMarca("Apple");
    computador1.setPreco(587);

  computadores[i] = computador1;
  i++;

  break;"

# Muita dificuldade em decidir onde criar o hardware
Minha ideia inicial era inicializar o computador na main e o hardware e outras classes dentro do computador. Passei algumas boas horas tentando desenvolver essa ideia, como não deu certo, fui falar com o chat GPT. Ele também não apresentou uma solução funcional para a forma como eu queria, por isso optei por inicializar na main mesmo.

Prompt: "isso tá ficando muito confuso. Vamos esquecer isso e focar no seguinte: Como eu adiciono o hardware básico no pc"

Solução: "🧠 💡 PASSO 1 — O COMPUTADOR PRECISA TER UM LUGAR PRA GUARDAR

Na classe Computador:

private HardwareBasico[] hardwares = new HardwareBasico[3];

👉 isso é tipo uma “caixinha” com 3 espaços

🧠 💡 PASSO 2 — CRIAR UM MÉTODO PRA ADICIONAR

Ainda em Computador:

public void addHardware(HardwareBasico hw, int pos){
    hardwares[pos] = hw;
}
💡 Tradução:

👉 “coloca esse hardware nessa posição”

🧠 💡 PASSO 3 — USAR NO MAIN

Agora no Main (dentro do case):

🔹 1. cria o computador
Computador pc = new Computador();
🔹 2. cria um hardware
HardwareBasico h1 = new HardwareBasico();
h1.setNome("Processador");
h1.setCapacidade(2200);
🔹 3. adiciona no computador
pc.addHardware(h1, 0);
💥 PRONTO. É SÓ ISSO.
🧠 💡 EXEMPLO COMPLETO SIMPLES
Computador pc = new Computador();

HardwareBasico h1 = new HardwareBasico();
h1.setNome("Processador");
h1.setCapacidade(2200);

pc.addHardware(h1, 0);"

# Dificuldade em mostrar as configurações do PC

Essa foi minha ultima dúvida que tive que recorrer a ia, mandei o seguinte prompt: "Chat, já pensei e pensei e não consigo mostrar PC configs na classe computador. Pode me ajudar?"

Solução da ia: "✅ mostraPCConfigs() (coloca na classe Computador)
public void mostraPCConfigs(){
    System.out.println("---------------");
    System.out.println("Marca: " + marca);
    System.out.println("Preço: " + preco);

  System.out.println("Hardware:");
  for(int i = 0; i < hardwares.length; i++){
        if(hardwares[i] != null){
            System.out.println("- " + hardwares[i].getNome() + ": " + hardwares[i].getCapacidade());
        }
    }
}
⚠️ 💥 MUITO IMPORTANTE

Isso só funciona se na sua classe HardwareBasico tiver:

public String getNome(){
    return nome;
}

public float getCapacidade(){
    return capacidade;
}
🧠 💡 O QUE ESSE MÉTODO FAZ

👉 mostra marca
👉 mostra preço
👉 percorre o array de hardware
👉 mostra cada peça

🚀 PRA USAR NO MAIN (QUANDO VOLTAR)

Depois do while:

for(int j = 0; j < i; j++){
    computadores[j].mostraPCConfigs();
}
💙 RESULTADO

Vai aparecer algo tipo:

---------------
Marca: Apple
Preço: 587
Hardware:
- Processador Core i3: 2200
- Memória RAM: 8
- HD: 500"

==================================================================================================

No final ainda mudei muitas coisas no código e acabei usando as respostas do chat apenas como um esqueleto e uma ajuda externa para modelar as classes e descobrir outros erros simples (os quais não adicionei aqui, como erro no número de arrays, palavras erradas, etc).
