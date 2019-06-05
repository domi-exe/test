<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>
// imports 
import Menu from './components/Menu.vue'

export default {
  components: {
    'app-menu': Menu
  },
  data () {
    return {
    }
  }
}

</script>

<style>
@import url('https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap&subset=latin-ext');
html {
    /* background: url(./assets/background.jpg) no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover; */
}

body {
    font-family: 'Lato', sans-serif;
    color: #FFF;
    font-weight: bold;
    margin: 0;
    padding: 0;
}
#app {
  display: grid;
  grid-template-columns: 100%;
  grid-template-rows: min-content;
}
.containerLoggout {
  width: 100%;
  height: 100vh;
  position: absolute;
  background: url(./assets/background.jpg) no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;

}

/* content */
.contentContainer {
    position: relative;
    left: 50%;
    top: 50%;
    display: flex;
    flex-wrap: nowrap;
    align-items: center;
    /* ******** dopracować wyśrodkowanie w przypadku HOME ********** */
    justify-content: center;
    height: 400px;
    width: 400px;
    background: rgba(255, 255, 255, 0.815);
    border: 1px solid rgba(255, 255, 255, 0.815);
    border-radius: 5px;
    flex-direction: column;
    
    /* padding: 40px;
    padding-bottom: 80px; */
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
}

.contentContainer h1 {
    font-size:3em;
    text-align: center;
    color: rgb(31, 31, 31);
    font-weight: 300;
    margin-top: 0;
}
.contentContainer h1::after {
  content: "";
  border: 0.2px solid rgba(233, 233, 233, 0.781);
  display: block;
}

.contentContainer h1, form, .buttonContainer {
     position: relative;
}

.contentContainer .inputBox {
    position: relative;
}

.contentContainer .inputBox input {
    border: 0;
    text-align: left;
    font-weight: 300;
    /* padding: 14px 10px; */
    margin: 3px;
    width: 210px;
    height: 40px;
    background: none;
    border: 3px solid rgb(31, 31, 31);
    border-radius: 25px;
    outline: none;
    transition: 0.25s;
} 
.contentContainer label {
    color: rgb(31, 31, 31);
    position: absolute;
    top: 10px;
    left: 15px;
    pointer-events: none;
    transition: .3s;
}

.contentContainer.inputBox input:focus ~ label,
.contentContainer .inputBox input:valid ~ label {
    top: 2px;
    font-size: .8em;
    outline: none;
}

.contentContainer .inputBox :required {
    box-shadow: none;
}
.contentContainer .inputBox input:focus {
    /* width: 280px; */
    border-color: #1b85ff;
    color: #09002b;
    font-weight: bold;
} 

.buttonContainer button{
    border: 0;
    background-color: rgb(31, 31, 31);
    margin: 10px;
    width: 200px;
    height: 40px;
    text-align: center;
    font-size: 1em;
    color: white;
    font-weight: 300;
    border: 3px solid rgb(31, 31, 31);
    outline: none;
    border-radius: 24px;
    transition: 0.25s;
}

.buttonContainer button:hover {
    color: rgb(9, 0, 43);
    background-color: #1b85ff;
    border-color: #1b85ff;
    
}
</style>
