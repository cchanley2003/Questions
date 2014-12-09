<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Add Question</title>
</head>
<body>
<g:form action="saveQuestion" id="${params.id}">
    <label style="padding-right:7px"for="questionText">Questions Text</label>
    <g:textField name="questionText"/>
    <br/>
    <label for="answerOne">Potenial Answer</label>
    <g:textField name="answerOne"/>
    <br/>
    <label for="answerTwo">Potenial Answer</label>
    <g:textField name="answerTwo"/>
    <br/>
     <label for="answerThree">Potenial Answer</label>
    <g:textField name="answerThree"/>
    <br/>
    <label for="answerFour">Potenial Answer</label>
    <g:textField name="answerFour"/>
    <br/>
    <g:submitButton name="create" value="Save" />
</g:form>

<div class="allQuestions">
   <g:each in="${survey.questions}" var="question">
      <div class="questionEntry">
          <div class="questionText">
             <b>Question:</b> ${question.questionText}
          </div>
          <div style="padding-left:50px" class="answers">
             <g:each in="${question.answers}" var="answer">
                 <b>Potential Answer:</b> ${answer.answerText} </br>
             </g:each>
          </div>
          </br>
      </div>
   </g:each>
</div>
</body>
</html>