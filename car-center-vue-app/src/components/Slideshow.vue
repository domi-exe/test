<template>
    <vue-displacement-slideshow 
            :images="images"
            displacement="require('../assets/displacement.png')"
            :intensity="0.2"
            :speedIn="1.4"
            :speedOut="1.4"
            ease="Expo.easeInOut"
            ref="slideshow"></vue-displacement-slideshow>
</template>
    
<script>
    import VueDisplacementSlideshow from "vue-displacement-slideshow";
    
    export default {
        components: {
            VueDisplacementSlideshow,
        },
        computed: {
            images() {
                return [
                    require("../assets/car1.jpg"),
                    require("../assets/car2.jpg"),
                    require("../assets/car3.jpg")
                ];
            }
        },
        methods: {
            init() {
                //We loop through all our images by calling the 'next' method of our component every 2 seconds
                setInterval(() => {
                    this.$refs.slideshow.next();
                }, 5000);
            }
        },
        mounted() {
            this.init();
        }
    };
</script>