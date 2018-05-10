<%-- 
    Document   : tempindex
    Created on : 27-Jan-2018, 5:13:19 PM
    Author     : gggab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="main.Paiements, main.Revenus"%>
<%
    Revenus revenus = (Revenus)request.getAttribute("revenus");
    Paiements paiements = (Paiements)request.getAttribute("paiements");
    String ratio = (String)request.getAttribute("ratio");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Outil Financier</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action='Servlet_Revenu' method="post">
            <table>
                <th colspan="3"><h1>Vos revenus mensuels</h1></th>  

                <tr>
                    <td>Salaire mensuel (avant impôts)</td>
                    <td><input type="text" name="salaire" placeholder="0.00" value="${revenus.getSalaire()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Pension alimentaire reçue</td>
                    <td><input type="text" name="pension" placeholder="0.00" value="${revenus.getPension()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Autres revenus mensuels</td>
                    <td><input type="text" name="autres" placeholder="0.00" value="${revenus.getAutres()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td><h3>Total des revenus mensuels</h3></td>
                    <td><input type="text" name="total" placeholder="0.00" value="${revenus.getTotal()}" readonly="true"></td>
                    <td class="signe">$</td>
                </tr>


                <th colspan="3"><h1>Vos paiements de remboursement</h1></th>  

                <tr>
                    <td>Paiement hypothécaire mensuel (incluant assurances et taxes municipales/scolaires)</td>
                    <td><input type="text" name="hypotheque" placeholder="0.00" value="${paiements.getHypotheque()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel d'un prêt automobile</td>
                    <td><input type="text" name="auto" placeholder="0.00" value="${paiements.getAuto()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiements mensuels de vos prêts personnels</td>
                    <td><input type="text" name="pretspersonnel" placeholder="0.00" value="${paiements.getPretspersonnel()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel du solde de votre carte de crédit</td>
                    <td><input type="text" name="credit" placeholder="0.00" value="${paiements.getCredit()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel d'un prêt étudiant</td>
                    <td><input type="text" name="pretetudiant" placeholder="0.00" value="${paiements.getPretetudiant()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel de soutien aux enfants et pensions alimentaire</td>
                    <td><input type="text" name="enfants" placeholder="0.00" value="${paiements.getEnfants()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel divers 1 (ex. chalet)</td>
                    <td><input type="text" name="divers1" placeholder="0.00" value="${paiements.getDivers1()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel divers 2 (ex. motocyclette)</td>
                    <td><input type="text" name="divers2" placeholder="0.00" value="${paiements.getDivers2()}"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td>Paiement mensuel divers 3 (ex. électroménagers)</td>
                    <td><input type="text" name="divers3" placeholder="0.00" value="${paiements.getDivers3()}"></td>
                    <td class="signe">$</td>
                </tr>


                <tr>
                    <td><h3>Total des paiements mensuels pour rembourser des dettes</h3></td>
                    <td><input type="text" name="remboursement" placeholder="0.00" value="${paiements.getTotal()}" readonly="true"></td>
                    <td class="signe">$</td>
                </tr>
                <tr>
                    <td><h3>Ratio d'endettement</h3></td>
                    <td><input class="test" type="text" name="ratio" placeholder="0.00" value="${ratio}" readonly="true"></td>
                    <td class="signe">%</td>
                </tr>                
                <tr>
                    <td colspan='3' align='center'>
                        <input class='submit' type='submit' value='Calculer'>
                    </td>
                </tr>
            </table>     
        </form>
    </body>
</html>
