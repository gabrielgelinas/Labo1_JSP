/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.text.DecimalFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.Paiements;
import main.Revenus;

/**
 *
 * @author Zombietux
 */
public class Servlet_Revenu extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        Double salaire = getDoubleorNull(request.getParameter("salaire"));
        Double pension = getDoubleorNull(request.getParameter("pension"));
        Double autres = getDoubleorNull(request.getParameter("autres"));
        Revenus revenus = new Revenus(salaire, pension, autres);
        
        Double hypotheque = getDoubleorNull(request.getParameter("hypotheque"));
        Double auto = getDoubleorNull(request.getParameter("auto"));
        Double pretspersonnel = getDoubleorNull(request.getParameter("pretspersonnel"));
        Double credit = getDoubleorNull(request.getParameter("credit"));
        Double pretetudiant = getDoubleorNull(request.getParameter("pretetudiant"));
        Double enfants = getDoubleorNull(request.getParameter("enfants"));
        Double divers1 = getDoubleorNull(request.getParameter("divers1"));
        Double divers2 = getDoubleorNull(request.getParameter("divers2"));
        Double divers3 = getDoubleorNull(request.getParameter("divers3"));
        Paiements paiements = new Paiements(hypotheque, auto, pretspersonnel, credit, pretetudiant, enfants, divers1, divers2, divers3);
        
        DecimalFormat f = new DecimalFormat("#0.00");
        Double ratio = revenus.getTotal()!=0 ? (paiements.getTotal() / revenus.getTotal()) * 100 : 0.0;
        
        request.setAttribute("revenus", revenus);        
        request.setAttribute("paiements", paiements); 
        request.setAttribute("ratio", f.format(ratio));
     
        RequestDispatcher dispatch = request.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
        
        /* 
        Enumeration<String> datanames = request.getParameterNames();
        List datanameslist = Collections.list(datanames);

        HashMap hm = new HashMap();

        DecimalFormat formatter = new DecimalFormat("#0.00");

        for (Iterator it = datanameslist.iterator(); it.hasNext();) {
            Object dataname = it.next();
            try {
                hm.put(dataname, formatter.format(getDoubleorNull((String) request.getParameter(dataname + ""))));
            } catch (NumberFormatException e) {
                hm.put(dataname, formatter.format(0));
            }
        }

        Double total = 0.00;
        for (int i = 0; i < 3; i++) {
            try {
                total += getDoubleorNull((String) hm.get(datanameslist.get(i)));
            } catch (NumberFormatException e) {

            }
        }
        hm.replace("total", formatter.format(total));

        Double paiements = 0.00;
        for (int i = 4; i < 13; i++) {
            try {
                paiements += getDoubleorNull((String) hm.get(datanameslist.get(i)));
            } catch (NumberFormatException e) {

            }
        }
        hm.replace("remboursement", formatter.format(paiements));

        Double ratio = (paiements / total) * 100;
        hm.replace("ratio", ratio);

        request.setAttribute("hmdata", hm);

        ServletContext sc = getServletContext();
        sc.getRequestDispatcher("/index.jsp").forward(request, response);
        */

    }

    private Double getDoubleorNull(String s_dbl){
        Double dbl;
        try{
            dbl = Double.parseDouble(s_dbl);
        } catch(NumberFormatException e) {
            dbl = 0.0;
        }        
        return dbl;
    }
    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
