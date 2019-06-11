<template>
    <div class="containerLoggout">
        <app-menu></app-menu>
        <mobile-menu></mobile-menu>
        <div class="contentContainer"> 
            <h1>Home</h1>
        </div>
    </div>
</template>

<script>

import Menu from "./Menu.vue"
import MobileMenu from "./MenuMobile.vue"
export default {
    components: {
        "app-menu": Menu,
        "mobile-menu": MobileMenu,
    },   
}
</script>

<style>

</style>
