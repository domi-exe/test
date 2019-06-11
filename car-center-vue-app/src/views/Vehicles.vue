<template>
    <div class="container">
        <div class="img1Container">
            <img src="../assets/con2.jpg" alt="" class="firstImg">
            <div class="cover"></div>
            <h3>All Vehicles</h3>
        </div>
        <app-menu></app-menu>
        <div class="mainContainer">
            <!-- <div class="searchContainer"></div> -->
            <search-box></search-box>
            <div class="imgGallery">
                <div class="g" v-for="i in imgSrc">
                    <my-img v-bind:source="i.source"></my-img>
                    <h4>Model</h4>
                    <p>cena 0.00</p>
                </div>
            </div>
        </div>

    </div>
</template>

<script>
import Menu from "../components/MenuOnline.vue"
import Image from "../components/Image.vue"
import Search from "../components/Search.vue"
export default {
    components: {
        "app-menu": Menu,
        "my-img": Image,
        "search-box": Search
    },
    data() {
        return {
            imgSrc: [
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
                {source: "https://build.ford.com/dig/Ford/Mustang/2019/HD-THUMB/Image[|Ford|Mustang|2019|1|1.|100A.P8T..J7..882.~ICPAB.LTS.DUM.COU.CJDAA.~RZZ00.LRS.64A.CLO.44X.EBST.891.13D.]/EXT/5/vehicle.png"},
            ]
        }
    }
    
}
</script>

<style  scoped>
.container {
    width: 100%;
    display: flex;
    flex-direction: column;
}
.img1Container {
    position: relative;
}
 .img1Container .firstImg {
    width: 100%;
    height: auto;
    object-fit: cover;
}
.img1Container .cover {
    /* background-color: rgba(255,255,255,0.6); */
    background-color: #1b85ffa1;
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0%;
    left: 0%;
}
.img1Container h3 {
    /* color: #ff1414; */
    color: #fff;
    font-size: 56px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    font-weight: 400;
}
.mainContainer {
    display: flex;
    flex-direction: row;
}
.searchContainer {
    width: 350px;
    height: 500px;
    background-color: rgb(223, 223, 223);
}
.imgGallery {
    display: flex;
    flex-wrap: wrap;
}
.g {
    color: black;
    margin: 10px 30px 10px 30px;
    /* margin: 10px; */
    text-align: center;
}
.g p {
    color: #2f3538;
    font-size: 14px;
    line-height: 20px;
    margin-top: 0;
    /* background: red; */
}
.g h4 {
    
    font-weight: 400;
    line-height: 1.3;
    letter-spacing: normal;
    margin-top: 15px;
    margin-bottom: 5px;
    color: #1b85ff;
    font-size: 20px;
    /* background: #2f3538; */
}
.g h4::after {
    content: "";
    border: 0.4px solid #8b9497e7;
    display: block;
}
</style>