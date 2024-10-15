---
layout: base
title: Student Home 
description: Home Page
hide: true
---
{% include nav/home.html %}

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Cookie Clicker</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
        }
        #cookieButton {
            width: 100px;
            height: 100px;
            margin: 20px;
        }
    </style>
</head>
<body>
    <h1>Cookie Clicker</h1>
    <p>Cookies: <span id="cookieCount">0</span></p>
    <button id="cookieButton">🍪</button>

    <script>
        let cookieCount = 0;
        const cookieButton = document.getElementById('cookieButton');
        const cookieCountDisplay = document.getElementById('cookieCount');

        cookieButton.addEventListener('click', () => {
            cookieCount++;
            cookieCountDisplay.textContent = cookieCount;
        });
    </script>
</body>
</html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hover Grid Drop-Down</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="grid-container">
        <div class="box">
            Variables
            <div class="dropdown-text">Python: Dynamically typed variables, use =, case-sensitive, local/global scope. JavaScript: Loosely typed, declared with var, let, or const, case-sensitive, </div>
        </div>
        <div class="box">
            Data Abstraction
            <div class="dropdown-text">Drop-down 2</div>
        </div>
        <div class="box">
            Mathematical Expressions
            <div class="dropdown-text">Drop-down 3</div>
        </div>
        <div class="box">
            Strings
            <div class="dropdown-text">Drop-down 4</div>
        </div>
        <div class="box">
            Boolean Expressions
            <div class="dropdown-text">Drop-down 5</div>
        </div>
        <div class="box">
            Conditionals
            <div class="dropdown-text">Drop-down 6</div>
        </div>
        <div class="box">
            Nested Conditionals
            <div class="dropdown-text">Drop-down 7</div>
        </div>
        <div class="box">
            Iteration
            <div class="dropdown-text">Drop-down 8</div>
        </div>
        <div class="box">
            List Operations
            <div class="dropdown-text">Drop-down 9</div>
        </div>
    </div>
</body>
</html>
