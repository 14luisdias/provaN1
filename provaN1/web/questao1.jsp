<%-- 
    Document   : questao1
    Created on : 07/04/2016, 19:28:26
    Author     : W7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Calcular o Salário Mensal </h1>
    <body>
        <form action="questao1" method="POST">
                Salario Minimo: <input type="text" name="salMin" /><br>
                Informe Quantidades de Carros Vendidos: <input type="text" name="quant" /><br>
                Valor Faturado no Mês: <input type="text" name="valFat" /><br>
                Procentual do Valor das Vendas: <input type="text" name="porVen" /><br>
                <input type="submit" value="Calcular" />
        </form>
    </body>
</html>
