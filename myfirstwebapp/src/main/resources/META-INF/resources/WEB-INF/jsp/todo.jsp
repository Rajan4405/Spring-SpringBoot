<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
      rel="stylesheet"
    />
    <title>Add Todos</title>
  </head>
  <body>
    <div class="container">
      <h1>Enter Todo Details</h1>
      <form:form action="" method="post" modelAttribute="todo">
        <fieldset class="mb-3">
          <form:label path="description">Description</form:label>
          <form:input type="text" name="description" path="description" />
          <form:errors path="description" cssClass="text-danger" />
        </fieldset>

        <fieldset class="mb-3">
          <form:label path="targetDate">Targate Date</form:label>
          <form:input type="text" path="targetDate" />
          <form:errors path="targetDate" cssClass="text-danger" />
        </fieldset>

        <form:input type="hidden" path="id" />
        <form:input type="hidden" path="isDone" />
        <input type="submit" class="btn btn-success" />
      </form:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
  </body>
</html>
