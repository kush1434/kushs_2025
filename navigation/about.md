---
layout: post
title: About Me
permalink: /about/
comments: true
---
{% include nav/home.html %}

**AP Computer Science Principles**
<ul>
<li>My name is Kush and I am a sophmore at Del Norte High School</li>
<img><img src="../me_pic.jpg" alt="Picture of me" width="450" style="height: auto;">
<br>
<li>Both my parents are immigrants from India</li>
<li>I enjoy playing sleeping and playing basketball in my free time</li>
</ul>
<br>



**My Path to Success**

My goals while taking this class are to learn the fundamentals of 
computer science. Along with this, I aspire to gain the knowledge of computational thinking.
With these skills, I would like my knowledge of Python to climb and become familiar 
with Web Development. In all, I believe that the knowledge and skills I will gain from this
class will eventually help me apply them to real-world situations.
<br>

**My Nationality**
<br>
<style>
    .grid-container {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(150px, 1fr)); /* Dynamic columns */
        gap: 10px;
    }
    .grid-item {
        text-align: center;
    }
    .grid-item img {
        width: 100%;
        height: 100px; /* Fixed height for uniformity */
        object-fit: contain; /* Ensure the image fits within the fixed height */
    }
    .grid-item p {
        margin: 5px 0; /* Add some margin for spacing */
    }
</style>

<div class="grid-container" id="grid_container">
    <!-- content will be added here by JavaScript -->
</div>

<script>
    var container = document.getElementById("grid_container");

    var http_source = "https://upload.wikimedia.org/wikipedia/commons/";
    var living_in_the_world = [
        {"flag": "a/a4/Flag_of_the_United_States.svg", "description": "American"},
        {"flag": "4/41/Flag_of_India.svg", "description": "Indian"},
    ]; 
    
    for (const location of living_in_the_world) {
        var gridItem = document.createElement("div");
        gridItem.className = "grid-item";
        
        var img = document.createElement("img");
        img.src = http_source + location.flag;
        img.alt = location.flag + " Flag";

        var description = document.createElement("p");
        description.textContent = location.description;

        gridItem.appendChild(img);
        gridItem.appendChild(description);
        container.appendChild(gridItem);
    }
</script>

Use this script to add comments to your blog posts manually

<script src="https://utteranc.es/client.js"
        repo="kushs_2025/kush1434"
        issue-term="title"
        label="blogpost-comment"
        theme="github-light"
        crossorigin="anonymous"
        async>
</script>