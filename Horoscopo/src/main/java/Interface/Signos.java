/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author JhéssikLeal
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    public Signos() {
        initComponents();
        
       RedimensionarImagens(); 
    }
    //TODA FUNCAO É CRIADA ABAIXO DO CONSTRUTOR
    
    public void RedimensionarImagens(){
        ////capturar img dentro da label
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        
        // =========================
        // ÁRIES
        // =========================
        Image imgAries = aries.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);  
        imgSignoAries.setIcon(new ImageIcon(imgAries));


        // =========================
        // TOURO
        // =========================
        Image imgTouro = touro.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoTouro.setIcon(new ImageIcon(imgTouro));


        // =========================
        // GÊMEOS
        // =========================
        Image imgGemeos = gemeos.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoGemeos.setIcon(new ImageIcon(imgGemeos));


        // =========================
        // CÂNCER
        // =========================
        Image imgCancer = cancer.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoCancer.setIcon(new ImageIcon(imgCancer));


        // =========================
        // LEÃO
        // =========================
        Image imgLeao = leao.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoLeao.setIcon(new ImageIcon(imgLeao));


        // =========================
        // VIRGEM
        // =========================
        Image imgVirgem = virgem.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoVirgem.setIcon(new ImageIcon(imgVirgem));


        // =========================
        // LIBRA
        // =========================
        Image imgLibra = libra.getImage().getScaledInstance(
        400, 630, Image.SCALE_SMOOTH);
        imgSignoLibra.setIcon(new ImageIcon(imgLibra));


        // =========================
        // ESCORPIÃO
        // =========================
        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(
        400, 620, Image.SCALE_SMOOTH);
        imgSignoEscorpiao.setIcon(new ImageIcon(imgEscorpiao));


        // =========================
        // SAGITÁRIO
        // =========================
        Image imgSagitario = sagitario.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoSagitario.setIcon(new ImageIcon(imgSagitario));


        // =========================
        // CAPRICÓRNIO
        // =========================
        Image imgCapricornio = capricornio.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoCapricornio.setIcon(new ImageIcon(imgCapricornio));


        // =========================
        // AQUÁRIO
        // =========================
        Image imgAquario = aquario.getImage().getScaledInstance(
        400, 700, Image.SCALE_SMOOTH);
        imgSignoAquario.setIcon(new ImageIcon(imgAquario));


        // =========================
        // PEIXES
        // =========================
        Image imgPeixes = peixes.getImage().getScaledInstance(
        600, 700, Image.SCALE_SMOOTH);

        imgSignoPeixes.setIcon(new ImageIcon(imgPeixes));

        // Centralizar a imagem na JLabel
        imgSignoPeixes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSignoPeixes.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        
    }//Fim da funcao
    
    public void PreencherPrevisao(){
        //verificar dia da semana
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        
        //criar a condicional para preencher o campo previsao
        switch (diaSemana) {

    // =====================================================
    // SEGUNDA-FEIRA
    // =====================================================
    case 1: // Segunda-Feira

        txtPrevisaoAries.setText("Comece a semana com energia e determinação. Evite agir por impulso e organize seus objetivos.");
        txtPrevisaoTouro.setText("Um dia favorável para organizar sua vida financeira e colocar suas tarefas em ordem. Tenha paciência.");
        txtPrevisaoGemeos.setText("Sua comunicação estará favorecida. Aproveite para conversar, trocar ideias e resolver assuntos pendentes.");
        txtPrevisaoCancer.setText("O dia pede tranquilidade e atenção aos sentimentos. Valorize as pessoas que realmente fazem bem a você.");
        txtPrevisaoLeao.setText("Sua confiança estará em alta. Use sua criatividade para enfrentar os desafios e mostrar seu potencial.");
        txtPrevisaoVirgem.setText("Organização será sua maior aliada. Concentre-se nas tarefas mais importantes e evite preocupações desnecessárias.");
        txtPrevisaoLibra.setText("Procure manter o equilíbrio entre suas responsabilidades e sua vida pessoal. Uma conversa pode esclarecer uma situação.");
        txtPrevisaoEscorpiao.setText("Sua intuição estará forte. Observe os detalhes antes de tomar decisões importantes.");
        txtPrevisaoSagitario.setText("Novas ideias podem surgir durante o dia. Mantenha o otimismo e aproveite oportunidades de aprendizado.");
        txtPrevisaoCapricornio.setText("Foco e disciplina ajudarão você a avançar. Dê atenção especial aos seus projetos pessoais.");
        txtPrevisaoAquario.setText("Um dia interessante para pensar diferente e buscar novas soluções. Não tenha medo de mudar seus planos.");
        txtPrevisaoPeixes.setText("Reserve um momento para cuidar de si. Sua sensibilidade pode ajudar a perceber coisas que normalmente passam despercebidas.");

        break;


    // =====================================================
    // TERÇA-FEIRA
    // =====================================================
    case 2: // Terça-Feira

        txtPrevisaoAries.setText("Sua energia estará em alta. Aproveite para correr atrás dos seus objetivos e resolver pendências.");
        txtPrevisaoTouro.setText("Tenha calma para tomar decisões. Um pequeno esforço hoje poderá trazer resultados positivos no futuro.");
        txtPrevisaoGemeos.setText("Uma conversa inesperada pode trazer uma boa oportunidade. Esteja aberto a novas ideias.");
        txtPrevisaoCancer.setText("Aproxime-se de quem você gosta. Um gesto simples pode fortalecer uma relação importante.");
        txtPrevisaoLeao.setText("Você poderá se destacar em uma situação importante. Confie nas suas capacidades e mantenha a confiança.");
        txtPrevisaoVirgem.setText("Seu senso de organização estará favorecido. Aproveite para finalizar algo que estava pendente.");
        txtPrevisaoLibra.setText("Evite conflitos desnecessários. O diálogo será a melhor maneira de encontrar soluções.");
        txtPrevisaoEscorpiao.setText("Uma situação que parecia complicada pode começar a ficar mais clara. Confie na sua percepção.");
        txtPrevisaoSagitario.setText("O dia favorece novas experiências. Aproveite para sair da rotina e aprender algo diferente.");
        txtPrevisaoCapricornio.setText("Persistência será importante hoje. Continue trabalhando nos seus objetivos mesmo que os resultados demorem.");
        txtPrevisaoAquario.setText("Uma ideia diferente pode chamar sua atenção. Anote seus planos e pense em maneiras de colocá-los em prática.");
        txtPrevisaoPeixes.setText("Sua criatividade estará favorecida. Use sua imaginação para encontrar soluções para pequenas dificuldades.");

        break;


    // =====================================================
    // QUARTA-FEIRA
    // =====================================================
    case 3: // Quarta-Feira

        txtPrevisaoAries.setText("O dia favorece novas ideias e mudanças. Pense antes de assumir novas responsabilidades.");
        txtPrevisaoTouro.setText("Mantenha os pés no chão e siga seu ritmo. Evite deixar a ansiedade atrapalhar suas decisões.");
        txtPrevisaoGemeos.setText("Sua curiosidade estará forte. Uma nova informação pode mudar sua maneira de enxergar uma situação.");
        txtPrevisaoCancer.setText("Procure não guardar tudo para você. Conversar com alguém de confiança poderá trazer alívio.");
        txtPrevisaoLeao.setText("Sua presença poderá chamar atenção. Use isso de maneira positiva e valorize também as opiniões dos outros.");
        txtPrevisaoVirgem.setText("Um bom planejamento poderá facilitar bastante seu dia. Faça uma coisa de cada vez.");
        txtPrevisaoLibra.setText("O equilíbrio será importante. Não deixe que pequenos problemas tirem sua tranquilidade.");
        txtPrevisaoEscorpiao.setText("Evite tirar conclusões precipitadas. Observe os acontecimentos antes de tomar uma atitude.");
        txtPrevisaoSagitario.setText("Sua vontade de explorar coisas novas estará forte. Aproveite para buscar conhecimento.");
        txtPrevisaoCapricornio.setText("Um esforço realizado anteriormente pode começar a mostrar resultados. Continue firme nos seus objetivos.");
        txtPrevisaoAquario.setText("Sua criatividade poderá surpreender. Uma solução original pode resolver um problema antigo.");
        txtPrevisaoPeixes.setText("Escute sua intuição, mas procure também analisar os fatos antes de tomar uma decisão.");

        break;


    // =====================================================
    // QUINTA-FEIRA
    // =====================================================
    case 4: // Quinta-Feira

        txtPrevisaoAries.setText("Você poderá perceber uma nova oportunidade surgindo. Mantenha o foco e mostre suas capacidades.");
        txtPrevisaoTouro.setText("Um dia adequado para cuidar das finanças e dos planos para o futuro. Evite gastos por impulso.");
        txtPrevisaoGemeos.setText("Sua facilidade para conversar poderá abrir portas. Não tenha medo de apresentar suas ideias.");
        txtPrevisaoCancer.setText("Um momento agradável com pessoas próximas pode melhorar seu dia. Valorize as pequenas demonstrações de carinho.");
        txtPrevisaoLeao.setText("Sua determinação poderá ajudar a superar um desafio. Acredite mais no seu potencial.");
        txtPrevisaoVirgem.setText("Você terá facilidade para perceber detalhes importantes. Use isso para melhorar uma tarefa ou projeto.");
        txtPrevisaoLibra.setText("Uma decisão poderá exigir equilíbrio. Considere todos os lados antes de escolher o caminho.");
        txtPrevisaoEscorpiao.setText("Algo que estava escondido pode ficar mais evidente. Use sua percepção para entender melhor a situação.");
        txtPrevisaoSagitario.setText("O dia pode trazer uma oportunidade inesperada. Esteja preparado para aproveitar novas experiências.");
        txtPrevisaoCapricornio.setText("Sua responsabilidade será reconhecida. Continue mantendo o foco sem esquecer de descansar.");
        txtPrevisaoAquario.setText("Novas possibilidades podem surgir quando você estiver disposto a experimentar algo diferente.");
        txtPrevisaoPeixes.setText("Sua sensibilidade estará acentuada. Use sua empatia para melhorar uma conversa importante.");

        break;


    // =====================================================
    // SEXTA-FEIRA
    // =====================================================
    case 5: // Sexta-Feira

        txtPrevisaoAries.setText("O clima favorece os relacionamentos. Deixe de lado pequenos desentendimentos e aproveite o dia.");
        txtPrevisaoTouro.setText("Depois de uma semana movimentada, permita-se desacelerar. Aproveite momentos simples e agradáveis.");
        txtPrevisaoGemeos.setText("Uma conversa divertida pode transformar seu dia. Aproveite para estar perto de pessoas que você gosta.");
        txtPrevisaoCancer.setText("O carinho estará em destaque. Demonstre seus sentimentos e valorize quem está ao seu lado.");
        txtPrevisaoLeao.setText("Um elogio ou reconhecimento poderá melhorar seu dia. Aproveite o momento sem deixar o orgulho falar mais alto.");
        txtPrevisaoVirgem.setText("Depois de cumprir suas responsabilidades, permita-se descansar. Nem tudo precisa ser perfeito.");
        txtPrevisaoLibra.setText("Um encontro ou conversa pode trazer boas lembranças. Aproveite para fortalecer seus relacionamentos.");
        txtPrevisaoEscorpiao.setText("O dia favorece momentos mais intensos. Seja sincero sobre o que sente e evite esconder suas emoções.");
        txtPrevisaoSagitario.setText("A sexta-feira combina com diversão e novas experiências. Aproveite, mas mantenha o equilíbrio.");
        txtPrevisaoCapricornio.setText("Depois de uma semana de dedicação, reserve um tempo para relaxar e aproveitar suas conquistas.");
        txtPrevisaoAquario.setText("Uma ideia diferente para o fim da semana pode deixar seu dia mais interessante. Aproveite a companhia dos amigos.");
        txtPrevisaoPeixes.setText("O momento favorece carinho e tranquilidade. Aproveite para estar perto de quem transmite boas energias.");

        break;


    // =====================================================
    // SÁBADO
    // =====================================================
    case 6: // Sábado

        txtPrevisaoAries.setText("Aproveite o sábado para fazer algo que realmente gosta. Sua energia pede movimento e diversão.");
        txtPrevisaoTouro.setText("Um dia perfeito para descansar e aproveitar pequenos prazeres. Não tenha pressa para resolver tudo.");
        txtPrevisaoGemeos.setText("Um passeio ou encontro pode trazer boas histórias. Aproveite para conversar e conhecer pessoas novas.");
        txtPrevisaoCancer.setText("Ficar perto da família ou de pessoas queridas poderá trazer uma sensação especial de conforto.");
        txtPrevisaoLeao.setText("Você estará mais disposto a se divertir. Aproveite para fazer algo criativo e que coloque você em destaque.");
        txtPrevisaoVirgem.setText("Organize seu espaço e depois aproveite o tempo livre. Um ambiente agradável pode melhorar seu humor.");
        txtPrevisaoLibra.setText("O sábado favorece encontros e momentos agradáveis. Procure evitar discussões e aproveite a companhia.");
        txtPrevisaoEscorpiao.setText("Um momento de tranquilidade pode ajudar você a colocar os pensamentos em ordem.");
        txtPrevisaoSagitario.setText("A aventura chama sua atenção. Se puder, faça algo diferente e saia um pouco da rotina.");
        txtPrevisaoCapricornio.setText("Descanse sem culpa. Você merece aproveitar o tempo livre depois de tanto esforço.");
        txtPrevisaoAquario.setText("Um programa diferente pode tornar seu sábado especial. Convide alguém para compartilhar o momento.");
        txtPrevisaoPeixes.setText("Aproveite o dia para relaxar, ouvir música ou fazer algo que desperte sua criatividade.");

        break;


    // =====================================================
    // DOMINGO
    // =====================================================
    case 7: // Domingo

        txtPrevisaoAries.setText("Um dia ideal para refletir sobre a semana e planejar seus próximos passos com confiança.");
        txtPrevisaoTouro.setText("Desacelere e aproveite a tranquilidade. Planeje a próxima semana sem se cobrar demais.");
        txtPrevisaoGemeos.setText("Use o domingo para organizar suas ideias. Uma conversa pode ajudar você a definir seus próximos objetivos.");
        txtPrevisaoCancer.setText("A família e as pessoas queridas estarão em destaque. Aproveite cada momento de proximidade.");
        txtPrevisaoLeao.setText("Recarregue suas energias e pense nos seus próximos objetivos. Acredite mais em si mesmo.");
        txtPrevisaoVirgem.setText("Organize mentalmente a próxima semana, mas não esqueça de reservar um tempo para descansar.");
        txtPrevisaoLibra.setText("Procure começar a próxima semana com tranquilidade. Deixe para trás aquilo que não merece sua preocupação.");
        txtPrevisaoEscorpiao.setText("Um momento de reflexão poderá ajudar você a entender melhor seus desejos e próximos passos.");
        txtPrevisaoSagitario.setText("Pense nas experiências que deseja viver nos próximos dias. O futuro pode trazer novas oportunidades.");
        txtPrevisaoCapricornio.setText("Planejamento e determinação serão importantes. Defina suas prioridades para começar bem a semana.");
        txtPrevisaoAquario.setText("Novas ideias podem surgir enquanto você descansa. Anote aquilo que parecer interessante.");
        txtPrevisaoPeixes.setText("Um domingo tranquilo ajudará você a recuperar as energias. Confie na sua intuição para a próxima semana.");

        break;
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno2 = new javax.swing.JComboBox<>();
        cbSigno1 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaCaracteristicas = new javax.swing.JPanel();
        tituloCaracteristicaAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaInformacoesAries = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaPrevisao = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        txPrevisaoAries = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagem = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        txMensagemAries = new javax.swing.JScrollPane();
        txtMensagemAries = new javax.swing.JTextArea();
        btnCopiarMsgAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaCaracteristicas1 = new javax.swing.JPanel();
        tituloCaracteristicaTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaInformacoes1 = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaPrevisao1 = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        txPrevisaoTouro = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        areaEnergia1 = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        tfAmorAries1 = new javax.swing.JTextField();
        tfTrabalhoAries1 = new javax.swing.JTextField();
        tfSaudeAries1 = new javax.swing.JTextField();
        tfSorteAries1 = new javax.swing.JTextField();
        areaMensagem1 = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        txMensagemTouro = new javax.swing.JScrollPane();
        txtMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMsgTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaCaracteristicas2 = new javax.swing.JPanel();
        tituloCaracteristicaGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaInformacoes2 = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoAries2 = new javax.swing.JTextField();
        tfElementoAries2 = new javax.swing.JTextField();
        tfPlanetaAries2 = new javax.swing.JTextField();
        tfCorAries2 = new javax.swing.JTextField();
        tfNumeroAries2 = new javax.swing.JTextField();
        areaPrevisao2 = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        txPrevisaoAries2 = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        areaEnergia2 = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagem2 = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txMensagemGemeos = new javax.swing.JScrollPane();
        txtMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        fundoGemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaCaracteristicas3 = new javax.swing.JPanel();
        tituloCaracteristicaCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaInformacoes3 = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaPrevisao3 = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        txPrevisaoCancer = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        areaEnergia3 = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagem3 = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txMensagemCancer = new javax.swing.JScrollPane();
        txtMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMsgCancer = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaCaracteristicas4 = new javax.swing.JPanel();
        tituloCaracteristicaLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaInformacoes4 = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaPrevisao4 = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        txPrevisaoAries4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        areaEnergia4 = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txMensagemAries4 = new javax.swing.JScrollPane();
        txtMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaCaracteristicas5 = new javax.swing.JPanel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaInformacoes5 = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaPrevisao5 = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        txPrevisaoAries5 = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        areaEnergia5 = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagem5 = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txMensagemVirgem = new javax.swing.JScrollPane();
        txtMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        tituloCaracteristicaLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        txPrevisaoAries6 = new javax.swing.JScrollPane();
        txtPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txMensagemAries6 = new javax.swing.JScrollPane();
        txtMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicaEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        txPrevisaoAries7 = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txMensagemAries7 = new javax.swing.JScrollPane();
        txtMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicaSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoAries8 = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        txPrevisaoAries8 = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txMensagemAries8 = new javax.swing.JScrollPane();
        txtMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCaracteristicaCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        txPrevisaoAries9 = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txMensagemAries9 = new javax.swing.JScrollPane();
        txtMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicaAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaInformacoes10 = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        txPrevisaoAries10 = new javax.swing.JScrollPane();
        txtPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txMensagemAries10 = new javax.swing.JScrollPane();
        txtMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        tituloCaracteristicaPeixes = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaPrevisaoPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        txPrevisaoPeixes = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        txMensagemPeixes = new javax.swing.JScrollPane();
        txtMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloDescobrirSigno.setText("Descubra Seu Signo");

        nome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nome.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tfNome.setText("digite seu nome");

        cbDia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnDescobrirSigno.setText("Descobrir Signo");

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diaNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaNascimento))
                .addGap(38, 38, 38)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesNascimento))
                .addGap(31, 31, 31)
                .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 790, 490));

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signo2.setText("Segundo Signo:");

        cbSigno2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                                .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                                .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(tituloCompatibilidade)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 790, 410));

        signo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        compatibilidade.setText("Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(0, 0, 102));

        tfCompatibilidade.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                        .addComponent(compatibilidade)
                        .addGap(61, 61, 61))))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(signo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(signo)
                .addGap(37, 37, 37)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compatibilidade)
                .addGap(18, 18, 18)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 410, 910));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1090));

        areaAbas.addTab("Inicio", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setEditable(false);
        txFortesAries.setColumns(20);
        txFortesAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa, determinação, energia e liderança.");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setEditable(false);
        txMelhorarAries.setColumns(20);
        txMelhorarAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Impulsividade, impaciência, ansiedade e\n dificuldade em ouvir os outros.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasLayout = new javax.swing.GroupLayout(areaCaracteristicas);
        areaCaracteristicas.setLayout(areaCaracteristicasLayout);
        areaCaracteristicasLayout.setHorizontalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasLayout.setVerticalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aries.add(areaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aries.png")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAries.setText("ÁRIES");

        periodoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAries.setText("PERIODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setEditable(false);
        tfPeriodoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoAries.setText("21 de março a 19 de abril");
        tfPeriodoAries.addActionListener(this::tfPeriodoAriesActionPerformed);

        tfElementoAries.setEditable(false);
        tfElementoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setEditable(false);
        tfPlanetaAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaAries.setText("Marte");

        tfCorAries.setEditable(false);
        tfCorAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorAries.setText("Vermelho");

        tfNumeroAries.setEditable(false);
        tfNumeroAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAries, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries)
                                .addComponent(tfNumeroAries)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries))))
                .addGap(10, 10, 10))
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAries.setText("Previsão do Dia:");

        txtPrevisaoAries.setEditable(false);
        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoAries.setRows(5);
        txPrevisaoAries.setViewportView(txtPrevisaoAries);

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLayout = new javax.swing.GroupLayout(areaPrevisao);
        areaPrevisao.setLayout(areaPrevisaoLayout);
        areaPrevisaoLayout.setHorizontalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLayout.createSequentialGroup()
                        .addGroup(areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(previsaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(13, 13, 13))
                    .addGroup(areaPrevisaoLayout.createSequentialGroup()
                        .addComponent(txPrevisaoAries)
                        .addContainerGap())))
        );
        areaPrevisaoLayout.setVerticalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aries.add(areaPrevisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAries.setText("Sorte:");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAries.setText("Amor:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAries.setText("Saúde:");

        tfAmorAries.setEditable(false);
        tfAmorAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorAries.setText("85%");

        tfTrabalhoAries.setEditable(false);
        tfTrabalhoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoAries.setText("90%");
        tfTrabalhoAries.addActionListener(this::tfTrabalhoAriesActionPerformed);

        tfSaudeAries.setEditable(false);
        tfSaudeAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeAries.setText("75%");
        tfSaudeAries.addActionListener(this::tfSaudeAriesActionPerformed);

        tfSorteAries.setEditable(false);
        tfSorteAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteAries.setText("88%");
        tfSorteAries.addActionListener(this::tfSorteAriesActionPerformed);

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        aries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAries.setText("Mensagem do dia");

        txtMensagemAries.setEditable(false);
        txtMensagemAries.setColumns(20);
        txtMensagemAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemAries.setRows(5);
        txMensagemAries.setViewportView(txtMensagemAries);

        btnCopiarMsgAries.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLayout = new javax.swing.GroupLayout(areaMensagem);
        areaMensagem.setLayout(areaMensagemLayout);
        areaMensagemLayout.setHorizontalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txMensagemAries))
                    .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaMensagemLayout.setVerticalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAries)
                .addGap(20, 20, 20))
        );

        aries.add(areaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1930, 1100));

        areaAbas.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setEditable(false);
        txFortesTouro.setColumns(20);
        txFortesTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Estabilidade, paciência, determinação,\n lealdade e praticidade.");
        jScrollPane3.setViewportView(txFortesTouro);

        txMelhorarTouro.setEditable(false);
        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Teimosia, resistência a mudanças e excesso\n de preocupação com segurança.");
        jScrollPane4.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicas1Layout = new javax.swing.GroupLayout(areaCaracteristicas1);
        areaCaracteristicas1.setLayout(areaCaracteristicas1Layout);
        areaCaracteristicas1Layout.setHorizontalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas1Layout.setVerticalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        touro.add(areaCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoTouro.setText("PERIODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setEditable(false);
        tfPeriodoTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoTouro.setText("20 de abril a 20 de maio");

        tfElementoTouro.setEditable(false);
        tfElementoTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoTouro.setText("Terra");

        tfPlanetaTouro.setEditable(false);
        tfPlanetaTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaTouro.setText("Vênus");
        tfPlanetaTouro.addActionListener(this::tfPlanetaTouroActionPerformed);

        tfCorTouro.setEditable(false);
        tfCorTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorTouro.setText("Verde");
        tfCorTouro.addActionListener(this::tfCorTouroActionPerformed);

        tfNumeroTouro.setEditable(false);
        tfNumeroTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroTouro.setText("6");

        javax.swing.GroupLayout areaInformacoes1Layout = new javax.swing.GroupLayout(areaInformacoes1);
        areaInformacoes1.setLayout(areaInformacoes1Layout);
        areaInformacoes1Layout.setHorizontalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaTouro)
                                .addComponent(tfNumeroTouro)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoTouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorTouro))))
                .addGap(10, 10, 10))
        );
        areaInformacoes1Layout.setVerticalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        touro.add(areaInformacoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoTouro.setText("Previsão do Dia:");

        txtPrevisaoTouro.setEditable(false);
        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoTouro.setRows(5);
        txPrevisaoTouro.setViewportView(txtPrevisaoTouro);

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao1Layout = new javax.swing.GroupLayout(areaPrevisao1);
        areaPrevisao1.setLayout(areaPrevisao1Layout);
        areaPrevisao1Layout.setHorizontalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(previsaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoTouro)
                .addContainerGap())
        );
        areaPrevisao1Layout.setVerticalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        touro.add(areaPrevisao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteTouro.setText("Sorte:");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorTouro.setText("Amor:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeTouro.setText("Saúde:");

        tfAmorAries1.setEditable(false);
        tfAmorAries1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorAries1.setText("82%");

        tfTrabalhoAries1.setEditable(false);
        tfTrabalhoAries1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoAries1.setText("86%");
        tfTrabalhoAries1.addActionListener(this::tfTrabalhoAries1ActionPerformed);

        tfSaudeAries1.setEditable(false);
        tfSaudeAries1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeAries1.setText("80%");

        tfSorteAries1.setEditable(false);
        tfSorteAries1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteAries1.setText("78%");

        javax.swing.GroupLayout areaEnergia1Layout = new javax.swing.GroupLayout(areaEnergia1);
        areaEnergia1.setLayout(areaEnergia1Layout);
        areaEnergia1Layout.setHorizontalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfAmorAries1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                                .addComponent(tfTrabalhoAries1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSaudeAries1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSorteAries1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergia1Layout.setVerticalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries1)
                .addGap(16, 16, 16)
                .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries1)
                .addGap(15, 15, 15)
                .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries1)
                .addGap(51, 51, 51))
        );

        touro.add(areaEnergia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do dia");

        txtMensagemTouro.setEditable(false);
        txtMensagemTouro.setColumns(20);
        txtMensagemTouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemTouro.setRows(5);
        txMensagemTouro.setViewportView(txtMensagemTouro);

        btnCopiarMsgTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem1Layout = new javax.swing.GroupLayout(areaMensagem1);
        areaMensagem1.setLayout(areaMensagem1Layout);
        areaMensagem1Layout.setHorizontalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMensagemTouro))
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaMensagem1Layout.setVerticalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro)
                .addGap(26, 26, 26))
        );

        touro.add(areaMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setEditable(false);
        txFortesGemeos.setColumns(20);
        txFortesGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicação, inteligência, curiosidade, criatividade e\n adaptabilidade.");
        jScrollPane5.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setEditable(false);
        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Distração, indecisão, ansiedade e dificuldade\n de concentração.");
        jScrollPane6.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicas2Layout = new javax.swing.GroupLayout(areaCaracteristicas2);
        areaCaracteristicas2.setLayout(areaCaracteristicas2Layout);
        areaCaracteristicas2Layout.setHorizontalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas2Layout.setVerticalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaCaracteristicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\gemeos.png")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoAries2.setEditable(false);
        tfPeriodoAries2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoAries2.setText("21 de maio a 20 de junho");

        tfElementoAries2.setEditable(false);
        tfElementoAries2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoAries2.setText("Ar");

        tfPlanetaAries2.setEditable(false);
        tfPlanetaAries2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaAries2.setText("Mercúrio");

        tfCorAries2.setEditable(false);
        tfCorAries2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorAries2.setText("Amarelo");

        tfNumeroAries2.setEditable(false);
        tfNumeroAries2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroAries2.setText("5");

        javax.swing.GroupLayout areaInformacoes2Layout = new javax.swing.GroupLayout(areaInformacoes2);
        areaInformacoes2.setLayout(areaInformacoes2Layout);
        areaInformacoes2Layout.setHorizontalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes2Layout.createSequentialGroup()
                            .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries2)
                                .addComponent(tfNumeroAries2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries2))))
                .addGap(10, 10, 10))
        );
        areaInformacoes2Layout.setVerticalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos)
                    .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        gemeos.add(areaInformacoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoGemeos.setText("Previsão do Dia:");

        txtPrevisaoGemeos.setEditable(false);
        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoGemeos.setRows(5);
        txPrevisaoAries2.setViewportView(txtPrevisaoGemeos);

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao2Layout = new javax.swing.GroupLayout(areaPrevisao2);
        areaPrevisao2.setLayout(areaPrevisao2Layout);
        areaPrevisao2Layout.setHorizontalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGroup(areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(previsaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(13, 13, 13))
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txPrevisaoAries2)
                        .addContainerGap())))
        );
        areaPrevisao2Layout.setVerticalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaPrevisao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteGemeos.setText("Sorte:");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorGemeos.setText("Amor:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeGemeos.setText("Saúde:");

        tfAmorGemeos.setEditable(false);
        tfAmorGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorGemeos.setText("88%");

        tfTrabalhoGemeos.setEditable(false);
        tfTrabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoGemeos.setText("84%");

        tfSaudeGemeos.setEditable(false);
        tfSaudeGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeGemeos.setText("72%");

        tfSorteGemeos.setEditable(false);
        tfSorteGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteGemeos.setText("91%");

        javax.swing.GroupLayout areaEnergia2Layout = new javax.swing.GroupLayout(areaEnergia2);
        areaEnergia2.setLayout(areaEnergia2Layout);
        areaEnergia2Layout.setHorizontalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergia2Layout.setVerticalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos)
                .addGap(16, 16, 16)
                .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeGemeos)
                .addGap(15, 15, 15)
                .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos)
                .addGap(51, 51, 51))
        );

        gemeos.add(areaEnergia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem do dia");

        txtMensagemGemeos.setEditable(false);
        txtMensagemGemeos.setColumns(20);
        txtMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemGemeos.setRows(5);
        txMensagemGemeos.setViewportView(txtMensagemGemeos);

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem2Layout = new javax.swing.GroupLayout(areaMensagem2);
        areaMensagem2.setLayout(areaMensagem2Layout);
        areaMensagem2Layout.setHorizontalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addGroup(areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(areaMensagem2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMensagemGemeos))
                    .addGroup(areaMensagem2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaMensagem2Layout.setVerticalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setEditable(false);
        txFortesCancer.setColumns(20);
        txFortesCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Sensibilidade, empatia, proteção, intuição e lealdade.");
        jScrollPane7.setViewportView(txFortesCancer);

        txMelhorarCancer.setEditable(false);
        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Oscilação emocional, insegurança, apego ao passado e \nexcesso de preocupação.");
        jScrollPane8.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicas3Layout = new javax.swing.GroupLayout(areaCaracteristicas3);
        areaCaracteristicas3.setLayout(areaCaracteristicas3Layout);
        areaCaracteristicas3Layout.setHorizontalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas3Layout.setVerticalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        cancer.add(areaCaracteristicas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\cancer.png")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCancer.setText("PERIODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setEditable(false);
        tfPeriodoCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoCancer.setText("21 de junho a 22 de julho");

        tfElementoCancer.setEditable(false);
        tfElementoCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setEditable(false);
        tfPlanetaCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setEditable(false);
        tfCorCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorCancer.setText("Branco");

        tfNumeroCancer.setEditable(false);
        tfNumeroCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroCancer.setText("2");

        javax.swing.GroupLayout areaInformacoes3Layout = new javax.swing.GroupLayout(areaInformacoes3);
        areaInformacoes3.setLayout(areaInformacoes3Layout);
        areaInformacoes3Layout.setHorizontalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCancer)
                                .addComponent(tfNumeroCancer)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCancer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCancer))))
                .addGap(10, 10, 10))
        );
        areaInformacoes3Layout.setVerticalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        cancer.add(areaInformacoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCancer.setText("Previsão do Dia:");

        txtPrevisaoCancer.setEditable(false);
        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoCancer.setRows(5);
        txPrevisaoCancer.setViewportView(txtPrevisaoCancer);

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao3Layout = new javax.swing.GroupLayout(areaPrevisao3);
        areaPrevisao3.setLayout(areaPrevisao3Layout);
        areaPrevisao3Layout.setHorizontalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(previsaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoCancer)
                .addContainerGap())
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaPrevisao3Layout.setVerticalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        cancer.add(areaPrevisao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCancer.setText("Sorte:");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCancer.setText("Amor:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCancer.setText("Saúde:");

        tfAmorCancer.setEditable(false);
        tfAmorCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorCancer.setText("90%");

        tfTrabalhoCancer.setEditable(false);
        tfTrabalhoCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoCancer.setText("76%");

        tfSaudeCancer.setEditable(false);
        tfSaudeCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeCancer.setText("78%");

        tfSorteCancer.setEditable(false);
        tfSorteCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteCancer.setText("83%");

        javax.swing.GroupLayout areaEnergia3Layout = new javax.swing.GroupLayout(areaEnergia3);
        areaEnergia3.setLayout(areaEnergia3Layout);
        areaEnergia3Layout.setHorizontalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergia3Layout.setVerticalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCancer)
                .addGap(15, 15, 15)
                .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCancer)
                .addGap(51, 51, 51))
        );

        cancer.add(areaEnergia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do dia");

        txtMensagemCancer.setEditable(false);
        txtMensagemCancer.setColumns(20);
        txtMensagemCancer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemCancer.setRows(5);
        txMensagemCancer.setViewportView(txtMensagemCancer);

        btnCopiarMsgCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem3Layout = new javax.swing.GroupLayout(areaMensagem3);
        areaMensagem3.setLayout(areaMensagem3Layout);
        areaMensagem3Layout.setHorizontalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMensagemCancer)
                    .addGroup(areaMensagem3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaMensagem3Layout.setVerticalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        cancer.add(areaMensagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setEditable(false);
        txFortesLeao.setColumns(20);
        txFortesLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Liderança, criatividade, confiança, generosidade\n e entusiasmo.");
        jScrollPane9.setViewportView(txFortesLeao);

        txMelhorarLeao.setEditable(false);
        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Orgulho, necessidade de reconhecimento,\n teimosia e impulsividade.");
        jScrollPane10.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicas4Layout = new javax.swing.GroupLayout(areaCaracteristicas4);
        areaCaracteristicas4.setLayout(areaCaracteristicas4Layout);
        areaCaracteristicas4Layout.setHorizontalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas4Layout.setVerticalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        leao.add(areaCaracteristicas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leao.png")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLeao.setText("PERIODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setEditable(false);
        tfPeriodoLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoLeao.setText("23 de julho a 22 de agosto");

        tfElementoLeao.setEditable(false);
        tfElementoLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoLeao.setText("Fogo");

        tfPlanetaLeao.setEditable(false);
        tfPlanetaLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setEditable(false);
        tfCorLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorLeao.setText("Dourado");

        tfNumeroLeao.setEditable(false);
        tfNumeroLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroLeao.setText("1");

        javax.swing.GroupLayout areaInformacoes4Layout = new javax.swing.GroupLayout(areaInformacoes4);
        areaInformacoes4.setLayout(areaInformacoes4Layout);
        areaInformacoes4Layout.setHorizontalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLeao)
                                .addComponent(tfNumeroLeao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLeao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLeao))))
                .addGap(10, 10, 10))
        );
        areaInformacoes4Layout.setVerticalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        leao.add(areaInformacoes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLeao.setText("Previsão do Dia:");

        txtPrevisaoLeao.setEditable(false);
        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoLeao.setRows(5);
        txPrevisaoAries4.setViewportView(txtPrevisaoLeao);

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao4Layout = new javax.swing.GroupLayout(areaPrevisao4);
        areaPrevisao4.setLayout(areaPrevisao4Layout);
        areaPrevisao4Layout.setHorizontalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(previsaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoAries4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaPrevisao4Layout.setVerticalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        leao.add(areaPrevisao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLeao.setText("Sorte:");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLeao.setText("Amor:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLeao.setText("Saúde:");

        tfAmorLeao.setEditable(false);
        tfAmorLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorLeao.setText("92%");

        tfTrabalhoLeao.setEditable(false);
        tfTrabalhoLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoLeao.setText("89%");

        tfSaudeLeao.setEditable(false);
        tfSaudeLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeLeao.setText("81%");

        tfSorteLeao.setEditable(false);
        tfSorteLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteLeao.setText("87%");

        javax.swing.GroupLayout areaEnergia4Layout = new javax.swing.GroupLayout(areaEnergia4);
        areaEnergia4.setLayout(areaEnergia4Layout);
        areaEnergia4Layout.setHorizontalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addGroup(areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergia4Layout.setVerticalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLeao)
                .addGap(15, 15, 15)
                .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLeao)
                .addGap(51, 51, 51))
        );

        leao.add(areaEnergia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do dia");

        txtMensagemLeao.setEditable(false);
        txtMensagemLeao.setColumns(20);
        txtMensagemLeao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemLeao.setRows(5);
        txMensagemAries4.setViewportView(txtMensagemLeao);

        btnCopiarMsgLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMensagemAries4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setEditable(false);
        txFortesVirgem.setColumns(20);
        txFortesVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Organização, inteligência, atenção aos detalhes,\n responsabilidade e dedicação.");
        jScrollPane11.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setEditable(false);
        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("Perfeccionismo, excesso de cobrança, preocupação \ne dificuldade em relaxar.");
        jScrollPane12.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicas5Layout = new javax.swing.GroupLayout(areaCaracteristicas5);
        areaCaracteristicas5.setLayout(areaCaracteristicas5Layout);
        areaCaracteristicas5Layout.setHorizontalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas5Layout.setVerticalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        virgem.add(areaCaracteristicas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgem.png")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoVirgem.setText("PERIODO:");

        elementoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoVirgem.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setEditable(false);
        tfPeriodoVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoVirgem.setText("23 de agosto a 22 de setembro");

        tfElementoVirgem.setEditable(false);
        tfElementoVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoVirgem.setText("Terra");

        tfPlanetaVirgem.setEditable(false);
        tfPlanetaVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setEditable(false);
        tfCorVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorVirgem.setText("Verde-oliva");

        tfNumeroVirgem.setEditable(false);
        tfNumeroVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroVirgem.setText("5");

        javax.swing.GroupLayout areaInformacoes5Layout = new javax.swing.GroupLayout(areaInformacoes5);
        areaInformacoes5.setLayout(areaInformacoes5Layout);
        areaInformacoes5Layout.setHorizontalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes5Layout.createSequentialGroup()
                        .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                            .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                    .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(planetaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numeroVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfNumeroVirgem)
                                        .addComponent(tfPlanetaVirgem)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                                    .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                    .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCorVirgem))))
                        .addGap(10, 10, 10))
                    .addGroup(areaInformacoes5Layout.createSequentialGroup()
                        .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaInformacoes5Layout.setVerticalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        virgem.add(areaInformacoes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia:");

        txtPrevisaoVirgem.setEditable(false);
        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoVirgem.setRows(5);
        txPrevisaoAries5.setViewportView(txtPrevisaoVirgem);

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao5Layout = new javax.swing.GroupLayout(areaPrevisao5);
        areaPrevisao5.setLayout(areaPrevisao5Layout);
        areaPrevisao5Layout.setHorizontalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisao5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisao5Layout.createSequentialGroup()
                        .addGroup(areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txPrevisaoAries5))
                        .addContainerGap())))
        );
        areaPrevisao5Layout.setVerticalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        virgem.add(areaPrevisao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteVirgem.setText("Sorte:");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorVirgem.setText("Amor:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeVirgem.setText("Saúde:");

        tfAmorVirgem.setEditable(false);
        tfAmorVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorVirgem.setText("84%");

        tfTrabalhoVirgem.setEditable(false);
        tfTrabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoVirgem.setText("94%");

        tfSaudeVirgem.setEditable(false);
        tfSaudeVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeVirgem.setText("79%");

        tfSorteVirgem.setEditable(false);
        tfSorteVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteVirgem.setText("86%");

        javax.swing.GroupLayout areaEnergia5Layout = new javax.swing.GroupLayout(areaEnergia5);
        areaEnergia5.setLayout(areaEnergia5Layout);
        areaEnergia5Layout.setHorizontalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addGroup(areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergia5Layout.setVerticalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem)
                .addGap(16, 16, 16)
                .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeVirgem)
                .addGap(15, 15, 15)
                .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteVirgem)
                .addGap(51, 51, 51))
        );

        virgem.add(areaEnergia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do dia");

        txtMensagemVirgem.setEditable(false);
        txtMensagemVirgem.setColumns(20);
        txtMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMensagemVirgem.setRows(5);
        txMensagemVirgem.setViewportView(txtMensagemVirgem);

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem5Layout = new javax.swing.GroupLayout(areaMensagem5);
        areaMensagem5.setLayout(areaMensagem5Layout);
        areaMensagem5Layout.setHorizontalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addGroup(areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMensagemVirgem))
                    .addGroup(areaMensagem5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(areaMensagem5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaMensagem5Layout.setVerticalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        virgem.add(areaMensagem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setEditable(false);
        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Diplomacia, simpatia, equilíbrio, justiça e capacidade de negociação.");
        jScrollPane13.setViewportView(txFortesLibra);

        txMelhorarLibra.setEditable(false);
        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("Indecisão, necessidade de aprovação, dificuldade em dizer não e hesitação.");
        jScrollPane14.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14)
                .addGap(27, 27, 27))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\libra.png")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLibra.setText("Libra");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLibra.setText("PERIODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setEditable(false);
        tfPeriodoLibra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPeriodoLibra.setText("23 de setembro a 22 de outubro");

        tfElementoLibra.setEditable(false);
        tfElementoLibra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoLibra.setText("Ar");

        tfPlanetaLibra.setEditable(false);
        tfPlanetaLibra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaLibra.setText("Vênus");

        tfCorLibra.setEditable(false);
        tfCorLibra.setText("Rosa");

        tfNumeroLibra.setEditable(false);
        tfNumeroLibra.setText("7");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(planetaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(numeroLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfNumeroLibra)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesLibraLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                            .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCorLibra)))
                                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLibra.setText("Previsão do Dia:");

        txtPrevisaoLibra.setEditable(false);
        txtPrevisaoLibra.setColumns(20);
        txtPrevisaoLibra.setRows(5);
        txPrevisaoAries6.setViewportView(txtPrevisaoLibra);

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries6)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries6, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLibra.setText("Sorte:");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLibra.setText("Amor:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLibra.setText("Saúde:");

        tfAmorLibra.setEditable(false);
        tfAmorLibra.setText("91%");

        tfTrabalhoLibra.setEditable(false);
        tfTrabalhoLibra.setText("82%");

        tfSaudeLibra.setEditable(false);
        tfSaudeLibra.setText("77%");

        tfSorteLibra.setEditable(false);
        tfSorteLibra.setText("89%");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLibra)
                    .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLibra)
                .addGap(15, 15, 15)
                .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLibra)
                .addGap(51, 51, 51))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 570, 460));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do dia");

        txtMensagemLibra.setEditable(false);
        txtMensagemLibra.setColumns(20);
        txtMensagemLibra.setRows(5);
        txMensagemAries6.setViewportView(txtMensagemLibra);

        btnCopiarMsgLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries6, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibra)
                .addGap(20, 20, 20))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 570, 420));

        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Libra", libra);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setEditable(false);
        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Determinação, intensidade, coragem, intuição e capacidade de transformação.");
        jScrollPane15.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setEditable(false);
        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText("Ciúme, desconfiança, intensidade excessiva e dificuldade em perdoar.");
        jScrollPane16.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane16))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpiao.png")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setEditable(false);
        tfPeriodoEscorpiao.setText("23 de outubro a 21 de novembro");

        tfElementoEscorpiao.setEditable(false);
        tfElementoEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setEditable(false);
        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setEditable(false);
        tfCorEscorpiao.setText("Vinho");

        tfNumeroEscorpiao.setEditable(false);
        tfNumeroEscorpiao.setText("8");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaEscorpiao)
                                .addComponent(tfNumeroEscorpiao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoEscorpiao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorEscorpiao))))
                .addGap(10, 10, 10))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia:");

        txtPrevisaoEscorpiao.setEditable(false);
        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setRows(5);
        txPrevisaoAries7.setViewportView(txtPrevisaoEscorpiao);

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries7)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries7, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorEscorpiao.setText("Amor:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        tfAmorEscorpiao.setText("87%");

        tfTrabalhoEscorpiao.setText("91%");

        tfSaudeEscorpiao.setText("74%");

        tfSorteEscorpiao.setText("85%");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeEscorpiao)
                .addGap(15, 15, 15)
                .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteEscorpiao)
                .addGap(51, 51, 51))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do dia");

        txtMensagemEscorpiao.setEditable(false);
        txtMensagemEscorpiao.setColumns(20);
        txtMensagemEscorpiao.setRows(5);
        txMensagemAries7.setViewportView(txtMensagemEscorpiao);

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries7, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries7, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao)
                .addGap(20, 20, 20))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText("Otimismo, sinceridade, entusiasmo, independência e espírito aventureiro.");
        jScrollPane17.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("Impaciência, exageros, falta de planejamento e sinceridade excessiva.");
        jScrollPane18.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane17)
                    .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane18))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\sagitario.png")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloSagitario.setText("Sagitário");

        periodoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoSagitario.setText("PERIODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setText("22 de novembro a 21 de dezembro");

        tfElementoAries8.setText("Fogo");

        tfPlanetaSagitario.setText("Júpiter");

        tfCorSagitario.setText("Roxo");

        tfNumeroSagitario.setText("3");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaSagitario)
                                .addComponent(tfNumeroSagitario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorSagitario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoSagitario)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoAries8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoSagitario.setText("Previsão do Dia:");

        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setRows(5);
        txPrevisaoAries8.setViewportView(txtPrevisaoSagitario);

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries8)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteSagitario.setText("Sorte:");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorSagitario.setText("Amor:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeSagitario.setText("Saúde:");

        tfAmorSagitario.setText("89%");

        tfTrabalhoSagitario.setText("85%");

        tfSaudeSagitario.setText("83%");

        tfSorteSagitario.setText("93%");

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteSagitario)
                    .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeSagitario)
                .addGap(15, 15, 15)
                .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteSagitario)
                .addGap(51, 51, 51))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do dia");

        txtMensagemSagitario.setColumns(20);
        txtMensagemSagitario.setRows(5);
        txMensagemAries8.setViewportView(txtMensagemSagitario);

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries8, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario)
                .addGap(20, 20, 20))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Disciplina, responsabilidade, determinação, organização e ambição.");
        jScrollPane19.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText("Rigidez, pessimismo, excesso de trabalho e dificuldade em demonstrar sentimentos.");
        jScrollPane20.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane19)
                    .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane20))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\capricornio.png")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCapricornio.setText("Capricórnio");

        periodoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCapricornio.setText("PERIODO:");

        elementoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCapricornio.setText("ELEMENTO:");

        planetaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCapricornio.setText("PLANETA REGENTE:");

        corCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCapricornio.setText("COR:");

        numeroCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCapricornio.setText("NÚMERO DA SORTE:");

        tfPeriodoCapricornio.setText("22 de dezembro a 19 de janeiro");

        tfElementoCapricornio.setText("Terra");

        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setText("Marrom");

        tfNumeroCapricornio.setText("4");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCapricornio)
                                .addComponent(tfNumeroCapricornio)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(elementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCapricornio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCapricornio))))
                .addGap(10, 10, 10))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCapricornio)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCapricornio)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCapricornio.setText("Previsão do Dia:");

        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setRows(5);
        txPrevisaoAries9.setViewportView(txtPrevisaoCapricornio);

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoAries9)
                .addContainerGap())
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia do Dia");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCapricornio.setText("Amor:");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        tfAmorCapricornio.setText("79%");

        tfTrabalhoCapricornio.setText("96%");

        tfSaudeCapricornio.setText("82%");

        tfSorteCapricornio.setText("80%");

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addComponent(amorCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addComponent(trabalhoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addComponent(saudeCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addComponent(sorteCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCapricornio)
                .addGap(15, 15, 15)
                .addComponent(sorteCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCapricornio)
                .addGap(51, 51, 51))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem do dia");

        txtMensagemCapricornio.setColumns(20);
        txtMensagemCapricornio.setRows(5);
        txMensagemAries9.setViewportView(txtMensagemCapricornio);

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txMensagemAries9))
                .addContainerGap())
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio)
                .addGap(20, 20, 20))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Originalidade, criatividade, independência, inteligência e inovação.");
        jScrollPane21.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("Distanciamento emocional, teimosia, imprevisibilidade e dificuldade com regras.");
        jScrollPane22.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane21)
                    .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane22))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22)
                .addGap(27, 27, 27))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aquario.png")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAquario.setText("PERIODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setText("20 de janeiro a 18 de fevereiro");

        tfElementoAquario.setText("Ar");

        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setText("Azul");

        tfNumeroAquario.setText("11");
        tfNumeroAquario.addActionListener(this::tfNumeroAquarioActionPerformed);

        javax.swing.GroupLayout areaInformacoes10Layout = new javax.swing.GroupLayout(areaInformacoes10);
        areaInformacoes10.setLayout(areaInformacoes10Layout);
        areaInformacoes10Layout.setHorizontalGroup(
            areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes10Layout.createSequentialGroup()
                            .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAquario)
                                .addComponent(tfNumeroAquario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes10Layout.createSequentialGroup()
                            .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAquario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes10Layout.createSequentialGroup()
                            .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes10Layout.createSequentialGroup()
                            .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAquario))))
                .addGap(10, 10, 10))
        );
        areaInformacoes10Layout.setVerticalGroup(
            areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aquario.add(areaInformacoes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAquario.setText("Previsão do Dia:");

        txtPrevisaoAquario.setColumns(20);
        txtPrevisaoAquario.setRows(5);
        txPrevisaoAries10.setViewportView(txtPrevisaoAquario);

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(previsaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoAries10)
                .addContainerGap())
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAquario.setText("Sorte:");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAquario.setText("Amor:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAquario.setText("Saúde:");

        tfAmorAquario.setText("86%");

        tfTrabalhoAquario.setText("88%");

        tfSaudeAquario.setText("76%");

        tfSorteAquario.setText("90%");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAquario)
                .addGap(15, 15, 15)
                .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAquario)
                .addGap(51, 51, 51))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do dia");

        txtMensagemAquario.setColumns(20);
        txtMensagemAquario.setRows(5);
        txMensagemAries10.setViewportView(txtMensagemAquario);

        btnCopiarMsgAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMensagemAries10)
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaPeixes.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesPeixes.setText("Pontos Fortes:");

        pMelhorarPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("Empatia, criatividade, sensibilidade, intuição e imaginação.");
        jScrollPane23.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText("Distração, excesso de sensibilidade, indecisão e tendência a idealizar situações.");
        jScrollPane24.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane23)
                    .addComponent(pMelhorarPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24)
                .addGap(27, 27, 27))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\peixes.png")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloPeixes.setText("Peixes");

        periodoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoPeixes.setText("PERIODO:");

        elementoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoPeixes.setText("ELEMENTO:");

        planetaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corPeixes.setText("COR:");

        numeroPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroPeixes.setText("NÚMERO DA SORTE:");

        tfPeriodoPeixes.setText("19 de fevereiro a 20 de março");

        tfElementoPeixes.setText("Água");

        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setText("Lilás");

        tfNumeroPeixes.setText("7");

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaPeixes)
                                .addComponent(tfNumeroPeixes)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(elementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoPeixes))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(corPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorPeixes))))
                .addGap(10, 10, 10))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoPeixes)
                    .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoPeixes)
                    .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixes)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia:");

        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setRows(5);
        txPrevisaoPeixes.setViewportView(txtPrevisaoPeixes);

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoPeixesLayout = new javax.swing.GroupLayout(areaPrevisaoPeixes);
        areaPrevisaoPeixes.setLayout(areaPrevisaoPeixesLayout);
        areaPrevisaoPeixesLayout.setHorizontalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(previsaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPrevisaoPeixes)
                .addContainerGap())
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaPrevisaoPeixesLayout.setVerticalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        peixes.add(areaPrevisaoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sortePeixes.setText("Sorte:");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorPeixes.setText("Amor:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudePeixes.setText("Saúde:");

        tfAmorPeixes.setText("93%");

        tfTrabalhoPeixes.setText("78%");

        tfSaudePeixes.setText("80%");

        tfSortePeixes.setText("84%");

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(379, 379, 379))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(439, 439, 439))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes)
                .addGap(16, 16, 16)
                .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudePeixes)
                .addGap(15, 15, 15)
                .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSortePeixes)
                .addGap(51, 51, 51))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 540, 460));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemPeixes.setText("Mensagem do dia");

        txtMensagemPeixes.setColumns(20);
        txtMensagemPeixes.setRows(5);
        txMensagemPeixes.setViewportView(txtMensagemPeixes);

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMensagemPeixes))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\RogerioSilva\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\fundodossignos.png")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPeriodoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAriesActionPerformed

    private void tfTrabalhoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoAriesActionPerformed

    private void tfSaudeAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeAriesActionPerformed

    private void tfSorteAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteAriesActionPerformed

    private void tfPlanetaTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouroActionPerformed

    private void tfCorTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorTouroActionPerformed

    private void tfTrabalhoAries1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoAries1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoAries1ActionPerformed

    private void tfNumeroAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroAquarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCaracteristicas;
    private javax.swing.JPanel areaCaracteristicas1;
    private javax.swing.JPanel areaCaracteristicas2;
    private javax.swing.JPanel areaCaracteristicas3;
    private javax.swing.JPanel areaCaracteristicas4;
    private javax.swing.JPanel areaCaracteristicas5;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergia1;
    private javax.swing.JPanel areaEnergia2;
    private javax.swing.JPanel areaEnergia3;
    private javax.swing.JPanel areaEnergia4;
    private javax.swing.JPanel areaEnergia5;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaInformacoes1;
    private javax.swing.JPanel areaInformacoes10;
    private javax.swing.JPanel areaInformacoes2;
    private javax.swing.JPanel areaInformacoes3;
    private javax.swing.JPanel areaInformacoes4;
    private javax.swing.JPanel areaInformacoes5;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaMensagem;
    private javax.swing.JPanel areaMensagem1;
    private javax.swing.JPanel areaMensagem2;
    private javax.swing.JPanel areaMensagem3;
    private javax.swing.JPanel areaMensagem5;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaPrevisao;
    private javax.swing.JPanel areaPrevisao1;
    private javax.swing.JPanel areaPrevisao2;
    private javax.swing.JPanel areaPrevisao3;
    private javax.swing.JPanel areaPrevisao4;
    private javax.swing.JPanel areaPrevisao5;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoPeixes;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorAries1;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorAries2;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoAries2;
    private javax.swing.JTextField tfElementoAries8;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroAries2;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoAries2;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaAries2;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeAries1;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteAries1;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoAries1;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCaracteristicaAquario;
    private javax.swing.JLabel tituloCaracteristicaAries;
    private javax.swing.JLabel tituloCaracteristicaCancer;
    private javax.swing.JLabel tituloCaracteristicaCapricornio;
    private javax.swing.JLabel tituloCaracteristicaEscorpiao;
    private javax.swing.JLabel tituloCaracteristicaGemeos;
    private javax.swing.JLabel tituloCaracteristicaLeao;
    private javax.swing.JLabel tituloCaracteristicaLibra;
    private javax.swing.JLabel tituloCaracteristicaPeixes;
    private javax.swing.JLabel tituloCaracteristicaSagitario;
    private javax.swing.JLabel tituloCaracteristicaTouro;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JScrollPane txMensagemAries;
    private javax.swing.JScrollPane txMensagemAries10;
    private javax.swing.JScrollPane txMensagemAries4;
    private javax.swing.JScrollPane txMensagemAries6;
    private javax.swing.JScrollPane txMensagemAries7;
    private javax.swing.JScrollPane txMensagemAries8;
    private javax.swing.JScrollPane txMensagemAries9;
    private javax.swing.JScrollPane txMensagemCancer;
    private javax.swing.JScrollPane txMensagemGemeos;
    private javax.swing.JScrollPane txMensagemPeixes;
    private javax.swing.JScrollPane txMensagemTouro;
    private javax.swing.JScrollPane txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisaoAries;
    private javax.swing.JScrollPane txPrevisaoAries10;
    private javax.swing.JScrollPane txPrevisaoAries2;
    private javax.swing.JScrollPane txPrevisaoAries4;
    private javax.swing.JScrollPane txPrevisaoAries5;
    private javax.swing.JScrollPane txPrevisaoAries6;
    private javax.swing.JScrollPane txPrevisaoAries7;
    private javax.swing.JScrollPane txPrevisaoAries8;
    private javax.swing.JScrollPane txPrevisaoAries9;
    private javax.swing.JScrollPane txPrevisaoCancer;
    private javax.swing.JScrollPane txPrevisaoPeixes;
    private javax.swing.JScrollPane txPrevisaoTouro;
    private javax.swing.JTextArea txtMensagemAquario;
    private javax.swing.JTextArea txtMensagemAries;
    private javax.swing.JTextArea txtMensagemCancer;
    private javax.swing.JTextArea txtMensagemCapricornio;
    private javax.swing.JTextArea txtMensagemEscorpiao;
    private javax.swing.JTextArea txtMensagemGemeos;
    private javax.swing.JTextArea txtMensagemLeao;
    private javax.swing.JTextArea txtMensagemLibra;
    private javax.swing.JTextArea txtMensagemPeixes;
    private javax.swing.JTextArea txtMensagemSagitario;
    private javax.swing.JTextArea txtMensagemTouro;
    private javax.swing.JTextArea txtMensagemVirgem;
    private javax.swing.JTextArea txtPrevisaoAquario;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibra;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
