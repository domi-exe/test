<template>
    <div class="search">
        <div class="searchName">
            <h2>Filter</h2>
        </div>
        <div class="searchContainer">
            <h3>Manufacturer</h3>
            <div class="searchGrid">
                <div class="searchManCheckbox" v-for="manf in manufacturers">
                    <checkbox class="mycheck" v-bind:id="manf.id" v-bind:value="manf.name" v-model="checkedManf" color="#1b85ffa1" > {{ manf.name }} </checkbox>
                </div>
            </div>
        </div>
        <div class="searchContainer">
            <h3>Engine</h3>
            <div class="searchGrid">
                <div class="searchEngCheckbox" v-for="engine in engines">
                    <checkbox class="mycheck" v-bind:value="engine.name" v-model="checkedEngines" color="#1b85ffa1" v-bind:id="engine.id"> {{ engine.name }} </checkbox>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            checkedManf: [],
            checkedEngines: [],
            manufacturers: [
                {
                    name :"Ford",
                    id: "Ford_Id"
                },
                {
                    name: "Honda",
                    id: "Honda_Id"
                },
                {
                    name: "Nissan",
                    id: "Nissan_Id"
                },
                {
                    name: "Subaru",
                    id: "Subaru_Id"
                },
            ],
            engines: [
                {
                    name: "4-cylinder",
                    id: "4c_Id"
                },
                {
                    name: "6-cylinder",
                    id: "6c_Id"
                },
                {
                    name: "Hybrid",
                    id: "Hybrid_Id"    
                },
                {
                    name: "Turbo",
                    id: "Turbo_Id"
                }
            ]
        }
    }
    
}
</script>

<style>
.search {
    height: 100%;
    width: 320px;
    background-color: rgb(231, 231, 231);
}
.search .searchName {
    margin: 0;
    padding: 0;
    height: 80px;
    width: 100%;
    background:  rgb(59, 59, 59);
}
.search .searchName h2 {
    font-weight: 400;
    margin: 0;
    padding-top: 25px;
    padding-left: 10px;
    
}
.search .searchContainer {
    margin-bottom: 30px;
}
.search .searchContainer::after {
    content: "";
    border: 0.4px solid rgb(214, 214, 214);
    display: block;
    margin: 0 20px 0 20px;
}
.search .searchContainer h3{
    font-weight: 400;
    text-align: left;
    margin-left: 10px;
    color: rgb(71, 71, 71);
}

.search .searchGrid {
    display: grid;
    grid-template-columns: repeat(2, 160px);
    grid-auto-rows: min-content;
    
}

.search .mycheck{ 
    margin: 15px;
}

.search label {
    font-weight: 400;
    color: rgb(71, 71, 71);
}

</style>
