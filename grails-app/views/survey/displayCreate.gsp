<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Create Survey</title>
</head>
<body>

<g:form action="save">
    <label style="padding-right:51px" for="surveyName">Survey</label>
    <g:textField name="surveyName"/>
    <br/>
    <label for="surveyAuthor">Survey Author</label>
    <g:textField name="surveyAuthor"/>
    <br/>
    <g:submitButton name="create" value="Save" />
</g:form>
</body>
</html>