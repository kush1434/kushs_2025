---
layout: page
title: About Me
permalink: /hack/
---
{% include nav/home.html %}



<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .container {
            width: 400px;
            margin: 20px auto;
            border: 2px solid black;
            padding: 10px;
        }

        .basketball, .team-info, .players, .shoot-button {
            margin: 10px 0;
            padding: 10px;
            text-align: center;
            font-weight: bold;
            font-size: 18px;
        }

        .basketball {
            border: 2px solid red;
        }

        .shoot-button {
            border: 2px solid green;
            color: green;
            cursor: pointer;
        }

        .team-info {
            border: 2px solid black;
        }

        .player1 {
            display: flex;
            justify-content: space-around;
        }

        .player1 {
            border: 2px solid blue;
            width: 100px;
            padding: 10px;
            cursor: pointer;
        }

        .player1:hover, .shoot-button:hover {
            background-color: lightgray;
        }

        .players {
            display: flex;
            justify-content: space-around;
        }

        .player {
            border: 2px solid blue;
            width: 100px;
            padding: 10px;
            cursor: pointer;
        }

        .player:hover, .shoot-button:hover {
            background-color: lightgray;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="basketball">Basketball</div>
        <div class="shoot-button">Shoot</div>
        <div class="players">
            <div class="player">lakers</div>
            <div class="player">Warriors</div>
        </div>
    </div>
</body>
</html>
