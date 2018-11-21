/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.onclave.nsga.ii.algorithm;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.*;


import org.jgraph.JGraph;
import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.*;
import org.jgrapht.ext.*;
import org.jgrapht.graph.*;

// resolve ambiguity
import org.jgrapht.graph.DefaultEdge;

import javax.swing.JApplet;

/**
 *
 * @author n9572791
 */
public class GraphDraw extends JApplet{
    
     //~ Static fields/initializers ---------------------------------------------

    private static final long serialVersionUID = 3256444702936019250L;
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FAFBFF");
    private static final Dimension DEFAULT_SIZE = new Dimension(700, 700);

    //~ Instance fields --------------------------------------------------------

    //
    private JGraphModelAdapter m_jgAdapter;
    
    
      public void init(java.util.List<java.util.List<String>> nodes, ArrayList internalCost, ArrayList microservicesInteractions, ArrayList numberOfCallsBetween)
    { 


        // create a JGraphT graphq
        ListenableGraph g =
            new ListenableDirectedMultigraph(
                    DefaultEdge.class);

        // create a visualization using JGraph, via an adapter
        m_jgAdapter = new JGraphModelAdapter( g );

        JGraph jgraph = new JGraph( m_jgAdapter );
        adjustDisplaySettings( jgraph );
        getContentPane(  ).add( jgraph );
        resize( DEFAULT_SIZE );

        ArrayList microservices = new ArrayList();
        
        for(int i = 0; i < nodes.size(); i++){
            ArrayList temp = (ArrayList)nodes.get(i);
            String msString = "[MS"+i+"]\n";
            
            for(int j = 0; j < temp.size(); j++){
                msString = msString +" "+temp.get(j)+",";
            }
            
            msString = msString +"\n("+internalCost.get(i)+")";
            
            g.addVertex( msString);
            microservices.add(msString);
        }
        
        
        for(int i = 0; i < microservicesInteractions.size(); i++){
            String split[] = microservicesInteractions.get(i).toString().split("-");
            int one = Integer.parseInt(split[0]);
            int two = Integer.parseInt(split[1]);
            
            g.addEdge(microservices.get(one), microservices.get(two), numberOfCallsBetween.get(i).toString());

        }
        
        
        for(int i = 0; i < microservices.size(); i++){
            
            Random r = new Random();
            int low = 10;
            int high = 500;
            int result = r.nextInt(high-low) + low;
            int result2 = r.nextInt(high-low) + low;
            
            positionVertexAt( microservices.get(i).toString(), result, result2);
            
        }
        

    }

    private void adjustDisplaySettings(JGraph jg)
    {
        jg.setPreferredSize(DEFAULT_SIZE);

        Color c = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter("bgcolor");
        } catch (Exception e) {
        }

        if (colorStr != null) {
            c = Color.decode(colorStr);
        }

        jg.setBackground(c);
    }

    @SuppressWarnings("unchecked") // FIXME hb 28-nov-05: See FIXME below
    private void positionVertexAt(Object vertex, int x, int y)
    {
        DefaultGraphCell cell = m_jgAdapter.getVertexCell(vertex);
        AttributeMap attr = cell.getAttributes();
        Rectangle2D bounds = GraphConstants.getBounds(attr);

        Rectangle2D newBounds = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());

        GraphConstants.setBounds(attr, newBounds);

        // TODO: Clean up generics once JGraph goes generic
        org.jgraph.graph.AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        m_jgAdapter.edit(cellAttr, null, null, null);
    }

    //~ Inner Classes ----------------------------------------------------------

    /**
     * a listenable directed multigraph that allows loops and parallel edges.
     */
    private static class ListenableDirectedMultigraph<V, E>
        extends DefaultListenableGraph<V, E>
        implements DirectedGraph<V, E>
    {
        private static final long serialVersionUID = 1L;

        ListenableDirectedMultigraph(Class<E> edgeClass)
        {
            super(new DirectedMultigraph<V, E>(edgeClass));
        }
    }
    
    
}
