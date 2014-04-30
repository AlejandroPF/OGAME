/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

/**
 * Producción|Investigaciones|Flota|+agregar planeta/luna|
 *
 * @author ASUS
 */
public class Menu implements ActiveEvent, ActionListener {

    public Menu() {
        JTabbedPane pesta = new JTabbedPane();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel fondo = new JLabel();
        ImageIcon icon = new ImageIcon(ImageTest.class.getResource("fondo.jpg"));
        fondo.setIcon(icon);
        fondo.setVisible(true);
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setLocation(50, 50);
        frame.setTitle("Ogame");

        Container pane = frame.getContentPane();
        pane.add(pesta);

        pesta.setOpaque(false);

//Primera pesataña
        //....//||||||\\
        //....||||....||
        //....||||||||//
        //....||||
        //....||||
        JPanel produccion = new JPanel(null);

        produccion.setSize(700, 700);
        produccion.add(fondo);
        int metal = 0;
        int cristal = 0;
        int deu = 0;
        int pl = 0;
        JLabel lmetal = new JLabel("Produccíon diaria de metal: " + metal + " +(" + (metal * (Recursos.nivelPlasmaMetal(pl))) + ")plasma");
        produccion.add(lmetal);
        lmetal.setBounds(10, 100, 400, 25);
        JLabel lcristal = new JLabel("Produccíon diaria de cristal: " + cristal + " +(" + (cristal * Recursos.nivelPlasmaCristal(pl)) + ")plasma");
        produccion.add(lcristal);
        lcristal.setBounds(10, 130, 400, 25);
        JLabel ldeute = new JLabel("Produccíon diaria de deuterio: " + deu);
        produccion.add(ldeute);
        ldeute.setBounds(10, 160, 200, 25);
        JButton bmostrar = new JButton("Mostrar pastel producción");
        produccion.add(bmostrar);
        bmostrar.setBounds(10, 185, 200, 25);
        bmostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                estadisticas.produccion();

            }
        });



        pesta.addTab("Producción", produccion);

        //PESTAÑA COMANDANTE
        JPanel coman = new JPanel(null);

        pesta.addTab("Comandante", coman);

//Primera pesataña
        //....||||..|||\....|||..\\......//..//|=====..///====...=========.
        //....||||..|||.\\..|||...\\....//...|||.......|||..........|||....
        //....||||..|||..\\.|||....\\..//....|||=====..\\\==\\\.....|||....
        //....||||..|||...\\|||.....\\//.....|||............|||.....|||....
        //....||||..|||....\|||......\/......\\|=====..=====///.....|||....
        JPanel investigacion = new JPanel(null);
        //LABELS
        //INESTIGACION BASICA
        JLabel libas = new JLabel("Investigación básica:");
        libas.setBounds(10, 5, 150, 25);
        investigacion.add(libas);
        Font fontibas = libas.getFont();
        Map attributesib = fontibas.getAttributes();
        attributesib.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        libas.setFont(fontibas.deriveFont(attributesib));

        JLabel ltecene = new JLabel("Tecnología de Energía");
        investigacion.add(ltecene);
        ltecene.setBounds(10, 30, 150, 25);
        JLabel ltecl = new JLabel("Tecnología Laser");
        investigacion.add(ltecl);
        ltecl.setBounds(10, 55, 150, 25);
        JLabel ltecion = new JLabel("Tecnología Iónica");
        investigacion.add(ltecion);
        ltecion.setBounds(10, 80, 150, 25);
        JLabel ltechip = new JLabel("Tecnología Hiperespacio");
        investigacion.add(ltechip);
        ltechip.setBounds(10, 105, 150, 25);
        JLabel ltecpl = new JLabel("Tecnología Plasma");
        investigacion.add(ltecpl);
        ltecpl.setBounds(10, 130, 150, 25);
        //Investigación de propulsión
        JLabel lipro = new JLabel("Investigación de Propulsión:");
        investigacion.add(lipro);
        lipro.setBounds(10, 155, 200, 25);
        lipro.setFont(fontibas.deriveFont(attributesib));

        JLabel ltmc = new JLabel("Motor Combustión");
        investigacion.add(ltmc);
        ltmc.setBounds(10, 180, 150, 25);
        JLabel ltmi = new JLabel("Motor Impulso");
        investigacion.add(ltmi);
        ltmi.setBounds(10, 205, 150, 25);
        JLabel ltphi = new JLabel("Prop. Hiperespacial");
        investigacion.add(ltphi);
        ltphi.setBounds(10, 230, 150, 25);


        //investigaciones avanzadas
        JLabel liava = new JLabel("Investigaciones avanzadas");
        investigacion.add(liava);
        liava.setBounds(10, 255, 200, 25);
        liava.setFont(fontibas.deriveFont(attributesib));
        JLabel ltesp = new JLabel("Tecnología espionaje:");
        investigacion.add(ltesp);
        ltesp.setBounds(10, 280, 150, 25);
        JLabel ltgv = new JLabel("Tecnología gravitón:");
        investigacion.add(ltgv);
        ltgv.setBounds(10, 305, 150, 25);
        JLabel ltcom = new JLabel("Tecnología computación:");
        investigacion.add(ltcom);
        ltcom.setBounds(10, 330, 150, 25);
        JLabel ltast = new JLabel("Astrofísica:");
        investigacion.add(ltast);
        ltast.setBounds(10, 355, 150, 25);
        JLabel ltrii = new JLabel("red inv. intergaláctica:");
        investigacion.add(ltrii);
        ltrii.setBounds(10, 380, 185, 25);

        //investigaciones de combate
        JLabel licomb = new JLabel("Investigación de combate:");
        investigacion.add(licomb);
        licomb.setBounds(10, 405, 150, 25);
        licomb.setFont(fontibas.deriveFont(attributesib));
        JLabel ltm = new JLabel("Tecnología militar:");
        investigacion.add(ltm);
        ltm.setBounds(10, 430, 150, 25);
        JLabel ltdef = new JLabel("Tecnología de defensa:");
        investigacion.add(ltdef);
        ltdef.setBounds(10, 455, 150, 25);
        JLabel ltbli = new JLabel("Tecnología de blindaje:");
        investigacion.add(ltbli);
        ltbli.setBounds(10, 480, 150, 25);
        //NIVELES BASICOS
        JTextField tecene = new JTextField(null);
        investigacion.add(tecene);
        tecene.setBounds(155, 30, 20, 25);
        JTextField tecl = new JTextField(null);
        investigacion.add(tecl);
        tecl.setBounds(155, 55, 20, 25);
        JTextField tecion = new JTextField(null);
        investigacion.add(tecion);
        tecion.setBounds(155, 80, 20, 25);
        JTextField techip = new JTextField(null);
        investigacion.add(techip);
        techip.setBounds(155, 105, 20, 25);
        JTextField tecpl = new JTextField(null);
        investigacion.add(tecpl);
        tecpl.setBounds(155, 130, 20, 25);
        JTextField tmcom = new JTextField(null);
        investigacion.add(tmcom);
        tmcom.setBounds(155, 180, 20, 25);
        JTextField tmimp = new JTextField(null);
        investigacion.add(tmimp);
        tmimp.setBounds(155, 205, 20, 25);
        JTextField tphip = new JTextField(null);
        investigacion.add(tphip);
        tphip.setBounds(155, 230, 20, 25);
        JTextField tesp = new JTextField(null);
        investigacion.add(tesp);
        tesp.setBounds(155, 280, 20, 25);
        JTextField tgr = new JTextField(null);
        investigacion.add(tgr);
        tgr.setBounds(155, 305, 20, 25);
        JTextField tcom = new JTextField(null);
        investigacion.add(tcom);
        tcom.setBounds(155, 330, 20, 25);
        JTextField tast = new JTextField(null);
        investigacion.add(tast);
        tast.setBounds(155, 355, 20, 25);
        JTextField trii = new JTextField(null);
        investigacion.add(trii);
        trii.setBounds(155, 380, 20, 25);
        JTextField tmil = new JTextField(null);
        investigacion.add(tmil);
        tmil.setBounds(155, 430, 20, 25);
        JTextField tdef = new JTextField(null);
        investigacion.add(tdef);
        tdef.setBounds(155, 455, 20, 25);
        JTextField tbli = new JTextField(null);
        investigacion.add(tbli);
        tbli.setBounds(155, 480, 20, 25);


        pesta.addTab("Investigación", investigacion);

//Tercera pesataña
        //....//||||||..|||......//=====\\...=======..//|====|\\
        //....||||......|||......|||....|||....|||....|||....|||
        //....||||||||..|||......|||....|||....|||....|||....|||
        //....||||......|||......|||....|||....|||....|||====|||
        //....\\||......\\|====..\\=====//.....|||....|||....|||
        JPanel flotas = new JPanel(null);

        JLabel lfnsb = new JLabel("Naves de batalla:");
        flotas.add(lfnsb);
        lfnsb.setBounds(10, 5, 120, 25);
        Font fontfl = lfnsb.getFont();
        Map attributesfl = fontfl.getAttributes();
        attributesfl.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lfnsb.setFont(fontfl.deriveFont(attributesfl));
        JLabel lfcl = new JLabel("Cazador Ligero:");
        flotas.add(lfcl);
        lfcl.setBounds(10, 30, 120, 25);
        JLabel lfcp = new JLabel("Cazador Pesado:");
        flotas.add(lfcp);
        lfcp.setBounds(10, 55, 120, 25);
        JLabel lfcr = new JLabel("Crucero:");
        flotas.add(lfcr);
        lfcr.setBounds(10, 80, 120, 25);
        JLabel lfnb = new JLabel("Nave de batalla:");
        flotas.add(lfnb);
        lfnb.setBounds(10, 105, 120, 25);
        JLabel lfaco = new JLabel("Acorazado:");
        flotas.add(lfaco);
        lfaco.setBounds(10, 130, 120, 25);
        JLabel lfbom = new JLabel("Bombardero:");
        flotas.add(lfbom);
        lfbom.setBounds(10, 155, 120, 25);
        JLabel lfdesc = new JLabel("Desctructor:");
        flotas.add(lfdesc);
        lfdesc.setBounds(10, 180, 120, 25);
        JLabel lfedlm = new JLabel("Estrella de la MUERTE:");
        flotas.add(lfedlm);
        lfedlm.setBounds(10, 205, 150, 25);
        JLabel lfncvl = new JLabel("Naves civiles:");
        flotas.add(lfncvl);
        lfncvl.setBounds(10, 230, 150, 25);
        lfncvl.setFont(fontfl.deriveFont(attributesfl));
        JLabel lfnpc = new JLabel("Nave p. carga:");
        flotas.add(lfnpc);
        lfnpc.setBounds(10, 255, 150, 25);
        JLabel lfngc = new JLabel("Nave g. carga:");
        flotas.add(lfngc);
        lfngc.setBounds(10, 280, 150, 25);
        JLabel lfcolo = new JLabel("Colonizador:");
        flotas.add(lfcolo);
        lfcolo.setBounds(10, 305, 150, 25);
        JLabel lfreci = new JLabel("Reciclador:");
        flotas.add(lfreci);
        lfreci.setBounds(10, 330, 150, 25);
        JLabel lfsonda = new JLabel("Sonda espionaje:");
        flotas.add(lfsonda);
        lfsonda.setBounds(10, 355, 150, 25);

        JTextField fcl = new JTextField(null);
        flotas.add(fcl);
        fcl.setBounds(160, 35, 70, 25);
        JTextField fcp = new JTextField(null);
        flotas.add(fcp);
        fcp.setBounds(160, 60, 70, 25);
        JTextField fc = new JTextField(null);
        flotas.add(fc);
        fc.setBounds(160, 85, 70, 25);
        JTextField fnb = new JTextField(null);
        flotas.add(fnb);
        fnb.setBounds(160, 110, 70, 25);
        JTextField faco = new JTextField(null);
        flotas.add(faco);
        faco.setBounds(160, 135, 70, 25);
        JTextField fbb = new JTextField(null);
        flotas.add(fbb);
        fbb.setBounds(160, 160, 70, 25);
        JTextField fdd = new JTextField(null);
        flotas.add(fdd);
        fdd.setBounds(160, 185, 70, 25);
        JTextField fedlm = new JTextField(null);
        flotas.add(fedlm);
        fedlm.setBounds(160, 210, 70, 25);
        JTextField fnpc = new JTextField(null);
        flotas.add(fnpc);
        fnpc.setBounds(160, 260, 70, 25);
        JTextField fngc = new JTextField(null);
        flotas.add(fngc);
        fngc.setBounds(160, 285, 70, 25);
        JTextField fcolo = new JTextField(null);
        flotas.add(fcolo);
        fcolo.setBounds(160, 310, 70, 25);
        JTextField frec = new JTextField(null);
        flotas.add(frec);
        frec.setBounds(160, 335, 70, 25);
        JTextField fsonda = new JTextField(null);
        flotas.add(fsonda);
        fsonda.setBounds(160, 360, 70, 25);


        pesta.addTab("Flota", flotas);




//Cuarta pesataña
        //....//||====||\\...//=========...///=====\\\..|||=====...//======\\....//||====||\\...///=====\\\
        //....||||....||||...|||...........|||.....|||..|||........|||...........||||....||||...|||.....|||
        //....||||====||||...|||...==|||...|||=====//...|||=====...|||...==|||...||||====||||...|||=====//
        //....||||....||||...|||.....|||...|||...\\.....|||........|||.....|||...||||....||||...|||...\\
        //....||||....||||...|||=====|||...|||.....\\...|||=====...|||=====|||...||||....||||...|||.....\\
        JPanel agregar = new JPanel(null);
        JLabel lplanetas = new JLabel("Planeta:");
        lplanetas.setBounds(10, 5, 100, 25);
        agregar.add(lplanetas);
        JLabel lcoor = new JLabel("Coordenadas:");
        lcoor.setBounds(10, 55, 100, 25);
        agregar.add(lcoor);
        JLabel ldosp = new JLabel(":");
        ldosp.setBounds(33, 75, 100, 25);
        agregar.add(ldosp);
        JLabel ldosp2 = new JLabel(":");
        ldosp2.setBounds(73, 75, 100, 25);
        agregar.add(ldosp2);
        JLabel lminas = new JLabel("Minas:");
        lminas.setBounds(10, 135, 100, 25);
        agregar.add(lminas);
        Font font = lminas.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lminas.setFont(font.deriveFont(attributes));
        JLabel lme = new JLabel("Mina de Metal:");
        lme.setBounds(10, 160, 100, 25);
        agregar.add(lme);
        JLabel lxtal = new JLabel("Mina de Cristal:");
        lxtal.setBounds(10, 185, 100, 25);
        agregar.add(lxtal);
        JLabel ldeu = new JLabel("Sint. Deuterio:");
        ldeu.setBounds(10, 210, 100, 25);
        agregar.add(ldeu);
        JLabel ledificios = new JLabel("Recursos:");
        ledificios.setBounds(10, 240, 100, 25);
        agregar.add(ledificios);
        Font fontedi = ledificios.getFont();
        Map attributesedi = fontedi.getAttributes();
        attributesedi.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        ledificios.setFont(font.deriveFont(attributesedi));
        JLabel lsolar = new JLabel("Planta Solar:");
        lsolar.setBounds(10, 265, 100, 25);
        agregar.add(lsolar);
        JLabel lfusion = new JLabel("Planta Fusión:");
        lfusion.setBounds(10, 290, 100, 25);
        agregar.add(lfusion);
        JLabel lalm = new JLabel("Almacén Metal:");
        lalm.setBounds(10, 315, 100, 25);
        agregar.add(lalm);
        JLabel lalx = new JLabel("Almacén Cristal:");
        lalx.setBounds(10, 340, 100, 25);
        agregar.add(lalx);
        JLabel lald = new JLabel("Cont. Deuterio:");
        lald.setBounds(10, 365, 100, 25);
        agregar.add(lald);
        JLabel lesm = new JLabel("Escon. Metal:");
        lesm.setBounds(10, 390, 100, 25);
        agregar.add(lesm);
        JLabel lesx = new JLabel("Escon. Cristal:");
        lesx.setBounds(10, 415, 100, 25);
        agregar.add(lesx);
        JLabel lesd = new JLabel("Escon. Deuterio:");
        lesd.setBounds(10, 440, 100, 25);
        agregar.add(lesd);
        JLabel lsat = new JLabel("Satelites:");
        lsat.setBounds(10, 465, 100, 25);
        agregar.add(lsat);
        JLabel ltem = new JLabel("Temp.");
        ltem.setBounds(70, 105, 60, 25);
        agregar.add(ltem);
        JLabel linsta = new JLabel("Instalaciones:");
        linsta.setBounds(170, 5, 100, 25);
        agregar.add(linsta);
        Font fontinsta = linsta.getFont();
        Map attributesinsta = fontinsta.getAttributes();
        attributesinsta.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        linsta.setFont(font.deriveFont(attributesinsta));
        JLabel lrobot = new JLabel("Fab Robots:");
        lrobot.setBounds(170, 30, 100, 25);
        agregar.add(lrobot);
        JLabel lhangar = new JLabel("Hangar:");
        lhangar.setBounds(170, 55, 100, 25);
        agregar.add(lhangar);
        JLabel llabo = new JLabel("Laboratorio:");
        llabo.setBounds(170, 80, 100, 25);
        agregar.add(llabo);
        JLabel ldepal = new JLabel("Dep. Alianza:");
        ldepal.setBounds(170, 105, 100, 25);
        agregar.add(ldepal);
        JLabel lsilo = new JLabel("Silo:");
        lsilo.setBounds(170, 130, 100, 25);
        agregar.add(lsilo);
        JLabel lnanos = new JLabel("Nanos:");
        lnanos.setBounds(170, 155, 100, 25);
        agregar.add(lnanos);
        JLabel lterra = new JLabel("Terraformer:");
        lterra.setBounds(170, 180, 100, 25);
        agregar.add(lterra);
        JLabel lcampos = new JLabel("Campos:");
        lcampos.setBounds(170, 205, 100, 25);
        agregar.add(lcampos);
        JLabel ldef = new JLabel("Defensas:");
        ldef.setBounds(170, 240, 100, 25);
        agregar.add(ldef);
        Font fontdef = ldef.getFont();
        Map attributesdef = fontdef.getAttributes();
        attributesdef.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        ldef.setFont(font.deriveFont(attributesdef));
        JLabel llanzas = new JLabel("Lanzamisiles:");
        llanzas.setBounds(170, 265, 100, 25);
        agregar.add(llanzas);
        JLabel llp = new JLabel("L.Pequeño:");
        llp.setBounds(170, 290, 100, 25);
        agregar.add(llp);
        JLabel llg = new JLabel("L.Grande:");
        llg.setBounds(170, 315, 100, 25);
        agregar.add(llg);
        JLabel lgau = new JLabel("C.Gauss:");
        lgau.setBounds(170, 340, 100, 25);
        agregar.add(lgau);
        JLabel lion = new JLabel("C.Iónico:");
        lion.setBounds(170, 365, 100, 25);
        agregar.add(lion);
        JLabel lplasmas = new JLabel("C.Plasma:");
        lplasmas.setBounds(170, 390, 100, 25);
        agregar.add(lplasmas);
        JLabel labal = new JLabel("M.Antibalístico:");
        labal.setBounds(170, 440, 100, 25);
        agregar.add(labal);
        JLabel linter = new JLabel("M.Interplanetario:");
        linter.setBounds(170, 465, 100, 25);
        agregar.add(linter);
        JPanel jpluna = new JPanel(null);
        agregar.add(jpluna);
        jpluna.setBounds(347, 0, 173, 700);
        jpluna.setEnabled(false);
        final JLabel lluna = new JLabel("Luna:");
        lluna.setBounds(1, 5, 100, 25);
        jpluna.add(lluna);

        Font fontluna = lluna.getFont();
        Map attributesluna = fontluna.getAttributes();
        attributesluna.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lluna.setFont(font.deriveFont(attributesluna));
        lluna.setEnabled(false);
        jpluna.setEnabled(false);
        final JLabel lledificios = new JLabel("Recursos:");
        lledificios.setBounds(1, 55, 100, 25);
        jpluna.add(lledificios);
        Font fontledi = lledificios.getFont();
        Map attributesledi = fontledi.getAttributes();
        attributesledi.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lledificios.setFont(font.deriveFont(attributesledi));
        lledificios.setEnabled(false);
        final JLabel llalm = new JLabel("Almacén Metal:");
        llalm.setBounds(1, 80, 100, 25);
        jpluna.add(llalm);
        llalm.setEnabled(false);
        final JLabel llalx = new JLabel("Almacén Cristal:");
        llalx.setBounds(1, 105, 100, 25);
        jpluna.add(llalx);
        llalx.setEnabled(false);
        final JLabel llald = new JLabel("Cont. Deuterio:");
        llald.setBounds(1, 130, 100, 25);
        jpluna.add(llald);
        llald.setEnabled(false);
        final JLabel llsat = new JLabel("Satélite:");
        llsat.setBounds(1, 155, 100, 25);
        jpluna.add(llsat);
        llsat.setEnabled(false);
        final JLabel llinsta = new JLabel("Instalaciones lunares:");
        llinsta.setBounds(1, 180, 140, 25);
        jpluna.add(llinsta);
        llinsta.setEnabled(false);
        Font fontlinsta = llinsta.getFont();
        Map attributeslinsta = fontlinsta.getAttributes();
        attributeslinsta.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        llinsta.setFont(font.deriveFont(attributeslinsta));
        final JLabel llrobots = new JLabel("Fab. Robots:");
        llrobots.setBounds(1, 205, 140, 25);
        jpluna.add(llrobots);
        llrobots.setEnabled(false);
        final JLabel llhangar = new JLabel("Hangar:");
        llhangar.setBounds(1, 230, 140, 25);
        jpluna.add(llhangar);
        llhangar.setEnabled(false);
        final JLabel llbaselunar = new JLabel("Base lunar:");
        llbaselunar.setBounds(1, 255, 140, 25);
        jpluna.add(llbaselunar);
        llbaselunar.setEnabled(false);
        final JLabel llphalanx = new JLabel("Sensor Phalanx:");
        llphalanx.setBounds(1, 280, 140, 25);
        jpluna.add(llphalanx);
        llphalanx.setEnabled(false);
        final JLabel llsalto = new JLabel("Salto Cuántico:");
        llsalto.setBounds(1, 305, 140, 25);
        jpluna.add(llsalto);
        llsalto.setEnabled(false);


        final JLabel lldef = new JLabel("Defensas lunares:");
        lldef.setBounds(1, 330, 110, 25);
        jpluna.add(lldef);
        lldef.setEnabled(false);
        Font fontldef = lldef.getFont();
        Map attributesldef = fontldef.getAttributes();
        attributesldef.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lldef.setFont(font.deriveFont(attributesldef));
        final JLabel lllanzas = new JLabel("Lanzamisiles:");
        lllanzas.setBounds(1, 355, 100, 25);
        jpluna.add(lllanzas);
        lllanzas.setEnabled(false);
        final JLabel lllp = new JLabel("L.Pequeño:");
        lllp.setBounds(1, 380, 100, 25);
        jpluna.add(lllp);
        lllp.setEnabled(false);
        final JLabel lllg = new JLabel("L.Grande:");
        lllg.setBounds(1, 405, 100, 25);
        jpluna.add(lllg);
        lllg.setEnabled(false);
        final JLabel llgau = new JLabel("C.Gauss:");
        llgau.setBounds(1, 430, 100, 25);
        jpluna.add(llgau);
        llgau.setEnabled(false);
        final JLabel llion = new JLabel("C.Iónico:");
        llion.setBounds(1, 455, 100, 25);
        jpluna.add(llion);
        llion.setEnabled(false);
        final JLabel llplasmas = new JLabel("C.Plasma:");
        llplasmas.setBounds(1, 480, 100, 25);
        jpluna.add(llplasmas);
        llplasmas.setEnabled(false);
        final JLabel lltamao = new JLabel("Tamaño:");
        lltamao.setBounds(100, 5, 100, 25);
        jpluna.add(lltamao);
        lltamao.setEnabled(false);
        //flota colonial
        JLabel lfcolon = new JLabel("Flota Colonial:");
        lfcolon.setBounds(520, 05, 100, 25);
        agregar.add(lfcolon);
        lfcolon.setFont(font.deriveFont(attributesdef));
        JLabel lfccl = new JLabel("Cazador Ligero:");
        lfccl.setBounds(520, 30, 100, 25);
        agregar.add(lfccl);
        JLabel lfccp = new JLabel("Cazador Pesado:");
        lfccp.setBounds(520, 55, 100, 25);
        agregar.add(lfccp);
        JLabel lfcc = new JLabel("Crucero:");
        lfcc.setBounds(520, 80, 100, 25);
        agregar.add(lfcc);
        JLabel lfcnb = new JLabel("Nave de Batalla:");
        lfcnb.setBounds(520, 105, 100, 25);
        agregar.add(lfcnb);
        JLabel lfcaco = new JLabel("Acorazado:");
        lfcaco.setBounds(520, 130, 100, 25);
        agregar.add(lfcaco);
        JLabel lfcbb = new JLabel("Bombardero:");
        lfcbb.setBounds(520, 155, 100, 25);
        agregar.add(lfcbb);
        JLabel lfcdesc = new JLabel("Desctructor:");
        lfcdesc.setBounds(520, 180, 100, 25);
        agregar.add(lfcdesc);
        JLabel lfcedlm = new JLabel("ESDM:");
        lfcedlm.setBounds(520, 205, 100, 25);
        agregar.add(lfcedlm);
        JLabel lfcnpc = new JLabel("N.P. de carga:");
        lfcnpc.setBounds(520, 230, 100, 25);
        agregar.add(lfcnpc);
        JLabel lfcngc = new JLabel("N.G. de carga:");
        lfcngc.setBounds(520, 255, 100, 25);
        agregar.add(lfcngc);
        JLabel lfccolo = new JLabel("Colonizador:");
        lfccolo.setBounds(520, 280, 100, 25);
        agregar.add(lfccolo);
        JLabel lfcreci = new JLabel("Reciclador:");
        lfcreci.setBounds(520, 305, 100, 25);
        agregar.add(lfcreci);
        JLabel lfcsonda = new JLabel("Sonda espionaje:");
        lfcsonda.setBounds(520, 330, 100, 25);
        agregar.add(lfcsonda);


        final JTextField planetas = new JTextField("Nombre planeta");
        agregar.add(planetas);
        planetas.setBounds(10, 25, 100, 25);
        final JTextField nluna = new JTextField("Nombre Luna");
        jpluna.add(nluna);
        nluna.setBounds(1, 25, 100, 25);
        nluna.setEditable(false);
        final JTextField tluna = new JTextField("km");
        jpluna.add(tluna);
        tluna.setBounds(100, 25, 40, 25);
        tluna.setEditable(false);


        final JTextField coordenadasg = new JTextField("G", 1);
        agregar.add(coordenadasg);
        coordenadasg.setBounds(10, 75, 20, 25);
        final JTextField coordenadasss = new JTextField("SS", 3);
        agregar.add(coordenadasss);
        coordenadasss.setBounds(40, 75, 30, 25);
        final JTextField coordenadasp = new JTextField("POS", 2);
        agregar.add(coordenadasp);
        coordenadasp.setBounds(80, 75, 20, 25);



        final JCheckBox luna = new JCheckBox("Luna");
        agregar.add(luna);
        luna.setBounds(7, 105, 60, 25);




        final JTextField temperatura = new JTextField("Gº");
        agregar.add(temperatura);
        temperatura.setBounds(110, 105, 35, 25);
        //recursos
        final JTextField minametal = new JTextField(null);
        agregar.add(minametal);
        minametal.setBounds(110, 160, 20, 25);

        final JTextField minacristal = new JTextField(null);
        agregar.add(minacristal);
        minacristal.setBounds(110, 185, 20, 25);

        final JTextField sintedeu = new JTextField(null);
        agregar.add(sintedeu);
        sintedeu.setBounds(110, 210, 20, 25);

        final JTextField plantasolar = new JTextField(null);
        agregar.add(plantasolar);
        plantasolar.setBounds(110, 265, 20, 25);

        final JTextField plantafusion = new JTextField(null);
        agregar.add(plantafusion);
        plantafusion.setBounds(110, 290, 20, 25);

        final JTextField almacenm = new JTextField(null);
        agregar.add(almacenm);
        almacenm.setBounds(110, 315, 20, 25);
        final JTextField almacenx = new JTextField(null);
        agregar.add(almacenx);
        almacenx.setBounds(110, 340, 20, 25);
        final JTextField almacendeu = new JTextField(null);
        agregar.add(almacendeu);
        almacendeu.setBounds(110, 365, 20, 25);
        final JTextField esconm = new JTextField(null);
        agregar.add(esconm);
        esconm.setBounds(110, 390, 20, 25);
        final JTextField esconx = new JTextField(null);
        agregar.add(esconx);
        esconx.setBounds(110, 415, 20, 25);
        final JTextField escond = new JTextField(null);
        agregar.add(escond);
        escond.setBounds(110, 440, 20, 25);
        final JTextField sat = new JTextField(null);
        agregar.add(sat);
        sat.setBounds(110, 465, 40, 25);
        esconx.setBounds(110, 415, 20, 25);

        //instalaciones
        final JTextField fabrob = new JTextField(null);
        agregar.add(fabrob);
        fabrob.setBounds(270, 30, 20, 25);
        final JTextField hangar = new JTextField(null);
        agregar.add(hangar);
        hangar.setBounds(270, 55, 20, 25);
        final JTextField lab = new JTextField(null);
        agregar.add(lab);
        lab.setBounds(270, 80, 20, 25);
        final JTextField depal = new JTextField(null);
        agregar.add(depal);
        depal.setBounds(270, 105, 20, 25);
        final JTextField silo = new JTextField(null);
        agregar.add(silo);
        silo.setBounds(270, 130, 20, 25);
        final JTextField nanos = new JTextField(null);
        agregar.add(nanos);
        nanos.setBounds(270, 155, 20, 25);
        final JTextField terra = new JTextField(null);
        agregar.add(terra);
        terra.setBounds(270, 180, 20, 25);
        final JTextField campmax = new JTextField(null);
        agregar.add(campmax);
        campmax.setBounds(270, 205, 35, 25);

        //DEFENSAS
        final JTextField lanz = new JTextField(null);
        agregar.add(lanz);
        lanz.setBounds(270, 265, 65, 25);
        final JTextField lp = new JTextField(null);
        agregar.add(lp);
        lp.setBounds(270, 290, 65, 25);
        final JTextField lg = new JTextField(null);
        agregar.add(lg);
        lg.setBounds(270, 315, 65, 25);
        final JTextField gauss = new JTextField(null);
        agregar.add(gauss);
        gauss.setBounds(270, 340, 65, 25);
        final JTextField ion = new JTextField(null);
        agregar.add(ion);
        ion.setBounds(270, 365, 65, 25);
        final JTextField plasma = new JTextField(null);
        agregar.add(plasma);
        plasma.setBounds(270, 390, 65, 25);
        final JCheckBox cpe = new JCheckBox("C. Pequeña");
        agregar.add(cpe);
        cpe.setBounds(167, 415, 90, 25);
        final JCheckBox cgr = new JCheckBox("C. Grande");
        agregar.add(cgr);
        cgr.setBounds(255, 415, 100, 25);
        final JTextField anti = new JTextField(null);
        agregar.add(anti);
        anti.setBounds(270, 440, 35, 25);
        final JTextField inter = new JTextField(null);
        agregar.add(inter);
        inter.setBounds(270, 465, 35, 25);

        //LUNA

        final JTextField lalme = new JTextField(null);
        jpluna.add(lalme);
        lalme.setBounds(100, 80, 20, 25);
        lalme.setEditable(false);
        final JTextField lalxt = new JTextField(null);
        jpluna.add(lalxt);
        lalxt.setBounds(100, 105, 20, 25);
        lalxt.setEditable(false);
        final JTextField lalde = new JTextField(null);
        jpluna.add(lalde);
        lalde.setBounds(100, 130, 20, 25);
        lalde.setEditable(false);
        final JTextField lsate = new JTextField(null);
        jpluna.add(lsate);
        lsate.setBounds(100, 155, 20, 25);
        lsate.setEditable(false);
        final JTextField lfro = new JTextField(null);
        jpluna.add(lfro);
        lfro.setBounds(100, 205, 20, 25);
        lfro.setEditable(false);
        final JTextField lha = new JTextField(null);
        jpluna.add(lha);
        lha.setBounds(100, 230, 20, 25);
        lha.setEditable(false);
        final JTextField lbs = new JTextField(null);
        jpluna.add(lbs);
        lbs.setBounds(100, 255, 20, 25);
        lbs.setEditable(false);
        final JTextField lph = new JTextField(null);
        jpluna.add(lph);
        lph.setBounds(100, 280, 20, 25);
        lph.setEditable(false);
        final JTextField lsalto = new JTextField(null);
        jpluna.add(lsalto);
        lsalto.setBounds(100, 305, 20, 25);
        lsalto.setEditable(false);

        //DEFENSAS LUNA

        final JTextField llanz = new JTextField(null);
        jpluna.add(llanz);
        llanz.setBounds(100, 355, 65, 25);
        llanz.setEditable(false);
        final JTextField llap = new JTextField(null);
        jpluna.add(llap);
        llap.setBounds(100, 380, 65, 25);
        llap.setEditable(false);
        final JTextField llag = new JTextField(null);
        jpluna.add(llag);
        llag.setBounds(100, 405, 65, 25);
        llag.setEditable(false);
        final JTextField lgauss = new JTextField(null);
        jpluna.add(lgauss);
        lgauss.setBounds(100, 430, 65, 25);
        lgauss.setEditable(false);
        final JTextField lioni = new JTextField(null);
        jpluna.add(lioni);
        lioni.setBounds(100, 455, 65, 25);
        lioni.setEditable(false);
        final JTextField lplasma = new JTextField(null);
        jpluna.add(lplasma);
        lplasma.setBounds(100, 480, 65, 25);
        lplasma.setEditable(false);
        final JCheckBox lcpe = new JCheckBox("C. Pequeña");
        jpluna.add(lcpe);
        lcpe.setBounds(1, 515, 90, 25);
        lcpe.setEnabled(false);
        final JCheckBox lcgr = new JCheckBox("C. Grande");
        jpluna.add(lcgr);
        lcgr.setBounds(95, 515, 100, 25);
        lcgr.setEnabled(false);

        //flotacolonial
        final JTextField fccl = new JTextField(null);
        agregar.add(fccl);
        fccl.setBounds(620, 30, 65, 25);
        final JTextField fccp = new JTextField(null);
        agregar.add(fccp);
        fccp.setBounds(620, 55, 65, 25);
        final JTextField fcc = new JTextField(null);
        agregar.add(fcc);
        fcc.setBounds(620, 80, 65, 25);
        final JTextField fcnb = new JTextField(null);
        agregar.add(fcnb);
        fcnb.setBounds(620, 105, 65, 25);
        final JTextField fcac = new JTextField(null);
        agregar.add(fcac);
        fcac.setBounds(620, 130, 65, 25);
        final JTextField fcbb = new JTextField(null);
        agregar.add(fcbb);
        fcbb.setBounds(620, 155, 65, 25);
        final JTextField fcdd = new JTextField(null);
        agregar.add(fcdd);
        fcdd.setBounds(620, 180, 65, 25);
        final JTextField fcedml = new JTextField(null);
        agregar.add(fcedml);
        fcedml.setBounds(620, 205, 65, 25);
        final JTextField fcnpc = new JTextField(null);
        agregar.add(fcnpc);
        fcnpc.setBounds(620, 230, 65, 25);
        final JTextField fcngc = new JTextField(null);
        agregar.add(fcngc);
        fcngc.setBounds(620, 255, 65, 25);
        final JTextField fccol = new JTextField(null);
        agregar.add(fccol);
        fccol.setBounds(620, 280, 65, 25);
        final JTextField fcrec = new JTextField(null);
        agregar.add(fcrec);
        fcrec.setBounds(620, 305, 65, 25);
        final JTextField fcsonda = new JTextField(null);
        agregar.add(fcsonda);
        fcsonda.setBounds(620, 330, 65, 25);

        JButton guarda = new JButton("Guardar");
        agregar.add(guarda);
        guarda.setBounds(10, 520, 100, 25);
        JButton borr = new JButton("Reset");
        agregar.add(borr);
        borr.setBounds(130, 520, 100, 25);
        borr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                planetas.setText("Nombre planeta");
                nluna.setText("Nombre Luna");
                tluna.setText("km");


                coordenadasg.setText("G");
                coordenadasss.setText("SS");
                coordenadasp.setText("P");



                luna.setSelected(false);
                temperatura.setText("Gº");
                //recursos
                minametal.setText(null);

                minacristal.setText(null);

                sintedeu.setText(null);
                plantasolar.setText(null);
                plantafusion.setText(null);

                almacenm.setText(null);
                almacenx.setText(null);
                almacendeu.setText(null);
                esconm.setText(null);
                esconx.setText(null);
                escond.setText(null);
                sat.setText(null);

                //instalaciones
                fabrob.setText(null);
                hangar.setText(null);
                lab.setText(null);
                depal.setText(null);
                silo.setText(null);
                nanos.setText(null);
                terra.setText(null);
                campmax.setText(null);

                //DEFENSAS
                lanz.setText(null);
                lp.setText(null);
                lg.setText(null);
                gauss.setText(null);
                ion.setText(null);
                plasma.setText(null);
                cpe.setSelected(false);
                cgr.setSelected(false);
                anti.setText(null);//boton
                inter.setText(null);//boton

                //LUNA

                lalme.setText(null);
                lalxt.setText(null);
                lalde.setText(null);
                lsate.setText(null);
                lfro.setText(null);
                lha.setText(null);
                lbs.setText(null);
                lph.setText(null);
                lsalto.setText(null);

                //DEFENSAS LUNA

                llanz.setText(null);
                llap.setText(null);
                llag.setText(null);
                lgauss.setText(null);
                lioni.setText(null);
                lplasma.setText(null);
                lcpe.setSelected(false);//boton
                lcgr.setSelected(false);//boton

                //flotacolonial
                fccl.setText(null);
                fccp.setText(null);
                fcc.setText(null);
                fcnb.setText(null);
                fcac.setText(null);
                fcbb.setText(null);
                fcdd.setText(null);
                fcedml.setText(null);
                fcnpc.setText(null);
                fcngc.setText(null);
                fccol.setText(null);
                fcrec.setText(null);
                fcsonda.setText(null);

                //luna

                nluna.setEditable(false);
                tluna.setEditable(false);
                lalme.setEditable(true);
                lalxt.setEditable(false);
                lalde.setEditable(false);
                lsate.setEditable(false);
                lfro.setEditable(false);
                lha.setEditable(false);
                lbs.setEditable(false);
                lph.setEditable(false);
                lsalto.setEditable(false);

                //DEFENSAS LUNA

                llanz.setEditable(false);
                llap.setEditable(false);
                llag.setEditable(false);
                lgauss.setEditable(false);
                lioni.setEditable(false);
                lplasma.setEditable(false);
                lcpe.setEnabled(false);
                lcgr.setEnabled(false);



                lluna.setEnabled(false);
                lledificios.setEnabled(false);
                llalm.setEnabled(false);
                llalx.setEnabled(false);
                llald.setEnabled(false);
                llsat.setEnabled(false);
                llinsta.setEnabled(false);

                llrobots.setEnabled(false);
                llhangar.setEnabled(false);
                llbaselunar.setEnabled(false);
                llphalanx.setEnabled(false);
                llsalto.setEnabled(false);

                lldef.setEnabled(false);

                lllanzas.setEnabled(false);
                lllp.setEnabled(false);
                lllg.setEnabled(false);
                llgau.setEnabled(false);
                llion.setEnabled(false);
                llplasmas.setEnabled(false);
                lltamao.setEnabled(false);


            }
        });
        //......//..//..///.....//..//////
        //......//..//..//.//...//..//..//
        //......//..//..//..//..//..//////
        //......//..//..//...//.//..//..//
        ///////.//////..//....///...//..//

        luna.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (luna.isSelected() == true) {
                    nluna.setEditable(true);
                    tluna.setEditable(true);
                    lalme.setEditable(true);
                    lalxt.setEditable(true);
                    lalde.setEditable(true);
                    lsate.setEditable(true);
                    lfro.setEditable(true);
                    lha.setEditable(true);
                    lbs.setEditable(true);
                    lph.setEditable(true);
                    lsalto.setEditable(true);

                    //DEFENSAS LUNA

                    llanz.setEditable(true);
                    llap.setEditable(true);
                    llag.setEditable(true);
                    lgauss.setEditable(true);
                    lioni.setEditable(true);
                    lplasma.setEditable(true);
                    lcpe.setEnabled(true);
                    lcgr.setEnabled(true);

                    lluna.setEnabled(true);
                    lledificios.setEnabled(true);
                    llalm.setEnabled(true);
                    llalx.setEnabled(true);
                    llald.setEnabled(true);
                    llsat.setEnabled(true);
                    llinsta.setEnabled(true);

                    llrobots.setEnabled(true);
                    llhangar.setEnabled(true);
                    llbaselunar.setEnabled(true);
                    llphalanx.setEnabled(true);
                    llsalto.setEnabled(true);

                    lldef.setEnabled(true);

                    lllanzas.setEnabled(true);
                    lllp.setEnabled(true);
                    lllg.setEnabled(true);
                    llgau.setEnabled(true);
                    llion.setEnabled(true);
                    llplasmas.setEnabled(true);
                    lltamao.setEnabled(true);

                } else {
                    nluna.setEditable(false);
                    tluna.setEditable(false);
                    lalme.setEditable(false);
                    lalxt.setEditable(false);
                    lalde.setEditable(false);
                    lsate.setEditable(false);
                    lfro.setEditable(false);
                    lha.setEditable(false);
                    lbs.setEditable(false);
                    lph.setEditable(false);
                    lsalto.setEditable(false);

                    //DEFENSAS LUNA

                    llanz.setEditable(false);
                    llap.setEditable(false);
                    llag.setEditable(false);
                    lgauss.setEditable(false);
                    lioni.setEditable(false);
                    lplasma.setEditable(false);
                    lcpe.setEnabled(false);
                    lcgr.setEnabled(false);

                    lluna.setEnabled(false);
                    lledificios.setEnabled(false);
                    llalm.setEnabled(false);
                    llalx.setEnabled(false);
                    llald.setEnabled(false);
                    llsat.setEnabled(false);
                    llinsta.setEnabled(false);

                    llrobots.setEnabled(false);
                    llhangar.setEnabled(false);
                    llbaselunar.setEnabled(false);
                    llphalanx.setEnabled(false);
                    llsalto.setEnabled(false);

                    lldef.setEnabled(false);

                    lllanzas.setEnabled(false);
                    lllp.setEnabled(false);
                    lllg.setEnabled(false);
                    llgau.setEnabled(false);
                    llion.setEnabled(false);
                    llplasmas.setEnabled(false);
                    lltamao.setEnabled(false);

                }
               
            }
        });

        pesta.addTab("+ Planeta/Luna", agregar);

        //Quinta Pestaña
        //..///====..///===\\\.///===\\\..|||..///====\\\..|||\....|||..///==\\\..=======.///====
        //..|||......|||.......|||...|||..|||..|||....|||..|||.\\..|||..|||..|||....|||...|||....
        //..|||====..\\\===\\\.|||===///..|||..|||....|||..|||..\\.|||..|||==|||....|||...|||====
        //..|||............|||.|||........|||..|||....|||..|||...\\|||..|||..|||....|||...|||....
        //..\\\====...=====///.|||........|||..\\\====///..|||....\|||..|||..|||.\\=|||...\\\====
        JPanel espionaje = new JPanel(null);

        JLabel lrepor = new JLabel("Reporte espionaje:");
        espionaje.add(lrepor);
        lrepor.setBounds(75, 05, 130, 25);
        JLabel ltxtfo = new JLabel("Texto foro:");
        espionaje.add(ltxtfo);
        ltxtfo.setBounds(400, 05, 130, 25);
        JLabel lmcoor = new JLabel("Mostrar coordenadas:");
        espionaje.add(lmcoor);
        lmcoor.setBounds(10, 280, 130, 25);
        JLabel lof = new JLabel("Foro:");
        espionaje.add(lof);
        lof.setBounds(145, 280, 70, 25);
        JLabel lofc = new JLabel("Color:");
        espionaje.add(lofc);
        lofc.setBounds(145, 305, 70, 25);
        JTextArea espi = new JTextArea("Espionaje");
        espionaje.add(espi);
        espi.setBorder(BorderFactory.createLineBorder(Color.black));
        espi.setBounds(10, 30, 250, 250);
        JTextArea escomp = new JTextArea();
        espionaje.add(escomp);
        escomp.setBounds(300, 30, 250, 250);
        escomp.setBorder(BorderFactory.createLineBorder(Color.black));
        ButtonGroup bg = new ButtonGroup();

        JRadioButton cordsi = new JRadioButton("Sí");
        JRadioButton cordno = new JRadioButton("No");

        bg.add(cordsi);
        bg.add(cordno);
        cordsi.setSelected(true);
        espionaje.add(cordsi);
        espionaje.add(cordno);
        cordsi.setBounds(10, 305, 40, 25);
        cordno.setBounds(60, 305, 40, 25);

        //opciones foro
        JComboBox cbopcionesf = new JComboBox();
        cbopcionesf.setBounds(180, 285, 80, 20);
        espionaje.add(cbopcionesf);
        cbopcionesf.addItem("VBulletin");
        cbopcionesf.addItem("SMF");
        cbopcionesf.addItem("phpBB2");
        cbopcionesf.addItem("phpBB3");
        cbopcionesf.addItem("Sin Formato");
        //opciones foro
        JComboBox cbopcionesfc = new JComboBox();
        cbopcionesfc.setBounds(180, 310, 80, 20);
        espionaje.add(cbopcionesfc);
        cbopcionesfc.addItem("Claro");
        cbopcionesfc.addItem("Oscuro");

        JButton bcomp = new JButton("Compactar");
        espionaje.add(bcomp);
        bcomp.setBounds(10, 340, 100, 25);
        JButton bborrar = new JButton("Compactar");
        espionaje.add(bborrar);
        bborrar.setBounds(150, 340, 100, 25);
        JButton bcopiar = new JButton("Copiar Espionaje");
        espionaje.add(bcopiar);
        bcopiar.setBounds(350, 305, 150, 25);




        pesta.addTab("Compactador espionajes", espionaje);

        frame.getContentPane().add(pesta);
    }

    @Override
    public void dispatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
