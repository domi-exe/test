<template>
    <div class="container">
        <div class="gallery">
            <app-menu></app-menu>
            <slide></slide>
            
        </div>
        <div class="imgGallery">
            <!-- <div class="search">Hallo</div> -->
            <div class="g" v-for="i in imgSrc">
                <my-img v-bind:source="i.source"></my-img>
            </div>
        </div>
        <!-- <my-gallery></my-gallery> -->
    </div>
</template>

<script>
import Menu from "../components/MenuOnline.vue"
import Slide from "../components/Slideshow.vue"
import Gallery from "../components/Gallery.vue"
import Image from "../components/Image.vue"

export default {
    components: {
    "my-img": Image,
    "app-menu": Menu,
    "slide" : Slide,
    "my-gallery": Gallery
    },
    data () {
        return {
            imgSrc: [
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
            ]
        }
        
    }
    
}
</script>

<style>
.container {
    width: 100%;
}

.gallery {
    height: 80vh;
    width: 100%;
}
/* .search  {
    width: 300px;
    background: #AAA;
    height: 300px;
} */

.imgGallery {
    display: flex;
    flex-wrap: wrap;
}
</style>
