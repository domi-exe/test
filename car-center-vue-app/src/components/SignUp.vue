<template>
    <div class="containerLoggout">
        <app-menu></app-menu>
        <div class="contentContainer">
            <h1>Sign up</h1>
            <form v-on:submit.prevent="register">
                <div class="inputBox">
                    <input type="text" required="" v-model="user.email">
                    <label>email</label>
                </div>
                <div class="inputBox">
                    <input type="text" required="" v-model="user.username">
                    <label>username</label>
                </div>
                <div class="inputBox">
                    <input type="password" required="" v-model="user.password">
                    <label>password</label>
                </div>
                <div class="buttonContainer">
                    <button type="submit">Sign up</button>
                </div>
            </form>

        </div>
    </div>
</template>

<script>
import Menu from './Menu.vue'
import axios from 'axios'
import { router } from '../routes';

export default {
  components: {
    "app-menu": Menu,
  },
    data() {
        return {
          user: {
              username: '',
              email: '',
              password: ''
          }
        }
    },
     methods: {
      register: function() {
        const SESION_URL = 'localhost:8082/oauth/token';
        let reqData = "username=Dominika&email=dominika@com&password=dominika";
  
        axios.request({
          url: "/rest/user/addUser",
          method: "post",
          baseURL: "http://localhost:8083/",
          data: this.user,

        }).then(function(resp) {
          console.log(resp);
          if(resp.status == 200) {
            router.push('/signin');
          }
        })
        .catch(function(error) {
          console.log('Error on Authentication');
        });
      }
        }
}
</script>
