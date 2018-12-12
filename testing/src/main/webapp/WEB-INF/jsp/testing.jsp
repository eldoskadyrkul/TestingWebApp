<%@ include file="common/header.jsp"%>

<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="welcome_user">
                <h2 class="text-center">Добро пожаловать, ${username}! Вы выбрали предмет: "${subjects}"</h2>
            </div>
            <div class="testing_content">
                <div class="testing_body">
                    <div class="questions_body">
                        <p class="text-right">${text_question}</p>
                    </div>
                    <div class="answer_body">
                        <textarea name="ans" id="" cols="130" rows="20" class="answers"></textarea>
                    </div>
                    <div class="button_submit">
                        <button class="submit button btn-primary">Ответить</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jsp"%>