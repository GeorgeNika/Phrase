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
<button onclick="$('#transcription').show()">Транскрипция</button>
<h1 id="transcription" hidden>${phraseTranscription}</h1>
<br/>
<br/>
<br/>
<a href="random">Случайная Фраза</a>
<br/>
<a href="simple">Простая фраза</a>
<br/>
<a href="infinitive">Фраза с инфинитивом</a>
<br/>
<a href="number">Фраза с числом</a>
<br/>
<a href="adjective">Фраза с прилагательным</a>
<br/>
<a href="own">Моё</a>
<br/>
<a href="have">У меня есть</a>
<br/>
<a href="question">Вопросы</a>
<br/>
<a href="adverb">Наречия</a>
<br/>
<a href="hello">Приветствия</a>
<br/>
<a href="union">Союзы</a>
<br/>
<a href="geography">География</a>

</body>
</html>
