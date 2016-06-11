<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.05.16
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
    <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
</head>
<body>
<h1>${phraseRussian}</h1>
<br/>
<button onclick="$('#translate').show()">Перевод</button>
<h1 id="translate" hidden>${phraseTranslate}</h1>
<br/>
<br/>
<br/>
<button onclick="$('#transcription').show()">Транскрипция</button>
<h1 id="transcription" hidden>${phraseTranscription}</h1>
<br/>
<br/>
<br/>
<table>
    <tr style="width: 800px; height: 60px;">
        <td style="width: 400px;">
            <a href="random"><h3>Случайная Фраза</h3></a>
        </td>
        <td style="width: 400px;">
            <a href="simple"><h3>Простая фраза</h3></a>
        </td>
    </tr>


    <tr style="height: 60px;">
        <td>
            <a href="infinitive"><h3>Фраза с инфинитивом</h3></a>
        </td>
        <td>
            <a href="number"><h3>Фраза с числом</h3></a>
        </td>
    </tr>

    <tr style="height: 60px;">
        <td>
            <a href="adjective"><h3>Фраза с прилагательным</h3></a>
        </td>
        <td>
            <a href="own"><h3>Моё</h3></a>
        </td>
    </tr>


    <tr style="height: 60px;">
        <td>
            <a href="have"><h3>У меня есть</h3></a>
        </td>
        <td>
            <a href="question"><h3>Вопросы</h3></a>
        </td>
    </tr>
    <tr style="height: 60px;">
        <td>
            <a href="adverb"><h3>Наречия</h3></a>
        </td>
        <td>
            <a href="hello"><h3>Приветствия</h3></a>
        </td>
    </tr>
    <tr style="height: 60px;">
        <td style="width: 50%;">
            <a href="union"><h3>Союзы</h3></a>
        </td>
        <td style="width: 50%;">
            <a href="geography"><h3>География</h3></a>
        </td>
    </tr>
</table>
</body>
</html>
