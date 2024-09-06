---
layout: page
title: About
permalink: /about/
---
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
        {"flag": "a/a4/Flag_of_the_United_States.svg", "description": "United States"},
        {"flag": "4/41/Flag_of_India.svg", "description": "India"},
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
