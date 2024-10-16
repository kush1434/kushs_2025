---
layout: post
title: Kush's Personal Blog
description: Personal Blog about Sprint 2
type: issues
comments: True
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
<br>
<a href = "https://kush1434.github.io/kushs_2025/2024/10/15/Teaching-Project_IPYNB_2_.html">
Sprint 2 Final Hacks
</a>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hover Grid Drop-Down</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="grid-container">
        <a href="https://kush1434.github.io/kushs_2025/2024/10/09/3-1_IPYNB_2_.html" class="box">
            Variables
            <div class="dropdown-text">
             Python:
             <br>
             • Doesn't need declaration keywords
             <br>
             • Dynamic typing
             <br>
             Javascript:
             <br>
             • Hoisting
             <br>
             • Dynamic typing
             </div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/09/3-2_IPYNB_2_.html" class="box">
            Data Abstraction
            <div class="dropdown-text">
             • Simplifies complex systems into manageable parts
             <br>
             • Focuses on essential features, hiding details
</div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/09/3-3-,-3-5_IPYNB_2_.html" class="box">
            Mathematical Expressions
            <div class="dropdown-text">
            • Use operators like +, -, *, and /
            <br>
            • Follow order of operations (PEMDAS/BODMAS)
            </div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/09/3-4_IPYNB_2_.html" class="box">
            Strings
            <div class="dropdown-text">
            • Immutable sequences of characters
            <br>
            • Use quotes (' or ") for definition
            </div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/09/3-3-,-3-5_IPYNB_2_.html" class="box">
            Boolean Expressions
            <div class="dropdown-text">
            • Evaluate to True or False
            <br>
            • Use logical operators: and, or, not
            </div>
        </a>
        <a href="https://kush1434.github.io/portfolio_2025/csp/big-idea/p2/3-6" class="box">
            Conditionals
            <div class="dropdown-text">
            • Control flow with if, elif, and else
            <br>
            • Execute code blocks based on conditions
            </div>
        </a>
        <a href="https://kush1434.github.io/portfolio_2025/csp/big-idea/p2/3-7" class="box">
            Nested Conditionals
            <div class="dropdown-text">
            • Conditionals within conditionals for complex logic
            <br>
            • Allows multiple layers of decision-making
            </div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/04/3-8_IPYNB_2_.html" class="box">
            Iteration
            <div class="dropdown-text">
            • Repeat code using loops (for, while)
            <br>
            • Control loop execution with break/continue
            </div>
        </a>
        <a href="https://kush1434.github.io/kushs_2025/2024/10/04/3-10_IPYNB_2_.html" class="box">
            List Operations
            <div class="dropdown-text">
            • Add/modify elements with append, insert, remove.
            <br>
            • Access elements using indices or slicing
            </div>
        </a>
    </div>
</body>
</html>
