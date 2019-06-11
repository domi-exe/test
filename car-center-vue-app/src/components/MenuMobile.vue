<template>
  <div id="mobileMenu">
    <h2>Car Center</h2>
    <nav class="nav">
      <ul>
        <li><router-link to="/">Home</router-link></li>
        <li><router-link to="/signin">Sign in</router-link></li>
        <li><router-link to="/signup">Sign up</router-link></li>
        <li><router-link to="/about">About</router-link></li>
      </ul>
    </nav>
  </div>
</template>

<script>
export default {
  data () {
    return {
    }
  },
hods: {

  }
}
</script>

<style scoped>
#mobileMenu {
    display: none;
    flex-direction: column;
    align-items: center;
    position: relative;
    left: 50%;
    top: 50%;
    height: 360px;
    width: 360px; 
    background: rgba(255, 255, 255, 0.815);
    border: 1px solid rgba(255, 255, 255, 0.815);
    border-radius: 5px;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    
    color: rgb(31, 31, 31);
    font-weight: 400;
}

#mobileMenu .awesomeArrow {
margin-left: -130px;
margin-top: 26px;

color: rgb(31, 31, 31);
}
#mobileMenu .awesomeArrow:hover {
    color: #1b85ff;
}

#mobileMenu h2 { 
    font-size: 2em;
    margin-top: 20px;
    padding: 0;
    font-weight: 400;
}
.nav a {
    color: rgb(31, 31, 31);
    text-decoration: none;
    display: block;
    font-size: 1.4em;
    padding: 10px;
}

.nav ul {
    list-style: none;
    display: flex;
    flex-direction: column;
    margin: 5px;
    margin-left: -40px;
    text-align: center;
    
}

.nav a:hover {
    color: #1b85ff;
}

 .nav ul li::after{
    content: "";
    display: block;
    border: 0.4px solid rgb(192, 192, 192);
  }

</style>
