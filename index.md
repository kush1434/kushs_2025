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

Use this script to add comments to your blog posts manually

<script src="https://utteranc.es/client.js"
        repo="kushs_2025/kush1434"
        issue-term="title"
        label="blogpost-comment"
        theme="github-light"
        crossorigin="anonymous"
        async>
</script>