/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ven_DibujoNeuronal.java
 *
 * Created on 17/06/2010, 10:18:56 PM
 */
package paq_ventanas;


import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.util.mxRectangle;
import java.awt.Color;
import paq_arquitectura.Red_FeedForward;
import paq_arquitectura.Neurona;
import paq_logica.cls_variables_globales;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ven_DibujoNeuronal extends javax.swing.JInternalFrame implements Runnable{
    
    private cls_variables_globales numero= new cls_variables_globales();
    private Red_FeedForward red_ref;  // copia de la red para trabajar
    private Neurona neurona;
    private double ancho = 10;
    private double alto = 10;
    private int minutos;
    private int segundos;
    private int horas;
    Thread crono;
    mxGraph graph = new mxGraph();
    Object parent = graph.getDefaultParent();
    Object entrada[];
    Object oculta[];
    Object salida[];
    private int contador =0;

   

    public ven_DibujoNeuronal(Red_FeedForward red) {
        initComponents();
        red_ref=red;
        dibujarRed(dibujarCapas(red_ref));
        this.title = "Arquitectura Neuronal Proyecto # " + red_ref.getIdProyecto() + " - Nombre: " + paq_logica.cls_variables_globales.nombreProyecto;



    }

    public mxGraphComponent dibujarCapas(Red_FeedForward red) {
        int posicion_y = 0;
        int posicion_x = 0;
        int espaciado=0;
 
        this.entrada = new Object[red.getCapa(0).getNumNeuronas()];
        this.oculta = new Object[red.getCapa(1).getNumNeuronas()];
        this.salida = new Object[red.getCapa(2).getNumNeuronas()];

        graph.getModel().beginUpdate();


        for (int j = 0; j < red.getNumCapas(); j++) // por cada una de las capas
        {
            posicion_x = red.getCapa(j).getOrden() * paq_logica.cls_variables_globales.espacio_x_neuronas;
            if (getMayorNumNeuronas()== red.getCapa(j).getNumNeuronas())
            espaciado=0;
            else
                espaciado=(((getMayorNumNeuronas()-1)*(paq_logica.cls_variables_globales.espacio_y_neuronas))-(red.getCapa(j).getNumNeuronas()-1)*paq_logica.cls_variables_globales.espacio_y_neuronas)/2;
            try {
                for (int i = 0; i < red.getCapa(j).getNumNeuronas(); i++) {
                    posicion_y = i * paq_logica.cls_variables_globales.espacio_y_neuronas+espaciado;

                    neurona = red.getCapa(j).getNeurona(i);
                  

                    switch (j) {
                        case 0:
                            entrada[i] = graph.insertVertex(parent, null, neurona.getEstado(), posicion_x, posicion_y, paq_logica.cls_variables_globales.ancho_radio_neurona, paq_logica.cls_variables_globales.alto_radio_neurona, "shape=ellipse;perimeter=ellipsePerimeter;strokeColor=green");
                            break;
                        case 1:
                            oculta[i] = graph.insertVertex(parent, null, neurona.getEstado(), posicion_x, posicion_y, paq_logica.cls_variables_globales.ancho_radio_neurona, paq_logica.cls_variables_globales.alto_radio_neurona, "shape=ellipse;perimeter=ellipsePerimeter;strokeColor=green");
                            break;
                        case 2:
                            salida[i] = graph.insertVertex(parent, null, neurona.getEstado(), posicion_x, posicion_y, paq_logica.cls_variables_globales.ancho_radio_neurona, paq_logica.cls_variables_globales.alto_radio_neurona, "shape=ellipse;perimeter=ellipsePerimeter;strokeColor=green");
                            break;
                    }
                }
            } finally {
                graph.getModel().endUpdate();
            }


        }

        for (int i = 0; i < red.getCapa(0).getNumNeuronas(); i++) //  entrada
        {
            for (int j = 0; j < red.getCapa(1).getNumNeuronas(); j++) // oculta
            {
               graph.insertEdge(parent, null, red.getCapa(0).getSinapsis(i, j, "total").getPeso(), entrada[i], oculta[j],"strokeColor=white;fillColor=red;fontColor=yellow");


            }
        }

        for (int i = 0; i < red.getCapa(1).getNumNeuronas(); i++) //  entrada
        {
            for (int j = 0; j < red.getCapa(2).getNumNeuronas(); j++) // oculta
            {  
                graph.insertEdge(parent, null, red.getCapa(1).getSinapsis(i, j, "total").getPeso(), oculta[i], salida[j],"strokeColor=white;fillColor=red;fontColor=yellow");

            }
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        graphComponent.setBackground(Color.red);
        return graphComponent;
    }

    private int getMayorNumNeuronas()
    {
        int numMayor=red_ref.getCapa(0).getNumNeuronas();
        for (int num=1; num<red_ref.getNumCapas();num++)
                if (red_ref.getCapa(num).getNumNeuronas()>=numMayor)
                    numMayor=red_ref.getCapa(num).getNumNeuronas();

        return numMayor;

    }
    public void dibujarRed(mxGraphComponent grafico) {

        this.Pn_panel.setLayout(new java.awt.GridLayout(1, 1));
       
        this.Pn_panel.add(grafico);
       
        

        /************************************************/

        final mxGraphComponent graphComponent = grafico;
      
        grafico.getViewport().setOpaque(false);
        grafico.setBackground(this.getBackground());




		graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{

			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphComponent.getCellAt(e.getX(), e.getY());

				if (cell != null)
				{
                                    if (graph.isEdgeValid(cell, cell, cell))
                                        setValor(graph.getLabel(cell)," ");
                                    else
                                        setValor(" ",graph.getLabel(cell));

                                   

				}
			}
		});


       /************************************************/

    }

    public void setValor(String neurona, String sinapsis )
    {
        this.lbl_neurona.setText(neurona);
        this.lbl_sinapsis.setText(sinapsis);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mxRectangle1 = new com.mxgraph.util.mxRectangle();
        chartTiming11 = new demo.ChartTiming1();
        Pn_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_num_patron = new javax.swing.JLabel();
        lbl_errorActual = new javax.swing.JLabel();
        lbl_epoca = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_ultimo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_errorTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_neurona = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_sinapsis = new javax.swing.JLabel();
        txtCronometro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_procesando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Aquitectura Neuronal");
        setAlignmentX(20.0F);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/chart_line.png"))); // NOI18N

        Pn_panel.setBackground(new java.awt.Color(102, 102, 102));
        Pn_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pn_panel.setPreferredSize(new java.awt.Dimension(846, 859));

        javax.swing.GroupLayout Pn_panelLayout = new javax.swing.GroupLayout(Pn_panel);
        Pn_panel.setLayout(Pn_panelLayout);
        Pn_panelLayout.setHorizontalGroup(
            Pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        Pn_panelLayout.setVerticalGroup(
            Pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patron Actual :");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Error Actual :");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Epoca :");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_num_patron.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_num_patron.setForeground(new java.awt.Color(0, 255, 0));
        lbl_num_patron.setText("  ");

        lbl_errorActual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_errorActual.setForeground(new java.awt.Color(0, 255, 0));

        lbl_epoca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_epoca.setForeground(new java.awt.Color(0, 255, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ultimo :");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_ultimo.setFont(new java.awt.Font("Arial", 1, 18));
        lbl_ultimo.setForeground(new java.awt.Color(0, 255, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Error Total :");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_errorTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_errorTotal.setForeground(new java.awt.Color(0, 255, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Neurona :");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_neurona.setFont(new java.awt.Font("Arial", 1, 18));
        lbl_neurona.setForeground(new java.awt.Color(0, 255, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sinapsis :");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_sinapsis.setFont(new java.awt.Font("Arial", 1, 18));
        lbl_sinapsis.setForeground(new java.awt.Color(0, 255, 0));

        txtCronometro.setBackground(new java.awt.Color(102, 102, 102));
        txtCronometro.setEditable(false);
        txtCronometro.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        txtCronometro.setForeground(new java.awt.Color(102, 255, 51));
        txtCronometro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCronometro.setText("0:0:0");
        txtCronometro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tiempo Ejecución ");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_procesando.setFont(new java.awt.Font("Arial", 3, 24));
        lbl_procesando.setForeground(new java.awt.Color(255, 255, 51));
        lbl_procesando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_procesando.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_neurona, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(209, 209, 209)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_sinapsis, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_epoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_num_patron, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_errorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_errorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addComponent(lbl_procesando, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(txtCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_errorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lbl_errorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_epoca, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_num_patron, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_neurona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_sinapsis, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(lbl_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_procesando)))
                .addGap(7, 7, 7)
                .addComponent(Pn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    

    public void cargar() {
        
         this.lbl_procesando.setText("Procesando");
         Thread t = new Thread() {


          public void run() {              

               
                double MErrorPromedio[]= new double[red_ref.getNumCiclos()];
                double MErrorMaximo[]= new double[red_ref.getNumCiclos()];
                double MErrorMinimo[]= new double[red_ref.getNumCiclos()];
                double maximoError=0;
                double minimoError=0;

                paq_arquitectura.Patron salidaRed = new paq_arquitectura.Patron();
                double error_total;
                double error_local=0;
                double temp=1;
                int epoca = 0;
                error_total=1;
            
 
  
    while(!ven_MDI.nueva_red.getParar())
     {
         temp=0;
         maximoError=0;
         minimoError=1;
         
                for (int p = 0; p < red_ref.getListaPatrones().getNumeroPatrones(); p++) // DESDE EL PRIMER PATRON DE ENTRENAMINETO  //
                {      
                    // Aprendizaje hacia adelante
                        
                        salidaRed = red_ref.ejecutarRed(red_ref.getListaPatrones().getPatron(p),true);
                        error_local=  red_ref.error_medio_cuadratico(red_ref.getListaPatrones().getPatron(p).getValorNormalizadoSalida(0) , salidaRed.getValorSalida(0));   // comparar con salida normalizada
           
                        if (error_local>maximoError)
                            maximoError=error_local;
                        if (error_local<minimoError)
                            minimoError=error_local;

                        temp=temp+error_local;
                        if (error_local>red_ref.getErrorDeseadoPatron())
                        {
                            red_ref.propagacionErrorAtras(salidaRed, red_ref.getListaPatrones().getPatron(p));
                            red_ref.aprenderSinapsis();
                        }
                      
                        if(paq_logica.cls_variables_globales.aprendizajePatron)
                                mostrar(epoca, p, error_local, p,error_total);

                      cls_variables_globales.epo=epoca;
                      cls_variables_globales.patron_actual_procesando=p;
                      cls_variables_globales.error_actual_procesando=error_local;
                  }
        
         error_total=temp;
         error_total= error_total/red_ref.getListaPatrones().getNumeroPatrones();    // error medio cuadratico total
         error_total= numero.Redondear(error_total);
         cls_variables_globales.error_total_procesando=error_total;
         MErrorPromedio[epoca]= error_total;
         MErrorMaximo[epoca]=maximoError;
         MErrorMinimo[epoca]=minimoError;
         
                    paq_logica.cls_variables_globales.erroresMaximo=MErrorMaximo;
                    paq_logica.cls_variables_globales.erroresMinimo=MErrorMinimo;
                    paq_logica.cls_variables_globales.erroresPromedio=MErrorPromedio;
                    paq_logica.cls_variables_globales.epoca=epoca;


         //////////////////////////////// Factor de Aprendizaje dínamico/////////////////////////////////////////////////
        //red_ref.setFactoraprendizaje(variar_factor_aprendizaje(MErrorPromedio,epoca,red_ref.getFactorAprendizaje()));
         //System.out.println("FARTOR " + red_ref.getFactorAprendizaje());
         ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (paq_logica.cls_variables_globales.aprendizajeEpoca)
            mostrar(epoca, 0, error_local, 0, error_total);
                    epoca = epoca + 1;
    

         if (error_total < red_ref.getErrorDeseado() || red_ref.getNumCiclos()<epoca+1)
         {
             ven_MDI.nueva_red.setParar(true);
             crono.stop();
             try
             {
                 ven_curvasAprendizajes.hilo.stop();
             }
             catch(Exception e)
             {
                 
             }


         }
   }

                /************************ Mostrar Curva de Error ***********************************/
                    ven_CurvaError curvaError= new ven_CurvaError();
                    paq_logica.cls_variables_globales.erroresMaximo=MErrorMaximo;
                    paq_logica.cls_variables_globales.erroresMinimo=MErrorMinimo;
                    paq_logica.cls_variables_globales.erroresPromedio=MErrorPromedio;
                    paq_logica.cls_variables_globales.epoca=epoca;
                    curvaError.grafico_curva_error(MErrorPromedio, MErrorMaximo,MErrorMinimo, epoca);

               /************************ Mostrar Curva Normal **************************************/
                    ven_CurvaNormal curva= new ven_CurvaNormal();
                    double media= numero.getMediaMuestral(MErrorPromedio);
                    double varianza= numero.getDesviacionTipica(MErrorPromedio, media);
                    double rangoInicial= numero.getMinimoArreglo(MErrorPromedio);
                    double rangoFinal= numero.getMaximoArreglo(MErrorPromedio);
                  
                    curva.mostrar(MErrorPromedio, media, varianza, rangoInicial, rangoFinal,epoca);

            }
        };
      
            t.start();
       
    }

    private double variar_factor_aprendizaje(double errores_medios[], int posicion_actual,double factor)
    {
        double calculo =0;
        double referencia;
        referencia=0.05;
         // porcentaje de error de incremento/decrec...
        
       
        if (posicion_actual!=0)
        calculo= ((errores_medios[posicion_actual]-errores_medios[posicion_actual-1])*100)/errores_medios[posicion_actual-1];
        else return factor;

       // System.out.println("Calculo " + calculo + " Rreferencia "+ referencia+ "   "+(5/100));
        if (calculo>referencia)   // el incremento es mayor al 5%
            return factor-(factor*referencia);
        else
        {
            if (calculo<referencia)
                return factor+(factor*referencia);
            else
                return factor;
        }


    }

 public void run() {
     String tiempo;
     String segundo="00";
     String minuto="00";
     String hora="00";
            try
            {
                for(;;) {
                if(segundos==59) { segundos=0; minutos++; }
                if(minutos==59) { minutos=0; horas++; }
                segundos++;

                segundo=String.valueOf(segundos);
                minuto=String.valueOf(minutos);
                hora=String.valueOf(horas);
                if (segundos<10 )
                        segundo="0"+segundos;
                if (minutos<10)
                        minuto="0"+minutos;
                if (horas<10)
                        hora="0"+horas;

                tiempo= hora+":"+minuto+":"+segundo;
                this.txtCronometro.setText(tiempo);
                cls_variables_globales.tiempo_utilizado= tiempo;
                this.lbl_epoca.setText(String.valueOf(cls_variables_globales.epoca));
                this.lbl_errorTotal.setText(String.valueOf(cls_variables_globales.error_total_procesando));
                this.lbl_errorActual.setText(String.valueOf(cls_variables_globales.error_actual_procesando));
                this.lbl_num_patron.setText(String.valueOf(cls_variables_globales.patron_actual_procesando));
                if (contador!=8 )
                 {
                    this.lbl_procesando.setText(this.lbl_procesando.getText() + ".");
                 }
                else
                {
                    this.lbl_procesando.setText("Procesando");
                    contador=0;
                }


                contador++;

                crono.sleep(1000); }
            }
            catch (InterruptedException e)
            { System.out.println(e.getMessage()); }
}

 public void cronometro()
 {
     horas=0;
     minutos=0;
     segundos=0;
     
    crono = new Thread(this);
    crono.start();

 }

    private void mostrar(int epoca, int numPatron, double errorActual, int ultimo,double errorTotal) {
     
        for (int e = 0; e < red_ref.getCapa(0).getNumNeuronas(); e++) {
            graph.getModel().setValue(entrada[e], red_ref.getCapa(0).getNeurona(e).getEstado());

        }
        for (int e = 0; e < red_ref.getCapa(1).getNumNeuronas(); e++) {
            graph.getModel().setValue(oculta[e],red_ref.getCapa(1).getNeurona(e).getEstado());
        }
        for (int e = 0; e < red_ref.getCapa(2).getNumNeuronas(); e++) {
            graph.getModel().setValue(salida[e], red_ref.getCapa(2).getNeurona(e).getEstado());
        }




for (int i = 0; i < ven_MDI.nueva_red.getCapa(0).getNumNeuronas(); i++) //  entrada
        {
            for (int j = 0; j < ven_MDI.nueva_red.getCapa(1).getNumNeuronas(); j++) // oculta
            {                 
              graph.getModel().setValue(graph.getEdgesBetween(entrada[i], oculta[j])[0], ven_MDI.nueva_red.getCapa(0).getSinapsis(i, j, "total").getPeso());
              graph.setSelectionCells(entrada);
               graph.refresh();
            }
        }
        
for (int i = 0; i < ven_MDI.nueva_red.getCapa(1).getNumNeuronas(); i++) //  oculta
        {
            for (int j = 0; j < ven_MDI.nueva_red.getCapa(2).getNumNeuronas(); j++) // salida
            {
               graph.getModel().setValue(graph.getEdgesBetween(oculta[i], salida[j])[0], ven_MDI.nueva_red.getCapa(1).getSinapsis(i, j, "total").getPeso());
               graph.setSelectionCells(oculta);
               graph.refresh();
            }
        }
       
        graph.setSelectionCells(salida);

 graph.refresh();

        this.lbl_epoca.setText(String.valueOf(epoca));
        this.lbl_errorActual.setText(String.valueOf(errorActual));
        this.lbl_num_patron.setText(String.valueOf(numPatron));
        this.lbl_ultimo.setText(String.valueOf(ultimo));
        this.lbl_errorTotal.setText(String.valueOf(errorTotal));


      
    }

    public void setTamaño(String tipo) {
        // graph.moveCells(entrada, 10, 10);   mover las neuronas
        mxRectangle m = new mxRectangle();

        if (tipo.equals("max")) {
            alto = alto + 10;
            ancho = ancho + 10;
        }
        if (tipo.equals("min")) {
            alto = alto - 10;
            ancho = ancho - 10;
            System.out.println("min");
        }
        m.setHeight(alto);
        m.setWidth(ancho);
    

        graph.resizeCell(entrada[0], m);
         graph.resizeCell(entrada[1], m);
         
        graph.resizeCell(salida[0], m);


        //System.out.println(alto + " " + ancho);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_panel;
    private demo.ChartTiming1 chartTiming11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_epoca;
    private javax.swing.JLabel lbl_errorActual;
    private javax.swing.JLabel lbl_errorTotal;
    private javax.swing.JLabel lbl_neurona;
    private javax.swing.JLabel lbl_num_patron;
    private javax.swing.JLabel lbl_procesando;
    private javax.swing.JLabel lbl_sinapsis;
    private javax.swing.JLabel lbl_ultimo;
    private com.mxgraph.util.mxRectangle mxRectangle1;
    private javax.swing.JTextField txtCronometro;
    // End of variables declaration//GEN-END:variables
}
