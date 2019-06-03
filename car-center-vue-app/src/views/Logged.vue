<template>
    <div class="container">
        <div class="gallery">
            <app-menu></app-menu>
            <slide></slide>
        </div>
        <div class="mostCommon">
            <h2>See the most common cars</h2>
            <div class="imgGallery">
                <div class="g" v-for="i in imgSrc">
                    <my-img v-bind:source="i.source"></my-img>
                    <h4>Model</h4>
                </div>
            </div>
        </div>
        <div class="contentImg">
            <img src="../assets/con3.jpg" alt="" class="conImg">
            <button>See all vehicles</button>
        </div>

        <!-- <my-gallery></my-gallery> -->
    </div>
</template>

<script>
import Menu from "../components/MenuOnline.vue"
import Slide from "../components/Slideshow.vue"
import Image from "../components/Image.vue"

export default {
    components: {
    "my-img": Image,
    "app-menu": Menu,
    "slide" : Slide,
    },
    data () {
        return {
            imgSrc: [
                // {source: "https://build.ford.com/dig/Ford/Fiesta/2019/HD-THUMB/Image[%7CFord%7CFiesta%7C2019%7C1%7C1.%7C100A.P4A..UX..885.SDN.64Y.CLO.44C.S.89D.58F.]/EXT/5/vehicle.png"},
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
.contentImg  {
    margin-top: 40px;
    position: relative;
    
}

.contentImg .conImg {
    width: 100%;
    height: auto;
}

.contentImg button {
    width: 250px;
    height: 45px;
    background-color: #ff1414cc;
    border: 1px solid #ff1414;
    /* background-color: #0362cfc0;
    border: 1px solid #0362cfc0; */
    color: #fff;
    font-size: 16px;
    position: absolute;
    top: 93%;
    left: 50%;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
}
.contentImg button:hover {
    background-color: #ffffffb6;
    border: 1px solid #000102c0;
    color: #ff1414;
}

.mostCommon {
    min-height: 350px;
    background-color: rgb(247, 247, 247);
    text-align: center;
}
.mostCommon h2 {
    font-size: 50px;
    color: rgb(71, 71, 71);
    padding-top: 30px;
    font-weight: 400;

}
.g {
    color: black;
    margin: 10px;
    text-align: center;
}

.g h4 {
    
    font-weight: 400;
    line-height: 1.3;
    letter-spacing: normal;
    margin-top: 10px;
    margin-bottom: 0;
    color: #ff1414;
    /* background: #2f3538; */
}
/* .search  {
    width: 300px;
    background: #AAA;
    height: 300px;
} */

.imgGallery {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
}
</style>
