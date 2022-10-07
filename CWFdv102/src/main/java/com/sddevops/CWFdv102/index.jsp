<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BMI Calculator with JavaScript</title>
    <script src="script.js" defer></script>
</head>
<body>
    <div class="wrapper">
        <p>Height in CM:
            <input type="text" id="height"><br><span id="height_error"></span>
        </p>

        <p>Weight in KG:
            <input type="text" id="weight"><br><span id="weight_error"></span>
        </p>

        <button id="btn">Calculate</button>
        <p id="output"></p>
    </div>
</body>
</html>