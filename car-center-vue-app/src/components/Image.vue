<template>
    <div class="imgContainer">
        <img v-bind:src="source" class="image">
        <div v-if="false" class="overlay">
            <h3>{{ imgTitle }}</h3>
        </div>
    </div>
</template>

<script>

export default {
    props: ['source', 'imgTitle' ]
    
}

</script>

<style>
    .imgContainer {
    }
</style>
