<template>
  <div class="contentContainer">
    <h1>Sign in</h1>
    <form class="login" @submit.prevent="handleSubmit" > 
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
</template>

<script>
import { router } from '../routes';
import { userService } from '../services';

export default {
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
      handleSubmit (e) {
        this.submitted = true;
        const { username, password } = this;


      if (!(username && password)) {
                return;
            }

        userService.login(username, password)
        .then(
            user => router.push(this.returnUrl),
            error => {
            this.error = error;
           }
         );

      }
    // login: function(){
    //     this.$http.post('http://35.238.239.157:8000/login/' ,{
    //         username: this.user.username,
    //         password: this.user.password})
    //         .then(request => this.loginSuccessful(request))
    //         .catch(() => this.loginFailed())
    //         },
    //         loginSuccessful (req) {
    //             if(!req.data.token) {
    //                 this.loginFailed();
    //                 return;
    //             }
    //             localStorage.token = req.data.token;
    //             this.error = false;
    //             this.authorization = true;
    //             this.$router.replace(this.$route.query.redirect || '/online')
    //         },
    //         loginFailed () {
    //             this.error = 'Login failed!';
    //             delete localStorage.token;
    //         }
  }
};
</script>

<style>
</style>
