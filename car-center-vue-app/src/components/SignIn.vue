<template>
  <div class="containerLoggout">
    <app-menu></app-menu>
    <mobile-menu></mobile-menu>
    <div class="contentContainer">
      <h1>Sign in</h1>
      <form class="login" @submit.prevent="login" > 
        <div class="inputBox">
          <input type="text" required="" v-model="username">
          <label>username</label>
        </div>
        <div class="inputBox">
          <input type="password" required="" v-model="password">
          <label>password</label>
          <div class="buttonContainer">
            <button type="submit">Log in</button>
          </div>
      </div>
    </form>
    
  </div>
  </div>
</template>

<script>
// import Vue from 'vue'
import axios from 'axios'
import { router } from '../routes';
import Menu from './Menu.vue'
import MobileMenu from "./MenuMobile.vue"

export default {
  components: {
    "app-menu": Menu,
    "mobile-menu": MobileMenu,
  },
  data () {
    return {
      error: false,
      returnUrl: '',
      username: '',
      password: ''
    }
  },
   created () {
    },
    methods: {
      login: function() {
        const SESION_URL = 'localhost:8082/oauth/token';
        let reqData = "grant_type=password&username="+this.username+"&password="+this.password;
  
        axios.request({
          url: "/oauth/token",
          method: "post",
          baseURL: "http://localhost:8082/",
          auth: {
            username: 'client',
            password: 'secret'
          },
          data: (reqData),

        }).then(function(resp) {
          const token = resp.data.access_token;
          localStorage.setItem('user-token', token);
          localStorage.setItem('isAuthenticated', true);
          axios.defaults.headers.common['Authorization'] = token;
          router.push('/logged');
        })
        .catch(function(error) {
          console.log('Error on Authentication');
        });
      }
  }
};
</script>

<style>
</style>
