<template>
  <div id="menu">
    <h2>Car Center</h2>
    <nav id="nav">
      <ul>
          <!--  zmienić  -> to -->
        <li><router-link to="/">Home</router-link></li>
        <li><router-link to="/vehicles">Vehicles</router-link></li>
        <li><router-link to="/profile">Profile</router-link></li>
        <li><router-link to="/signin">Log out</router-link></li>
      </ul>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'Fractals App',
  data () {
    return {
    }
  }
}
</script>

<style scoped>
#menu {
    display: flex;
    align-items: center;
    justify-content: space-between;

    /* DO MENU PO ZALOGOWANIU  */
    
    /* position: fixed; */
    position: absolute;
    top: 0;
    width: 96vw;
    margin: 0 2.5vw 0 1.5vw;
}

h2 { 
    font-size: 2em;
}
#nav a {
    color: #fff;
    text-decoration: none;
    display: block;
    padding: 15px;
}

#nav ul {
    list-style: none;
    display: flex;
}

#nav ul li {
    font-size: 1.4em;
    color: #fff;
    text-decoration: none;
    display: block;
    padding: 15px;
}

#nav a:hover {
    color: #000;
    background: #fff;
}
</style>
