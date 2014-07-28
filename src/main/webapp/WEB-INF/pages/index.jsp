<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 27/07/14
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        <%@ include file="../css/bootstrap.min.css" %>
    </style>
    <jsp:include page="header.jsp" />
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-2" >TESTE</div>
            <div class="col-lg-8">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h3 class="panel-title">Adicionar Modelo</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Modelo</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Digite o modelo">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
         </div>
    </div>
</body>
</html>
