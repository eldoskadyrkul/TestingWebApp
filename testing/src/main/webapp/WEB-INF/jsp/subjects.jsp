<%@ include file="common/header.jsp" %>

<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="name_subjects">
                <c:forEach items="${subjects}" var="subject">
                <a href="/user/testing?subject=${subject.id}" class="link">${subject.subject_name}</a>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jsp"%>