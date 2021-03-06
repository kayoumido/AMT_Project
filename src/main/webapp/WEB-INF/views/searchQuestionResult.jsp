<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="fragments/header.jsp"/>

<div class="container container-content">

    <div class="oneLineContainer mb-5">
        <h1 class="h1">${count} question(s) found for "${searchTerm}"</span></h1>
    </div>

    <div class="flex justify-center flex-wrap">
        <c:forEach var="question" items="${questions.questions}">
            <jsp:include page="fragments/questionSummary.jsp">
                <jsp:param name="uuid" value="${question.uuid}"/>
                <jsp:param name="author" value="${question.author}"/>
                <jsp:param name="title" value="${question.title}"/>
                <jsp:param name="content" value="${question.content}"/>
                <jsp:param name="votes" value="${question.votes.count}"/>
                <jsp:param name="answers" value="${question.answers.answers.size()}"/>
                <jsp:param name="creationDate" value="${question.creationDate.toString()}"/>
            </jsp:include>
        </c:forEach>
    </div>
</div>

<jsp:include page="fragments/footer.jsp"/>
