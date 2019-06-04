<template>
  <div class="containerLoggout">
    <app-menu></app-menu>
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
import { userService } from '../services';
import Menu from './Menu.vue'

export default {
  components: {
    "app-menu": Menu,
  },
  data () {
    return {
      error: false,
      returnUrl: '',
      username: '',
      password: '',
      submitted: false,
      data: []
    }
  },
   created () {
        // reset login status
      userService.logout();

        // get return url from route parameters
      this.returnUrl = this.$route.query.returnUrl || '/signin';
    },
    methods: {
      login: function() {
        const SESION_URL = 'localhost:8082/oauth/token';
        let reqData = "grant_type=password&username=Eli&password=eli";
  
        axios.request({
          url: "/oauth/token",
          method: "post",
          baseURL: "http://localhost:8082/",
          auth: {
            username: 'client',
            password: 'secret'
          },
          data: (reqData),

        }).then(function(res) {
          console.log(res);
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
