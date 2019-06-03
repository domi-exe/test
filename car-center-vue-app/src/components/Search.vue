<template>
    <div class="search">
        <div class="searchContainer">
            <h3>Manufacturer</h3>
            <div class="searchGrid">
                <div class="searchManCheckbox" v-for="manf in manufacturers">
                    <input type="checkbox">
                    <label for="">{{ manf }}</label>
                </div>
            </div>
        </div>
        <div class="searchContainer">
            <h3>Engine</h3>
            <div class="searchGrid">
                <div class="searchEngCheckbox" v-for="engine in engines">
                    <input type="checkbox">
                    <label for="">{{ engine }}</label>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            manufacturers: [
                "Ford",
                "Honda",
                "Nissan",
                "Subaru",
            ],
            engines: [
                "4-cylinder",
                "6-cylinder",
                "Hybrid",
                "Turbo"
            ]
        }
    }
    
}
</script>

<style>
.search {
    height: 500px;
    width: 320px;
    background-color: rgb(223, 223, 223);
}

.search .searchContainer {
    margin-bottom: 40px;
}
.search .searchContainer h3{
    text-align: left;
    margin-left: 10px;
    color: rgb(71, 71, 71);
}

.search .searchGrid {
    display: grid;
    grid-template-columns: repeat(2, 160px);
    grid-auto-rows: min-content;
    
}
.search .searchManCheckbox {

    /* height: 40px; */
}

.search input{
    /* opacity: 0; */
    transform: scale(2.0);
    margin: 15px;
}

/* .search .searchManCheckbox input::before {
    content: "";
    border: 1px solid; 
    transform: scale(2.0);
} */
</style>
