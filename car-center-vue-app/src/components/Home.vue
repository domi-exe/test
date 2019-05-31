<template>
    <div class="gallery"> 
        <!-- <h1>Welcome<br>to the<br>Car Center App</h1> -->
        <slide></slide>
    </div>
</template>

<script>
import Slide from "./Slideshow.vue"
export default {
    components: {
    "slide" : Slide,
    }
    
}
</script>

<style>
.gallery {
    display: flex;
    height: 80vh;
    width: 100vw;
    align-items: center;
    justify-content: center;
}
</style>
