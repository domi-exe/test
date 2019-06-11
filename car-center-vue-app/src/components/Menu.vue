<template>
  <div id="menu">
    <h2 ref="h2">Car Center</h2>
    <nav class="nav">
      <ul>
        <li><router-link to="/">Home</router-link></li>
        <li><router-link to="/signin">Sign in</router-link></li>
        <li><router-link to="/signup">Sign up</router-link></li>
        <li><router-link to="/about">About</router-link></li>
      </ul>
    </nav>
    <div class="hiddenNav">
      <font-awesome-icon class="awesomeBars"  icon="bars"  size="2x" v-on:click="showNav"/>
      <font-awesome-icon class="awesomeArrow"  icon="arrow-left"  size="2x" v-on:click="hideNav"/>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      w: {
        width: 0,
        height: 0
      },
      clickedIcon: false,
    }
  },
  created() {
    window.addEventListener('resize', this.handleResize);
    this.handleResize();
  },
  destroyed() {
    window.removeEventListener('resize', this.handleResize);
  },
  methods: {
     
    showNav: function() {
      this.clickedIcon = true;
      const mobieMenu = document.querySelector('#mobileMenu');
      const awwIconBar = document.querySelector(".awesomeBars");
      const awwIconArrow = document.querySelector(".awesomeArrow");
      const contentContainer = document.querySelector(".contentContainer");
      const header = this.$refs.h2;

      contentContainer.style.display = "none";
      awwIconBar.style.display = "none";
      mobileMenu.style.display = "flex";
      header.style.display = "none";
      awwIconArrow.style.display = "inline";

    },
    hideNav: function() {
      this.clickedIcon = false;
      const mobieMenu = document.querySelector('#mobileMenu');
      const awwIconBar = document.querySelector(".awesomeBars");
      const awwIconArrow = document.querySelector(".awesomeArrow");
      const contentContainer = document.querySelector(".contentContainer");
      const header = this.$refs.h2;

      // nav.style.display = "none";
      contentContainer.style.display = "flex";
      awwIconArrow.style.display = "none";
      awwIconBar.style.display = "block";
      mobileMenu.style.display = "none";
      header.style.display = "inline";

    },
    handleResize() {
      this.w.width = window.innerWidth;
      this.w.height = window.innerHeight;

      if(this.clickedIcon && this.w.width > 750) {
        this.clickedIcon = true;
        const mobieMenu = document.querySelector('#mobileMenu');
        const awwIconBar = document.querySelector(".awesomeBars");
        const awwIconArrow = document.querySelector(".awesomeArrow");
        const contentContainer = document.querySelector(".contentContainer");
        const header = this.$refs.h2;

        contentContainer.style.display = "flex";
        awwIconArrow.style.display = "none";
        awwIconBar.style.display = "block";
        mobileMenu.style.display = "none";
        header.style.display = "inline";

        
      }
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
    position: fixed;
    top: 0;
    width: 96vw;
    margin: 0 2vw 0 2vw;
}

#menu .hiddenNav {
  display: none;
}

#menu .awesomeArrow {
  display: none;
  margin: 5px;
  margin-top: 30px;
}
#menu .awesomeArrow:hover, .awesomeBars:hover {
  color: #1b85ff;
}
h2 { 
    font-size: 2em;
}
.nav a {
    color: #fff;
    text-decoration: none;
    display: block;
    padding: 15px;
}

.nav ul {
    list-style: none;
    display: flex;
}

.nav ul li {
    font-size: 1.4em;
    color: #fff;
    text-decoration: none;
    display: block;
    padding: 15px;
}

.nav a:hover {
    color: #000;
    background: rgba(255, 255, 255, 0.815);
}

@media only screen and (max-width: 750px) {
    
    .nav ul{
      display: none;
    }
    
    #menu .hiddenNav {
    display: inline;
  }
 

}
</style>
