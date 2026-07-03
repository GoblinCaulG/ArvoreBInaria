![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)
![Status](https://img.shields.io/badge/status-Concluído-brightgreen?style=for-the-badge)
 
# 🌳 Implementação de Árvore Binária de Busca em Java (EDI)
 
Este repositório contém a implementação completa de uma **Árvore Binária de Busca (ABB / BST)** em Java, incluindo operações de inserção, busca, remoção, percursos (pré-ordem, em-ordem e pós-ordem), cálculo de altura/quantidade de nós e um menu interativo via terminal para testar todas as funcionalidades.
 
---
 
# 🧠 Objetivo
 
Consolidar o entendimento sobre uma das estruturas de dados mais importantes da computação:
 
- Árvore Binária de Busca (**BST — Binary Search Tree**)
Explorando conceitos como:
 
- Organização hierárquica de dados (menor à esquerda, maior à direita)
- Recursividade
- Percursos em árvore (pré-ordem, em-ordem, pós-ordem)
- Remoção com tratamento dos três casos possíveis
- Complexidade de tempo em árvores equilibradas e degeneradas
---
 
# 🏗️ Estrutura do Projeto
 
## 📌 `No.java`
 
Representa um nó da árvore:
 
- `valor` — valor armazenado no nó
- `esquerda` — referência para o filho esquerdo
- `direita` — referência para o filho direito
---
 
## 📌 `ArvoreBinaria.java`
 
Classe principal com toda a lógica da árvore:
 
- `raiz` — ponto de entrada da árvore
---
 
# ⚙️ Operações Implementadas
 
## ➕ Inserção
 
- `inserir(int valor)`
- Desce recursivamente comparando valores até encontrar uma posição vazia
- Valores menores vão para a esquerda, maiores para a direita
## 🔍 Busca
 
- `buscar(int valor)`
- Retorna `true`/`false` comparando o valor buscado com cada nó visitado
## ➖ Remoção
 
- `remover(int valor)`
- Trata os **três casos clássicos**:
  1. **Nó folha** → apenas remove o nó
  2. **Um filho** → o pai "pula" o nó removido e adota o neto
  3. **Dois filhos** → substitui pelo **sucessor em-ordem** (menor valor da subárvore direita) e remove o sucessor original
## 🔁 Percursos
 
- `preOrdem(No no)` — nó → esquerda → direita
- `emOrdem(No no)` — esquerda → nó → direita (retorna valores **ordenados**)
- `posOrdem(No no)` — esquerda → direita → nó
## 📊 Propriedades
 
- `altura(No no)` — maior distância da raiz até uma folha
- `contarNos(No no)` — total de nós da árvore
## 🖼️ Visualização
 
- `exibir()` — imprime a árvore de forma hierárquica no terminal, com indentação e conectores (`┌──`, `└──`, `│`)
---
 
# 🧩 Menu Interativo (`Main.java`)
 
O programa disponibiliza um menu via `Scanner` com as seguintes opções:
 
| Opção | Ação |
|-------|------|
| 1 | Inserir valor |
| 2 | Remover valor |
| 3 | Buscar valor |
| 4 | Exibir os três percursos |
| 5 | Exibir estrutura da árvore |
| 6 | Exibir altura e total de nós |
| 7 | Carregar árvore de exemplo `{45, 20, 65, 10, 35, 55, 80}` |
| 0 | Encerrar |
 
---
 
# 🧪 Exemplo de Uso
 
```
--- Menu ---
1. Inserir
2. Remover
3. Buscar
4. Percursos
5. exibir
6. Propriedades
7. Carregar exemplo
0. Encerrar
Escolha: 7
Exemplo carregado
 
Estrutura da Arvore:
        ┌── 80
    ┌── 65
        └── 55
    45 (raiz)
        ┌── 35
    └── 20
        └── 10
Em-Ordem: 10 20 35 45 55 65 80
```
 
---
 
# 🧠 Conceitos Aplicados
 
- Estruturas de Dados
- Árvores Binárias de Busca (BST)
- Recursividade
- Percursos em árvore (pré, em, pós-ordem)
- Sucessor em-ordem
- Complexidade de tempo (O(log n) vs O(n))
- POO (Programação Orientada a Objetos)
---
 
# ⚙️ Tecnologias
 
- Java
- JDK 17+
- IntelliJ IDEA / NetBeans
- Git
- GitHub
---
 
# 🚀 Melhorias Futuras
 
- JUnit para testes automatizados
- Exceptions personalizadas (ex: valor duplicado)
- Balanceamento automático (AVL / Rubro-Negra)
- Iteradores
- JavaDoc
---
 
# 🎯 Objetivo Acadêmico
 
Projeto desenvolvido para a disciplina de **Estrutura de Dados**, com foco em implementação manual e entendimento profundo do funcionamento de uma Árvore Binária de Busca.
 
---
 
# 👨‍💻 Autor
 
Carlos Sales
