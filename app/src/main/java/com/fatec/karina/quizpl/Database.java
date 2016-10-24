package com.fatec.karina.quizpl;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Opa on 23/10/2016.
 */
public class Database extends Perguntas {

   ArrayList<Integer> resposta = new ArrayList<>();

    public void criarTeste(){
        questoes = new ArrayList<>();



        Perguntas   p1   = new Perguntas();
        p1.pergunta=    "   A definição arquitetura baseada a componentes é ?   ";
        p1.resposta=    1   ;
        p1.opcoes=new String[]{ "Estrutura da Funcionalidade    ",  "Estrutura de Defeitos  ",  "Estruturas de Arquivos ",  "Estruturas Lógicas ",  "   Estrutura Física    "};
        questoes.add(p1);
        resposta.add(p1.resposta);

        Perguntas   p2   = new Perguntas();
        p2.pergunta=    "   Das cracterísticas da arquitetura de componentes ?  ";
        p2.resposta=    1   ;
        p2.opcoes=new String[]{ "Reusabilidade - Substituição ",    "Nenhuma das Outras ",  "Trabalha c/ Linux  ",  "Mouse, Teclado...  ",  "Não usa Padrão "};
        questoes.add(p2);
        resposta.add(p2.resposta);

        Perguntas   p3   = new Perguntas();
        p3.pergunta=    "    tipos de componentes  utilizados em app ?  ";
        p3.resposta=    1   ;
        p3.opcoes=new String[]{ "botões / forms     ",  "Icones do Google", "Webdesing Cria ",  "Nenhuma das Alternativas   ",  "Botão Sair "};
        questoes.add(p3);
        resposta.add(p3.resposta);

        Perguntas   p4   = new Perguntas();
        p4.pergunta=    "   Vantagens utilizando Arquitetura de componentes ?   ";
        p4.resposta=    1   ;
        p4.opcoes=new String[]{ "  Compatibilidade  ",  "Incompatibilidade  ",  "Sincronia  ",  "Sistema Veloz  ",  "Não Sei    "};
        questoes.add(p4 );
        resposta.add(p4.resposta);

        Perguntas   p5   = new Perguntas();
        p5.pergunta=    "   Exigências. Projeto de desenvolvimento de Soft. ?   ";
        p5.resposta=    1   ;
        p5.opcoes=new String[]{ "Minimização dos prazos de entrega; ",  "Maximização de custos  ",  "Minimização de códgos  ",  "Custos altos   ",  "Será ? "};
        questoes.add(p5);
        resposta.add(p5.resposta);

        Perguntas   p6   = new Perguntas();
        p6.pergunta=    "   Como obter benefícios na  arquitetura de componente ?   ";
        p6.resposta=    1   ;
        p6.opcoes=new String[]{ "Melhora prog. Orientação a objetos ",  "Melhora prog. Estruturado  ",  "Melhora produção   ",  "Melhora relacionamento ",  "Melhora Humor  "};
        questoes.add(p6);
        resposta.add(p6.resposta);

        Perguntas   p7   = new Perguntas();
        p7.pergunta="   Atividades para viabilizar Arquitetura de componentes?  ";
        p7.resposta=    1   ;
        p7.opcoes=new String[]{ "Especificação do Sistema;  ",  "Não precisa viabilizar ",  "Casos de Usos  ",  "Diagrama de CLasse ",  "Diagrama Objeto    "};
        questoes.add(p7);
        resposta.add(p7.resposta);

        Perguntas   p8   = new Perguntas();
        p8.pergunta=    "Sobre arquitetura inter-organizacional distribuída é correto";
        p8.resposta=    1   ;
        p8.opcoes=new String[]{ "Distribui o processamento internamente ",  "Não distribuir ",  "Interliga todas Areas  ",  "Não Interliga  ",  "Nenhuma das Outras"};
        questoes.add(p8 );
        resposta.add(p8.resposta);

        Perguntas   p9   = new Perguntas();
        p9.pergunta=    "O que são sistemas ponto a ponto (peer to peer)?       ";
        p9.resposta=    1   ;
        p9.opcoes=new String[]{ " Sistemas Descentralizados ",  "Sistema Centralizados  ",  "Nenhuma das Anteriores ",  "Talvez seja essa   ",  "Sistemas Complexos "};
        questoes.add(p9 );
        resposta.add(p9.resposta);

        Perguntas   p10  = new Perguntas();
        p10.pergunta=   "Exemplo de arquitetura P2P descentralizada e semi-centralizada.        ";
        p10.resposta=   1   ;
        p10.opcoes=new String[]{"Similar ao whatsap ",  "Sistemas Lentos    ",  "Sistemas de Dominios   ",  "Servidor   ",  "Pode não ser essa  "};
        questoes.add(p10);
        resposta.add(p10.resposta);

        Perguntas   p11  = new Perguntas();
        p11.pergunta=   ". Definição de sistemas P2P descentralizados   ";
        p11.resposta=   2   ;
        p11.opcoes=new String[]{    "Nós Funcionais",   "Nós na redes n Funcional   ",  "Pode ser essa  ",  "Nenhuma das Outras ",  "Vamos para Proxima "};
        questoes.add(p11);
        resposta.add(p11.resposta);

        Perguntas   p12  = new Perguntas();
        p12.pergunta=   "   Explique SOA – Service -oriented Architecture – Arquitetura orientada à Serviço?    ";
        p12.resposta=   2   ;
        p12.opcoes=new String[]{    "   OPA ",  "   processos e funções de negócio  ",  "   OPA ",  "   OPA ",  "   OPA "};
        questoes.add(p12);
        resposta.add(p12.resposta);

        Perguntas p13 = new Perguntas();
        p13.pergunta="Os tipos de transmissão são:";
        p13.resposta= 4;
        p13.opcoes = new String[]{ "Síncrono, Half-Duplex e Full-Duplex","Síncrono, Assíncrono e Simplex","Simplex, Half-Duplex e Full-Duplex","Síncrono, Assíncrono e Duplex",
                "Vamos Pra Proxima"};
        questoes.add(p13);
        resposta.add(p13.resposta);

        Perguntas p14 = new Perguntas();
        p14.pergunta="Não é tipo de modulação:";
        p14.resposta= 4 ;
        p14.opcoes = new String[]{"AM – Amplitude Modulation",
                "PM – Phase Modulation",
                "FM – Frequency Modulation",
                "WM – Wave Modulation", "Não sei"};
        questoes.add(p14);
        resposta.add(p14.resposta);

        Perguntas p15 = new Perguntas();
        p15.pergunta="Não é um tipo de transmissão por radiofreqüência:";
        p15.resposta=4;
        p15.opcoes = new String[]{"Enlace via Rádio",
                "Microondas",
                "Wi-Fi",
                "N.d.a." , "Não sei"};
        questoes.add(p15);
        resposta.add(p15.resposta);

        Perguntas p16 = new Perguntas();
        p16.pergunta="É recomendado a utilização de cabo UTP para dados a partir de:";
        p16.resposta=3;
        p16.opcoes = new String[]{"Cat1",
                "Cat2",
                "Cat3",
                "Cat5", "Não sei"};
        questoes.add(p16);
        resposta.add(p16.resposta);

        Perguntas p17 = new Perguntas();
        p17.pergunta="Não é um tipo de multiplexação:";
        p17.resposta=4;
        p17.opcoes = new String[]{"WDM","TDM","FDM", "ODM", "Não sei"};
        questoes.add(p17);
        resposta.add(p17.resposta);

        Perguntas p18 = new Perguntas();
        p18.pergunta="Não é um tipo de rede:";
        p18.resposta=4;
        p18.opcoes = new String[]{"LAN",
                "WAN",
                "MAN",
                "N.d.a.", "Não sei"};
        questoes.add(p18);
        resposta.add(p18.resposta);

        Perguntas p19 = new Perguntas();
        p19.pergunta="É um tipo de topologia de redes :";
        p19.resposta=2;
        p19.opcoes = new String[]{"Secret Token",
                "Híbrida",
                "Token Star",
                "Ring Bar", "Não sei"};
        questoes.add(p19);
        resposta.add(p19.resposta);

        Perguntas p20 = new Perguntas();
        p20.pergunta="Unificar os meios de conexão para obtenção de mais banda é chamado de:";
        p20.resposta=3;
        p20.opcoes = new String[]{"Link Segregation",
                "Link Absolut",
                "Link Multiplex",
                "Link Agregation", "Não sei"};
        questoes.add(p20);
        resposta.add(p20.resposta);

        Perguntas p21 = new Perguntas();
        p21.pergunta="Os tipos de luz utilizados em fibra ótica são...e os tipos de fibra são...(respectivamente)";
        p21.resposta=4;
        p21.opcoes= new String[]{"Multimodo e Monomodo, LED e Laser",
                "TDM e STDM, LED e Laser",
                "LED e Laser, Multimodo e Monomodo",
                "LED e Laser, TDM e STDM", "Não sei"};
        questoes.add(p21);
        resposta.add(p21.resposta);

        Perguntas p22 = new Perguntas();
        p22.pergunta="A camada de redes é responsável por:";
        p22.resposta=2;
        p22.opcoes = new String[]{"Controle dos TPDU’s",
                "Roteamento e Encapsulamento",
                "Verificação de erros no nível físico",
                "Verificar o MAC", "Não sei"};
        questoes.add(p22);
        resposta.add(p22.resposta);

        Perguntas   p46  = new Perguntas();
        p46.pergunta=   "   Qual dos comando SQL abaixo ordena os dados selecionados ?  ";
        p46.resposta=   5   ;
        p46.opcoes=new String[]{    "   HAVING  ",  "   AND ",  "   GROUP BY    ",  "   BETWEEN ",  "   ORDER BY    "};
        questoes.add(p46);
        resposta.add(p46.resposta);

        Perguntas   p47  = new Perguntas();
        p47.pergunta=   "   Qual das alternativas abaixo possui SOMENTE operadores considerados como “operador lógico   ";
        p47.resposta=   5   ;
        p47.opcoes=new String[]{    "   NOT, OR, GROUP  ",  "   LIKE, ORDER BY  ",  "    AND, BETWEEN, LOWER    ",  "   AND, SUM, OR    ",  "   AND, NOT, OR    "};
        questoes.add(p47);
        resposta.add(p47.resposta);


        Perguntas   p48  = new Perguntas();
        p48.pergunta=   "   Qual da funções abaixo NÃO é utilizada para valores textuais    ";
        p48.resposta=   5   ;
        p48.opcoes=new String[]{    "   UPPER() ",  "   LIKE    ",  "    LOWER()    ",  "   INITCAP()   ",  " SUM() "};
        questoes.add(p48);
        resposta.add(p48.resposta);

        Perguntas   p49  = new Perguntas();
        p49.pergunta=   "   Qual dos comandos abaixo é utilizado para atualizar dados em uma tabela ";
        p49.resposta=   5   ;
        p49.opcoes=new String[]{    "   INSERT  ",  "   DELETE  ",  "   CREATE  ",  "   SELECT  ",  "   UPDATE  "};
        questoes.add(p49);
        resposta.add(p49.resposta);

        Perguntas   p50  = new Perguntas();
        p50.pergunta=   "   Por manipulação de dados o que NÃO explica o conceito   ";
        p50.resposta=   5   ;
        p50.opcoes=new String[]{    "    A modificação das informações no banco de dados.   ",  "   A remoção das informações no banco de dados ",  "     Inserção de novas informações no banco de dados.  ",  "    A recuperação das informações  ",  "    A definição da estrutura de armazenamento  "};
        questoes.add(p50);
        resposta.add(p50.resposta);



    }
}
