<%@ include file="common/header.jspf" %>
<body>
  <%@ include file="common/navigation.jspf" %>
  <div class="container">
    <h1>Your Todos are here</h1>
    <table class="table">
      <thead>
        <tr>
          <th>id</th>
          <th>description</th>
          <th>Target date</th>
          <th>Is Done</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.isDone}</td>
            <td>
              <a href="delete-todo?id=${todo.id}" class="btn btn-danger"
                >Delete</a
              >
            </td>
            <td>
              <a href="update-todo?id=${todo.id}" class="btn btn-info"
                >Update</a
              >
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <a class="btn btn-success" href="add-todo">Add Todo</a>
  </div>
  <%@ include file="common/footer.jspf" %>
</body>
